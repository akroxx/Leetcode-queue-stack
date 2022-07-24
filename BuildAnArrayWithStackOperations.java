class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();

        for(int i = 0, curr = 1; i < target.length && curr <= n; i++, curr++){
            res.add("Push");

            if(target[i] != curr){
                res.add("Pop");
                i--;
            }
        }
        return res;
    }
}