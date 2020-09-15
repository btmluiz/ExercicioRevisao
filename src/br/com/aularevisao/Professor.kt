package br.com.aularevisao

class Professor (var nome: String, var rd: Int) : Docente {

    override fun darAula(aula: Aula) {
        println("O professor $nome esta dando a aula: ${aula.nomeMateria.nome}")
    }

    override fun fazerChamada(alunos: List<Aluno>,  aula: Aula){
        println("O professor $nome esta fazendo a chamada da aula: ${aula.nomeMateria.nome}")
    }
}