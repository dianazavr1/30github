public class ThrowExample {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Принудительная ошибка!");
        } catch (RuntimeException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}
