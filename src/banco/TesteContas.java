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

        ContaPoupança poupanca = new ContaPoupança(222,222);
        poupanca.setTitular(gleyson);
        poupanca.deposita(200.0);

        //teste de tranferência
        corrente.transfere(50.0,poupanca);

        System.out.println("Titular Conta Corrente: "+corrente.getTitular().getNome()+"\n - Saldo: R$ "+corrente.getSaldo());
        System.out.println("Titular Conta Poupança: "+poupanca.getTitular().getNome()+"\n - Saldo: R$ "+poupanca.getSaldo());
    }
}
