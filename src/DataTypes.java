public class DataTypes {
    public static void main(String[] args) {
        // Целочисленные
        byte smallNumber = 127;
        int number = 100;
        long bigNumber = 10000000000L;

        // Числа с плавающей точкой
        float decimalSmall = 5.75f;
        double decimalBig = 19.99;

        // Логический тип
        boolean isJavaFun = true;

        // Символ
        char letter = 'A';

        // Строка
        String text = "Привет, Java!";

        // Массив
        int[] numbersArray = {1, 2, 3, 4, 5};

        // Коллекция (список)
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("Алиса");
        names.add("Боб");

        // Вывод данных
        System.out.println("Целочисленные: " + smallNumber + ", " + number + ", " + bigNumber);
        System.out.println("Дробные числа: " + decimalSmall + ", " + decimalBig);
        System.out.println("Логическое значение: " + isJavaFun);
        System.out.println("Символ: " + letter);
        System.out.println("Строка: " + text);
        System.out.println("Массив: " + java.util.Arrays.toString(numbersArray));
        System.out.println("Коллекция: " + names);
    }
}
