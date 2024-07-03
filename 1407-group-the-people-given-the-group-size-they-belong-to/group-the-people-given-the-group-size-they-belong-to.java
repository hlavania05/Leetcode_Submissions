class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ll = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if(!map.containsKey(size)){
                map.put(size, new ArrayList<>());
            }
            map.get(size).add(i);
            if(map.get(size).size() == size){
                ll.add(new ArrayList<>(map.get(size)));
                map.get(size).clear();
            }
        }
        return ll;
    }
}