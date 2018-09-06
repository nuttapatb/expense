public class Main {
    public static void main(String[] args) {
        Account a = new Account(1000,200);
        System.out.println(a.toString());
        a.payMoney(50);
        System.out.println(a.getBalance());
        a.addIncome(100);
        System.out.println(a.getIncome());
        System.out.println(a.getBalance());


    }
}
