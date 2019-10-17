package funcionario;

// classe Funcionario nao pode ser instanciada por se tratar de uma classe abstract
public abstract class Funcionario {
    private String nome;
    private String CPF;
    private double salario;

    public double getBonificacao() {
        return this.salario * 0.1;
    }

    //metodo abstrato
    public abstract String tipoDeFuncionario();

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
