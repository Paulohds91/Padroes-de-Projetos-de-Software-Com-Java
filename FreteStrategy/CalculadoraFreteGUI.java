import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraFreteGUI extends JFrame {
    private JTextField campoPeso;
    private JComboBox<String> comboEstrategia;
    private JLabel labelResultado;
    private CalculadoraFrete calculadora;

    public CalculadoraFreteGUI() {
        // Configuração básica da janela
        setTitle("Calculadora de Frete");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        // Inicializa a calculadora com estratégia padrão
        calculadora = new CalculadoraFrete(new FreteNormal());

        // Painel principal com padding
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridBagLayout());
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Título
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        JLabel titulo = new JLabel("Calculadora de Frete");
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        painelPrincipal.add(titulo, gbc);

        // Campo de peso
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        painelPrincipal.add(new JLabel("Peso (kg):"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        campoPeso = new JTextField(10);
        painelPrincipal.add(campoPeso, gbc);

        // Combo box de estratégias
        gbc.gridx = 0;
        gbc.gridy = 2;
        painelPrincipal.add(new JLabel("Tipo de Frete:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        String[] estrategias = {"Normal", "Expresso", "Premium", "Econômico"};
        comboEstrategia = new JComboBox<>(estrategias);
        painelPrincipal.add(comboEstrategia, gbc);

        // Botão de cálculo
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        JButton botaoCalcular = new JButton("Calcular Frete");
        botaoCalcular.setBackground(new Color(70, 130, 180));
        botaoCalcular.setForeground(Color.WHITE);
        botaoCalcular.setFocusPainted(false);
        botaoCalcular.addActionListener(e -> calcularFrete());
        painelPrincipal.add(botaoCalcular, gbc);

        // Label de resultado
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        labelResultado = new JLabel("Valor do Frete: R$ 0,00");
        labelResultado.setFont(new Font("Arial", Font.BOLD, 14));
        labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
        painelPrincipal.add(labelResultado, gbc);

        add(painelPrincipal);
    }

    private void calcularFrete() {
        try {
            double peso = Double.parseDouble(campoPeso.getText());
            String estrategiaSelecionada = (String) comboEstrategia.getSelectedItem();
            
            // Define a estratégia baseada na seleção
            switch (estrategiaSelecionada) {
                case "Normal":
                    calculadora.setEstrategia(new FreteNormal());
                    break;
                case "Expresso":
                    calculadora.setEstrategia(new FreteExpresso());
                    break;
                case "Premium":
                    calculadora.setEstrategia(new FretePremium());
                    break;
                case "Econômico":
                    calculadora.setEstrategia(new FreteEconomico());
                    break;
            }

            double valor = calculadora.calcular(peso);
            labelResultado.setText(String.format("Valor do Frete: R$ %.2f", valor));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Por favor, insira um valor válido para o peso.",
                "Erro de Entrada",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new CalculadoraFreteGUI().setVisible(true);
        });
    }
} 