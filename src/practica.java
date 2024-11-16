import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;



public class practica {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                /* leer numeros hasta que se introduzca un 0. para cada uno indicar si es par o impar
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
*/
                /* Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,y mostrar cuantos numeros se han introducido
                int n1,i=0;
                System.out.println("ingresar un numero");
                n1 = scanner.nextInt();

               while (n1 >= 0) {
                       i++;
                       System.out.println("ingrese otro numero");
                       n1 = scanner.nextInt();
                }
                System.out.println("ingreso " +i+ " numeros");
                */
                /* Ejercicio 5: Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100, y luego ir     pidiendo números indicando
                “es mayor” o “es menor” según sea mayor o menor con respecto a N. El proceso termina     cuando el usuario acierta y mostrar el número de intentos.

                int n1, i=0, aleatorio;

                aleatorio = (int)(Math.random()*100);


                do{
                        System.out.println("ingresar un numero");
                        n1 = scanner.nextInt();

                if (n1 > aleatorio) {
                        System.out.println("el numero ingresado es menor");
                }
                        else{
                                System.out.println("el numero es mayor");
                        }
                        i++;
                }while (n1 != aleatorio);
                System.out.println(i+" intentos y el nuemero era " +aleatorio);
                */
                /* Ejercicio 6: Pedir numeros por teclado, hasta que ingresemos un cero. y mostrar la suma
                int n1, i = 0, n2 = 0;
                System.out.println("ingresar un numero");
                n1 = scanner.nextInt();

                while (n1 != 0) {
                        n2 += n1;
                        System.out.println("ingrese otro numero");
                        n1 = scanner.nextInt();
                }
                System.out.println("la suma de todos los numeros introducidos es de "+n2);
                */
                /* pedir numeros hasta que se introduzca uno negativo, y calcular la media
                int n1,n2=0,i=0,media;
                System.out.println("ingrese un numero");
                n1 = scanner.nextInt();

                while (n1 >= 0){
                        n2 += n1;
                        i++;
                        System.out.println("ingrese un numero");
                        n1 = scanner.nextInt();
                }
                media = n2 / i;
                System.out.println("la media de todos los numeros ingresados es de " +media);
                 */
                /* pedir un numero n, y mostrar todos los numeros del 1 al N
                int n1;
                System.out.println("ingresar un numero");
                n1 = scanner.nextInt();

                for (int i = 1;i<=n1;i++){
                        System.out.println(i);
                }
                */
                /* escribir todos los numeros del 100 al 0 de 7 en 7
                for (int i = 100;i >= 0;i -= 7) {
                        System.out.println(i);
                }
                */
                /* ejercicio 10: pedir 10 numeros y escribir la suma total.
                int n1,n2=0;
                System.out.println("ingresar un numero");
                n1 = scanner.nextInt();
                for (int i = 0; i < 9; i++) {
                        System.out.println("ingresar un numero");
                        n1 = scanner.nextInt();
                        n2 += n1;
                }
                System.out.println(n2);

                 */
                /*
                int n1,n2 = 1;
                for (int i = 1; i < 20; i +=2) {
                        n2 = n2 * i;
                }
                System.out.println(n2);
                */
                /*
                int n1,n2 = 1;
                System.out.println("escriba un numero para saber su factorial");
                n1 = scanner.nextInt();

                for (int i = 1;i <= n1;i++) {
                        n2 = n2 * i;

                }
                System.out.println(n2);
                 */
                /*
                int n1,cantidad0=0,cantidadPositivo=0,SumaPositivos=0,cantidadNegativo=0,sumaNegativos=0;
                float mediaSuma,MediaResta;
                for (int i = 0;i<=9;i++ ) {
                        System.out.println("ingrese un numero");
                        n1 = scanner.nextInt();

                        if (n1 == 0) {
                                cantidad0++;

                        } else if (n1 > 0) {
                                cantidadPositivo++;
                                SumaPositivos +=n1;
                        } else if (n1 < 0 ){
                                cantidadNegativo++;
                                sumaNegativos +=n1;
                        }


                        }
                        mediaSuma = (float)SumaPositivos / cantidadPositivo;
                        MediaResta = (float)sumaNegativos / cantidadNegativo;
                        System.out.println("cantidad de ceros " +cantidad0);
                        System.out.println("media de numeros positivos "+mediaSuma);
                        System.out.println("media de numeros negativos"+MediaResta);
                        */
                /*
                int [] numeros = new int [3];

                numeros [0] = 7;
                numeros [1] = 10;
                numeros [2] = 13;
                for (int i =0; i<3;i++){
                        System.out.println(i);
                }
                */
/*
                // Pedimos al usuario que ingrese el tamaño del arreglo
                System.out.println("Ingrese el tamaño del arreglo: ");
                int tamano = scanner.nextInt();

                // Creamos el arreglo con el tamaño especificado
                int[] arreglo = new int[tamano];

                // Pedimos al usuario que ingrese los elementos del arreglo
                System.out.println("Ingrese los elementos del arreglo: ");
                for (int i = 0; i < tamano; i++) {
                        System.out.println("elemento " + (i + 1) + ": ");
                        arreglo[i] = scanner.nextInt();

                }
                // Imprimimos los elementos del arreglo (opcional)
                System.out.println("Los elementos del arreglo son:");
                for (int i = 0; i < tamano; i++) {
                        System.out.println(arreglo[i]);
               }
 */
                /*
                String [] nombres = {"alejandro" , "maria" , "luisa", "juan", "narcisa", "luis", "roberto", "flor"};
                for(int i=0 ; i < nombres.length; i++){
                        System.out.println(nombres[i]);
                }
                 */
                /*
                String [] nombres = {"alejandro" , "maria" , "luisa", "juan", "narcisa", "luis", "roberto", "flor"};
                //for (tipoVariable elemento : coleccion) {
                for (String i: nombres){
                        System.out.println(i);
                }
                */
                /*
                int[] numeros = new int[5];
                System.out.println("ingrese 5 numeros");
                for (int i = 0; i < 5; i++) {
                        System.out.println("elemento " + (i + 1) + ": ");
                        numeros[i] = scanner.nextInt();
                }
                System.out.println("los numeros ingresados son: ");
                for (int i: numeros){
                        System.out.println(i);
                }  */
                /*
                int [] numeros = new int [5];
                System.out.println("ingrese 5 numeros ");
                for (int i = 4; i >= 0; i --){
                        numeros[i] = scanner.nextInt();
                }
                System.out.println("los numeros ingresados son: ");
                for (int i : numeros){
                System.out.println(i);
        }
                */
                /*
                float [] numeros = new float[5];
                float sumaPositivos = 0, sumaNegatios=0, mediaNegativos,mediaPositivos;
                int conteoPositivos=0,conteoNegativos=0, conteo0=0;

                System.out.println("ingrese los numeros para saber la media y cantidad de ceros");
                for (int i = 0; i < 5; i++) {
                        numeros[i] = scanner.nextFloat();
                        if (numeros[i] > 0) {
                                conteoPositivos++;
                                sumaPositivos += numeros[i];

                        } else if (numeros[i] < 0) {
                                conteoNegativos++;
                                sumaNegatios += numeros[i];

                        } else {
                                conteo0++;
                        }

                }
                mediaPositivos = sumaPositivos / conteoPositivos;
                mediaNegativos = sumaNegatios / conteoNegativos;
                System.out.println("la media de los positivos es "+mediaPositivos);
                System.out.println("la media de los negativos es "+mediaNegativos);
                System.out.println("la cantidad de ceros es "+conteo0);
                */
                /*
                int numeros [] = new int [10];

                System.out.println("ingrese los numeros");
                for (int i = 0;i<10;i++ ){
                        numeros [i] = scanner.nextInt();
                }
                System.out.println("lista de numeros ingresados");
                for (int i = 0; i < 5; i++){
                        System.out.println(+numeros[i]);
                        System.out.println(+numeros[9-i]);
                }
                */
                /*
                int tabla1[] = new int[10];
                int tabla2[] = new int[10];
                int tabla3[] = new int[20];

                System.out.println("ingrese 10 numeros para la tabla 1");
                for (int i = 0; i < 10; i++) {
                        tabla1[i] = scanner.nextInt();
                }
                System.out.println("ingrese 10 numeros para la tabla 2");
                for (int i = 0; i < 10; i++) {
                        tabla2[i] = scanner.nextInt();
                }
                int j = 0;
                for (int i = 0; i < 10; i++) {
                        tabla3[j] = tabla1[i];
                        j++;
                        tabla3[j] = tabla2[i];
                        j++;
                }
                System.out.println("los nomeros del 3er arreglo es ");
                for (int i = 0 ; i<20 ; i++){
                        System.out.println(tabla3[i]);
                }
                */
                /*
                int a[],b[],c[];
                a = new int [12];
                b = new int [12];
                c = new int [24];

                System.out.println("ingrese los 12 elementos de la tabla A");
                for (int i = 0; i<12; i++){
                        a [i] = scanner.nextInt();
                }
                System.out.println("ingrese los 12 elementos de la tabla B");
                for (int i = 0; i<12; i++){
                        b [i] = scanner.nextInt();
                }
                int j = 0;
                for (int i = 0;i<12; i+=3 ){
                        c [j++] = a [i];
                        c [j++] = a [i + 1];
                        c [j++] = a [i + 2];
                        c [j++] = b [i];
                        c [j++] = b [i + 1];
                        c [j++] = b [i + 2];

                }
                System.out.println("asi quedaria la tabla 3");
                for (int i = 0; i<24; i++){
                        System.out.println(c[i]);
                }
*/

/*
                int arreglo[],nelementos, aux;
                System.out.println("digite la cantidad de elementos");
                nelementos = scanner.nextInt();

                arreglo = new int [nelementos];

                for (int i=0; i<nelementos; i++) {
                        System.out.println("digite un numero ");
                        arreglo[i] = scanner.nextInt();
                }

                //metodo burbuja
                for (int i=0; i<nelementos-1;i++){
                        for (int j=0; j<nelementos-1;j++){
                                if (arreglo[j]>arreglo[j+1]){//si numero actual > numero siguiente
                               aux = arreglo[j];
                               arreglo[j] = arreglo[j+1];
                               arreglo[j+1] = aux;
                                }
                        }
                }
                //mostrar el arreglo ordenado en forma creciente
                System.out.println("arreglo ordenado de forma creciente: ");
                for (int i=0; i<nelementos;i++) {
                        System.out.println(arreglo[i]);
                }
                //mostrar el arreglo ordenado en forma decreciente
                System.out.println("arreglo ordenado de forma creciente: ");
                for (int i=nelementos-1; i >= 0;i--) {
                        System.out.println(arreglo[i]);
                        }
                */
                /*
                //ordenamiento por insercion
                int arreglo[],nelementos,pos, aux;

                System.out.println("digite la cantidad de elementos");
                nelementos = scanner.nextInt();

                arreglo = new int [nelementos];

                for (int i=0; i<nelementos; i++) {
                        System.out.println("digite un numero ");
                        arreglo[i] = scanner.nextInt();
                }
                for (int i=0; i<nelementos;i++){
                        pos=i;
                        aux=arreglo[i];

                        while ((pos>0) && (arreglo [pos-1 ] > aux)){
                                arreglo[pos] = arreglo[pos-1];
                                pos--;
                        }
                        arreglo [pos] = aux;
                }
                System.out.println("orden ascendente");
                for (int i=0; i<nelementos;i++) {
                        System.out.println(arreglo[i]);
                }
                System.out.println("orden descendente");
                for (int i=nelementos-1 ; i>=0;i--) {
                        System.out.println(arreglo[i]);
                }
                */
/*
                //busqueda secuencial (buscar dato en un arreglo)
                int arreglo [] = {4,1,5,2,3};
                int dato;
                boolean band = false;

                System.out.println("escriba el dato que quiere buscar");
                dato = scanner.nextInt();

                //busque secuencial
                int i = 0;
                while(i<5 && band == false){
                        if (arreglo[i] == dato){
                                band = true;
                        }
                        i++;
                }
                if (band == false){
                        System.out.println("el dato ingresado no se encuentra");
                }
                else {
                        System.out.println("el numero ha sido encontrado en la posicion: "+ (i-1));
                }
                */

/// DEFINICION DE MATRIZ
                /*
                int matriz[][] = {{1,2,3,},{4,5,6},{7,8,9}};

                for(int i=0; i<3; i++){
                        for(int j=0; j<3; j++) {
                                System.out.print(matriz[i][j]);
                        }
                        System.out.println("");
                }
                */
                /*

                int matriz[][], nfilas, ncol;

                System.out.println("ingrese el numero de filas");
                nfilas = scanner.nextInt();
                System.out.println("ingrese el numero de columnas");
                ncol = scanner.nextInt();

                matriz = new int[nfilas][ncol];

                System.out.println("digite la matriz");
                for (int i = 0; i < nfilas; i++) {
                        for (int j = 0; j < ncol; j++) {
                                System.out.println("matriz [" + i + "] [" + j + "] ");
                                matriz[i][j] = scanner.nextInt();


                        }
                }
                for (int i = 0; i < nfilas; i++) {
                        for (int j = 0; j < ncol; j++) {
                                System.out.print(matriz[i][j]);
                        }
                        System.out.println("");
                }
                */

                /*
                int matriz[][], nfilas, ncol;
                boolean simetrica = true;

                System.out.println("ingrese cuantas filas va a tener matriz");
                nfilas = scanner.nextInt();
                System.out.println("ingrese cuantas columnas va a tener matriz");
                ncol = scanner.nextInt();
                matriz = new int[nfilas][ncol];

                System.out.println("ingrese los datos para la matriz");
                for (int i = 0; i < nfilas; i++) {
                        for (int j = 0; j < nfilas; j++) {
                                System.out.println("matriz [" + i + "] [" + j + "]");
                                matriz[i][j] = scanner.nextInt();
                        }
                }
                if (nfilas == ncol) {
                        int i = 0, j = 0;
                        while (i < nfilas && simetrica == true) {

                                while (j < i && simetrica == true) {
                                        if (matriz[i][j] != matriz[j][i]) {
                                                 simetrica = false;
                                        }
                                        j++;
                                }
                                i++;
                        }
                        if (simetrica == true) {
                                System.out.println("la matriz es simetrica");
                        } else {
                                System.out.println("la matriz no es simetrica");
                        }
                } else {
                        System.out.println("no es simetrica");
                }

                 */
// sumar matrices
/*
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
 */
//transponer un matriz
 /*
 int matriz[][], nfilas, ncol;

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


System.out.println("la matriz original es: ");
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }
        int aux=0;
        for (int i=0; i<nfilas;i++){
            for (int j=0; j<i;j++){
                aux = matriz[i][j];
                matriz [i][j] = matriz [j][i];
                matriz[j][i]=aux;

            }
        }
        System.out.println("la matriz transpuesta es: ");
        for (int i=0; i<nfilas;i++){
            for (int j=0; j<ncol;j++){
                System.out.print(matriz[i] [j]);
            }
            System.out.println(" ");
        }
    }
}
  */
//los elementos de la diagonal principal son 1 y los demas 0
 /*

        for (int i = 0; i < 7; i++) {
            matriz[i][i] = 1;
        }

            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println(" ");
            }
  */
//mostrar la suma de cada fila y cada columna
 /*
  int matriz[][], nfilas, ncol, aux ,aux2 ;

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
        for (int i = 0; i < nfilas; i++) {
            aux=0;
            for (int j = 0; j < ncol; j++) {
                aux += matriz[i][j];
            }
            System.out.println("la suma de las fila " + i + " es " + aux);
        }
        System.out.println(" ");
        for (int j = 0; j < nfilas; j++) {
            aux2=0;
            for (int i = 0; i < ncol; i++) {
            aux2 +=matriz[i][j];
            }
            System.out.println("la suma de la columna "+j+" es: "+aux2);
        }
        System.out.println(" ");
  */
//utilizando dos matrices 5x9 y 9x5, cargar la primera y transponerla a la segunda
                /*
                int matriz[][] = new int[5][9],aux,matriz2[][] = new int[9][5];;


        System.out.println("digite la matriz 5x9");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("matriz [" + i + "] [" + j + "] ");
                matriz[i][j] = scanner.nextInt();

            }
        }
        System.out.println("la matriz original es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j]);

            }
            System.out.println(" ");
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                matriz2[i][j] = matriz[j][i];
            }
        }
        System.out.println("la matriz transpuesta es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j]);

            }
            System.out.println(" ");
        }
                 */
 // hacer un cruadrado con 1
                /*
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
                 */
//POO
//ATRIBUTOS (CARACTERISTICAS): color, marca, km  /ejemplo auto
//METODOS (ACCIONES):encender, acerlerar, frenar   /ejemplo auto
//CLASES: es un conjunto de objetos con caracteristicas similares
/*
Coche
-color
-marca
-km
encender()
acelerar()
frenar()
 */
        }
}