package ingresso

class CamaroteInferior(
    adicional: Double,
    valor: Double,
    val localizacaoIngresso: String
): ClasseVip(valor, adicional) {
    fun acessar(): String{
        return localizacaoIngresso
    }

    fun imprimir(){
        println("Localização ${localizacaoIngresso}")
    }
}