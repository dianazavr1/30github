import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через запятую");
        String input = scanner.nextLine();

        String[] numbers = input.split(",");
        Set<Integer>uniqueNumbers = new HashSet<>();

        for (String number : numbers){
            uniqueNumbers.add(Integer.parseInt(number));
        }
        System.out.println("Уникальные числа" + uniqueNumbers);


    }
}
