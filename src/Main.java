public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] salaryArray = generateRandomArray();
        for (int j : salaryArray) {
            System.out.println(j);
        }
        int salaryTotal = 0;
        for (int salary : salaryArray) {
            salaryTotal = salaryTotal + salary;
        }
        System.out.println("Сумма трат за месяц составила " + salaryTotal + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] salaryArray = generateRandomArray();
        int salaryMin = 200001;
        int salaryMax = 99999;
        for (int salary : salaryArray) {
            if (salary > salaryMax) {
                salaryMax = salary;
            }
            if (salary < salaryMin) {
                salaryMin = salary;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + salaryMin + " рублей. Максимальная сумма трат за день составила " + salaryMax + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] salaryArray = generateRandomArray();
        for (int j : salaryArray) {
            System.out.println(j);
        }

        int salaryTotal = 0;
        double salaryDay = 30;

        for (int salary : salaryArray) {
            salaryTotal = salaryTotal + salary;
        }

        double salaryAverage = salaryTotal / salaryDay;
        System.out.println("Средняя сумма трат за месяц составила " + salaryAverage + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}