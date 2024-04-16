import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        return find_triplet(nums);
    }
    public static List<List<Integer>> find_triplet(int[] arr){
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int start = i+1;
            int end = arr.length-1;
            while(start < end){
                if(arr[i] + arr[start] + arr[end] == 0){
                    List<Integer> l = new ArrayList<>();
                    l.add(arr[i]);
                    l.add(arr[start]);
                    l.add(arr[end]);
                    result.add(l);
                    while(start+1<end &&  arr[start+1]==arr[start]){ start++; }
                    while(end-1>start &&  arr[end-1]==arr[end]){ end--; }
                    start++;
                    end--;
                }
                else if(arr[i] + arr[start] + arr[end] < 0){
                    start++;
                }
                else{
                    end--;
                }
            }
            while(i+1<arr.length && arr[i+1]==arr[i]){ i++; }
        }
        return result;
        
    }
}