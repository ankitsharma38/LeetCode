class Solution {
    public int countSeniors(String[] details) {
        int seniorCount = 0;
        for (String detail : details) {
            // the age substring from the detail string
            String ageStr = detail.substring(11, 13);
            // Converting the age substring to an integer
            int age = Integer.parseInt(ageStr);
            // Checking if the age is greater than 60
            if (age > 60) {
                seniorCount++;
            }
        }
        return seniorCount;
    }
}
