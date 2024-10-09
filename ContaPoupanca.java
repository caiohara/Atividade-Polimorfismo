public class ContaPoupanca extends Conta{

    private float saldoPoupança;

    public void saque(float valor) {
        if (saldo + saldoPoupança < valor) {
            System.out.println("O saldo é insuficiente!");
        } else {
            if (saldo < valor) {
                valor -= saldo;
                saldo = 0;
                saldoPoupança -= valor;
            } else {
                saldo -= valor;
            }
            System.out.println("Saque efetuado com sucesso!");
        }
    }

    public float getSaldoPoupança() {
        return saldoPoupança;
    }

    public void setSaldoPoupança(float saldoPoupança) {
        this.saldoPoupança = saldoPoupança;
    }
}