public class a_57_reverse {

    static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length - 1 ;
        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last-- ;
        }

    }
    public static void main(String[] args) {
        int numbers[] = {1,3,5,7,9,11,13,15,17,19};
         reverse(numbers); 

         for(int i=0; i<numbers.length; i++){
            System.out.print( numbers[i] +" ");
         }
         System.out.println();
         
    }
}
