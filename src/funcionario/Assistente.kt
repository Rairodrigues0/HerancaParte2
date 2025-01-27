package funcionario

open class Assistente(
    nome: String,
    salario: Double,
    val matricula: Int
): Funcionario(nome, salario) {
    override fun exibirDados() {
    super.exibirDados()
        println("O número da matrícula é: $matricula")
    }
}