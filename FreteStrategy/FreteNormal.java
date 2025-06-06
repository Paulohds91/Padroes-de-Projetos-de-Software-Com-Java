public class FreteNormal implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 1.5; // R$ 1,50 por kg
    }
} 