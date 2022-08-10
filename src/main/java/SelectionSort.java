public class SelectionSort extends Strategy {

    public int[] sort(int[] ints) {
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
        return ints;
    }
}
