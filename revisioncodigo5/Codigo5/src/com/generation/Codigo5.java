
package com.generation;

import java.util.Scanner;

//Este metodo pide al usuario que ingrese un número y luego 
//cuenta cuántos de sus dígitos son "afortunados" (es decir, si tiene: 3, 7, 8, 9) y cuántos no lo son. 
//Si tiene más dígitos afortunados que no afortunados, 
//el programa dice que el número es afortunado; de lo contrario, dice que no lo es.

public class Codigo5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        String ni = s.nextLine(); 
        int c = Integer.parseInt(ni);
        
        int afo = 0;
        int noAfo = 0;
        
        while (c > 0) {
            int digito = c % 10; 
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            c /= 10; 
        }
        
        
        if (afo > noAfo) {
            System.out.println("El " + ni + " es un número afortunado.");
        } else {
            System.out.println("El " + ni + " no es un número afortunado.");
        }
        
        s.close(); 
    }
}
