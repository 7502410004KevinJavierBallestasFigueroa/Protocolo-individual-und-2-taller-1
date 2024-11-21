package Ejercicio3;

public class Estudiante {

        private String nombre;
        private int edad;
        private int curso;
    
        public Estudiante(){
            this.nombre = "Hector";
            this.edad = 26;
            this.curso = 10;
            
        }
        public Estudiante(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
        }
        public Estudiante(String nombre, int edad, int curso){
            this(nombre, edad);
            this.curso = curso;
        }
        @Override
        public String toString() {
            return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + "]";
        }
        
        }

