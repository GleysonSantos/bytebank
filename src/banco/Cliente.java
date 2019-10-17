package banco;

public class Cliente {
    private String nome;
    private String CPF;
    private String profissao;

    public String getCPF() {
        return this.CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return this.profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
