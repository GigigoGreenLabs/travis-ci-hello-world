package com.gigigo.travis;

import java.lang.System;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
  @Test public void addition_isCorrect() throws Exception {
    assertEquals(4, 2 + 2);
  }

  @Test public void second_addition_isCorrect() throws Exception {
    System.out.println("------>>>TEST ARE BEING PASSED<<<-----");
    assertEquals(5, 2 + 3);
  }

  @Test public void third_addition_isCorrect() throws Exception {
    assertEquals(2, 1 + 1);
  }

  @Test public void fourth_addition_isCorrect() throws Exception {
    assertEquals(8, 4 + 4);
  }
}