class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Character> arr1 = new ArrayList<>();
        for(char c:s.toCharArray()){
            arr.add(c);
        }
        for(char c:t.toCharArray()){
            arr1.add(c);
        }
        Collections.sort(arr);
        Collections.sort(arr1);
        if(arr.equals(arr1)) return true;
        return false;
    }
}