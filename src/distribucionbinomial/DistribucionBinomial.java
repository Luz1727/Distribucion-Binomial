package distribucionbinomial;

import java.util.Scanner;
public class DistribucionBinomial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DistribucionBinomial factorial = new DistribucionBinomial();
        System.out.println("Ingresa X= numero de clientes nuevos: ");
        int x = entrada.nextInt();
        System.out.println("Ingresa n= numero de ensayos: ");
        int n = entrada.nextInt();
        System.out.println("Ingresa P= la probabilidad de exito: ");
        double P = entrada.nextDouble();
        int num = n - x;
        double res = 1 - P;
        double factorialR = factorial.factorialN(n) / (factorial.factorialX(x) * factorial.factorialNum(num));
        double p = factorialR * ((Math.pow(P, x)) * (Math.pow(res, num)));
        System.out.println("f(" + x + ")=P(X=" + x + ")= " + p+ "\n");
        System.out.println("En pocentje:" + "\n" + p + " = " + (p * 100) + "%");
    }

    public static int factorialX(int x) {
        //validar
        if (x < 0) {
            return 0;
        } else {
            //caso base
            if (x == 0) {
                return 1;
            } else {
                //Dominio (-1)
                return x * factorialX(x - 1);
            }
        }
    }

    public static int factorialN(int n) {
        //validar
        if (n < 0) {
            return 0;
        } else {
            //caso base
            if (n == 0) {
                return 1;
            } else {
                //Dominio (-1)
                return n * factorialN(n - 1);
            }
        }
    }

    public static int factorialNum(int num) {
        //validar
        if (num < 0) {
            return 0;
        } else {
            //caso base
            if (num == 0) {
                return 1;
            } else {
                //Dominio (-1)
                return num * factorialNum(num - 1);
            }
        }
    }
}
