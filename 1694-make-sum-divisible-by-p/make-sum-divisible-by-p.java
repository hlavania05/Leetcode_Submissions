class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=0;
        int length=nums.length;
        for(int i=0;i<length;i++)
        {
            sum+=nums[i];
        }
        int to_rem=(int)(sum%p);//4
        if(to_rem==0)
          return 0;
        
        HashMap<Integer,Integer> prefixMod=new HashMap<>();
        prefixMod.put(0,-1);//0
        long prefixSum=0;
        int minLength=length;
        for(int i=0;i<minLength;i++)
        {
            if(length==1)
              return 1;
            prefixSum+=nums[i];//8
            int currentMod=(int)(prefixSum%p);//2
            int targetMod=(currentMod-to_rem+p)%p;//(2-4+6)%6 = 4
            if(prefixMod.get(targetMod)!=null)//-1
            {
                length=Math.min(length,i-prefixMod.get(targetMod));//4, 3 - 2 = 1
            }
            prefixMod.put(currentMod,i);//2,2
        }
        if(minLength==length)
          return -1;
        else
         return length;


    }
}