package funcionario;

public class ControleBonificacao {
    private double somaDasBonificacoes;

    public void registarBonificacao(Funcionario funcionarioGenerico){
        double bonificacao = funcionarioGenerico.getBonificacao();
        this.somaDasBonificacoes += bonificacao;
    }

    public double getSomaDasBonificacoes() {
        return somaDasBonificacoes;
    }
}
