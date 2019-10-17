package banco;

public class TesteContas {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente();
        gleyson.setNome("Gleyson Santos");
        gleyson.setCPF("222.222.222-22");
        gleyson.setProfissao("Engenheiro de Software");

        ContaCorrente corrente = new ContaCorrente(111,111);
        corrente.setTitular(gleyson);
        corrente.deposita(100.0);
        System.out.println("Saldo CC: R$"+corrente.getSaldo());

        ContaPoupança poupanca = new ContaPoupança(222,222);
        poupanca.setTitular(gleyson);
        poupanca.deposita(200.0);
        System.out.println("Saldo CP: R$"+poupanca.getSaldo());

        //teste de tranferência
        System.out.println("------------TRANFERÊNCIA------------");

        corrente.transfere(50.0,poupanca);

        System.out.println("Titular CC: "+corrente.getTitular().getNome()+"\n - Saldo: R$ "+corrente.getSaldo());
        System.out.println("Titular CP: "+poupanca.getTitular().getNome()+"\n - Saldo: R$ "+poupanca.getSaldo());
    }
}
