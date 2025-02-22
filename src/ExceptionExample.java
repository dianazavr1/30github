public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Ошибка: деление на ноль
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль недопустимо!");
        }
    }
}
