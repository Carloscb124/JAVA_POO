package heranca;
public abstract class User {
    private String name;
    private String email;
    private String password;
    private boolean isAdmin;

    public User(String name, String email, String password, boolean isAdmin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }  

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void login(){
        System.out.println("Usuário " + name + " fez login");
    }

    public void logout(){
        System.out.println("Usuário " + name + "Fez logout");
    }

    public void changeData(String newName, String newEmail, String newPassword){
        this.name = newName;
        this.email = newEmail;
        this.password = newPassword;
        System.out.println("Dados alterados com sucesso para " + name  + " , " + email + " , " + password);
    }
}
