import java.util.Scanner;

public class a_4_temparature {

  public static void main(String[] args){
    
    float c, fe ;
     Scanner sc= new Scanner(System.in);
     
     System.out.println("enter ferihnhite:");
      fe= sc.nextFloat();
     c = (5*fe- 160)/9;
     System.out.println(c);
     
    
    sc.close();
    
  }
}

