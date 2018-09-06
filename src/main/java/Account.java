public class Account {

    public double income;
    public double expense;
    public double balance;

    public Account(double income, double expense) {
        this.income = income;
        this.expense = expense;
        this.balance = income - expense;
    }

    public void addIncome(double newReceipt) {
        balance += newReceipt;
        income += newReceipt;
    }

    public void payMoney(double newExpense) {
        balance -= newExpense;
        expense += newExpense;
    }

    public double getIncome() {
        return income;
    }

    public double getExpense() {
        return expense;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "income=" + income +
                ", expense=" + expense +
                ", balance=" + balance +
                '}';
    }
}
