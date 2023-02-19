public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int sum = 15000;
        int money = 0;
        int i = 0;
        while (money < 2_459_000) {
            money = money + money / 100;
            money = money + sum;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + money);
        }
    }

    public static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
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
        double sum = 15000;
        int mounth = 1;
        while (sum < 12000000) {
            sum = sum * 1.07;
            mounth++;
        }
        System.out.println(mounth);
    }

    public static void task5() {
        double sum = 15000;
        int mounth = 1;
        while (sum < 12000000) {
            sum = sum * 1.07;
            if (mounth % 6 == 0) {
                System.out.println("За " + mounth + " месяц было накоплено " + sum);
            }
            mounth++;
        }
    }

    public static void task6() {
        double sum = 15000;
        int interations = 12 * 9;
        int mounth = 1;

        while (mounth <= interations) {
            sum = sum * 1.07;
            if (mounth % 6 == 8) {
                System.out.println(mounth);
                System.out.println(sum);
            }
            mounth++;
        }
        System.out.println("За " + mounth + " месяц будет накоплено " + sum);
    }

    public static void task7() {
        for ( int friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        for (int year = 0; year <= 2054; year = year + 79) {
            System.out.println(year);
        }
    }
}


