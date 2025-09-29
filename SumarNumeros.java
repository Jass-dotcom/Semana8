/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones2;


public class SumarNumeros {
    public int sumaDigitos(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumaDigitos(n / 10);
        }
    }
}
