public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void task1 () {
        int sum = 15000;
        int money = 0;
        int i = 0;
        while (money < 2_459_000) {
            money = money + money/100;
            money = money + sum;
            i++;
            System.out.println("Месяц " + i +" сумма накоплений равна " + money);
        }
    }
    public static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++ ;
        }
        System.out.println();
        int a = 10;
        for (; a >= 1; ) {
            System.out.print(a + " ");
            a--;
        }
        System.out.println();
    }
    public static void task3() {
        int population = 12000000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        for (int i = 1; i <= 10; i++) {
            population += population * dif / 1000;
        System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }
    public static void task4() {
        int firstSum = 15000;
        int i = 0;
        while (firstSum <= 12000000) {
            firstSum += firstSum * 0.07;
            i++;
            System.out.println("Сумма накоплений за " + i + " месяц равна " + firstSum);
        }
    }
    public static void task5() {
        int firstSum = 15000;
        int i = 0;
        while (firstSum <= 12000000) {
            firstSum += firstSum * 0.07;
            i = i + 6;
            System.out.println("Сумма накоплений за " + i + " месяц равна " + firstSum);
        }
    }
    public static void task6() {

    }
}