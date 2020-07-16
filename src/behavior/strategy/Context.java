package behavior.strategy;

public class Context {
    public Strategy strategy;

    public void sort(int[] nums) {
        strategy.sort(nums);
    }
}
