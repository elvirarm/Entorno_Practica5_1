//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val estudiante1 = Estudiante("Maria", "77176762D")
    val estudiante2 = Estudiante("Roberta", "88765623D")

    val curso1 = Curso("DAM", "1234")
    val curso2 = Curso("DAW", "4321")

    estudiante1.inscribirse(curso1)

    curso2.agregarAlumnos(estudiante2)

    curso1.mostrarEstudiantes()

    curso2.mostrarEstudiantes()


}