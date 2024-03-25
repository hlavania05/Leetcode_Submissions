class StockSpanner {
    Stack<Pair<Integer, Integer>> s;

    public StockSpanner() {
        s = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        while(!s.empty() && s.peek().getKey() <= price){
            count += s.peek().getValue();
            s.pop();
        }
        s.push(new Pair<>(price, count));
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */