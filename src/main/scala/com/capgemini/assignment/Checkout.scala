package com.capgemini.assignment

class Checkout(offers: Seq[Offer] = Nil) {
  def calculate(inputProducts: Seq[ShopItem]): CheckoutSummary = {
    var total = 0.0
    for (product <- inputProducts) {
      total += product.price
    }
    for (offer <- offers) {
      total += offer.calcAdjustment(inputProducts)
    }
    CheckoutSummary(inputProducts, total)
  }

}

case class CheckoutSummary(products: Seq[ShopItem], subTotal: Double)