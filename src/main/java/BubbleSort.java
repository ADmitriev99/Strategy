import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class BubbleSort implements Strategy {

    public final Logger LOG = LogManager.getLogger(BubbleSort.class.getSimpleName());

    public static int[] ints = null;

    @Override
    public int[] sort() {
        if (ints==null) {
            LOG.error("Массив значений не инициализирован");
            return null;
        }
        LOG.info("Время начала сортировки");
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        LOG.info("Время конца сортировки");
        LOG.info("Отсортированный массив: " + Arrays.toString(ints));
        return ints;
    }

    @Override
    public void create(int quantity) {
        ints = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            ints[i] = (int) (10 * quantity * Math.random());
        }
        LOG.info("Созданный массив: " + Arrays.toString(ints));
    }
}
