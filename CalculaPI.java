/**
 *
 * @author felipr
 */
public class CalculaPI {

    public static void main(String[] args) {
        boolean mais = true;
        double pi = 0.0;
        double denominador = Double.parseDouble(args[0]);

        for (int i = 1; i <= denominador; i += 2) {
            if (mais) {
                mais = false;
                pi += (1.0 / i);
            } else {
                mais = true;
                pi -= (1.0 / i);
            }
        }
        pi *= 4;
        System.out.println("O valor de pi é: " + pi);
        double result = Math.PI / pi * 100;
        if (result > 100) {

            System.out.println("Erro: " + (result - 100) + "%");
        } else {
            System.out.println("Erro: " + result + "%");
        }
    }
}
