class Parent{
    public void add(){
        System.out.println("hello world");

    }
}
class child extends Parent {
    void display(){
        add();
    }
}

class Third extends child {
    void helper(){
        display();
    }
}
public class Multiple{
    public static void main(String[] args){
        Third obj = new Third();
    obj.helper();
    }
    
}