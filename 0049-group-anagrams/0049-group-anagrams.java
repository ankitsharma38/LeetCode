class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] a=s.toCharArray();

            Arrays.sort(a);
            String sort = new String(a);

            if(!map.containsKey(sort)){
                map.put(sort,new ArrayList<>());
            }
            map.get(sort).add(s);
        }
        return new ArrayList<>(map.values());
    }
}