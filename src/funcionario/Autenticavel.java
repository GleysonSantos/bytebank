package funcionario;

//quem assinar esse contrato (implements) dessa classe, precisa implementar os metodos dela
public abstract interface Autenticavel{

    public abstract void setSenha(int senha);

    public abstract boolean autenticaSenha(int senha);

}
