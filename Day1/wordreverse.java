import java.util.Scanner;

public class wordreverse {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        System.out.println("Reversed sentence: " + reversedSentence);

        
        scanner.close();
    }
}
        

        
        
        

       
        
