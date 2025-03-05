import java.util.Date;

public class classBudget {
    // Atributos
    private String budgetId;
    private String userId;
    private String category;
    private double limit;
    private double spent;
    private Date startDate;
    private Date endDate;

    // Construtor de parâmetros
    public classBudget(String budgetId, String userId, String category, double limit, Date endDate) {
        this.budgetId = budgetId;
        this.userId = userId;
        this.category = category;
        this.limit = limit;
        this.spent = 0; // Inicia o valor de gastos em zero
        this.startDate = new Date(); // Define a data de início
        this.endDate = endDate;
    }


    // Métodos
    public void createBudget() {
        // Lógica para criar orçamento
        System.out.println("Budget created: " + this.budgetId);
    }

    public void updateBudget(double newLimit) {
        this.limit = newLimit;
        System.out.println("Budget updated: " + this.budgetId);
    }

    public void deleteBudget() {
        // Lógica para deletar orçamento
        System.out.println("Budget deleted: " + this.budgetId);
    }

    public void checkBudgetStatus() {
        double remaining = this.limit - this.spent;
        System.out.println("Remaining budget for " + this.category + ": " + remaining);
    }
}
}
