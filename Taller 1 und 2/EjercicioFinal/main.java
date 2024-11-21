package EjercicioFinal;

import java.util.Scanner;
import Ejercicio1.Libro;
import Ejercicio2.CuentaBancaria;
import Ejercicio3.Estudiante;

public class main {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Datos del libro//
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el numero de paginas del libro:");
        int anioPublicacion = scanner.nextInt();
        scanner.nextLine();
        Libro libro1 = new Libro(titulo, autor, anioPublicacion);

//Datos de la cuenta bancaria//

        System.out.println("Ingrese el número de cuenta:");
        String numeroCuenta = scanner.nextLine();
        System.out.println("Ingrese el tipo de cuenta:");
        String tipoCuenta = scanner.nextLine();
        System.out.println("Ingrese el saldo de la cuenta:");
        int saldo = scanner.nextInt();
        scanner.nextLine();
        CuentaBancaria cuenta1 = new CuentaBancaria(numeroCuenta, tipoCuenta, saldo);

//Datos del estudiante/
        System.out.println("Ingrese el nombre del estudiante:");
        String nombreE = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edadE = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el curso del estudiante:");
        int cursoE = scanner.nextInt();
        Estudiante estudiante1 = new Estudiante(nombreE, edadE, cursoE);

//Impresión de datos//
        System.out.println(libro1);
        System.out.println(cuenta1);
        System.out.println(estudiante1);
        }
}
