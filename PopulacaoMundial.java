/**
 *
 * @author felipe
 */
public class PopulacaoMundial {

    public static void main(String[] args) {

        double taxa = 1.07;

        double pop = Double.parseDouble("7714576923");
        double anos =Double.parseDouble(args[0]);
        double total = (pop + (pop * taxa/100)) * anos;

        System.out.println(total+" pessoas");
        
        
        
        
    }
}
