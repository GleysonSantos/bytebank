package funcionario;

public class SistemaInterno {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void autenticar(FuncionarioAutenticavel funcinario){
        boolean senhaConfere = funcinario.autenticaSenha(this.senha);
        if(senhaConfere == true){
            System.out.println(" -> Acesso aberto ao usuário!");
        } else {
            System.out.println(" -> Acesso negado!");
        }
    }
}
