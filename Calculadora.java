/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.*;

/**
 *
 * @author Carlos Ulloa
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Scanner leer= new Scanner(System.in);
        int num1=0;
        int num2=0;
        int opera;
        float resultado=0 ;
        char opcion = 's';
        while (opcion=='s'||opcion=='s')
   
        {
        System.out.println("                CALCULADORA");
         System.out.println("Teclea 1 si deseas hacer una suma ");
          System.out.println("Teclea 2 si deseas hacer una resta ");
           System.out.println("Teclea 3 si deseas hacer una multiplicación ");
            System.out.println("Teclea 4 si deseas hacer una división ");
           opera= leer.nextInt();
            System.out.println("Teclea el numero 1");
            num1=leer.nextInt();
            System.out.println("Teclea el numero 2");
            num2=leer.nextInt();
           if(opera==1){
           resultado= num1+num2;
            
           }
           else if(opera==2){
           resultado= num1-num2;
           
           }
             if(opera==3){
           resultado= num1*num2;

           }
               if(opera==4){
           resultado= num1/num2;
        
           }
            System.out.println("El resultado es "+ resultado);
            System.out.println("¿Deseas hacer alguna otra opreración s/n?");
            opcion=leer.next().charAt(0);
       
        }
    }
    
}
