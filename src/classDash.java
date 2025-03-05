import java.util.List;
import java.util.Map; //

public class classDash {
    // Atributos
    private String userId;
    private Map<String, Double> financialSummary; // Ex: renda e despesas totais
    private List<Transaction> recentTransactions;
    private List<Goal> activeGoals;

    // Construtor de parâmetros
    public classDash(String userId, Map<String, Double> financialSummary, List<Transaction> recentTransactions, List<Goal> activeGoals) {
        this.userId = userId;
        this.financialSummary = financialSummary;
        this.recentTransactions = recentTransactions;
        this.activeGoals = activeGoals;
    }

    // Métodos
    public void generateFinancialSummary() {
        // Lógica para gerar resumo financeiro
        System.out.println("Financial summary generated for user: " + this.userId);
    }

    public void getRecentTransactions(int limit) {
        // Lógica para pesquisar transação recente
        System.out.println("Recent transactions fetched for user: " + this.userId);
    }

    public void getActiveGoals() {
        // Lógica para buscar objetivos ativos
        System.out.println("Active goals fetched for user: " + this.userId);
    }

    public void refreshDashboard() {
        // Lógica para atualizar dashboard
        System.out.println("Dashboard refreshed for user: " + this.userId);
    }
}
}
