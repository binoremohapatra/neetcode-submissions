class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length() ){
            return false ;

         }
         char[] sl = s.toCharArray();
         char[] tl = t.toCharArray();
         Arrays.sort(sl);
         Arrays.sort(tl);


          return Arrays.equals(sl,tl);
    }
}
