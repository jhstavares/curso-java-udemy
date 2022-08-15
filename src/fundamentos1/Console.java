package fundamentos1;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" Dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Salário: %.1f%n", 1234.5678);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite a sua idade");
        int idade = entrada.nextInt();
        System.out.printf("%s%s tem %d anos.%n",
                nome, sobrenome, idade);

        entrada.close();


    }
}
