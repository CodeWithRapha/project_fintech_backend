import java.util.Date;

public class classUser {
    // Atributos
    private String userId;
    private String name;
    private String email;
    private String passwordHash;
    private Date createdAt;
    private Date updatedAt;

    // Construtor com parâmetros
    public classUser(String userId, String name, String email, String passwordHash) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.createdAt = new Date(); // Configura automaticamente a data de criação
        this.updatedAt = new Date(); // Configura automaticamente a data de atualização
    }


    // Métodos
    public void registerUser() {
        // Lógica de registro de usuário
        System.out.println("User registered: " + this.name);
    }
}

