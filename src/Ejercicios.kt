fun controlGastos() {
    val gastos = arrayOf(25.0, 10.0, 5.0, 2.5, 100.0)
    var total = 0.0
    var maximoGastos = gastos[0]
    var minimoGastos = gastos[0]

    for (gasto in gastos) {
        total += gasto
        if (gasto > maximoGastos) maximoGastos = gasto
        if (gasto < minimoGastos) minimoGastos = gasto
    }
    println("total de gastos: $total")
    println("Gasto minimo: $minimoGastos")
    println("Gasto maximo: $maximoGastos")
}