enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        this.inscritos.add(usuario)
    }
}

fun main() {
    var formacao: Formacao = Formacao(nome = "teste", conteudos = mutableListOf(ConteudoEducacional("conteudo teste")))
    val usuario = Usuario()
    formacao.matricular(usuario)
    println(formacao.inscritos)
}
