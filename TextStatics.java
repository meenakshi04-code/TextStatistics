import java.util.Scanner;

public class TextStatics {
    public static void main(String[]args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter the text (type 'exit' to finish):");

        int charactercount = 0;
        int wordcount = 0;
        int linecount = 0;

        while(scanner.hasNextLine()) {
            String Line = Scanner.nextLine();

            if(line.eqaulIgnorecase("exit")){
            break;
        }
    

    CharacterCount += line.length();
    String[]words = line.split("\\s");
    wordCount += words.length;
    lineCount++;
}
System.out.println("Text statics");
System.out.println("Number of Characters: " + CharacterCount);
System.out.println("Number of words: " +wordCount);
System.out.println("Number of lines: " +lineCount);

Scanner.close();
}
}


