package poo_1_postwork

fun main(){
    var log = Login(user = String(),  pass = String(), us = String(), pas = String())
    var buyers = Buyers()
    var car = Car()
    var market = Market(nameproduct = String(),typeproduct = String(),brand = String(),color = String(),
        manyproducts = String(),description = String())
    var orders = Orders()
    var promotions = Promotions()
    var sellers = Sellers()
    var whishlist = Whishlist()

    println("[    GRAM COMERCE    ]")

    println("--------- Login ------------")
    println("Crea un usuario")
    log.user = readLine().toString()
    println("Crea un password")
    log.pass = readLine().toString()
    println("Ingresa tu usuario")
    log.us = readLine().toString()
    println("Ingresa tu password ")
    log.pas = readLine().toString()

    if (log.user == log.us && log.pass == log.pas) {
        println("Hola ${log.user} Bienvenido a tu cuenta")
    } else {
        println("Error al encontrar al usuario!!")
    }
    if(log.user == log.us && log.pass == log.pas) {
        println("---------Ingreso de productos------------")

        println("Ingresa el nombre de tu producto")
        market.nameproduct = readLine().toString()

        println("Ingresa la categoria de tu producto")
        market.typeproduct = readLine().toString()

        println("Ingresa la marca de tu producto")
        market.brand = readLine().toString()

        println("Ingresa el color de tu producto")
        market.color = readLine().toString()

        println("Ingresa la cantidad de unidadades de tu producto")
        market.manyproducts = readLine().toString()

        println("Ingresa una descripcion breve de tu producto")
        market.description = readLine().toString()

        println("producto agregado exitosamente")

        println(
            "Nombre del producto ${market.nameproduct} de la categoria ${market.typeproduct} " +
                    "de la marca ${market.brand} de color ${market.color} con la cantidad de ${market.manyproducts} ${market.description}"
        )
    }else{
        println("Acceso a tu cuenta denegado!!")
    }
}