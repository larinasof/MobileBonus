public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int depositAmount = 1500;
        int bonus = 0;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        }
        int finalBalance = balance + depositAmount + bonus;
        System.out.println("Бонус за начисление:" + bonus);
        System.out.println("Текущий баланс:" + finalBalance);
    }
}
