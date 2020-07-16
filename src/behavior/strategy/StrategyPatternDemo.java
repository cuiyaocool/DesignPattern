package behavior.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        context.strategy = new BubbleSortStrategy();
        int[] nums = new int[] {3,1,4,7,6,2};
        context.sort(nums);
        for (int k : nums) {
            System.out.print(k + " ");
        }
        System.out.println();
        nums = new int[] {3,1,4,7,6,2};
        context.strategy = new QuickSortStrategy();
        context.sort(nums);
        for (int k : nums) {
            System.out.print(k + " ");
        }
    }
}
