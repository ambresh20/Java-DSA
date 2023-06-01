public class a_53_argument {
    static void update(int a, int marks){
        a = 10; 
        // for(int i=0; i<marks.length; i++){
        //     marks[i] = marks[i]  + 2; 
        // }
        
    }
    public static void main(String[] args) {
        int marks[] = {5,6,7};
        int a = 5; 
        update(a,marks[0]);

         System.out.println(a);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] +" ");
           
        }
        System.out.println();
    }
}
