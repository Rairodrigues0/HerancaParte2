package funcionario

open class Funcionario (
    val nome: String,
    var salario: Double
){
    fun addAumento(valor: Double){
         salario += valor
    }

    open fun ganhoAnual(): Double{
        return salario * 12
    }

    open fun exibirDados(){
        println("O nome do funcionário é: $nome")
        println("O salário é: $salario ")

    }
}