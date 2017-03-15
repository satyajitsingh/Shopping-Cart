package com.capgemini.assignment

import org.scalatest.{FlatSpec, Matchers}

class AppleBuy1Get1OfferTest extends FlatSpec with Matchers {


  "AppleBuy1Get1OfferTest" should "calcAdjustment for min eligible quantity" in {
    // Given
    val apples = Seq(Apple, Apple)

    // When
    val adjustment = AppleBuy1Get1Offer.calcAdjustment(apples)

    // Then
    adjustment should be(-0.6)
  }

  it should "Apply offer multiple times when there are multiple eligible quantities" in {
    // Given
    val apples = Seq(Apple, Apple, Apple, Apple, Apple)

    // When
    val adjustment = AppleBuy1Get1Offer.calcAdjustment(apples)

    // Then
    adjustment should be(-1.2)
  }

  it should "Apply offer correctly for a mixed list of items" in {
    // Given
    val apples = Seq(Apple, Apple, Orange, Apple, Orange)

    // When
    val adjustment = AppleBuy1Get1Offer.calcAdjustment(apples)

    // Then
    adjustment should be(-0.6)
  }

}
