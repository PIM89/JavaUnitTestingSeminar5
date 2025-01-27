import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AverageModelTest extends AverageModelAbstractTest {
    @Test
    void checkFirstBiggerSecond() {
        int[] oneArray = new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] twoArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        AverageModel averageModel = new AverageModel(oneArray, twoArray);
        averageModel.getCompareAverageValue();
        Assertions.assertEquals("Первый список имеет большее среднее значение!",
                outputStreamCaptor.toString().trim());
    }

    @Test
    void checkSecondBiggerFirst() {
        int[] oneArray = new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] twoArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        AverageModel averageModel = new AverageModel(twoArray, oneArray);
        averageModel.getCompareAverageValue();
        Assertions.assertEquals("Второй список имеет большее среднее значение!",
                outputStreamCaptor.toString().trim());
    }

    @Test
    void checkFirstEqualsSecond() {
        int[] oneArray = new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] twoArray = oneArray;
        AverageModel averageModel = new AverageModel(oneArray, twoArray);
        averageModel.getCompareAverageValue();
        Assertions.assertEquals("Средние значения равны!",
                outputStreamCaptor.toString().trim());
    }

    @Test
    void checkNegativeFirst() {
        int[] oneArray = new int[]{-5, -6, -7, -8, -9, -10, -11, -12, -13};
        int[] twoArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        AverageModel averageModel = new AverageModel(oneArray, twoArray);
        averageModel.getCompareAverageValue();
        Assertions.assertEquals("Второй список имеет большее среднее значение!",
                outputStreamCaptor.toString().trim());
    }
}