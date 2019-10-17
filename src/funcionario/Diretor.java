package funcionario;

// funcionario.Diretor também é um funcionario, ele herda da classe funcionario.Funcionario
public class Diretor extends Funcionario implements Autenticavel{

    private int senha;

    @Override
    public String tipoDeFuncionario() {
        String tipo = (" DIRETOR ");
        return tipo;
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario() + 1500.00;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticaSenha(int senha) {
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}
