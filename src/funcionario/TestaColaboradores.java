package funcionario;

public class TestaColaboradores {
    public static void main(String[] args) {

        // criando novo prgramador
        Programador vinicius = new Programador();
        System.out.println("-----------"+vinicius.tipoDeFuncionario()+"-----------");
        vinicius.setNome("Vinícius");
        vinicius.setCPF("555.444.333-22");
        vinicius.setSalario(2500.00);

        System.out.println("Nome programador: "+vinicius.getNome());
        System.out.println("CPF programador: "+vinicius.getCPF());
        System.out.println("Salario programador: R$ "+vinicius.getSalario());
        System.out.println("Bonifcação programador: R$ "+vinicius.getBonificacao());

        // criando novo gerente
        Gerente gleyson = new Gerente();
        System.out.println("-----------"+gleyson.tipoDeFuncionario()+"-----------");
        gleyson.setNome("Gleyson");
        gleyson.setCPF("222.222.222-22");
        gleyson.setSalario(5000.00);

        System.out.println("Nome gerente: "+gleyson.getNome());
        System.out.println("CPF gerente: "+gleyson.getCPF());
        System.out.println("Salario gerente: R$ "+gleyson.getSalario());
        System.out.println("Bonifcação gerente: R$ "+gleyson.getBonificacao());

        // criando novo diretor
        Diretor santos = new Diretor();
        System.out.println("-----------"+santos.tipoDeFuncionario()+"-----------");
        santos.setNome("Santos");
        santos.setCPF("123.123.123-12");
        santos.setSalario(9500.00);

        System.out.println("Nome diretor: "+santos.getNome());
        System.out.println("CPF diretor: "+santos.getCPF());
        System.out.println("Salario direto: R$ "+santos.getSalario());
        System.out.println("Bonificação diretor: R$ "+santos.getBonificacao());

        //retorno do total de bonificações
        System.out.println("----------------------------------");

        ControleBonificacao controle = new ControleBonificacao();
        controle.registarBonificacao(gleyson);
        controle.registarBonificacao(santos);

        System.out.println("Total das bonificações: R$ "+controle.getSomaDasBonificacoes());

        //testa senha para acesso ao sistema interno
        System.out.println("----------------------------------");

        SistemaInterno sistemaDeGestao = new SistemaInterno();
        sistemaDeGestao.setSenha(54321);

        gleyson.setSenha(54321);
        santos.setSenha(54321);

        System.out.println(gleyson.getNome()+" "+gleyson.tipoDeFuncionario());
        sistemaDeGestao.autenticar(gleyson);
        System.out.println(santos.getNome()+" "+santos.tipoDeFuncionario());
        sistemaDeGestao.autenticar(santos);

    }
}
