class Solution {
    public String countAndSay(int n) {
        String seq="1";
        

        for(int i=0;i<n-1;i++){
            StringBuilder sb=new StringBuilder();
            char prev=seq.charAt(0);
            int count=0;

            for(int j=0;j<seq.length();j++){
                char current=seq.charAt(j);
                if(prev==current){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(prev);
                    count=1;
                    prev=current;
                }
                
            } 
            sb.append(count);
            sb.append(prev);
            seq=sb.toString();
        }
        return seq;  

    }
    
}