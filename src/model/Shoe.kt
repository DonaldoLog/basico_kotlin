package model

class Shoe(name: String, description: String, sku: Int, var brand: String): Product(name, description, sku), ICrudActions {

    override fun create(): String {
        saludar("hola desde create")
        return "Create shoe"
    }

    override fun read(): String {
        return "Read show"
    }

    override fun update(): String {
        return "Update shoe"
    }

    override fun delete(): String {
        return "Delete shoe"
    }

    override fun toString(): String {
        return super.toString() + "SKU ID: $sku \nMarca: $brand \nmodelo: $model \nSize: $size \ncolor: $color"
    }
    init {
        println("SKU: $sku")
        println("Marca: $brand")
    }

    var size: Int = 34 //Minnimo sea 34
        set(value) {
            if (value >= 34) {
                field = value
            } else {
                field = 34
            }
        }
    get() = field

    var color: String = "White"
    var model: String = "Boots" //No tenis
        set(value) {
            if (value.equals("Tenis")) {
                field = "Boots"
            } else {
                field = value
            }
        }
    get() = field
}