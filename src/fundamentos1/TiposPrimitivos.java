package fundamentos1;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informação do Funcionário

        //Tipo numéricos inteiros
        byte anosDeEmresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcomulados = 3_134_845_223l;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.91;

        // Tipo Boolean
        boolean  estaDeFerias = false; // true

        // Tipos Caractere
        char status = 'A'; // Ativo

        // Dias de Empresa
        System.out.println(anosDeEmresa * 365);

        // Numero de Viagens
        System.out.println( numeroDeVoos /2);

        // ponto por real
        System.out.println( pontosAcomulados / vendasAcumuladas);

        System.out.println(id + "; ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " +status);

    }
}
