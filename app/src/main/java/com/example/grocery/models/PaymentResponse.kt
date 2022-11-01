package com.example.grocery.models

data class PaymentResponse(
    val amount_cents: Int,
    val collector: String,
    val created_at: String,
    val currency: String,
    val delivery_needed: Boolean,
    val id: Int,
    val is_payment_locked: String,
    val items: List<Cart>,
    val merchant: Merchant,
    val merchant_order_id: String,
    val paid_amount_cents: Int,
    val shipping_data: ShippingData,
    val wallet_notification: String
)

/*{
  "id": 103,
  "created_at": "2017-01-10T05:41:15.700814Z",
  "delivery_needed": "false",
  "merchant": {
      "id": 28,
      "created_at": "2016-11-17T15:02:53.646620Z",
      "phones": [
          "011111111111",
          "012324151432"
      ],
      "company_emails": [
          "brendon42@cummings-windler.biz",
          "jim50@sipes-kunze.com"
      ],
      "company_name": "Wuckert, Zieme and Dach",
      "state": "Oklahoma",
      "country": "Oman",
      "city": "Port Arvillachester",
      "postal_code": "83372",
      "street": "Walker Ramp"
  },
  "collector": "null",
  "amount_cents": 100,
  "shipping_data": {
      "id": 80,
      "first_name": "test",
      "last_name": "account",
      "street": "example",
      "building": "6",
      "floor": "4",
      "apartment": "404",
      "city": "cairo",
      "state": "egypt",
      "country": "egypt",
      "email": "test@example.com",
      "phone_number": "00201000212058",
      "postal_code": "123456",
      "extra_description": "test asdf",
      "shipping_method": "EM",
      "order_id": 103,
      "order": 103
  },
  "currency": "EGP",
  "is_payment_locked": "false",
  "merchant_order_id": "null",
  "wallet_notification": "null",
  "paid_amount_cents": 0,
  "items": []
}*/