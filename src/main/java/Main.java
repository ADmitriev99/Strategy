import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        sorting.setStrategy(new InsertSort());
        int[] ints = new int[]{1, 3, 5, 2, 6, -1, -2, 0, 4};
        System.out.println(Arrays.toString(sorting.sort(ints)));
    }
}
