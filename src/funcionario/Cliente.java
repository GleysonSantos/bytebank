package funcionario;

public class Cliente implements Autenticavel {
    private int senha;

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
