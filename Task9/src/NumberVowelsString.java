public class NumberVowelsString {

    public static void main(String[] args) {
        String x = "programming";
        System.out.println(countVowels(x, 0));
    }

    public static int countVowels(String word, int index) {

        // Base case
        if (index == word.length()) {
            return 0;
        }

        int count = 0;
        char current = word.charAt(index);

        if (current == 'a' || current == 'e' ||
                current == 'i' || current == 'o' ||
                current == 'u') {
            count = 1;
        }

        return count + countVowels(word, index + 1);
    }
}