public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int balance = 100;
        int balanceReplenishment = 1100;
        int bonus = balanceReplenishment / 100;
        if (balanceReplenishment > 1000) {
            balance += balanceReplenishment + bonus;
            System.out.println(balance);
        } else {
            balance += balanceReplenishment;
            System.out.println(balance);
        }
    }
}