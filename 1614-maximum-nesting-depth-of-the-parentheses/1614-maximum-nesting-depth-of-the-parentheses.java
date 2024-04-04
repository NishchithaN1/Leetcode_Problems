class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxlen=0;
        for(char c:s.toCharArray())
        if(c=='('){
            count++;
            if(maxlen<count){
                maxlen=count;
            }
        }else if(c==')'){
            count--;
        }
        return maxlen;
    }
}