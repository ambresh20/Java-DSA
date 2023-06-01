public class a_54_linear_search {

    static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int linearString(String menu[], String food){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == food){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        // int numbers [] = {2,4,6,8,10,12,14,16,18,20};
        // int key = 16;
        // int index = linearSearch(numbers ,key);

        // if(index == -1){
        //     System.out.println("Not found");
        // }
        //  else{
        //     System.out.println("Index are :" + index);
        //  }

        String menu[] = { "Dosa", "Rise", "Panear", "chicken", "Egg", "Samosa", "Spite" };
        String food = "Ice-cream";
        int index = linearString(menu ,food);

         if(index == -1){
            System.out.println("Not found");
        }
         else{
            System.out.println("Index are :" + index);
         }

    




    }
}
