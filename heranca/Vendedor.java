package heranca;

public class Vendedor extends User {
    
    private int quantidadeVendas;

    public Vendedor(String name, String email, String password) {
        super(name, email, password, false); // O vendedor não é um administrador
        this.quantidadeVendas = 0;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada. Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas... Total de vendas: " + quantidadeVendas);
    }

    @Override
    public void login() {
        System.out.println("Vendedor " + getName() + " fez login");
    }

    @Override
    public void logout() {
        System.out.println("Vendedor " + getName() + " fez logout");
    }

    @Override
    public void changeData(String newName, String newEmail, String newPassword) {
        super.changeData(newName, newEmail, newPassword);
        System.out.println("Dados do vendedor alterados com sucesso.");
    }
    
}
