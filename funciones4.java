/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenes;

public class funciones4 {
    
    public void preorden(int[] arr, int i) {
        if (i < arr.length) {
            System.out.print(i + " ");
            preorden(arr, 2 * i + 1);
            preorden(arr, 2 * i + 2);
        }
    }

    
    public void inorden(int[] arr, int i) {
        if (i < arr.length) {
            inorden(arr, 2 * i + 1);
            System.out.print(i + " ");
            inorden(arr, 2 * i + 2);
        }
    }

    
    public void postorden(int[] arr, int i) {
        if (i < arr.length) {
            postorden(arr, 2 * i + 1);
            postorden(arr, 2 * i + 2);
            System.out.print(i + " ");
        }
    }
}
