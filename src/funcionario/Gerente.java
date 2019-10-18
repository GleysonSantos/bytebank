package funcionario;

// Gerente também é um funcionario, ele herda da classe Funcionario e assina o contrato de Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticadorUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticadorUtil();
    }

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
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticaSenha(int senha) {
        return this.autenticador.autenticaSenha(senha);
    }
}
