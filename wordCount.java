import java.util.Scanner;

public class WordCount {

   public static void main(String[] args) {
       Scanner myObj = new Scanner(System.in);

    System.out.println("Enter the word to reverse:");
    String input = myObj.nextLine();

        char[] x = input.toCharArray(); 
        List<Character> y; 
        y = new ArrayList<>();
  
        for (char c: x) 
            y.add(c); 
  
        Collections.reverse(y); 
        ListIterator a = y.listIterator(); 
        
        while (a.hasNext()) 
            System.out.print(a.next()); 
}
}
