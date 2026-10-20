class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //map
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int []arr = new int[26];
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                arr[ch - 'a']++;  // 
            }
           StringBuilder sb = new StringBuilder();
           for(int i: arr){
            sb.append('#');
            sb.append(i);
           }
String key = sb.toString();
if(!map.containsKey(key)){
    map.put(key, new ArrayList<String>());
}
map.get(key).add(s);
        }
        return new ArrayList(map.values());

        }
}
