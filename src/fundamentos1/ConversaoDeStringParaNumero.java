package fundamentos1;

import javax.swing.*;

public class ConversaoDeStringParaNumero {
    public static void main(String[] args) {
        String v1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String v2 = JOptionPane.showInputDialog("Digite o primeiro número");

        System.out.println(v1 + v2);

        double n1 = Double.parseDouble(v1);
        double n2 = Double.parseDouble(v2);

        double soma = n1 + n2;
        System.out.println("soma é" + soma);
        System.out.println("Média é" + soma / 2);


    }

}