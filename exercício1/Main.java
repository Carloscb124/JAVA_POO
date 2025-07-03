package exercício1;

public class Main {
    public static void main(String[] args) {
        var conta = new ContaBancaria(500);
        System.out.println("Saldo inicial: R$" + conta.getSaldo());
        System.out.println("Cheque especial disponível: R$" + conta.getChequeEspecialDisponivel());

        conta.sacar(550); // Deve usar R$50 do cheque especial
        System.out.println("Saldo após saque: R$" + conta.getSaldo());
        System.out.println("Cheque especial usado: R$" + conta.getChequeUsado());
        System.out.println("Está usando cheque especial? " + conta.estaUsandoChequeEspecial());

        conta.depositar(100); // Deve pagar os R$50 do cheque especial + R$10 de taxa (20%)
        System.out.println("Saldo após depósito: R$" + conta.getSaldo());
    }
}





/*
Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
Consultar saldo
consultar cheque especial
Depositar dinheiro;
Sacar dinheiro;
Pagar um boleto.
Verificar se a conta está usando cheque especial.
Siga as seguintes regras para implementar

A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
*/