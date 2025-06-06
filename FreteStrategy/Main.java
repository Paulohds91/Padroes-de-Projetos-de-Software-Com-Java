public class Main {
    public static void main(String[] args) {
        // Criando a calculadora com estratégia normal
        CalculadoraFrete calculadora = new CalculadoraFrete(new FreteNormal());
        
        double peso = 10.0; // 10 kg
        
        // Calculando com frete normal
        System.out.println("Frete Normal: R$ " + calculadora.calcular(peso));
        
        // Mudando para frete expresso
        calculadora.setEstrategia(new FreteExpresso());
        System.out.println("Frete Expresso: R$ " + calculadora.calcular(peso));
        
        // Mudando para frete econômico
        calculadora.setEstrategia(new FreteEconomico());
        System.out.println("Frete Econômico: R$ " + calculadora.calcular(peso));
        
        // Testando a nova estratégia de frete premium
        calculadora.setEstrategia(new FretePremium());
        System.out.println("Frete Premium: R$ " + calculadora.calcular(peso));
    }
} 