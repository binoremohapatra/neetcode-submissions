class Solution {

    public String encode(List<String> strs) {
     StringBuilder sb = new StringBuilder();
     for(String s: strs){
        sb.append(s.length()).append("#").append(s);

     }
     return sb.toString();

    }

    public List<String> decode(String str) {
    List <String> ans = new ArrayList<>();
    int i = 0;
    while(i<str.length()){
        int hashIndex = str.indexOf("#", i);
        int length = Integer.parseInt(str.substring(i, hashIndex));
        int wordStart = hashIndex + 1;
            String word = str.substring(wordStart, wordStart + length);
            ans.add(word);
            i = wordStart + length;
    }
    return ans;

    }
}
