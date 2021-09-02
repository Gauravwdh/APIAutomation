package org.example;

import org.junit.Assert;
import org.junit.Test;

public class APIAutomation {

  @Test
  public void test_sum() {
    int x = 2;
    int y = 2;
    Assert.assertEquals(4, x + y);
  }

  @Test
  public void test_sub() {
    int x = 3;
    int y = 1;
    Assert.assertEquals(2, x - y);
  }
}
