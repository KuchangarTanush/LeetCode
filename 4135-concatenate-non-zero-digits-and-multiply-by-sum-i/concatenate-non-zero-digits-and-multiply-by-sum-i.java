class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb=new StringBuilder();
        String s=Integer.toString(n);
        int sum=0;
        if(n==0)return 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                sb.append(s.charAt(i));
                sum+=s.charAt(i)-'0';
            }
        }
        long ans=(Long.parseLong(sb.toString()))*(long)sum;
        return ans;
    }
}