package com.homeassn.assignment.controller;

import com.homeassn.assignment.service.AssignmentService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ProblemController {

  @Autowired
  AssignmentService assignmentService;

  @ApiOperation(value = "evaluate the expression", notes = "api that evaluates arithmetic expressions written in Polish notation")
  @PostMapping(value = "/evaluateExpression")
  public ResponseEntity<List<String>> evaluateExpression(@RequestBody List<String> input) {
    return new ResponseEntity<>(assignmentService.evaluateExpression(input), HttpStatus.OK);
  }

}
