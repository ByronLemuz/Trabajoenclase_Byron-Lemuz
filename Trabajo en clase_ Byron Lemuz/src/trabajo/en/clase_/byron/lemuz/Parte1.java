/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.en.clase_.byron.lemuz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lesly
 */
class auto {
    Scanner lea=new Scanner (System.in);
    static Random r=new Random ();
    
    public  int[] Lectura(int size){
      int temporal [] = new int [size];
      for(int i=0; i < size;i++){
         temporal [i]= 1 + r.nextInt(15);
         
      }//fin del for
      return temporal;
    }//fin del metodo
    public  void Imprimir(int []arreglo){
      
      for(int i=0; i < arreglo.length;i++){
         
          System.out.println(arreglo[i]);
      }//fin del for
      
    
  }//fin del metodo
public  int[] Ordenar(int[]a, int size1){
        int ordenado = 0;
        int respuesta[] = new int[size1];
        for (int i = 0; i < (size1 - 1); i++) {
            for (int j = (i + 1); j < size1; j++) {
                if(a[i] > a[j]){
                    ordenado = a[i];
                    a[i] = a[j];
                    a[j] = ordenado;
                }
            }
        }
        for (int i = 0; i < size1; i++) {
            respuesta[i] = a[i]; 
        }
        return respuesta;
  }
public String [] convertir(String a[]) {
          String temp[]= new String[a.length];
          for (int i = 0; i < a.length; i++) {
              if (a[i].equals("1")) {
                  temp[i]="uno";
              }
              else if (a[i].equals("2")) {
                  temp[i]="dos";
              }
              else if (a[i].equals("3")) {
                  temp[i]="tres";
              }
              else if (a[i].equals("4")) {
                  temp[i]="cuatro";
              }
else if (a[i].equals("5")) {
                  temp[i]="cinco";
              }
              else if (a[i].equals("6")) {
                  temp[i]="seis";
              }
              else if (a[i].equals("7")) {
                  temp[i]="siete";
              }
              else if (a[i].equals("8")) {
                  temp[i]="ocho";
              }
              else if (a[i].equals("9")) {
                  temp[i]="nueve";
              }
              else if (a[i].equals("10")) {
                  temp[i]="diez";
              }
        
              else if (a[i].equals("11")) {
                  temp[i]="once";
              }
              else if (a[i].equals("12")) {
                  temp[i]="doce";
              }
              else if (a[i].equals("13")) {
                  temp[i]="trece";
              }
              else if (a[i].equals("14")) {
                  temp[i]="catorce";
              }
              else if (a[i].equals("15")) {
                  temp[i]="quince";
              }
              
          }
return temp;
}
public String[] split(int []a) {
          int b= a.length/2;
            int cont1=0;int cont = 0;
         
           String temp1[]= new String[b];
           String  temp2[]=new String[b];
           String arreglo[]=new String[a.length];
           for (int i = 0; i < a.length; i++) {
               if (i<b) {
                   temp1[cont1]=Integer.toString(a[i]);
                   cont1=cont1+1;
               }
               else{
                   temp2[cont]=Integer.toString(a[i]);
                   cont =cont+1;
                 }
          
            }
          
          
           cont1=0;cont =0;
           for (int i = 0; i < arreglo.length; i++) {
               if (i<arreglo.length/2) {
                   arreglo[i]=temp1[cont1];
                   cont1=cont1+1;
               }
               else{
                   arreglo[i]= temp2[cont] ;
                   cont=cont+1;
          }
           
          }
           return arreglo;
      
}
public  void Imprimirc(String []arreglo){
      
      for(int i=0; i < arreglo.length;i++){
         
          System.out.println(arreglo[i]);
      }//fin del for
      
    
  }
}


