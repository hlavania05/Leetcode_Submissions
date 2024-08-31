/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return first_bad_version(n);
    }
    public int first_bad_version(int n){
        int low = 1;
        int high = n;
        int result = 0;
        while(low<=high){
            int mid = low + ((high-low)/2);
            if(isBadVersion(mid)){
                result = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }
}