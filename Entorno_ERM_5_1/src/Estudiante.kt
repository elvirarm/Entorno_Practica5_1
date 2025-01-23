class Estudiante (val nombre: String, val dni: String) {

    fun inscribirse(curso: Curso){
        curso.agregarAlumnos(Estudiante(nombre,dni))
    }
}