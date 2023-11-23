import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a string you would like to scan (or an empty string to exit):");
            // make the text lowercase
            String text = sc.nextLine().toLowerCase();
            // since this is a while loop to break it you need to enter an empty string
            if (text.isEmpty())
                break;

            System.out.println("Enter a character you would like to find the amount of in said string:");
            // how you define a character apperently
            char character = sc.next().charAt(0);
            // make the character lowercase
            character = Character.toLowerCase(character);
            sc.nextLine();

            System.out.println("Amount of different characters in the string: " + getNumberOfDifferentCharacters(text));
            System.out.println("Amount of characters in the string: " + getLengthOfString(text));
            System.out.println("Percentage of letters compared to characters in the string: " + getPercentage(text) * 100 + "%");
            System.out.println("Amount of times the character " + character + " appears in the string: " + countInputInString(text, character));
            System.out.println("The most used letter in the string: " + getMostUsedCharacter(text));
        }



    }
// gets amount of letters in the string
    public static int getLengthOfString (String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(Character.isLetter(text.charAt(i))) {
                count++;
            }

        }
        return count;
    }
    // gets the percentage of letters in the string
public static double getPercentage (String text) {
    return (double) getLengthOfString(text) / text.length();
}
// gets the amount of times a character appears in the string
    public static int countInputInString (String text, char character) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            // if the character at the index is the same as the character you are looking for
            if (text.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
    public static int getNumberOfDifferentCharacters(String text) {
        int count = 0;
        // boolean array to check if the character exists
        boolean[] characterexist = new boolean[256];
// for loop in the length of the text
        for (int i = 0; i < text.length(); i++) {
            // current character is the character at the index
            char currentChar = text.charAt(i);
            // if the character is between a and å
            if(currentChar >= 'a' && currentChar <= 'å') {
                // index is the current character - a
                int index = currentChar - 'a';
                // if the character does not exist
                if (!characterexist[index]) {
                    characterexist[index] = true;
                    count++;
                }

        }
    }
        return count;
    }
    public static char getMostUsedCharacter(String text) {
        // replace all the dots, spaces and commas with nothing (W3 schools baby)
        text = text.replaceAll("[.\\s,:]", "");
// int array with 30 indexes
        int[] letterFrequency = new int[256];
        for (int i = 0; i < 29; i++) {
            letterFrequency[i] = 0;
        }
        // same code as the getNumberOfDifferentCharacters method
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'å') {
                int index = currentChar - 'a';
                letterFrequency[index]++;
            }
        }
//make an empty char variable and an int variable
        char mostUsedChar = '\0';
        int maxFrequency = 0;

        for (int i = 0; i < 29; i++) {
            // if the letter frequency is bigger than the max frequency
            if (letterFrequency[i] > maxFrequency) {
                maxFrequency = letterFrequency[i];
                mostUsedChar = (char) ('a' + i);
            }
        }

        return mostUsedChar;
    }
    }


