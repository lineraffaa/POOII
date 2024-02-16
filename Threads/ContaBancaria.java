public class ContaBancaria {
    private double saldo;
    private double valor;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;

    }

    public void deposito(double saldo) {
        saldo += valor;
    }

    public void saque(double saldo) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}