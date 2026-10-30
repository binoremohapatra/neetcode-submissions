class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //  Locker Room banaya <Sticker (String), Andar ka Thaila (List<String>)>
       Map<String, List<String>> map = new HashMap<>();
       // Ek-ek word uthao
       for(int i =0; i<strs.length;i++){

        String  word = strs[i];
        //  Word ko A-to-Z sort karke Locker ka Sticker (key) banao
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
       
        String key =  new String(arr);
         //  step  1: Agar "aet" ka locker nahi hai, toh banao aur khali thaila rakh do
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        // step 2  2 & 3: Locker se thaila nikalo (.get) aur usme word daal do (.add)
        List<String> thaila = map.get(key);
        thaila.add(word);
       }
       // Saare lockers ke andar rakhe Thalle (map.values()) nikaal kar return kar do!
       return new ArrayList<>(map.values());
    }
}
