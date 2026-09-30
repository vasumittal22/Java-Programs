public class MethodOverloading {
    static void print(int num) {
        System.out.println("Integer"  + num);
    }
    
    static void print(double num) {
        System.out.println("Double"  + num);
    }
    
    public static void main(String[] args) {
        print(5);        //Calls print(int)
        print(3.14);     //Calls print(double)
        System.out.println("Coded By: Vasu Mittal");
        System.out.println("ERP ID: 0251BCA061");
    }
}

