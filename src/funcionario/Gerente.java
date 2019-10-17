package funcionario;

// funcionario.Gerente também é um funcionario, ele herda da classe funcionario.Funcionario
public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    @Override
    public String tipoDeFuncionario() {
        String tipo = (" GERENTE ");
        return tipo;
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
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
