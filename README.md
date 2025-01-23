# Entorno_Practica5_1



1.Interpreta el significado del diagrama de clases.

a) Relación entre las clases. Significado, tipo, multiplicidad. 


La clase Curso contiene la clase Estudiante, esto quiere decir que . Ambas son clases y la multiplicidad es de 1 a muchos. Un curso puede tener como mínimo 1 estudiante y como máximo muchos y los estudiantes pueden pertenecer como mínimo a 1 curso y como máximo a 1.

b) Elementos de las clases. Tipos y propósito. 

La clase Curso tiene 2 atributos de tipo String (que son cadenas de texto) donde se almacena información sobre el curso, el nombre y el código. Y además tiene una lista mutable (que se puede modificar en caso de que se necesitaran añadir nuevos alumnos).

A su vez contiene dos métodos agregarAlumno() y mostrarEstudiante()

La clase Estudiante por su parte tiene el nombre del alumno y su DNI en formato texto, además contiene un método para inscribirse al curso.

c)Significado del método agregarAlumno(). Funcionamiento. 

Es el método de la clase Curso y tiene como objetivo agregar un objeto de tipo Estudiante a la lista de estudiantes (estudiantes) del curso.

Recibe el estudiante por parámetro y lo añade a la lista mutable “estudiantes”.

d) Significado del método inscribirse()
El método agregarAlumno() pertenece a la clase Estudiante y permite que un estudiante se inscriba en un curso determinado.
Se le indica a qué curso quiere inscribirse a través de parámetros y después se añadiría el alumno a la lista de estudiantes mediante el método agregarAlumno()

2. Generación de código a partir del diagrama. 

a) Crear clases

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

class Estudiante (val nombre: String, val dni: String) {

    fun inscribirse(curso: Curso){
        curso.agregarAlumnos(Estudiante(nombre,dni))
    }
}



b) Crear relaciones

    estudiante1.inscribirse(curso1)

    curso2.agregarAlumnos(estudiante2)

    curso1.mostrarEstudiantes()

    curso2.mostrarEstudiantes()


c) Crear main (para probar el sistema).

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
