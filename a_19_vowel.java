// WAP check user input character are vowel or not.
import java.util.Scanner;

public class a_19_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String text;
        switch(ch){
            case 'a':
                   text = "Vowel";
                   break;
            case 'e':
                   text = "Vowel";
                   break;
            case 'i':
                   text = "Vowel";
                   break;
            case 'o':
                   text = "Vowel";
                   break;
            case 'u':
                   text = "Vowel";
                   break;
            case 'A':
                   text = "Vowel";
                   break;
            case 'E':
                   text = "Vowel";
                   break;
            case 'I':
                   text = "Vowel";
                   break;
            case 'O':
                   text = "Vowel";
                   break; 
            case 'U':
                   text = "Vowel";
                   break; 
           default:
                  text = "Constant";
            
                          
        }
        System.out.println("character are "+ text);
        

        sc.close();
    }
}
