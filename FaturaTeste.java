/**
 *
 * @author felipe
 */
public class FaturaTeste {

    public static void main(String[] args) {
        String codigo = args[0];
        String descricao = args[1];
        int qtd = Integer.parseInt(args[2]);
        double preco = Double.parseDouble(args[3]);


        Fatura fatura = new Fatura(codigo, descricao, qtd, preco);

        System.out.println("Código: " + fatura.getCodigo());
        System.out.println("\nDescrição: " + fatura.getDescricao());
        System.out.println("nQuantidade: " + fatura.getQtd());
        System.out.println("\nPreço Unitário: R$ " + fatura.getPreco());
        System.out.println("\nTotal: R$ " + fatura.totalFaturado());
    }
}
