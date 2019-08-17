package model

abstract class Product(var name: String, var descrption: String, var sku: Int) {
    override fun toString(): String {
        return "Name: $name \nDescription: $descrption \nSKU: $sku"
    }




}
