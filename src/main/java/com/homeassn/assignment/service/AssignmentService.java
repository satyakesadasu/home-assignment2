package com.homeassn.assignment.service;

import java.util.List;

public interface AssignmentService {

  /**
   * this service prints the evaluated expression for the input provided
   *
   * @return
   */
  public List<String> evaluateExpression(List<String> input);
}
