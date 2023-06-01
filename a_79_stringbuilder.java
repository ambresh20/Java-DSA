public class a_79_stringbuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='A' ; ch<='Z'; ch++){
        //     sb.append(ch);
        // }
        // time complexity :
        // O(26) -- Stringbuilder.
        // O(n^2) -- String

        // System.out.println(sb +" ");
        // System.out.println(sb.length() );

        long arr[] = {1,2,3,4,5,6};
        // long ar[] = new long[arr.length];
        for(int i=0; i<arr.length; i++){
            int first =0 , last =arr.length-1;
            if(i%2 == 0){
                while(first<last){
                    long temp = arr[last];
                    arr[last] = arr[first];
                    arr[first] = temp ;
                    first++;
                    last--;

                }
            } 
            else{
                arr[i] = 0;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();



    }

}
