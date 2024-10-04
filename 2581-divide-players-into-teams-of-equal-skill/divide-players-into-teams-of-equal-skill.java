class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i = 0;
        int j = skill.length-1;
        long score = 0;
        int target = skill[i] + skill[j];
        while(i < j){
            int sum = skill[i] + skill[j];
            if(target != sum){
                return -1;
            }
            score += (skill[i]*skill[j]);
            i++;
            j--;
        }
        return score;

    }
}