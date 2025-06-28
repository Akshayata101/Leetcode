class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll=new ArrayList<>();
        buildeme(ll,"",0,0,n);
        return ll;
        
    }
    private void buildeme(List<String> ll,String curr,int s,int e,int maxi){
        if(curr.length()==maxi*2){
            ll.add(curr);
            return;
        }
        if(s<maxi) buildeme(ll,curr+"(",s+1,e,maxi);
        if(e<s) buildeme(ll,curr+")",s,e+1,maxi);
    }
}
