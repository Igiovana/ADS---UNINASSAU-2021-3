public class Main {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa(nome, cpf, idade);
        Pessoa pessoa2 = new Pessoa(nome, cpf, idade);

        pessoa1.setNome("Giovana Oliveira");
        pessoa1.setCpf (01234567890);
        pessoa1.setIdade(20);
        pessoa2.setNome("Fulano da Silva");
        pessoa2.setCpf (22554846974);
        pessoa2.setIdade(44);


        System.out.println(pessoa1.getNome(), pessoa1.getCpf(), pessoa1.getIdade());


        Funcionario funcionario1 = new Funcionario(nome, cpf, idade, setor_funcionario, salario)

        funcionario1.setNome(pessoa1);
        funcionario1.setSetor_funcionario("vendas");

        System.out.println(funcionario1.getNome(), funcionario1.getSetor_funcionario());
        
        Vendedor vendedor1 = new Vendedor();

        vendedor1.setQtd_Vendas(25);
        vendedor1.getSalario_vendas();

        Gerente gerente1 = new Gerente(nome, cpf, idade, setor, qtd_Vendas);

        gerente1.setNome(pessoa2);
        gerente1.setQtd_Vendas(vendedor1);
        gerente1.getSalario_gerente();

        System.out.println(gerente1.getNome(), gerente1.getSalario_gerente());

    }


}
