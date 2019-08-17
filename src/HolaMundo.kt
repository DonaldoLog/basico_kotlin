import model.Camera
import model.Movie
import model.Shoe
import java.lang.NullPointerException

fun main(args: Array<String>) {
    println("Hola mundo")
    println(1+1)
    println(3-1)
    println(2*2)
    println(2/2)
    println(7%2)

    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))

    var n = 3
    val nombre = args[0]
    println(nombre)
    println(n)

    val name = "donaldo"
    val apellido: String = "lopez"
    val nombreapellido = "donaldo\nlopez"
    println("TU nombre es ${nombreapellido}")
    println("Tu nombre es $name $apellido")

    val parrafo = """
        ** Loremasjdasdja sdasdhasd hasj dhasj dasd
        ** as dasd asd askdjsdjasjdaskjd akjd askskj dasdas
        ** d asd adasd asd assa 
        ** asd asd asd as
    """.trimIndent()

    println(parrafo.trimMargin("** "))

    val oneToFive = 1..5
    for (i in oneToFive){
        println(i)
    }

    val aTod = 'A'..'D'
    for (letra in 'A'..'D') println(letra)

    val numero = 3
    if (numero.equals(2)) {
        println(true)
    } else {
        println(false)
    }

    when (numero) {
        in 1..5 -> println("Si esta en el rango")
        in 1..3 -> println("entre uno y 3")
        !in 5..10 -> println("no entre 5 y 10")
        else -> println("no esta crack")
    }

    var i = 1
    while (i <= 10){
        println(i)
        i++
    }

    i = 1
    do {
        println("mensaje: ${i}")
        i++
    } while (i <= 1)

    /*try {
        var compute: String?
        compute = null
        var longitud: Int = compute!!.length
    } catch (e: NullPointerException) {
        println("Ingresa un valor, no nullos")
    }*/

    //llamada segura
    var compute: String? = null
    var longitud: Int? = compute?.length
    println("Loingitud: ${longitud}")

    //operador elvis
    var teclado: String? = null
    var longitudTeclado: Int = teclado?.length?:0
    println("Longitud teclado: ${longitudTeclado}")

    val listWithNulls: List<Int?> = listOf<Int?>(0, null, null, 4)
    println("Lista con NUll: ${listWithNulls}")

    val listWithOuthNulls: List<Int?> = listWithNulls.filterNotNull()
    println(listWithOuthNulls)

    // array
    val countries = arrayOf("Mexico", "Colombia", "Argentina", "Chile")

    val days = arrayOf<String>("Lunes", "Martes", "Miercoles")


    // promedio
    val numbers = intArrayOf(18,6,8,9,8,7,8,7)
    var sum = 0
    for (num in numbers) {
        sum += num
        println("numero: $num")
    }
    val average = sum.div(numbers.size)
    println("promedio: $average")

    var arrayObject = arrayOf(1, 2, 3)
    var arrayPrimitive: IntArray = arrayObject.toIntArray()

    val suma = arrayObject.sum()
    println("sum del array es: $suma")

    arrayObject = arrayObject.plus(4)

    for (num in arrayObject) {
        println("Array: $num")
    }

    arrayObject = arrayObject.reversedArray()
    for (num in arrayObject) {
        println("array reversa: $num")
    }

    arrayObject.reverse()
    for (num in arrayObject) {
        println("array reversa: $num")
    }

    var x = 5
    println("X es igual a 5? ${x.equals(5)}")
    var mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x")


    println("Raiz cuadrada de: ${Math.sqrt(4.0)}")

    println("El promedio de los numeros es ${averageNumbers(numbers, 1)}")

    println("${evaluate(6)}")

    //Lambdas

    var saludo = { println("HOla mundo")}
    saludo()

    //val suma = {instrucciones -> sentencias}
    val plus = {a: Int, b: Int, c: Int -> a + b + c}
    val result = plus(1,2,3)
    println(result)
    println(plus(1,2,3))
    println({a: Int, b: Int, c: Int -> a + b + c}(1,2,3))

    val calculateNumber = {n: Int ->
        when(n){
            in 0..3 -> println("Tu numero esta entre 1 y 3")
            in 4..7 -> println("Tu numero esta entre 1 y 3")
            in 8..10 -> println("Tu numero esta entre 1 y 3")
            else -> {
                println("Tu nomero no esta entre 0 y 10")
            }
        }
    }

    println(calculateNumber(11))


    val camera = Camera()
    camera.turnOn()
    println( camera.getCameraStatus())

    camera.setResolution(1080)
    println("Resolution: ${camera.getResolution()}")

    var shoe = Shoe("Shoe", "Blue shoes",12345, "Praga")
    println("Shoe: ${shoe}")
    shoe.size = 38
    println(shoe.size)

    shoe.model = "Zapatos de tacon"
    println(shoe.model)
    println(shoe.brand)

    val movie = Movie("Coco", "Pixar", 120)
    println("Movie")
    println(movie.creator)
    println(movie.title)
    println("${movie.duration} mins")

    var resultado = calculadora(1,2,3, ::multiplicar)
    println("La calculadora opera una multiplicacion: $resultado")
    resultado = calculadora(4,2,3, ::sumar)
    println("La calculadora opera una suma: $resultado")
    resultado = calculadora(6,2,3, ::restar)
    println("La calculadora opera una resta: $resultado")
}

fun calculadora(a: Int, b: Int, c: Int, operacion:(Int, Int, Int) -> Int): Int{
    return operacion(a, b, c)
}

fun sumar(a: Int, b: Int, c: Int) = a + b + c
fun restar(a: Int, b: Int, c: Int) = a - b - c
fun multiplicar(a: Int, b: Int, c: Int) = a * b * c


fun evaluate(number: Int = 2, character: Char = '='): String {

    return "${number} es ${character}"
}


fun averageNumbers (numbers: IntArray, n: Int): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum.div(numbers.size).plus(n)
}