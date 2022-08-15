public class Main {

    public static void main(String[] args) {
        strategySort(new SelectionSort(), 10_000);
    }

    private static void strategySort(Strategy strategy, int quantity) {
        strategy.create(quantity);
        strategy.sort();
    }
}
