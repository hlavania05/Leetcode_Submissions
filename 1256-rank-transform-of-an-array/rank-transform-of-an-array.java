class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = arr[i];
        }
        Arrays.sort(ans);
        HashMap<Integer, Integer> map = new HashMap<>();
        int smaller = 0;
        for(int item : ans){
            if(!map.containsKey(item)){
                map.put(item, smaller);
                smaller++;
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = map.get(arr[i]) +1;
        }
        return arr;

    }
}