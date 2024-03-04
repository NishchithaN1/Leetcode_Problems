class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        return getLetterCombination(digits,0);        
    }

    String[] codes={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> getLetterCombination(String digits,int idx){

        if(idx==digits.length()){
            List<String> baseres=new ArrayList<>();
            baseres.add("");
            return baseres;
        }

        List<String> myres=new ArrayList<>();

        List<String> recResult=getLetterCombination(digits,idx+1);
        char ch=digits.charAt(idx);
        String code=codes[ch-'0'];

        for(String resString:recResult){
            for(int i=0;i<code.length();i++){
                char chcode=code.charAt(i);
                myres.add(chcode+resString);
            }
        }

        return myres;

    }
}