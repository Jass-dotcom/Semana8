/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

public class ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci f = new Fibonacci();
        System.out.print("ingrese un numero: ");
        int n = sc.nextInt();
        System.out.println("fibonacci de " + n + ": " + f.fibonacci(n));
        sc.close();
    }
}
