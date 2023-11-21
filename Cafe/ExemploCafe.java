package Cafe;

public class ExemploCafe {

    public static void main(String[] args) {
        // Cafe simples
        Cafe cafe = new CafeSimples();
        System.out.println("Descrição: " + cafe.descricao());
        System.out.println("Custo: $" + cafe.custo());

        // Cafe com Leite
        Cafe cafeComLeite = new LeiteDecorator(new CafeSimples());
        System.out.println("\nDescrição: " + cafeComLeite.descricao());
        System.out.println("Custo: $" + cafeComLeite.custo());

    }
}
