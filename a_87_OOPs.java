public class a_87_OOPs {
    public static void main(String agrs[]){
        // Create a Object.
        Pen p1 = new Pen();   // create a pen object called p1.

        p1.setColor("white");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        // p1.setColor("Red");
        p1.color = "Red" ;
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Ambresh";
        // myAcc.possword = "abcdefghijklmnopqrstuvwxyz"
        myAcc.setPossword("kamalesh");
      

    }

}

class BankAccount{
    public String userName ;
    private String possword ;
    // default void setPossword(String psw){
        possword = psw;
    }
}

class Pen {   // prop + fun.
    String color ;  // blueprint.
    int tip ;

   void setColor(String newcolor){
        color = newcolor ;
    }

    void setTip(int newtip ){
        tip = newtip ;
    }

}

class Student{
    String name ;
    int age ;
    String course;
    float percentage ;   // CGPA

    void calpercentage(int phy, int chem, int maths){
        percentage = (phy + chem + maths) / 3 ;
    }

    void setName(String newname){
        name = newname ;
    }
    void setAge( int newage){
        age = newage ;
    }
}
