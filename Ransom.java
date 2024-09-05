class Ransom {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rN = new int[125];
        int max = Math.max(magazine.length(),ransomNote.length());

        for(int i=0; i<max; i++){
            if(i<ransomNote.length())
                rN[ransomNote.charAt(i)]--;
            if(i<magazine.length())
                rN[magazine.charAt(i)]++;
        }
        for(int i=96; i<125; i++){
            if(rN[i]<0) return false;
        }
        return true;
    }
}