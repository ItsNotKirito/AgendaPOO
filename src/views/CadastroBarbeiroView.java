package views;

import javax.swing.*;
import java.awt.*;

public class CadastroBarbeiroView{
    private JLabel emailLabel;
    private JLabel nomeLabel;
    private JLabel passwordLabel;
    private JLabel telefoneLabel;
    private JTextField emailInput;
    private JTextField nomeInput;
    private JPasswordField passwordInput;
    private JTextField telefoneInput;
    private JButton cadastrarButton;
    private JButton cancelarButton;
    private JPanel cadastroBarbeiroPanel;

    public CadastroBarbeiroView() {
        cadastroBarbeiroPanel = new JPanel();
        cadastroBarbeiroPanel.setLayout(new GridLayout(5, 2));

        nomeLabel = new JLabel("Nome: ");
        emailLabel = new JLabel("Email: ");
        passwordLabel = new JLabel("Senha: ");
        telefoneLabel = new JLabel("Telefone: ");

        nomeInput = new JTextField();
        emailInput = new JTextField();
        passwordInput = new JPasswordField();
        telefoneInput = new JTextField();

        cadastrarButton = new JButton("Cadastrar");
        cancelarButton = new JButton("Cancelar");


        nomeInput.setMaximumSize(new Dimension(300, 120));
        emailInput.setMaximumSize(new Dimension(300, 120));
        passwordInput.setMaximumSize(new Dimension(300, 120));
        telefoneInput.setMaximumSize(new Dimension(300, 120));

        cadastroBarbeiroPanel.add(nomeLabel);
        cadastroBarbeiroPanel.add(nomeInput);
        cadastroBarbeiroPanel.add(emailLabel);
        cadastroBarbeiroPanel.add(emailInput);
        cadastroBarbeiroPanel.add(passwordLabel);
        cadastroBarbeiroPanel.add(passwordInput);
        cadastroBarbeiroPanel.add(telefoneLabel);
        cadastroBarbeiroPanel.add(telefoneInput);

        cadastroBarbeiroPanel.add(cadastrarButton);
        cadastroBarbeiroPanel.add(cancelarButton);

    }


    public JPanel getPanel() {
        return cadastroBarbeiroPanel; // Retorna o painel atual (this é uma instância de JPanel)
    }
}



