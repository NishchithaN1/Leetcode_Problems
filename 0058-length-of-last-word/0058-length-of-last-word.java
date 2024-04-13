class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        boolean val=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(val){
                break;
                }
            }else{
                val=true;
                count++;
            }
        }
        return count;
    }
}