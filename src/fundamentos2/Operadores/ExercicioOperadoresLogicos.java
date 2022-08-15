package fundamentos2.Operadores;

public class ExercicioOperadoresLogicos {
    public static void main(String[] args) {
        boolean t1 = true;
        boolean t2 = false;

        boolean compTV50 = t1 && t2;
        boolean compTV32 = t1 ^ t2;
        boolean compSor = t1 || t2;

        // operadores Unários!

        boolean maisSaudaveis = ! compSor;

        System.out.println("Comprou TV 50\"?" + compTV50);
        System.out.println("Comprou tv 32\"?" + compTV32);
        System.out.println("Comprou Soverte? " + compSor);
        System.out.println("Mais saudaveis? " + maisSaudaveis);
    }
}
