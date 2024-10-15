package cursoJava2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoGUI extends JFrame {
    
    public OlaMundoGUI() {
        // Configurando a tela/Janela
        setTitle("Olá Mundo!");
        setSize(300, 200); // Corrigi o tamanho da janela para ser mais razoável
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Corrigido para 'EXIT_ON_CLOSE'
        setLocationRelativeTo(null); // Centraliza a janela

        // Criando o botão
        JButton botao = new JButton("Clique ai querida!");

        // Adicionando evento escutador
        botao.addActionListener(new ActionListener() { // Corrigido para 'ActionListener'
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibe um popup com a mensagem "Olá Mundo"
                JOptionPane.showMessageDialog(null, "Olá Mundo!"); // Corrigido 'showMessageDialog' e colocado vírgula entre parâmetros
            }
        });

        // Adicionando o botão à janela
        add(botao);

        // Tornando a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Chamando o construtor da GUI
        new OlaMundoGUI();
    }
}
