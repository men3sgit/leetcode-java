class Solution {
    int[] array;
    public Solution(int[] nums) {
        this.array = nums.clone();
    }
    
    public int pick(int target) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<array.length;i++){
            if(array[i] == target) list.add(i);
        }
        return list.get(new Random().nextInt(list.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
