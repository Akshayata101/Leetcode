class Solution {
    public int calculate(String s) {
        if(s==null||s.isEmpty()) return 0;
        int num=0;
        int ln=0;
        int res=0;
        char op='+';

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num=num*10+(s.charAt(i)-'0');

            }
            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||i==s.length()-1){
                if(op=='+'){
                    res+=ln;
                    ln=num;
                }else if(op=='-'){
                    res+=ln;
                    ln=-num;
                }else if(op=='*'){
                    ln=ln*num;
                }else if(op=='/'){
                    ln/=num;
                }
                op=s.charAt(i);
                num=0;
            }
        }
        return res+ln;

        
    }
}
