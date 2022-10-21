package writingHW;

public class Pro_3 {

    static String name = "Prime";
    static String surname = "Testing";

    public void instanceMethod() {
        System.out.println(name);
        System.out.println(surname);
    }
    public static void staticMethod() {
        Pro_3 pro_3= new Pro_3();
        System.out.println(name);
        System.out.println(surname);
    }
    public static void main(String[] args) {
       Pro_3 pro_3 = new Pro_3();
      pro_3.instanceMethod();
        staticMethod();
    }
}
