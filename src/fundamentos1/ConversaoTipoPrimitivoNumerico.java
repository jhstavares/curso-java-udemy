package fundamentos1;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        // Convers�o implicita
        double a = 1;
        System.out.println(a);

        //Convers�o explicita = perda de informa��o (CAST)
        float b = (float) 1.0;
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // Convers�o explicita (Cast)
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);


    }
}
