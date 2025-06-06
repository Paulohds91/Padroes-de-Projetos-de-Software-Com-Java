public class CalculadoraFrete {
    private FreteStrategy estrategia;

    public CalculadoraFrete(FreteStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(FreteStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double peso) {
        return estrategia.calcularFrete(peso);
    }
} 