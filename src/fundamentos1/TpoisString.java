package fundamentos1;

import java.util.Locale;

public class TpoisString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal ".charAt((2)));


        String s = "Boa tarde";
        s = s.toUpperCase();
        s = "Bom dia";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase(Locale.ROOT).startsWith("Boa"));
        System.out.println(s.endsWith("tarde!"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("Boa tarde"));

        var nome = "Jhonatan";
        var sobrenome = "Tavares";
        var idade = 35;
        var salario = 12345.87;

        System.out.println("Nome: " + nome + "\nsobrenome " + sobrenome + "\nidade " + idade + "\n salario " + salario);
        System.out.printf("Nome: %s %s tem %d anoss e ganha %.2f" , nome, sobrenome,idade);

        

    }
}
