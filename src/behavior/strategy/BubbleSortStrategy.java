package behavior.strategy;

public class BubbleSortStrategy extends Strategy {
    @Override
    public void sort(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println(i);
            //boolean flag = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                System.out.println(" -- " + j);
                if (nums[j] > nums[j + 1]) {
                    int t = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = t;
                    //flag = true;
                }
            }
            for (int k : nums) {
                System.out.print(k + " ");
            }
            System.out.println();
//            if (!flag) {
//                System.out.println("未交换");
//                return;
//            }
        }
    }
}
