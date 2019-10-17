package funcionario;

//classe intermediária entre funcionario e tipos de funcionaros que possuem senha
public abstract class FuncionarioAutenticavel extends Funcionario{
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticaSenha(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}
