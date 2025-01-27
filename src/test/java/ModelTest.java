import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ModelTest extends ModelAbstractTest {


    @Test
    void getOneArray() {
        int[] array = model.getOneArray();
        Assertions.assertTrue(Arrays.asList(array).contains(oneArray));
    }

    @Test
    void setOneArray() {
        model.setOneArray(thirdArray);
        Assertions.assertTrue(Arrays.asList(model.getOneArray()).contains(thirdArray));
    }

    @Test
    void getTwoArray() {
        int[] array = model.getTwoArray();
        Assertions.assertTrue(Arrays.asList(array).contains(twoArray));
    }

    @Test
    void setTwoArray() {
        model.setTwoArray(thirdArray);
        Assertions.assertTrue(Arrays.asList(model.getTwoArray()).contains(thirdArray));
    }
}