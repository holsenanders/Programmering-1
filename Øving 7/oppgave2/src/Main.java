import java .util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        System.out.println("What word would you like to swap?");
        String word = sc.nextLine();

        System.out.println("What word would you like to swap it with?");
        String newWord = sc.nextLine();

        System.out.println("The text is: " + getText(text));
        System.out.println("The amount of words in the text is:" + getAmountOfWords(text));
        System.out.println("The average size of words in the text is: " + getAverageSizeOfWords(text));
        System.out.println("The average amount of words per sentence is: " + periodAmount(text));
        System.out.println("The text with the word " + word + " replaced with " + newWord + " is: " + replaceWord(text, word, newWord));
        System.out.println("The text in all uppercase is: " + makeWordsUpperCase(text));


    }
    // muligens ikke nødvendig lol
    public static String getText(String text){
        return text;
    }

    public static int getAmountOfWords(String text) {
        String[] words = text.split(" ");
        return words.length;
    }

    public static double getAverageSizeOfWords(String text) {
        String[] words = text.split(" ");
        int totalWordLength = 0;

        for (String word : words) {
            totalWordLength += word.length();
        }
        if (words.length == 0) {
            return 0.0;
        }
        return (double) totalWordLength / words.length;
    }

    public static double periodAmount(String text) {
        String[] sentences = text.split("[.!?:]");
        int totalSentences = sentences.length;
        int totalWords = getAmountOfWords(text);
        if (totalSentences == 0) {
            return 0.0;
        }
        return (double) totalWords / totalSentences;
    }

    public static String replaceWord(String text, String word, String newWord) {
        String[] words = text.split("\\s+|[,.;!?]");
        StringBuilder newText = new StringBuilder();


        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (currentWord.equals(word)) {
                newText.append(newWord);
            } else {
                newText.append(currentWord);
            }
            // legger til mellomrom mellom ordene men ikke etter siste ordet
            if (i < words.length - 1) {
                newText.append(" ");
            }
        }

        return newText.toString();
    }

    public static String makeWordsUpperCase(String text){
        return text.toUpperCase();
    }


}