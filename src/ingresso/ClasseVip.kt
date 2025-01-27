package ingresso

class ClasseVip(
    valor: Double,
    val adicional: Double
): Ingresso(valor) {
    fun ingressoVip(){
        valor += adicional
        println(valor)
    }
}