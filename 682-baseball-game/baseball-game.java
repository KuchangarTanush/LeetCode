class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(String s:operations){
            if(s.equals("+")){
                int top=st.pop();
                int newTop=st.peek()+top;
                st.push(top);
                st.push(newTop);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                int doub=st.peek();
                int newdoub=doub*2;
                st.push(newdoub);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        for(int val:st){
            sum+=val;
        }
        return sum;
    }
}