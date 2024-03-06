class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map=new HashMap<>();

       for(String word:strs){
           char[] ch=word.toCharArray();
           Arrays.sort(ch);
           String store=new String(ch);

           if(!map.containsKey(store)){
               map.put(store,new ArrayList<>());
           }

           map.get(store).add(word);
       } 
        return new ArrayList<>(map.values());
    }
}