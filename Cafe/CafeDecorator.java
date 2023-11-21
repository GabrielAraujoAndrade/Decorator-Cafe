package Cafe;


public abstract class CafeDecorator implements Cafe {
    private Cafe cafeDecorado;

    public CafeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public String descricao() {
        return cafeDecorado.descricao();
    }

    @Override
    public double custo() {
        return cafeDecorado.custo();
    }
}