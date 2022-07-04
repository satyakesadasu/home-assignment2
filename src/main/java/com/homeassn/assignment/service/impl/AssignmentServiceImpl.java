package com.homeassn.assignment.service.impl;

import com.homeassn.assignment.exception.InvalidDataException;
import com.homeassn.assignment.service.AssignmentService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class AssignmentServiceImpl implements AssignmentService {

  private static final Logger LOGGER = LoggerFactory.getLogger(AssignmentServiceImpl.class);
  private static final String EMPTY_REQUEST_ERROR_MESSAGE = "Input request should not be empty or null";
  private static final String ERROR = "error";
  private static final List<String> operations = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));

  @Override
  public List<String> evaluateExpression(List<String> input) {
    //checks if the request is empty
    if (CollectionUtils.isEmpty(input)) {
      throw new InvalidDataException(EMPTY_REQUEST_ERROR_MESSAGE);
    }
    List<String> resultList = new ArrayList<>();
    //iterates through each expression and returns the result
    input.stream().forEach(inp -> {
      String result = handler(inp);
      LOGGER.info("result : " + result);
      resultList.add(result);
    });
    return resultList;
  }

  /*
  Create a stack and pushes the values
   */
  private String handler(String expression) {
    String expressionSplit[] = expression.split(" ");
    int size = expressionSplit.length;
    //streaming through values
    boolean operatorsCheck = Arrays.asList(expressionSplit).stream().anyMatch
        (p -> operations.contains(p));
    if (size == 1 && !operations.contains(expressionSplit[0]) && NumberUtils
        .isCreatable(expressionSplit[0])) {
      LOGGER.info(expressionSplit[0]);
      return expression;
    } else if (!operatorsCheck) {
      return ERROR;
    } else {
      Stack expressionStack = new Stack();
      for (int i = 0; i < size; i++) {
        if (operations.contains(expressionSplit[i].toString())) {
          expressionStack.push(expressionSplit[i]);
        } else if (!NumberUtils.isCreatable(expressionSplit[i])) {
          return ERROR;
        } else {
          expressionStack.push(Double.parseDouble(expressionSplit[i]));
        }
      }
      return expressionEvaluation(expressionStack);
    }
  }

  /*
  evaluates the expression
   */
  public String expressionEvaluation(Stack expressionStack) {
    Stack finalStack = new Stack();
    finalStack.push(expressionStack.pop());
    for (int i = 0; i < finalStack.capacity(); i++) {
      try {
        if (operations.contains(expressionStack.peek().toString())) {
          double stack1 = (double) finalStack.pop();
          double stack2 = (double) finalStack.pop();
          double stack3;
          String operator = String.valueOf(expressionStack.pop());
          switch (operator) {
            case "+":
              stack3 = stack1 + stack2;
              finalStack.push(stack3);
              break;
            case "-":
              stack3 = stack1 - stack2;
              finalStack.push(stack3);
              break;
            case "*":
              stack3 = stack1 * stack2;
              finalStack.push(stack3);
              break;
            case "/":
              stack3 = stack1 / stack2;
              finalStack.push(stack3);
              break;
          }
        } else {
          finalStack.push(Double.parseDouble(String.valueOf(expressionStack.pop())));
        }
      } catch (EmptyStackException e) {
      }
    }
    return finalStack.peek().toString();
  }

}
