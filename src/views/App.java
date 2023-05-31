package views;

import controllers.Autenticacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
    private JButton cadastrarClienteButton;
    private JButton loginButton;
    private JButton cadastrarBarbeiroButton;
    private JPanel menuPrincipal;
    private JPanel currentPanel;

    private Autenticacao autenticacao;

    public App (Autenticacao autenticacao){
        //Autenticação será uma instância compartilhada por todo sistema
        this.autenticacao = autenticacao;

        menuPrincipal = new JPanel();

        loginButton = new JButton("Login");
        cadastrarBarbeiroButton = new JButton("Cadastrar Barbeiro");
        cadastrarClienteButton = new JButton("Cadastrar Cliente");

        menuPrincipal.setLayout(new GridLayout(3, 1));
        menuPrincipal.add(loginButton);
        menuPrincipal.add(cadastrarBarbeiroButton);
        menuPrincipal.add(cadastrarClienteButton);

        currentPanel = menuPrincipal;
        getContentPane().add(currentPanel);
        setTitle("Barbearia aplicativo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        // Ação do botão Cadastrar Barbeiro
        cadastrarBarbeiroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CadastroBarbeiroView cadastroBarbeiroView = new CadastroBarbeiroView(autenticacao);
                setPanel(cadastroBarbeiroView.getPanel());
            }
        });

        // Ação do botão Cadastrar Cliente
        cadastrarClienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CadastroClienteView cadastroClienteView = new CadastroClienteView(autenticacao);
                System.out.println(cadastroClienteView.getPanel());
                setPanel(cadastroClienteView.getPanel());
            }
        });

    }

    // Função responsável por mudar o panel, recebe um atributo do tipo panel e em seguida
    // remove o panel atual do Frame e adiciona o Frame recebido como parâmetro
    private void setPanel(JPanel panel){
        if (currentPanel != null) {
            getContentPane().remove(currentPanel);
        }

        currentPanel = panel;
        getContentPane().add(currentPanel);
        getContentPane().revalidate();
        getContentPane().repaint();
    }


    public static void main(String[] args) {
        Autenticacao autenticacao = new Autenticacao();
        new App(autenticacao);

    }
}
