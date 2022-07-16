import java.util.Arrays;

public class Main {
        public static void main(String[] args) {

            int startingScore = 100;
            int replenishmentAmount = 1200;

            int bonusRubles;
            int totalScore;

            if (replenishmentAmount >= 1000) {
                bonusRubles = replenishmentAmount / 100;
                totalScore = startingScore + replenishmentAmount + bonusRubles;
            } else {
                bonusRubles = 0;
                totalScore = startingScore + replenishmentAmount + bonusRubles;
            }

            System.out.println("Сумма бонуса = " + bonusRubles + " рублей ");
            System.out.println("Сумма счета после пополнения = " + totalScore + " рублей ");





            // Объявляете переменные для входных данных и
            // параметров программы: начального счёта,
            // суммы пополнения и тп

            // Условным оператором проверяете превысила ли
            // сумма пополнения порог и для этих двух разных
            // сценариев рассчитываете сумму бонуса и выводите
            // на экран.
    }
}
