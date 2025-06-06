public class FretePremium implements FreteStrategy {
    private static final double TAXA_BASE = 3.0; // R$ 3,00 por kg
    private static final double TAXA_SEGURO = 5.0; // R$ 5,00 fixo para seguro
    
    @Override
    public double calcularFrete(double peso) {
        // Cálculo do frete premium inclui seguro e taxa base mais alta
        return (peso * TAXA_BASE) + TAXA_SEGURO;
    }
} 