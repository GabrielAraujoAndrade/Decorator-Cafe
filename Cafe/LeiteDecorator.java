package Cafe;

public class LeiteDecorator extends CafeDecorator {
    public LeiteDecorator(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Leite";
    }

    @Override
    public double custo() {
        return super.custo() + 0.5;
    }
}