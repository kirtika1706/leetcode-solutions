class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int sum=0;
        for(int x:candies){
            sum=Math.max(sum,x);
        }
        List<Boolean> result=new ArrayList<>();
        for(int x:candies){
            if(x+extraCandies>=sum){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}