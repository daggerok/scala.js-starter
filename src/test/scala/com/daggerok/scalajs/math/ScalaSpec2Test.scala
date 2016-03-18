package com.daggerok.scalajs.math

import org.specs2.Specification
import org.specs2.ScalaCheck
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

import com.daggerok.scalajs.math.Calc._

@RunWith(classOf[JUnitRunner])
class ScalaSpec2Test extends Specification {
  def is = s2"""

  The Calc add function should
    add posetives                    $posetives
    add negatives                    $negatives
    add zeroes                       $zeroes
  """

  def posetives = add(1, 2) === 3
  def negatives = add(-5, 2) === -3
  def zeroes = add(0, 1) === 1
}
