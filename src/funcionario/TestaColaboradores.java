package funcionario;

public class TestaColaboradores {
    public static void main(String[] args) {

        // criando novo prgramador
        Programador programador = new Programador();
        System.out.println("-----------"+programador.tipoDeFuncionario()+"-----------");
        programador.setNome("Vinícius");
        programador.setCPF("555.444.333-22");
        programador.setSalario(2500.00);

        System.out.println("Nome programador: "+programador.getNome());
        System.out.println("CPF programador: "+programador.getCPF());
        System.out.println("Salario programador: R$ "+programador.getSalario());
        System.out.println("Bonifcação programador: R$ "+programador.getBonificacao());

        // criando novo gerente
        Gerente gerente = new Gerente();
        System.out.println("-----------"+gerente.tipoDeFuncionario()+"-----------");
        gerente.setNome("Gleyson");
        gerente.setCPF("222.222.222-22");
        gerente.setSalario(5000.00);

        System.out.println("Nome gerente: "+gerente.getNome());
        System.out.println("CPF gerente: "+gerente.getCPF());
        System.out.println("Salario gerente: R$ "+gerente.getSalario());
        System.out.println("Bonifcação gerente: R$ "+gerente.getBonificacao());

        // criando novo diretor
        Diretor diretor = new Diretor();
        System.out.println("-----------"+diretor.tipoDeFuncionario()+"-----------");
        diretor.setNome("Santos");
        diretor.setCPF("123.123.123-12");
        diretor.setSalario(9500.00);

        System.out.println("Nome diretor: "+diretor.getNome());
        System.out.println("CPF diretor: "+diretor.getCPF());
        System.out.println("Salario direto: R$ "+diretor.getSalario());
        System.out.println("Bonificação diretor: R$ "+diretor.getBonificacao());

        //retorno do total de bonificações
        System.out.println("----------------------------------");

        ControleBonificacao controle = new ControleBonificacao();
        controle.registarBonificacao(gerente);
        controle.registarBonificacao(diretor);

        System.out.println("Total das bonificações: R$ "+controle.getSomaDasBonificacoes());

        //testa senha para acesso ao sistema interno
        System.out.println("----------------------------------");

        SistemaInterno sistemaDeGestao = new SistemaInterno();
        sistemaDeGestao.setSenha(54321);

        gerente.setSenha(54321);
        diretor.setSenha(54321);

        System.out.println(gerente.getNome()+" "+gerente.tipoDeFuncionario());
        sistemaDeGestao.autenticar(gerente);
        System.out.println(diretor.getNome()+" "+diretor.tipoDeFuncionario());
        sistemaDeGestao.autenticar(diretor);

        //testa cliente
        Cliente cliente = new Cliente();
        cliente.setSenha(54321);

        sistemaDeGestao.autenticar(cliente);

    }
}
