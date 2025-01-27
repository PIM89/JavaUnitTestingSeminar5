import java.util.Arrays;

/**
 * Класс для работы с массивами.
 */

public class AverageModel extends Model implements AverageModelInterface {

    /**
     * Конструктор объекта.
     *
     * @param arrayOne Значение первого массива.
     * @param arrayTwo Значение второго массива.
     */
    public AverageModel(final int[] arrayOne, final int[] arrayTwo) {
        super(arrayOne, arrayTwo);
    }

    /**
     * Метод сравнивает средние значения массивов.
     */
    @Override
    public void getCompareAverageValue() {
        double averageOne = Arrays.stream(getOneArray())
                .average()
                .orElse(Double.NaN);
        double averageTwo = Arrays.stream(getTwoArray())
                .average()
                .orElse(Double.NaN);

        if (averageOne > averageTwo) {
            System.out.println("Первый список имеет большее среднее значение!");
        } else if (averageOne < averageTwo) {
            System.out.println("Второй список имеет большее среднее значение!");
        } else {
            System.out.println("Средние значения равны!");
        }
    }
}
