import java.util.Scanner;



public class practica {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                leer numeros hasta que se introduzca un 0. para cada uno indicar si es par o impar
                int n1;
                System.out.println("ingrese un numero para saber si es par o impar");
                n1 = scanner.nextInt();

                while (n1 != 0) {
                        if (n1 % 2 == 0) {
                                System.out.println("el numero " + n1 + " es par");
                        }
                        else {
                                System.out.println("el numero " + n1 + " es impar");
                        }

                        System.out.println("ingrese un numero para saber si es par o impar");
                        n1 = scanner.nextInt();
                }