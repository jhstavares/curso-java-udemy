package fundamentos1;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro salario");
        String v1 = entrada.next().replace(",",".");

        System.out.println("Informe o segunddo salario");
        String v2 = entrada.next().replace(",",".");

        System.out.println("Informe o terceiro salario");
        String v3 = entrada.next().replace(",",".");

        double s1 = Double.parseDouble(v1);
        double s2 = Double.parseDouble(v2);
        double s3 = Double.parseDouble(v3);

        double media = (s1 +s2 + s3) / 3;
        System.out.println("A média dos salarios é" + media);

        entrada.close();
    }
}
