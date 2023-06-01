public class a_78_substring {
    public static void subString(String str){
        int count = 0;
     for(int i=0; i<str.length() ; i++){        // starting index.
        for(int j=i+1; j<=str.length() ; j++){  // exclusive index.
            System.out.print(str.substring(i,j) +" ");
            count++;
        }
        System.out.println();
     }
     System.out.println(count);
  }

    public static void main(String[] args) {
        // String str = "Ambresh";
        // System.out.println(str.substring(0,7));
        // subString(str);

        // Largest String.
        String fruit[] = {"Banana", "mango", "apple"} ;
        String largest = fruit[0];
        for(int i=0; i<fruit.length; i++){
            if( largest.compareToIgnoreCase(fruit[i]) < 0 ){
                largest = fruit[i] ;
            }
        }

        System.out.println(largest);

    }
}
