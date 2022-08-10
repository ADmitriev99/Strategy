public class InsertSort extends Strategy{

    public int[] sort(int[] ints) {
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
        return ints;
    }
}
