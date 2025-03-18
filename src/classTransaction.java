import java.util.Date;

public class classTransaction {
    // Atributos
    private String transactionId;
    private String userId;
    private String type; // Ex: Investimentos, despesas e etc.
    private double amount;
    private Date date;
    private String description;

    // Construtor de parâmetros
    public classTransaction(String transactionId, String userId, String type, double amount, String description) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.type = type;
        this.amount = amount;
        this.date = new Date(); // Define a data de transação
        this.description = description;
    }


    // Métodos
    public void addTransaction() {
        // Lógica para adicionar nova transaction
        System.out.println("Transaction added: " + this.transactionId);
    }

    public void editTransaction(double newAmount, String newDescription) {
        this.amount = newAmount;
        this.description = newDescription;
        System.out.println("Transaction updated: " + this.transactionId);
    }

    public void deleteTransaction() {
        // Lógica para deletar transaction
        System.out.println("Transaction deleted: " + this.transactionId);
    }
}

