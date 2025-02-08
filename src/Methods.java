public class Methods {
    public static void main(String[] args) {
        printLastDayOfWeek();
        System.out.println("Сумма 5 и 10: " + sum(5, 10));
        System.out.println("Максимальное число: " + max(8, 3));
        System.out.println("Число 7 чётное? " + isEven(7));
    }

    // Метод 1: Вывод последнего дня недели
    public static void printLastDayOfWeek() {
        String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        System.out.println("Последний день недели: " + days[days.length - 1]);
    }

    // Метод 2: Возвращает сумму двух чисел
    public static int sum(int a, int b) {
        return a + b;
    }

    // Метод 3: Возвращает большее из двух чисел
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Метод 4: Проверяет, является ли число чётным
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

