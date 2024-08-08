import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();

        System.out.println("Digite o nome da pessoa física:");
        String namePf = sc.nextLine();
        System.out.println("Digite a idade da pessoa física:");
        int idadePf = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o CPF:");
        String cpf = sc.nextLine();

        pf.setCpf(cpf);
        pf.setIdade(idadePf);
        pf.setName(namePf);

        System.out.println("Digite o nome da pessoa jurídica:");
        String namePj = sc.nextLine();
        System.out.println("Digite a idade da pessoa jurídica:");
        int idadePj = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o cnpj:");
        String cnpj = sc.nextLine();

        pj.setCnpj(cnpj);
        pj.setIdade(idadePj);
        pj.setName(namePj);

        System.out.println("Pessoa física:");
        System.out.println("Nome " + pf.getName() + ", idade " + pf.getIdade() + ", CPF " + pf.getCpf());
        System.out.println("Pessoa jurídica:");
        System.out.println("Nome " + pj.getName() + ", idade " + pj.getIdade() + ", CNPJ " + pj.getCnpj());






    }
}