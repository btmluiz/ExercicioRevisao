package br.com.aularevisao

class Curso(var nome: String, var professor: Professor){
    var aulaLista = arrayListOf<Aula>()
    var listAlunos =  arrayListOf<Aluno>()

    fun addAulas(vararg x: Aula) = aulaLista.addAll(x)

    fun addAlunos(vararg x: Aluno) = listAlunos.addAll(x)
}