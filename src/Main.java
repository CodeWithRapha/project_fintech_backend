import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //criando transação
        classTransaction transaction = new classTransaction("txn1", "user1", "renda", 1000.0, "salario");
        transaction.addTransaction();
        transaction.editTransaction(1200.0, "salario + bonus");

        //criar uma orçamento
        classBudget budget = new classBudget("orçamento1", "user1", "Mercado", 500.0, new Date());
        budget.createBudget();

        }
    }
