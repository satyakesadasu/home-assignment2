package com.homeassn.assignment.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstProblem {

  public static void main(String[] args) {
    System.out.println(numberOfPairs());
  }

  public static int numberOfPairs() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a , the size of the array that is to be created: ");
    int size = sc.nextInt();
    System.out.println("Enter K value");
    int[] array = new int[size];
    int num = sc.nextInt();
    System.out.println("Enter elements of array");
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }
    //Reading the number
    List<String> result = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        if ((array[i] + array[j]) == num && i != j) {
          result.add(i + ", " + j);
        }
      }
    }
    return result.size();
  }
}
