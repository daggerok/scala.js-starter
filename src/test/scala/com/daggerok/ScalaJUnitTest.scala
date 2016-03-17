package com.daggerok

import org.junit.Test
import org.junit.Assert._

import com.daggerok.Calc._

class ScalaJUnitTest {
  @Test def testAdd() {
    assertEquals(3, add(1, 2))
  }
}
