import org.junit.jupiter.api.BeforeEach;

public class ModelAbstractTest {
    final int[] oneArray = new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13};
    final int[] twoArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    final int[] thirdArray = new int[]{20, 21, 22, 23, 24, 25};
    Model model;

    @BeforeEach
    public void setUp() {
        model = new Model(oneArray, twoArray);
    }
}
