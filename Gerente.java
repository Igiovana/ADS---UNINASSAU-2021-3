public class Gerente extends Pessoa {
    
    private String setor;
    private Vendedor qtd_Vendas;
    private int salario_gerente;

    public Gerente(String nome, int cpf, int idade, String setor, Vendedor qtd_Vendas) {
        super(nome, cpf, idade);
        this.setor = setor;
        this.qtd_Vendas = qtd_Vendas;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Vendedor getQtd_Vendas() {

        if (qtd_Vendas >=10){
            salario_gerente = 4500;
        } else {
            salario_gerente = 3000;
        }
        return qtd_Vendas;
    }

    public void setQtd_Vendas(Vendedor qtd_Vendas) {
        this.qtd_Vendas = qtd_Vendas;
    }

    public int getSalario_gerente() {
        return salario_gerente;
    }

    public void setSalario_gerente(int salario_gerente) {
        this.salario_gerente = salario_gerente;
    }

    





    




}
