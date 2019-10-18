package funcionario;

public class Cliente implements Autenticavel {

    private AutenticadorUtil autenticador;

    public Cliente(){
         this.autenticador = new AutenticadorUtil();
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
