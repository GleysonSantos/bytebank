package funcionario;

// Diretor também é um funcionario, ele herda da classe Funcionario e assina o contrato de Autenticavel
public class Diretor extends Funcionario implements Autenticavel{

    private AutenticadorUtil autenticador;

    public Diretor(){
       this.autenticador = new AutenticadorUtil();
    }

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
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticaSenha(int senha) {
        return this.autenticador.autenticaSenha(senha);
    }
}
