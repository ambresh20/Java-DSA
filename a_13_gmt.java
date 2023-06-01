import java.util.Scanner;
public class a_13_gmt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Q.5 
        // System.out.println("Enter Your GMT:");
        // long GMT = sc.nextInt();

        // long totalMilliSecond = System.currentTimeMillis();
        // long totalSecond = totalMilliSecond / 1000;
        // long currentSecond = totalSecond % 60;

        // long totalMinute = totalSecond % 60;
        // long currentMinute = totalMinute /60 ;

        // long totalHour = totalMinute /60 ;
        // long currentHour = ((totalHour + GMT)%24);
        // System.out.println("Current time is "+ currentHour +":"+currentMinute + ":"+ currentSecond);
      
        // Q.6 body mass index . 
        System.out.println("Enter weight in pound:");
        int weight = sc.nextInt();
        System.out.println("Enter height in inch:");
        float height = sc.nextFloat();


        double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.println(BMI);


      sc.close();
    }
}
