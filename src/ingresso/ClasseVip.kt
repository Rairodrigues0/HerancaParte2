package ingresso

open class ClasseVip(
    valor: Double,
    val adicional: Double
): Ingresso(valor) {
    fun ingressoVip(): Double{
        val ingressoVip = valor + adicional
        return ingressoVip

    }
}