package br.com.aularevisao

class Aluno (var ra:Int,var nome:String,var sobrenome:String){

    fun assistiAula(aula: Aula){
        println("$nome assistindo a aula ${aula.nomeMateria}")
    }

    fun fazerLicao(aula: Aula){
        println("$nome esta fazendo a lição da materia ${aula.nomeMateria}")
    }
}

