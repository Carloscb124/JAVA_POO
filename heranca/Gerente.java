package heranca;
public class Gerente extends User {
    
    public Gerente(String name, String email, String password) {
        super(name, email, password, true); // O gerente é sempre um administrador
    }
    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando relatório financeiro...");
    }
    
    public void consultarVendas() {
        System.out.println("Consultando vendas...");
    }
    
    @Override
    public void login() {
        System.out.println("Gerente " + getName() + " fez login");
    }
    
    @Override
    public void logout() {
        System.out.println("Gerente " + getName() + " fez logout");
    }
    
    @Override
    public void changeData(String newName, String newEmail, String newPassword) {
        super.changeData(newName, newEmail, newPassword);
        System.out.println("Dados do gerente alterados com sucesso.");
    }

}
