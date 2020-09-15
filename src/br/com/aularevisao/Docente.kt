package br.com.aularevisao

interface Docente {
    fun darAula(aula: Aula)

    fun fazerChamada(alunos: List<Aluno>)
}