/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenes;

import java.util.Scanner;

public class ejecutor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        funciones4 f = new funciones4();

        
        int[] arreglo = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("elija un orden:");
        System.out.println("1. preorden");
        System.out.println("2. inorden");
        System.out.println("3. postorden");
        System.out.print("> ");
        int opcion = sc.nextInt();

        System.out.print("los indices recorridos fueron: ");
        switch(opcion) {
            case 1:
                f.preorden(arreglo, 0);
                break;
            case 2:
                f.inorden(arreglo, 0);
                break;
            case 3:
                f.postorden(arreglo, 0);
                break;
            default:
                System.out.println("opción no válida");
        }
        sc.close();
    }
}
