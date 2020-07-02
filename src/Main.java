public class Main {
    public static void main(String[] args) {
        long Balance = 500;
        long DepositAmount = 1500;
        long Bonus = 0;
        if (DepositAmount > 1000) {
            Bonus = DepositAmount / 100;
        }
        long FinalBalance = Balance + DepositAmount + Bonus;
        System.out.println(Bonus);
        System.out.println(FinalBalance);
    }
}
