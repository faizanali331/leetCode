class LongestSubstring{
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max = 0;
        while(j<s.length()){
            String sb = s.substring(i, j);
            if(sb.contains(Character.toString(s.charAt(j)))){
                i++;
            }else{
                j++;
            }
            max = Math.max(max, j-i);
        }
        return max;
    }
}