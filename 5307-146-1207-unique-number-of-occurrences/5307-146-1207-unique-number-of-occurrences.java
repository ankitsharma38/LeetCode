class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> frequencySet = new HashSet<>();
        for (int freq : countMap.values()) {
            if (!frequencySet.add(freq)) {
                return false; 
            }
        }

        return true;
    }
}