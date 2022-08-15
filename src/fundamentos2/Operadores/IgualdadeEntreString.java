package fundamentos2.Operadores;

import java.util.Scanner;

public class IgualdadeEntreString {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner scanner = new Scanner(System.in);
        String s2 = scanner.next();
        System.out.println("2" ==s2);
         scanner.close();
    }
}
