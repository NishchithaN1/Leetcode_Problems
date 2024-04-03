class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res,new ArrayList<>(),candidates,target,0);
        return res;        
    }

    public void backtrack(List<List<Integer>> res,List<Integer> temp,int[] num,int remain,int start){
        if(remain<0)return;
        else if(remain==0)res.add(new ArrayList<>(temp));
        else{
            for(int i=start;i<num.length;i++){
                if(i>start && num[i]==num[i-1])continue;
                temp.add(num[i]);
                backtrack(res,temp,num,remain-num[i],i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}