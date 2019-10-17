package banco;

public abstract class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas;

    //construtor
    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;

        //somatorio do total de contas criadas
        Conta.totalDeContas++;
    }

    //metodo depositar
    public void deposita(double valor) {
        this.saldo += valor;
    }

    //metodo sacar
    public boolean saca(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //metodo transferir
    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor){
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return titular;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
}
