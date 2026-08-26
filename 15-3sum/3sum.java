class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for(int i =0;i<nums.length;i++){
            Set<Integer> ha = new HashSet<>();

            for(int j = i+1;j<nums.length;j++){
                int third = -(nums[i] + nums[j]);

                if(ha.contains(third)){
                    List<Integer> list = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(list);
                    set.add(list);

                }
                ha.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}