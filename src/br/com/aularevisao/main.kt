package br.com.aularevisao

fun main() {

    val materia1 = Materia("Matematica")
    val materia2 = Materia("Quimica")
    val materia3 = Materia("Fisica")

    val aula1 = Aula(materia1, "8:45", "9:30")
    val aula2 = Aula(materia2, "9:31", "10:15")
    val aula3 = Aula(materia3, "10:16", "11:00")

    val aluno1 = Aluno(1, "Pedrinho", "Horizonte")
    val aluno2 = Aluno(2, "Ana", "Roberta")
    val aluno3 = Aluno(3, "Gustavo", "Araujo")

    val professor = Professor("Jessica", 1)

    val curso = Curso("Curso de exatas", professor)
    curso.addAlunos(aluno1, aluno2, aluno3)
    curso.addAulas(aula1, aula2, aula3)

    val turma = Turma("Turma de extas", curso)


    turma.curso.aulaLista.forEach() { it ->
        turma.curso.professor.darAula(it)
        turma.curso.professor.fazerChamada(turma.curso.listAlunos, it)
        turma.curso.listAlunos.forEach { ita ->
            ita.assistiAula(it)
        }
    }
}