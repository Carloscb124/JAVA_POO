package exercício1;

public class ContaBancaria {

    // Atributos da Conta Bancaria

    private double saldo;
    private double chequeEspecial;
    private double chequeUsado;
    private double taxaPedente;
    
    // Construtor da Conta Bancaria
    public ContaBancaria(double valorDeposito) {
        this.saldo = valorDeposito;
        if(valorDeposito <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = valorDeposito * 0.5; // 50% do valor depositado
        }

        this.chequeUsado = 0;
        this.taxaPedente = 0;
    }

    // Métodos da Conta Bancaria
    public double getSaldo() {
        return saldo;
    }

    public double getChequeUsado() {
        return chequeUsado;
    }
    
    // Método para consultar o valor total do cheque especial
    public double getChequeEspecial() {
        return chequeEspecial - chequeUsado;
    }
    
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }

        double totalDisponivel = saldo + getChequeEspecial();
        if (valor > totalDisponivel) {
            System.out.println("Saldo e cheque especial insuficientes.");
        return;
        }

        if (valor <= saldo) {
            saldo -= valor;
        } else {
        // Usa o cheque especial
        double valorRestante = valor - saldo;
        saldo = 0;
        chequeUsado += valorRestante;
        }
        System.out.println("Saque realizado. Saldo atual: R$" + saldo);
    
    }
    
  public void depositar(double valor) {
    if (valor <= 0) {
        System.out.println("Valor de depósito inválido.");
        return;
    }

    if (chequeUsado > 0) {
        // Primeiro paga o cheque usado
        if (valor >= chequeUsado) {
            valor -= chequeUsado;
            double taxa = chequeUsado * 0.2; // 20% de taxa
            saldo = valor - taxa; // Restante vai para o saldo (já deduzindo a taxa)
            chequeUsado = 0;
        } else {
            chequeUsado -= valor;
            valor = 0;
        }
    } else {
        saldo += valor;
    }
    System.out.println("Depósito realizado. Saldo atual: R$" + saldo);
    }

    public boolean estaUsandoChequeEspecial() {
    return chequeUsado > 0;
    }

    public double getChequeEspecialDisponivel() {
    return chequeEspecial - chequeUsado;
    }

}

