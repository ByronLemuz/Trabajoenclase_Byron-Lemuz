/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.en.clase_.byron.lemuz;

import java.util.*;

/**
 *
 * @author lesly
 */
public class TrabajoEnClase_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner lea = new Scanner(System.in);

        boolean centinela = true;
        auto ma = new auto();
        while (centinela == true) {
            System.out.println("=======================Menu=====================");
            System.out.println("1)Entradas ");
            System.out.println("2)Salir");
            System.out.println("================================================");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.print("Ingrese tamaño:");
                    int size1 = lea.nextInt();
                    int[]a=new int[size1];
                    System.out.println("Arreglo base");
                    a = ma.Lectura(size1);   
                    ma.Imprimir(a);
                    System.out.println("Arreglo ordenado");
                    ma.Imprimir(ma.Ordenar(a, size1));
                    System.out.println();

                    String []arreglo = new String[size1];  
                    System.out.println("Arreglo final :");
                    arreglo = ma.split(a);
                    ma.Imprimirc(arreglo);
                }//fin del case 1
                break;
                case 2:
                    centinela = false;
                    break;

                default:
                    System.out.println("Opcion Incorrecta");
            }//fin del switch
        }//fin while
    }
}

    
    

