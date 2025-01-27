public interface ModelInterface {

    /**
     * Метод возвращает первый массив.
     * @return значения первого массива
     */
    int[] getOneArray();

    /**
     * Метод задает первый массив.
     * @param value новое значение первого массива.
     */
    void setOneArray(int[] value);

    /**
     * Метод задает второй массив.
     * @return значение сторого массива.
     */
    int[] getTwoArray();

    /**
     * Метод задает второй массив.
     * @param value новое значение второго массива
     */
    void setTwoArray(int[] value);
}
