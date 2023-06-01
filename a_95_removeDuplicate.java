public class a_95_removeDuplicate {

    public static void removeDuplicat(String str , int idx, StringBuilder sb , boolean map[]){

        //  base case 
        if(idx == str.length()){
            System.out.println(sb);
            return ;
        }

        // kaam 
        char currChar = str.charAt(idx);

        if(map[currChar- 'a'] == true){
            // duplicate words.
            removeDuplicat(str, idx +1, sb, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicat(str, idx+1, sb.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        String str = "ambreshkumarvaishya";
        StringBuilder sb = new StringBuilder("");

         removeDuplicat(str, 0, sb, new boolean[26] );


        
    }
}
