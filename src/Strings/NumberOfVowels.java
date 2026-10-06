package Strings;

public class NumberOfVowels {
    public static void main(String[] args) {
        String str = "its Hemant Kauhal";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            // char ch = str.charAt(i);           (Optional)
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                count++;
        }
        System.out.println(count);
    }
}