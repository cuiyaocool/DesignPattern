package behavior.strategy;

public class QuickSortStrategy extends Strategy {
    @Override
    public void sort(int[] nums) {
        System.out.println("快速排序");
        if (nums == null || nums.length <= 1) {
            return;
        }
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int s, int e) {
        if (s >= e) {
            return;
        }
        for (int k : nums) {
            System.out.print(k + " ");
        }
        System.out.println();
        int i = s, j = e;
        int base = nums[s];
        while (i < j) {
            while (nums[j] >= base && i < j) {
                j--;
            }
            while (nums[i] <= base && i < j) {
                i++;
            }
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        nums[s] = nums[i];
        nums[i] = base;
        quickSort(nums, s, i - 1);
        quickSort(nums, i + 1, e);

    }
}
