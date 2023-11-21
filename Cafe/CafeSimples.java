
package Cafe;

public class CafeSimples implements Cafe {
    @Override
    public String descricao() {
        return "Café Simples";
    }

    @Override
    public double custo() {
        return 2.0;
    }
}