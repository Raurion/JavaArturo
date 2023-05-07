import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "la conchaaaa, mete un entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("el numero binario de " + numeroDecimal + " es " + 
                Integer.toBinaryString(numeroDecimal));
        
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroBinario + " es " +Integer.toOctalString(numeroBinario));

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);



        String mensaje = "el numero binario de " + numeroDecimal + " es " +
                Integer.toBinaryString(numeroDecimal);
        mensaje += "\n numero octal de " + numeroBinario + " es " + Integer.toOctalString(numeroBinario);

        System.out.println(mensaje);










    }

}