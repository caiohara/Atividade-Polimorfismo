public class Conta {
    
    private String agencia;
    private String numero;
    protected float saldo;

    public void saque(float valor) {
        if (saldo < valor) {
            System.out.println("O saldo é insuficiente !");
        } else {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
