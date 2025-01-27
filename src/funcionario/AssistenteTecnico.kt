package funcionario

class AssistenteTecnico(
    nome: String,
    salario: Double,
    matricula: Int,
    var bonus: Double
): Assistente(nome, salario, matricula) {
    override fun ganhoAnual():Double {
      return  (salario + bonus) * 12
    }

    override fun exibirDados() {
        super.exibirDados()
        println("Bônus Salarial: $bonus")
    }
}