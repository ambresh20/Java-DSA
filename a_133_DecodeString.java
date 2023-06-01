import java.util.Stack;

public class a_133_DecodeString {
    public static String decode(String str){
      
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();
        StringBuilder temp = new StringBuilder("") ;
        StringBuilder result = new StringBuilder("") ;

        for (int i = 0; i < str.length(); i++){
               int count = 0;

            if (Character.isDigit(str.charAt(i))){
                   while (Character.isDigit(str.charAt(i))){
                         count = count * 10 + str.charAt(i) - '0';
                          i++;
                     }

                   i--;
                   integerstack.push(count);
             }
            else if (str.charAt(i) == ']'){
                     temp.setLength(0) ;
                     count = 0;
                if (!integerstack.isEmpty()){

                    count = integerstack.peek();
                    integerstack.pop();
                }

            while (!stringstack.isEmpty() && stringstack.peek() != '[' ){
                temp.insert(0, stringstack.peek()) ;
                stringstack.pop();
           }

        if (!stringstack.empty() && stringstack.peek() == '[' )
            stringstack.pop();

            for (int j = 0; j < count; j++){
                result.append(temp) ;
            }

            for (int j = 0; j < result.length(); j++)
                 stringstack.push(result.charAt(j));
                 result.setLength(0) ;
            }

        else if (str.charAt(i) == '[' ) {

            if (Character.isDigit(str.charAt(i-1)))
                    stringstack.push(str.charAt(i));
            else{
                  stringstack.push(str.charAt(i));
                  integerstack.push(1);
            }

       }
       else 
          stringstack.push(str.charAt(i));
}
            while (!stringstack.isEmpty()){
                result.insert(0, stringstack.peek() ) ;
                stringstack.pop();
            }

            
      return result.toString() ;
    }

    
    public static void main(String[] args) {
        String str = "3[b2[ca]]";
        System.out.println(decode(str)) ;
    }
}
