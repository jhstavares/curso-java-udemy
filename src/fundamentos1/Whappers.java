package fundamentos1;

import java.util.Scanner;

public class Whappers {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //byte
        // Com as letras maiusculas são classes
        // Com letras minuscula são classes
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt("1000"); // int - tipo primitos
        Long l = 100000l;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i *3);
        System.out.println(l/3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        System.out.println(bo.toString());

        Character c = '#'; // char
        System.out.println(c + "...");

        entrada.close();

    }


}
