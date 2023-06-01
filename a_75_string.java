// import java.util.Scanner ;
public class a_75_string {
    public static void printLetter(String str){
        for(int i=0; i<str.length() ; i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    //     String str = "Ambresh";
    //     String str2 = new String("Kamalesh");
        
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // s = sc.next();
        // s = sc.nextLine();
        // System.out.println(s);

        // length.
        // String fullName = "Ambresh Vaishya";
        // System.out.println(fullName.length() );

        // concatanation of String.
        String firstName = "Ambresh";
        String lastName = "Vaishya";
        String fullName = firstName + " " + lastName ;
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(5));

        printLetter(fullName);


       
    }
}
