package fundamentos2.Operadores;

import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero");
        double n1 = scanner.nextDouble();

        System.out.println("Informe outro numero");
        double n2 = scanner.nextDouble();

        System.out.println("Informe a operação");
        String op = scanner.next();

        double resultado = "+".equals(op) ? n1 + n2 : 0;
        resultado = "-".equals(op) ? n1 - n2 :resultado;
        resultado = "*".equals(op) ? n1 * n2 :resultado;
        resultado = "/".equals(op) ? n1 / n2 :resultado;
        resultado = "%".equals(op) ? n1 % n2 :resultado;

        System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2 , resultado);

        scanner.close();

    }
}
