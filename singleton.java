package Singleton;

class A1 {
    //static A1 obj = new A1();//Early instantiation
static A1 obj;
    private A1() {
        System.out.println("Hello World");
    }

    public static A1 getObject() {
        if (obj == null) {
            obj = new A1();
        }
            return obj;
        }
    }
public class singleton {
    public static void main(String[] args) {
        A1 a1 = A1.getObject();
        A1 a2 = A1.getObject();
    }
}
