import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class SelectionSort implements Strategy {

    public final Logger LOG = LogManager.getLogger(SelectionSort.class.getSimpleName());

    public static int[] ints = null;

    @Override
    public int[] sort() {
        if (ints==null) {
            LOG.error("Массив значений не инициализирован");
            return null;
        }
        LOG.info("Время начала сортировки");
        for (int i = 0; i < ints.length; i++) {
            int position = i;
            int min = ints[i];
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] < min) {
                    position = j;
                    min = ints[j];
                }
            }
            ints[position] = ints[i];
            ints[i] = min;
        }
        LOG.info("Время конца сортировки");
        LOG.info("Отсортированный массив: " + Arrays.toString(ints));
        return ints;
    }

    @Override
    public void create(int quantity) {
        ints = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            ints[i] = 10 * (quantity - i);
        }
        LOG.info("Созданный массив: " + Arrays.toString(ints));
    }
}
