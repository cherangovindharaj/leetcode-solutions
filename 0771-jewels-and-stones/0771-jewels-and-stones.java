class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set= new HashSet<>();
        char ch[]= jewels.toCharArray();
        for(char i:ch){
            set.add(i);
        }
        int count =0;
        char c[] = stones.toCharArray();
        for(char i:c){
            if(set.contains(i)){
                count ++;
            }
        }
        return count;
    }
}