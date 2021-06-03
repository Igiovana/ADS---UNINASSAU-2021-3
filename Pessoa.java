public class Pessoa {

    private String Nome;
    private int Cpf;
    private int idade;
    
    public Pessoa(String nome, int cpf, int idade) {
        Nome = nome;
        Cpf = cpf;
        this.idade = idade;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getCpf() {
        return Cpf;
    }
    public void setCpf(int cpf) {
        Cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    

}