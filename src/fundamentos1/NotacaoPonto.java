package fundamentos1;

public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 2.3;
        String s = "Bom dia X";
        s = s.replace("X", "SENHORA");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        System.out.println("LEO.".toUpperCase());

        String y = "Bom dia  X".replace("X", "GUi").toUpperCase().concat("!!!!");
        System.out.println(y);

        //Tipos primitivos não tem o operador "."


    }
}
