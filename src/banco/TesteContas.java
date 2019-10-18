package banco;

public class TesteContas {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente();
        gleyson.setNome("Gleyson Santos");
        gleyson.setCPF("222.222.222-22");
        gleyson.setProfissao("Engenheiro de Software");

        //intanciando uma conta corrente
        ContaCorrente corrente = new ContaCorrente(111,111);
        corrente.setTitular(gleyson);
        corrente.deposita(150.0);
        System.out.println("Saldo CC: R$"+corrente.getSaldo());

        //intanciando uma conta poupança
        ContaPoupança poupanca = new ContaPoupança(222,222);
        poupanca.setTitular(gleyson);
        poupanca.deposita(50.0);
        System.out.println("Saldo CP: R$"+poupanca.getSaldo());

        //intanciando um seguro de vida
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        //teste de tranferência
        System.out.println("------------TRANFERÊNCIA------------");

        corrente.transfere(50.0,poupanca);

        System.out.println("Titular CC: "+corrente.getTitular().getNome()+"\n - Saldo: R$ "+corrente.getSaldo());
        System.out.println("Titular CP: "+poupanca.getTitular().getNome()+"\n - Saldo: R$ "+poupanca.getSaldo());

        //teste de tributação
        System.out.println("------------TRIBUTAÇÃO------------");
        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

        calculadorDeImposto.registra(corrente);
        System.out.println("Imposto Conta Corrente: R$ "+corrente.getValorImposto());
        calculadorDeImposto.registra(seguroDeVida);
        System.out.println("Imposto Seguro de Vida: R$ "+seguroDeVida.getValorImposto());

        System.out.println("\n - Total de Impostos: R$ "+calculadorDeImposto.getTotalImposto());
    }
}
