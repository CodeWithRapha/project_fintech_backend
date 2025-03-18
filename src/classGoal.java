import java.util.Date;

public class classGoal {
    // Atributos
    private String goalId;
    private String userId;
    private String description;
    private double targetAmount;
    private double savedAmount;
    private Date targetDate;

    // Construtor de parâmetros
    public classGoal(String goalId, String userId, String description, double targetAmount, Date targetDate) {
        this.goalId = goalId;
        this.userId = userId;
        this.description = description;
        this.targetAmount = targetAmount;
        this.savedAmount = 0; // Inicia o valor economizado em zero
        this.targetDate = targetDate;
    }


    // Métodos
    public void setGoal() {
        // Lógica para criar meta financeira
        System.out.println("Goal set: " + this.description);
    }

    public void updateGoal(double newTargetAmount) {
        this.targetAmount = newTargetAmount;
        System.out.println("Goal updated: " + this.goalId);
    }

    public void setsavedAmount(double v) {
    }
}

