package fundamentos2.Operadores;

public class DesafioDeVariaVeis {
    public static void main(String[] args) {
        double nA = Math.pow(6*(3+2), 2);
        double deNa = 3*2;

        double nB = (1-5) * (2-7);
        double dB = 2;

        double sA = nA / nB;
        double sB = Math.pow(nA/nB,2);

        double S = Math.pow(sA - sB, 3);
        double I = Math.pow( 10,3);

        double resultado = S / I;

        System.out.println(" O resultado é " + resultado);
        }
    }

