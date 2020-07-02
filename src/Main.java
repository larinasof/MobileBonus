public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int deposit_amount = 1500;
        int bonus = 0;
        if (deposit_amount > 1000) {
            bonus = deposit_amount / 100;
        }
        int final_balance = balance + deposit_amount + bonus;
        System.out.println("Бонус за начисление:" + bonus);
        System.out.println("Текущий баланс:" + final_balance);
    }
}
