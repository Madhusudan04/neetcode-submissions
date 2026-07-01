
class StockSpanner {
    class Pair{
        int val, days;
        Pair(int val, int d){
            this.val = val;
            this.days = d;
        }
    }
    Stack<Pair> s;
    public StockSpanner() {
        s = new Stack<>();
    }
    
    public int next(int price) {
        int day = 1;
        while(!s.isEmpty() && s.peek().val <= price){
            day += s.pop().days;
        }
        s.push(new Pair(price,day));
        return day;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */