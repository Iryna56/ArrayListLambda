import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Main {

    /*Создайте стрим, который будет делать следующие вещи:
1) Делит все числа на 2
2) Оставляет только те, которые больше, чем 25
3) Вычитает 30 из каждого числа
4) Сортирует
5) Выбирает только первых 5 элементов
6) подсчитывает сумму оставшихся элементов
    * */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(100);
        for (int i = 0; i <= 100; i++) {
            Random random = new Random();
            arrayList.add(random.nextInt(100));
        }




        Optional<Integer> sum = arrayList.stream()
                .map(x -> x / 2)
                .filter(x -> x > 25)
                .map(x -> x - 30)
                .sorted()
                .limit(5)
                .reduce((a,b) -> a + b);

        System.out.println(sum);


    }
}






























