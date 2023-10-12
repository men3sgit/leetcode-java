class Solution {
    private int[] array;
    public Solution(int[] nums) {
        this.array = nums;
    }
    
    public int[] reset() {
        return array;
    }
    
    public int[] shuffle() {
        int[] res = new int[array.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<array.length;i++){
            list.add(array[i]);
        }

        Collections.shuffle(list);
        for(int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
   
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
