public class FreteEconomico implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 1.0; // R$ 1,00 por kg
    }
} 