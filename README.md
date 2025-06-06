# Calculadora de Fretes - Padrão Strategy

Este projeto implementa uma calculadora de fretes utilizando o padrão de projeto Strategy em Java. O sistema permite calcular o valor do frete baseado em diferentes estratégias de entrega.

## Descrição

O projeto demonstra a aplicação do padrão Strategy para calcular o valor do frete de acordo com diferentes modalidades de entrega:
- Frete Econômico
- Frete Normal
- Frete Expresso
- Frete Premium

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `FreteStrategy.java` - Interface que define o contrato para as estratégias de frete
- `FreteEconomico.java` - Implementação da estratégia de frete econômico
- `FreteNormal.java` - Implementação da estratégia de frete normal
- `FreteExpresso.java` - Implementação da estratégia de frete expresso
- `FretePremium.java` - Implementação da estratégia de frete premium
- `CalculadoraFrete.java` - Classe que utiliza as estratégias para calcular o frete
- `CalculadoraFreteGUI.java` - Interface gráfica para interação com o usuário
- `Main.java` - Classe principal que inicia a aplicação

## Como Executar

1. Certifique-se de ter o Java instalado em sua máquina
2. Compile os arquivos Java:
   ```
   javac *.java
   ```
3. Execute a aplicação:
   ```
   java Main
   ```

## Funcionalidades

- Interface gráfica para seleção do tipo de frete
- Cálculo automático do valor do frete baseado na estratégia selecionada
- Suporte a diferentes modalidades de entrega
- Implementação flexível que permite adicionar novas estratégias de frete facilmente

## Padrão Strategy

O padrão Strategy foi utilizado neste projeto para:
- Encapsular diferentes algoritmos de cálculo de frete
- Permitir a troca dinâmica entre diferentes estratégias
- Facilitar a adição de novas estratégias sem modificar o código existente
- Manter o código organizado e seguindo o princípio Open/Closed

## Contribuição

Sinta-se à vontade para contribuir com o projeto através de:
- Adição de novas estratégias de frete
- Melhorias na interface gráfica
- Correção de bugs
- Sugestões de melhorias 