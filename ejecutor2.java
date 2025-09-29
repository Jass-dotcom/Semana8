/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones2;

import java.util.Scanner;

public class ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumarNumeros f = new SumarNumeros();
        System.out.print("ingrese varios numeros: ");
        int n = sc.nextInt();
        System.out.println("suma de digitos de " + n + ": " + f.sumaDigitos(n));
        sc.close();
    }
}
