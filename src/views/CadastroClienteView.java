package views;

import controllers.Autenticacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroClienteView{
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
    private JPanel cadastroClientePanel;

    private Autenticacao autenticacao;

    public CadastroClienteView(Autenticacao autenticacao) {
        this.autenticacao = autenticacao;

        cadastroClientePanel = new JPanel();
        cadastroClientePanel.setLayout(new GridLayout(5, 2));

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

        cadastroClientePanel.add(nomeLabel);
        cadastroClientePanel.add(nomeInput);
        cadastroClientePanel.add(emailLabel);
        cadastroClientePanel.add(emailInput);
        cadastroClientePanel.add(passwordLabel);
        cadastroClientePanel.add(passwordInput);
        cadastroClientePanel.add(telefoneLabel);
        cadastroClientePanel.add(telefoneInput);

        cadastroClientePanel.add(cadastrarButton);
        cadastroClientePanel.add(cancelarButton);

        // Ação do botão Cadastrar Cliente
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeInput.getText();
                String email = emailInput.getText();
                String senha = passwordInput.getText();
                String telefone = telefoneInput.getText();

                cadastrarCliente(nome, email, senha, telefone);

                nomeInput.setText("");
                emailInput.setText("");
                passwordInput.setText("");
                telefoneInput.setText("");

            }
        });
    }

    public void cadastrarCliente( String nome, String email, String senha, String telefone){
        autenticacao.cadastrarCliente(nome, email, senha, telefone);
    }



    public JPanel getPanel() {
        return cadastroClientePanel; // Retorna o painel atual (this é uma instância de JPanel)
    }
}



