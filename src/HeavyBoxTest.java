import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeavyBoxTest {
    public static void main (String[]args){
        List<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox(2.0, 3.0, 4.0, 10));
        boxes.add(new HeavyBox(3.5, 2.5, 5.0, 15));
        boxes.add(new HeavyBox(1.5, 2.0, 3.5, 8));

        System.out.println("Содержимое списка:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        boxes.get(0).weight += 1;

        if (!boxes.isEmpty()) {
            boxes.remove(boxes.size() - 1);
        }

        System.out.println("После изменений:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        HeavyBox[] array1 = boxes.toArray(new HeavyBox[0]);
        HeavyBox[] array2 = new HeavyBox[boxes.size()];
        boxes.toArray(array2);
        Object[] array3 = boxes.toArray();

        System.out.println("Массивы:");
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));
        System.out.println("array3: " + Arrays.toString(array3));

        boxes.clear();
        System.out.println("Список после удаления всех ящиков: " + boxes);
    }

}
