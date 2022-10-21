package writingHW;

public class Pro_4 {

    String Name = "Prime";
    String Surname = "Testing";

    static boolean a = true;
    static boolean b = false;

    public void instanceMethod() {
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(Pro_4.a);
        System.out.println(Pro_4.b);
    }
    public static void staticMethod() {
        Pro_4 programme_4 = new Pro_4();
        System.out.println(programme_4.Name);
        System.out.println(programme_4.Surname);
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Pro_4 pro = new Pro_4();
        pro.instanceMethod();
        staticMethod();
    }
}
