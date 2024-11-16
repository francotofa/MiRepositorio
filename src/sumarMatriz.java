import java.util.Scanner;

public class sumarMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[5][5];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    matriz [i][j] = 1;
                }
                else if (j == 0 || j == 4) {
                    matriz [i][j] = 1;
                }
                else {
                    matriz[i][j] =0;
                }
            }
        }
                System.out.println("\nMatriz\n");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(matriz[i][j] + "  ");
                    }
                    System.out.println(" ");
                }
            }
        }