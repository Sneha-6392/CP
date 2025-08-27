package CP.day4;
import java.util.*;
// Check if two strings are equal (case-sensitive and case-insensitive).
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str1 = sc.nextLine();
//         String str2 = sc.nextLine();
//         // case-sensitive comparison
//         System.out.println(str1.equals(str2));
//         // case-insensitive comparison
//         System.out.println(str1.equalsIgnoreCase(str2));
//         sc.close();
//     }
// }


// Convert a string to uppercase without using toUpperCase() (ASCII based).
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         StringBuilder upperStr = new StringBuilder();
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch >= 'a' && ch <= 'z') {
//                 upperStr.append((char)(ch - ('a' - 'A')));
//             } else {
//                 upperStr.append(ch);
//             }
//         }
//         System.out.println(upperStr.toString());
//         sc.close();
//     }
// }


// Count the number of vowels in a string.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int vowelsCount =0;
//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
//                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
//                 vowelsCount++;
//             }

//         }
//         System.out.println("Number of vowels: " + vowelsCount);
//         sc.close();
//     }
// }


// Find the length of a string without using .length().
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int length = 0;
//         for(int i : str.toCharArray()) {
//             length++;
//         }
//         System.out.println("Length of the string: " + length);
//         sc.close();
//     }
// }


// Check if a string is a palindrome.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder str = new StringBuilder(sc.nextLine());
//         StringBuilder revStr = new StringBuilder(str).reverse();
//         if(str.toString().equals(revStr.toString())) {
//             System.out.println("The string is a palindrome.");
//         } else {
//             System.out.println("The string is not a palindrome.");
//         }
//     }
// }


// Find the first non-repeating character in a string.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             if(map.get(ch) == 1) {
//                 System.out.println("First non-repeating character: " + ch);
//                 break;
//             }
//         }
//         sc.close();
//     }
// }


// Count the number of words in a string (use StringTokenizer).
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         StringTokenizer st = new StringTokenizer(str);
//         System.out.println("Number of words: " + st.countTokens());
//         sc.close();
//     }
// }


// Replace all spaces with hyphens in a string.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner (System.in);
//         String str = sc.nextLine();
//         String replacedStr = str.replace(' ', '-');
//         System.out.println(replacedStr);
//         sc.close();
//     }
// }


// Find the ASCII value of each character in a string.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             int ASCIIvalue = (int) ch;
//             System.out.println("ASCII value of " + ch + " is: " + ASCIIvalue);
//         }
//         sc.close();
//     }
// }


// Reverse each word in a sentence (e.g., "Hello World" → "olleH dlroW").
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String[] words = str.split(" ");
//         StringBuilder result = new StringBuilder();
//         for(String word : words) {
//             StringBuilder revWord = new StringBuilder(word).reverse();
//             result.append(revWord).append(" ");
//         }
//         System.out.println(result.toString().trim());
//         sc.close();
//     }
// }


// Remove duplicate characters from a string.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         StringBuilder str2 = new StringBuilder();
//         HashSet<Character> set = new HashSet<>();
//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             if(!set.contains(ch)) {
//                 set.add(ch);
//                 str2.append(ch);
//             }
//         }
//         System.out.println(str2.toString());
//         sc.close();
//     }
// }


// Check if two strings are anagrams.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str1 = sc.nextLine();
//         String str2 = sc.nextLine();
//         if(str1.length() != str2.length()) {
//             System.out.println("The strings are not anagrams.");
//             return;
//         }
//         int[] count = new int[256]; // Assuming ASCII character set
//         for(int i=0; i<str1.length(); i++) {
//             count[str1.charAt(i)]++;
//             count[str2.charAt(i)]--;
//         }
//         for(int i : count) {
//             if(i != 0) {
//                 System.out.println("The strings are not anagrams.");
//                 return;
//             }
//         }
//         System.out.println("The strings are anagrams.");
//         sc.close();
//     }
// }


// Remove all digits from a string.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         StringBuilder result = new StringBuilder();
//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             if(!Character.isDigit(ch)) {
//                 result.append(ch);
//             }
//         }
//         System.out.println(result.toString());
//         sc.close();
//     }
// }


// Capitalize the first letter of each word in a sentence.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String[] words = str.split(" ");
//         for(int i=0; i<words.length; i++) {
//             if(words[i].length() > 0) {
//                 words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
//             }
//         }
//         String result = String.join(" ", words);
//         System.out.println(result);
//         sc.close();
//     }
// }


// Check if a string contains only digits.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         boolean isDigitOnly = true;
//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             if(!Character.isDigit(ch)) {
//                 isDigitOnly = false;
//                 break;
//             }
//         }
//         if(isDigitOnly) {
//             System.out.println("The string contains only digits.");
//         } else {
//             System.out.println("The string contains non-digit characters.");
//         }
//         sc.close();
//     }
// }


// Compress a string like "aaabbcc" → "a3b2c2" using StringBuilder.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         StringBuilder str2 = new StringBuilder();
//         int count =1;
//         for(int i=0; i<str.length(); i++) {
//             if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//             } else {
//                 str2.append(str.charAt(i));
//                 if(count > 1) {
//                     str2.append(count);
//                 }
//                 count = 1;
//             }
//         }
//         System.out.println(str2.toString());
//         sc.close();
//     }
// }


// Toggle the case of each character in a string.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         StringBuilder str2 = new StringBuilder();
//         for(int i=0; i<str.length(); i++) { 
//             char ch = str.charAt(i);
//             if(Character.isLowerCase(ch)) {
//                 str2.append(Character.toUpperCase(ch));
//             } else if(Character.isUpperCase(ch)) {
//                 str2.append(Character.toLowerCase(ch));
//             } else {
//                 str2.append(ch);
//             }
//         }
//         System.out.println(str2.toString());
//         sc.close();
//     }
// }


// Find the longest word in a sentence.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String[] words = str.split(" ");
//         String longestWord = "";
//         for(String word : words) {
//             if(word.length() > longestWord.length()) {
//                 longestWord = word;
//             }   
//         }
//         System.out.println("Longest word: " + longestWord);
//         sc.close();
//     }
// }


// Count frequency of each character in a string.
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
//         for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//             System.out.println(entry.getKey() + ": " + entry.getValue());
//         }
//         sc.close();
//     }
// }


// Implement your own split() method (without using built-in split() or StringTokenizer).
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//     }
// }


// 







