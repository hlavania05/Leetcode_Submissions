class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] steps = new int[cost.length+1];
        Arrays.fill(steps, -1);
        return Math.min(help(cost, 0, steps), help(cost, 1, steps));
    }
    public int help(int[] cost, int step, int[] steps){
        if(step >= cost.length){
            return 0;
        }
        if(steps[step] != -1){
            return steps[step];
        }
        int oneStep = help(cost, step+1, steps);
        int twoStep = help(cost, step+2, steps);

        return steps[step] = cost[step] + Math.min(oneStep, twoStep);
    }
}