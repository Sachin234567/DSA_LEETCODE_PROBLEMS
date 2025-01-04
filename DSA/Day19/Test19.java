package Day19;

// To find the length of last word in a string
public class Test19 {
    public int FindLength(String s) {
        if (s == null || s.isEmpty()) {
            return 0; // Handle null or empty strings
        }

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                count++;
            } else if (count != 0) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Test19 obj = new Test19();
        String s = "I am a Boy"; // Test string
        int result = obj.FindLength(s);
        System.out.println(result);
    }
}