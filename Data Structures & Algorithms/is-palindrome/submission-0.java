class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isAlphanumeric(s.charAt(i))) {
                i++;
                continue;
            } else if (!isAlphanumeric(s.charAt(j))) {
                j--;
                continue;
            } else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
