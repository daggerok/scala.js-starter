package com.daggerok.scalajs.math

import org.junit.Test
import org.junit.Assert._

import com.daggerok.scalajs.math.Calc._

class ScalaJUnitTest {
  @Test def testAdd() {
    assertEquals(3, add(1, 2))
  }
}
