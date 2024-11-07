//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("xxx"); //mostrar en pantalla
        System.out.println("xxx"); //mostrar en pantalla con salto de linea

/*
VARIABLES PRIMITIVAS ~enteros: long int short byte ~decimales: double, float
        ~caracter: 'char'
        ~true or false: boolean
        String: Cadena de "caracteres"
          NO PRIMITIVO
         ~integer
*/
        Scanner xx = new Scanner(System.in); // entrada de datos por usuarios
        int numero = 5, numero2;
        System.out.print("ingrese un numero");
        numero = xx.nextInt();

        // int = xx.nextInt(); / float = xx.nextFloat(); ,/ double = xx.nextDouble(); String = xx.nextLine(); / char = xx.next().chartAt(0);

         numero = numero + 5 ;
         numero +=  5 ;
         numero++ ;
         numero2 = numero++; // numero2=5 numero=6
         numero2 = ++numero; // numero2=6 numero=6

        //Clase Math

        double raiz = Math.sqrt(9); // 9 = numero que quiero saber la raiz
        double base=2, exponente=4 ;
        double resultado = Math.pow(base,exponente); //potencia

        double numeroAleatorio = Math.random();
        //redondear
        double num = 4.46;
        long result = Math.round(num);
        float nume = 4.46f;
        int resulta = Math.round(nume);

        /*
        if (condicion){
            instruccion1;
        }
        else{
            instruccion2;
        }

        switch(dato){
            case n: instruccionesN
                    break;
            default: casoContrario;
                    break;
        }

(Character.isUpperCase())

        (mientras)
        while (condicion){
            instrucciones;
        }

        do{
            instrucciones;
         }while(condicion);


         for (inicializacion ; condicion ;aumento o decremento) {
            instrucciones;
         }



                int [] numeros = new int [3];

                numeros [0] = 7;
                numeros [1] = 10;
                numeros [2] = 13;
                for (int i =0; i<3;i++){
                        System.out.println(i);

                int [] numeros = {5,7,9,};
         */




























    }
}