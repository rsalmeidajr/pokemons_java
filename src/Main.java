import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon( 25, "Pikachu");
        Pokemon onix = new Pokemon( 98, "Onix");
        Pokemon vulpix = new Pokemon( 38, "Vulpix");

        List<Pokemon> pokemondoricardo = List.of(pikachu,onix,vulpix);

        for (Pokemon p : pokemondoricardo) {
            System.out.println(p.name);
        }
    }
}




