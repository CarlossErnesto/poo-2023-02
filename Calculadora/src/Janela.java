import javax.swing.*;
import java.awt.event.*;

public class Janela {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Calculadora");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        janela.add(panel);
        panel.setLayout(null);


        JLabel labelValor1 = new JLabel("Valor 1:");
        labelValor1.setBounds(20, 20, 80, 25);
        panel.add(labelValor1);

        JTextField textValor1 = new JTextField(10);
        textValor1.setBounds(100, 20, 165, 25);
        panel.add(textValor1);

        JLabel labelValor2 = new JLabel("Lado 2:");
        labelValor2.setBounds(20, 50, 80, 25);
        panel.add(labelValor2);

        JTextField textValor2 = new JTextField(10);
        textValor2.setBounds(100, 50, 165, 25);
        panel.add(textValor2);


        JButton maisButton = new JButton("Somar");
        maisButton.setBounds(100, 120, 100, 20);
        panel.add(maisButton);

        JButton menosButton = new JButton("Subtrair");
        menosButton.setBounds(100, 140, 100, 20);
        panel.add(menosButton);

        JButton multiplicarButton = new JButton("Multiplicar");
        multiplicarButton.setBounds(190, 120, 100, 20);
        panel.add(multiplicarButton);

        JButton dividirButton = new JButton("Divisão");
        dividirButton.setBounds(190, 140, 100, 20);
        panel.add(dividirButton);

        JButton resolverButton = new JButton("Resolver");
        resolverButton.setBounds(145, 180, 100, 25);
        panel.add(resolverButton);

        JLabel resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(20, 150, 250, 25);
        panel.add(resultadoLabel);

       resolverButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado1 = Double.parseDouble(textValor1.getText());
                    double lado2 = Double.parseDouble(textValor2.getText());
                }

        janela.setLocationRelativeTo(null);

        janela.setVisible(true);
    }
}
