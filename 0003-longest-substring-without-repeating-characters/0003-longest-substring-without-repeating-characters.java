class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int last=0;
        int max_length=0;
        List<Character> list=new ArrayList<Character>();

        while(last<s.length()){
            if(!list.contains(s.charAt(last))){
                list.add(s.charAt(last));
                last++;
                max_length=Math.max(max_length,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
        
    }
}