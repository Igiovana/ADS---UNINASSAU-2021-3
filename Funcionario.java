public class Funcionario extends Pessoa {

    private String setor_funcionario;
    private double salario;

    
    public Funcionario(String nome, int cpf, int idade, String setor_funcionario, double salario) {
        super(nome, cpf, idade);
        this.setor_funcionario = setor_funcionario;
        this.salario = salario;
    }


    @Override
    public void setCpf(int cpf) {
        super.setCpf(cpf);
    }


    public String getSetor_funcionario() {
        return setor_funcionario;
    }

    public void setSetor_funcionario(String setor_funcionario) {
        this.setor_funcionario = setor_funcionario;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}