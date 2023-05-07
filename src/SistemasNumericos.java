import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"ingrese un numero entero");

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

        JOptionPane.showMessageDialog(null,mensaje);










    }

}