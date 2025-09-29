import java.util.Scanner;

public class SumaDigitos {
    
    public static int sumarDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }
        return numero % 10 + sumarDigitos(numero / 10);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Ingresa un numero: ");
            String entrada = sc.nextLine();
            
            for (char c : entrada.toCharArray()) {
                if (!Character.isDigit(c)) {
                    System.out.println("Error");
                    return;
                }
            }
            
            int[] digitos = new int[entrada.length()];
            
            for (int i = 0; i < entrada.length(); i++) {
                digitos[i] = Character.getNumericValue(entrada.charAt(i));
            }
            
            for (int i = 0; i < digitos.length; i++) {
                System.out.print(digitos[i]);
                if (i < digitos.length - 1) {
                    System.out.print("+");
                }
            }
            System.out.println();
            
            int numero = Integer.parseInt(entrada);
            int suma = sumarDigitos(numero);
            System.out.println(suma);
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        sc.close();
    }
}