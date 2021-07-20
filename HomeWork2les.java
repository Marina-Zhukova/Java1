package homework2;

public class HomeWork2les {

    public static void main(String[] args) {
        System.out.println("Задание 1:");
        compareSumNumbers(3,5);
        System.out.println(compareSumNumbers(3,5));
        System.out.println("//--------------------------//");
        System.out.println("Задание 2:");
        plusOrMinus(5);
        System.out.println("//--------------------------//");
        System.out.println("Задание 3:");
        ifMinus(-15);
        System.out.println(ifMinus(5));
        System.out.println("//--------------------------///");
        System.out.println("Задание 4:");
        printStringTimes("Этот текст в строке № ", 5);
        System.out.println("//--------------------------///");
    }

//1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.
    public static boolean compareSumNumbers(int a, int b) {
        if ((a + b) >= 10 || (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }
//2. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или
// отрицательное. Замечание: ноль считаем положительным числом.
    public static void plusOrMinus(int c) {
        if (c >= 0) {
            System.out.println("Число " + c + " положительное");
        } else {
            System.out.println("Число " + c + " отрицательное");
        }
    }
//3. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное,
// и вернуть false если положительное.
    public static boolean ifMinus(int d) {
        if (d >= 0) {
            return false;
        } else {
            return true;
        }
    }
//4. Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printStringTimes(String words, int times) {
        for (int j = 0; j < times; j++) {
            System.out.println(words + " " + j + " напечатается " + times + " раз");
        }
    }
}