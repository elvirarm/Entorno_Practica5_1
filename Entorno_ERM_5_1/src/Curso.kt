class Curso (val nombre: String, val codigo: String) {

    var estudiantes: MutableList<Estudiante> = mutableListOf()

    fun agregarAlumnos (estudiante: Estudiante){
        estudiantes.add(estudiante)
    }

    fun mostrarEstudiantes(){
        for(estudiante in estudiantes){
            println("${estudiante.nombre}  ${estudiante.dni}")
        }
    }
}