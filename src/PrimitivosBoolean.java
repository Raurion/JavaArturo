public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 1295.4e-3; //1.2954
        float f = 1.234e2f; // 123.4

        datoLogico = d < f;

        System.out.println(datoLogico);
        
        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);

    }
}
