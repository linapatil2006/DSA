class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                Set<Integer> ha = new HashSet<>();
                for(int k =j+1;k<nums.length;k++){
                    long req =(long) target - nums[i] - nums[j] - nums[k];
                    if(req >= Integer.MIN_VALUE && req <= Integer.MAX_VALUE && ha.contains((int) req)){
                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],(int) req);
                        Collections.sort(list);
                        st.add(list);
                    }
                    ha.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(st);
    }
}