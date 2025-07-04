package heranca;
public class Atendente extends User {

    private double valorEmCaixa;

    public Atendente(String name, String email, String password) {
        super(name, email, password, false); // O atendente não é um administrador
        this.valorEmCaixa = 0.0;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void receberPagamento(double valor) {
        if (valor > 0) {
            valorEmCaixa += valor;
            System.out.println("Pagamento recebido: " + valor + ". Valor em caixa: " + valorEmCaixa);
        } else {
            System.out.println("Valor inválido para pagamento.");
        }
    }

    public void fecharCaixa() {
        System.out.println("Fechando caixa. Valor total em caixa: " + valorEmCaixa);
        valorEmCaixa = 0.0; // Reseta o valor em caixa após fechar
    }

    @Override
    public void login() {
        System.out.println("Atendente " + getName() + " fez login");
    }

    @Override
    public void logout() {
        System.out.println("Atendente " + getName() + " fez logout");
    }

    @Override
    public void changeData(String newName, String newEmail, String newPassword) {
        super.changeData(newName, newEmail, newPassword);
        System.out.println("Dados do atendente alterados com sucesso.");
    }

}
