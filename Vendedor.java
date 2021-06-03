public class Vendedor extends Pessoa {
    
    private int qtd_Vendas;
    private Gerente supervisor;
    private int Salario_vendas;

    public Vendedor(String nome, int cpf, int idade, int qtd_Vendas, Gerente supervisor, int salario_vendas) {
        super(nome, cpf, idade);
        this.qtd_Vendas = qtd_Vendas;
        this.supervisor = supervisor;
        Salario_vendas = salario_vendas;
    }

    public int getQtd_Vendas() {
        return qtd_Vendas;
    }

    public void setQtd_Vendas(int qtd_Vendas) {
        this.qtd_Vendas = qtd_Vendas;
    }

    public Gerente getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Gerente supervisor) {
        this.supervisor = supervisor;
    }

    public int getSalario_vendas() {

      if (qtd_Vendas >=10){
         Salario_vendas = 2000;
     } else { 
         Salario_vendas = 1000;
     }
        return Salario_vendas;
    }

    public void setSalario_vendas(int salario_vendas) {
        Salario_vendas = salario_vendas;
    }

    
    


}
