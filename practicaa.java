import java.util.Scanner;

public class practicaa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][], matriz2[][], nfilas, ncol, nfilas2, ncol2;

        System.out.println("ingrese el numero de filas");
        nfilas = scanner.nextInt();
        System.out.println("ingrese el numero de columnas");
        ncol = scanner.nextInt();

        matriz = new int[nfilas][ncol];

        System.out.println("digite la matriz 1");
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.println("matriz [" + i + "] [" + j + "] ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("ingrese el numero de filas de la 2da matriz");
        nfilas2 = scanner.nextInt();
        System.out.println("ingrese el numero de columnas de la 2da matriz");
        ncol2 = scanner.nextInt();
        System.out.println("digite la matriz 2");
        matriz2 = new int[nfilas2][ncol2];

        for (int i = 0; i < nfilas2; i++) {
            for (int j = 0; j < ncol2; j++) {
                System.out.println("matriz [" + i + "] [" + j + "] ");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        System.out.print("la suma de las matrices es: ");
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.print(matriz[i][j] + matriz2[i][j]+ "");

            }
            System.out.println("");
        }
    }
}

