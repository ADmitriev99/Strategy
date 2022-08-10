public class Sorting {

    private Strategy strategy;

    public Sorting() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int[] sort(int[] ints) {
        return strategy.sort(ints);
    }
}
