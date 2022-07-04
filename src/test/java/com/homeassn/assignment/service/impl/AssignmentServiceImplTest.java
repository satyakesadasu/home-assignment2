package com.homeassn.assignment.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.homeassn.assignment.exception.InvalidDataException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssignmentServiceImplTest {

  public AssignmentServiceImpl classUndrTest = new AssignmentServiceImpl();

  @Test
  void evaluateExpressionShouldReturnCalucatedStringList() {
    List<String> strings = classUndrTest.evaluateExpression(validInputValue());
    System.out.println(strings);
    assertEquals(Arrays.asList("42.0", "1337.0", "100500"), strings);
  }

  @Test
  void evaluateExpressionShouldReturnError() {
    List<String> strings = classUndrTest.evaluateExpression(invalidInputValue());
    System.out.println(strings);
    assertEquals(Arrays.asList("error", "error", "error"), strings);
  }

  @Test
  void evaluateExpressionShouldthrowExpression() {
    List<String> emptyList = Collections.<String>emptyList();
    Assertions.assertThrows(InvalidDataException.class,
        () -> classUndrTest.evaluateExpression(emptyList));
  }

  private List<String> validInputValue() {
    return Arrays.asList("+ + 0.5 1.5 * 4 10",
        "- 2e3 - 700 + 7 * 2 15",
        "100500");

  }

  private List<String> invalidInputValue() {
    return Arrays.asList("1 2",
        "A B C",
        "qwerty");

  }
}
