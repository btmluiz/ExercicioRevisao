package br.com.aularevisao

class Professor (var nome: String, var rd: Int) : Docente {

    override fun darAula(aula: Aula) {
        println("O professor $nome esta dando a aula: ${aula.nomeMateria}")
    }

    override fun fazerChamada(alunos: List<Aluno>){
        println("O professor $nome esta fazendo a chamada")
    }
}