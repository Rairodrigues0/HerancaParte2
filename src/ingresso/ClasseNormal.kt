package ingresso

class ClasseNormal(
    valor: Double
): Ingresso(valor) {
    override fun imprimeValor() {
        println("Ingresso Normal")
    }
}