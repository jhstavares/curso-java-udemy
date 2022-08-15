package fundamentos1;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        // Conversão implicita
        double a = 1;
        System.out.println(a);

        //Conversão explicita = perda de informação (CAST)
        float b = (float) 1.0;
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // Conversão explicita (Cast)
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);


    }
}
