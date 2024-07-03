class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Creating of HaspMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Mapping the frequencies of all numbers
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }

        // checking the Majority element
        int fq = nums.length/3;
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > fq){
                ans.add(e.getKey());
            }
        }
        return ans;

    }
}