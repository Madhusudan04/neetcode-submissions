class MinStack {

    class Pair{
        int min, top;
        public Pair(int top, int min){
            this.min = min;
            this.top = top;
        }
    }

    Stack<Pair> s;

    public MinStack() {
        s = new Stack<>();     
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push(new Pair(val,val));
            return;
        }
        s.push(new Pair(val,Math.min(s.peek().min, val)));
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek().top;
    }
    
    public int getMin() {
        return s.peek().min;
    }
}
