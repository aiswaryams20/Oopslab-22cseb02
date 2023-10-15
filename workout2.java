/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;
//1.reverse
/*import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}*/

//2.palindrome
/*import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
}*/

//3.vowel and consonaunt count
/*import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int vowels = 0;
        int consonants = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}*/

//4.no of words
/*import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}*/

//5.sorting array
/*import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}*/

//6.anagram
/*import java.util.Arrays;
public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}*/

//7.change two strings
/*public class StringChanger {
    public static void swapStrings(String[] strings) {
        if (strings.length == 2) {
            String temp = strings[0];
            strings[0] = strings[1];
            strings[1] = temp;
        }
    }

    public static void main(String[] args) {
        String[] strings = {"Hello", "World"};
        swapStrings(strings);
        System.out.println("After swapping: " + strings[0] + " " + strings[1]);
    }
}*/

//8.capitalize first letter
/*public class CapitalizeFirstLetter {
    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        String input = "hello, world";
        String result = capitalizeFirstLetter(input);
        System.out.println("Capitalized String: " + result);
    }
}*/

//9.validate alphabetic characters
/*public class AlphabeticValidator {
    public static boolean containsOnlyAlphabetic(String str) {
        return str.matches("^[a-zA-Z]+$");
    }

    public static void main(String[] args) {
        String input = "HelloWorld";
        if (containsOnlyAlphabetic(input)) {
            System.out.println("Contains only alphabetic characters.");
        } else {
            System.out.println("Contains non-alphabetic characters.");
        }
    }
}*/

//10.removing duplicate
/*public class DuplicateRemover {
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("String with duplicates removed: " + result);
    }
}*/

//11.remove digits
/*public class DigitRemover {
    public static String removeDigits(String str) {
        return str.replaceAll("\\d", "");
    }

    public static void main(String[] args) {
        String input = "Hello123World456";
        String result = removeDigits(input);
        System.out.println("String with digits removed: " + result);
    }
}*/

//12.no of characters
/*import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); // Case-insensitive count
            }
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}*/

//13.ascii code
/*public class AsciiPrint {
    public static void main(String[] args) {
        String input = "Hello, World!";
        
        for (char c : input.toCharArray()) {
            int ascii = (int) c;
            System.out.println(c + ": " + ascii);
        }
    }
}*/

//14.print upper case
/*public class UppercasePrint {
    public static void main(String[] args) {
        String input = "Hello, World!";
        
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                System.out.println(c);
            }
        }
    }
}*/

//15.lowercase count
/*public class LowercaseCount {
    public static void main(String[] args) {
        String input = "Hello, World!";
        int count = 0;
        
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count++;
            }
        }
        
        System.out.println("Lowercase character count: " + count);
    }
}*/

//16.string with digits
/*public class DigitThenChar {
    public static void main(String[] args) {
        String input = "a1b2c3";
        StringBuilder digits = new StringBuilder();
        StringBuilder chars = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else {
                chars.append(c);
            }
        }
        
        String result = digits.toString() + chars.toString();
        System.out.println(result);
    }
}*/

//17.remove spaces
/*public class RemoveSpaces {
    public static void main(String[] args) {
        String input = "This is a string with spaces";
        String result = input.replaceAll(" ", "");
        System.out.println(result);
    }
}*/

//18.reverse the case
/*public class ReverseCase {
    public static String reverseCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseCase(input);
        System.out.println(reversed);
    }
}*/

//19.piglatin
/*public class PigLatin {
    public static String toPigLatin(String word) {
        String vowels = "AEIOUaeiou";
        if (word.length() == 0) {
            return word;
        }
        if (vowels.indexOf(word.charAt(0)) != -1) {
            return word + "way";
        } else {
            int i = 0;
            while (i < word.length() && vowels.indexOf(word.charAt(i)) == -1) {
                i++;
            }
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            return suffix + prefix + "ay";
        }
    }

    public static void main(String[] args) {
        String input = "hello";
        String pigLatin = toPigLatin(input);
        System.out.println(pigLatin);
    }
}*/

//20.encoding in java
/*public class CaesarCipher {
    public static String encode(String input, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) (base + (c - base + shift) % 26));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        int shift = 2;
        String encoded = encode(input, shift);
        System.out.println(encoded);
    }
}*/

//21.print the first character of each word in a sentence
/*public class FirstCharacterOfWords {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.print(word.charAt(0) + " ");
        }
    }
}*/

//22.first two characters
/*public class FirstTwoCharactersOfWords {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() >= 2) {
                System.out.print(word.substring(0, 2) + " ");
            } else {
                System.out.print(word + " ");
            }
        }
    }
}*/

//23.print a word of first letter
/*public class WordsStartingWith {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with words that start with S";
        String start = "S";
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.startsWith(start)) {
                System.out.println(word);
            }
        }
    }
}*/

//24.print word with last letter
/*public class WordsEndingWithLetterOrString {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with some words ending with 's'.";
        String ending = "s";

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.endsWith(ending)) {
                System.out.println(word);
            }
        }
    }
}*/

//25.print with specific letter
/*public class WordsContainingLetterOrString {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with some words containing 'th'.";
        String search = "th";

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.contains(search)) {
                System.out.println(word);
            }
        }
    }
}*/

//26.print with particular no of characters
/*public class WordsWithSpecificLength {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with words of various lengths.";
        int lengthToFind = 5;

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() == lengthToFind) {
                System.out.println(word);
            }
        }
    }
}*/

//27.special characters
/*public class PrintStringWithSpecialCharacters {
    public static void main(String[] args) {
        String specialString = "Hello, this is a string with special characters: !@#$%^&*()";
        System.out.println(specialString);
    }
}*/

//28.longest word
/*public class LongestWordInSentence {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with some long words in it.";

        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
    }
}*/

//29.find the word
/*public class FindWordInString {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to find a particular word.";
        String targetWord = "particular";

        if (sentence.contains(targetWord)) {
            System.out.println("The word '" + targetWord + "' was found in the sentence.");
        } else {
            System.out.println("The word '" + targetWord + "' was not found in the sentence.");
        }
    }
}*/

//30.count no of words
/*import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
    }
}*/

//31.Count number of words ending with a particular letter
/*import java.util.Scanner;
public class WordsEndingWithLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the letter to search for: ");
        char letter = scanner.nextLine().charAt(0);
        
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.endsWith(String.valueOf(letter))) {
                count++;
            }
        }
        System.out.println("Number of words ending with '" + letter + "': " + count);
    }
}*/

//32.replace the word
/*public class ReplaceWord {
    public static void main(String[] args) {
        String original = "The quick brown fox jumps over the lazy dog";
        String replaced = original.replace("fox", "cat");
        System.out.println("Original: " + original);
        System.out.println("Replaced: " + replaced);
    }
}*/

//33.delete the word
/*public class DeleteWord {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with a word to delete.";
        String wordToDelete = "word";
        
        String updatedSentence = sentence.replaceAll("\\b" + wordToDelete + "\\b", "");
        System.out.println("Original: " + sentence);
        System.out.println("After deleting '" + wordToDelete + "': " + updatedSentence);
    }
}*/

//34.change the case
/*public class ChangeCase {
    public static void main(String[] args) {
        String text = "Hello, World!";
        String lowerCaseText = text.toLowerCase();
        String upperCaseText = text.toUpperCase();
        
        System.out.println("Original: " + text);
        System.out.println("Lowercase: " + lowerCaseText);
        System.out.println("Uppercase: " + upperCaseText);
    }
}*/

//35.swap the first letter of each word
/*public class SwapFirstLastLetter {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (word.length() > 1) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                word = last + word.substring(1, word.length() - 1) + first;
            }
            result.append(word).append(" ");
        }
        
        System.out.println("Original: " + sentence);
        System.out.println("After swapping: " + result.toString().trim());
    }
}*/

















