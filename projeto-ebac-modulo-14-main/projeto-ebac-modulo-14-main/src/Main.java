import com.marcelocbasilio.projetocrudsingle.dao.ClienteMapDAO;
import com.marcelocbasilio.projetocrudsingle.dao.IClienteDAO;
import com.marcelocbasilio.projetocrudsingle.domain.Cliente;

import javax.swing.*;

public class Main {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {

        iClienteDAO = new ClienteMapDAO();

        String opcao = opcaoValida();

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = opcaoInvalida();
        }

        while (isOpcaoValida(opcao)) {
            String title;
            String message;
            String cpf;
            String[] dados = new String[7];
            String[] campos = {"Nome", "CPF", "Telefone", "Endereço", "Número", "Cidade", "Estado"};

            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                validarCamposCadastro(dados, campos);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                title = "Consultar Cliente";
                message = "> Digite o CPF";
                cpf = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
                consultar(cpf);
            } else if (isExclusao(opcao)) {
                title = "Excluir Cliente";
                message = "> Digite o CPF";
                cpf = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
                excluir(cpf);
            } else if (isAtualizacao(opcao)) {
                validarCamposAlteracao(dados, campos);
                alterar(dados);
            }
            opcao = opcaoValida();
        }
    }

    private static void cadastrar(String[] dados) {
        Cliente cliente = new Cliente(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], dados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        return "1".equals(opcao);
    }

    private static void consultar(String cpf) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(cpf));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado!\n\n" + cliente, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado! ", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    private static boolean isConsultar(String opcao) {
        return "2".equals(opcao);
    }

    private static Cliente buscar(String cpf) {
        return iClienteDAO.buscarPorCpf(Long.parseLong(cpf));
    }

    private static void excluir(String cpf) {
        iClienteDAO.excluir(Long.parseLong(cpf));
        JOptionPane.showMessageDialog(null, "Cliente Excluído!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isExclusao(String opcao) {
        return "3".equals(opcao);
    }

    private static void alterar(String[] dados) {
        Cliente cliente = new Cliente(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], dados[6]);
        iClienteDAO.alterar(cliente);
        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isAtualizacao(String opcao) {
        return "4".equals(opcao);
    }

    private static boolean isOpcaoSair(String opcao) {
        return "5".equals(opcao);
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo!", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        return "1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao);
    }

    private static String opcaoValida() {
        String title = "Cadastrar Cliente";
        String message = "> Digite: \n [1] cadastro\n [2] consulta\n [3] exclusão\n [4] alteração\n [5] sair\n";
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    private static String opcaoInvalida() {
        String title = "[ERRO] Opção Inválida!!!";
        String message = "Você digitou uma opção diferente do menu abaixo!! \n\n > Digite: \n [1] cadastro\n [2] consulta\n [3] exclusão\n [4] alteração\n [5] sair\n";
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }

    private static void validarCamposCadastro(String[] dados, String[] campos) {
        String title;
        String message;
        title = "Cadastrar Cliente";
        for (int i = 0; i < dados.length; i++) {
            message = "> Digite o(a) " + campos[i];
            dados[i] = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);

            if ("".equals(dados[0]) || dados[0] == null || dados[0].equals("0")) {
                message = "> Digite seu Nome!";
                dados[i] = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
            } else if ("".equals(dados[1])) {
                message = "> Digite um CPF válido!";
                dados[i] = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
            } else if ("".equals(dados[2])) {
                message = "> Digite um Telefone válido!";
                dados[i] = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
            } else if ("".equals(dados[3])) {
                message = "> Digite seu endereço!";
                dados[i] = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
            } else if ("".equals(dados[4])) {
                message = "> Digite um Número válido! Para sem número digite 0!";
                dados[i] = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private static void validarCamposAlteracao(String[] dados, String[] campos) {
        String message;
        String title;
        String cpf;
        cpf = JOptionPane.showInputDialog(null, "Digite CPF", "Cliente Existe?", JOptionPane.INFORMATION_MESSAGE);
        Cliente cliente = buscar(cpf);
        title = "Atualizar Cliente " + cliente.getNome();
        for (int i = 0; i < dados.length; i++) {
            if (i > 1) {
                message = "> Digite o(a) " + campos[i];
                dados[i] = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);

                if ("".equals(dados[2])) {
                    message = "> Digite um Telefone válido!";
                    dados[i] = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
                } else if ("".equals(dados[3])) {
                    message = "> Digite seu endereço!";
                    dados[i] = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
                } else if ("".equals(dados[4])) {
                    message = "> Digite um Número válido! Para sem número digite 0!";
                    dados[i] = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        dados[0] = cliente.getNome();
        dados[1] = cpf;
    }
}