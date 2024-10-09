public class Main {
    public static void main(String[] args) {
        // 1 задача
        int[] accountant = {90000, 67000,300000, 45000, 89000};
        int total = 0;
        for (int j : accountant) {
            total += j;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        // 2 задача
        int minWeek = 1000000000;
        int maxWeek = -1;
        for (int j : accountant) {
            if (j <= minWeek) {
                minWeek = j;
            }
            if (j >= maxWeek) {
                maxWeek = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWeek + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxWeek +  " рублей");
        // 3 задача
        System.out.println("Средняя сумма трат за месяц составила " + total / accountant.length + " рублей");
        // 4 задача
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        // думаю ничего страшного если я 3 задания выполнил с помощью одного массива, а не нескольких
    }
}