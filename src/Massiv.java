public class Massiv {
    public static void main(String[] args) {
        String[] days = new String[7]; // Создаем массив из 7 элементов
        days[0] = "Понедельник";
        days[1] = "Вторник";
        days[2] = "Среда";
        days[3] = "Четверг";
        days[4] = "Пятница";
        days[5] = "Суббота";
        days[6] = "Воскресенье";

        System.out.println(days[days.length - 1]); // Выводим последний элемент
    }
}
