package funcionario

class AssistenteAdministrativo(
    nome: String,
    salario: Double,
    matricula: Int,
    var turno: String,
    val adicionalNoturno: Double
): Assistente(nome, salario, matricula) {

    fun turno(novoTurno: String){
        turno = novoTurno
    }
    override fun ganhoAnual():Double {
       return if (turno.lowercase() == "noite"){
            (salario + adicionalNoturno) * 12
        } else{
            salario * 12
        }
    }

    override fun exibirDados() {
        super.exibirDados()
        println("Turno: $turno")
        println("Adicional Noturno: $adicionalNoturno")
    }
}