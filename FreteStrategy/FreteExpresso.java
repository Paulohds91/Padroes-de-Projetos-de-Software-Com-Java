public class FreteExpresso implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 2.5; // R$ 2,50 por kg
    }
} 