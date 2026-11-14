

class Parent {
    void show(Object obj) {
        System.out.println("Object");
    }
}

class Child extends Parent {
    void show(String str) {
        System.out.println("String");
    }
}



public class MainProg {


    public static void main(String[] args) {
        Parent p = new Child();
        p.show("Hello");
    }

}
