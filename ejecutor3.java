/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

public class ejecutor3 {
    public static void main(String[] args) {
        factorial f = new factorial();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ingrese un numero: ");
        int n1 = sc.nextInt();
        
        System.out.println("factorial de " + n1 + ": " + f.factorial(n1));
        
    }
}
