package fundamentos2.Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a';
        System.out.println(a == b);

        System.out.println('\u0061');

        System.out.println(3>4);
        System.out.println(3>=3);
        System.out.println(3<7);
        System.out.println(30<=7);
        System.out.println(30!=7);

        double nota = 9.0;
        boolean bomCompor = false;
        boolean passouPorMe = nota >=7;
        boolean temDesc = bomCompor && passouPorMe;

        System.out.println("Tem desconsto? " + temDesc);

    }
}
