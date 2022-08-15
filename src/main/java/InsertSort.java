import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class InsertSort implements Strategy {

    public final Logger LOG = LogManager.getLogger(InsertSort.class.getSimpleName());

    public static int[] ints = null;

    @Override
    public int[] sort() {
        if (ints==null) {
            LOG.error("Массив значений не инициализирован");
            return null;
        }
        LOG.info("Время начала сортировки");
        for (int left = 0; left < ints.length; left++) {
            int key = ints[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (key < ints[i]) {
                    ints[i + 1] = ints[i];
                } else {
                    break;
                }
            }
            ints[i + 1] = key;
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
