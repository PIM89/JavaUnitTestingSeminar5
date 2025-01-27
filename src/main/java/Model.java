public class Model implements ModelInterface {
    /**
     * Первый массив.
     */
    private int[] arrayOne;
    /**
     * Второй массив.
     */
    private int[] arrayTwo;

    /**
     * Конструктор объекта.
     *
     * @param firstArray значение первого массива.
     * @param secondArray значение второго массива.
     */
    public Model(final int[] firstArray, final int[] secondArray) {
        arrayOne = firstArray;
        arrayTwo = secondArray;
    }

    /**
     * Метод возвращает значение первого массива.
     * @return первый массив.
     */
    @Override
    public int[] getOneArray() {
        return arrayOne;
    }

    /**
     * Метод устанавливает значение первого массива.
     * @param value новое значение первого массива.
     */
    @Override
    public void setOneArray(final int[] value) {
        arrayOne = value;
    }

    /**
     * Метод возвращает значение второго массива.
     * @return второй массив.
     */
    @Override
    public int[] getTwoArray() {
        return arrayTwo;
    }

    /**
     * Метод устанавливает значение второго массива.
     * @param value новое значение второго массива.
     */
    @Override
    public void setTwoArray(final int[] value) {
        arrayTwo = value;
    }
}
