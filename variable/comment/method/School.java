public class School{
    public void add(int numOne,int numTwo){
        int numThree = numOne + numTwo;
        System.out.println(numThree);
    }
    public static void main(String[] args){
        School obj = new School();
        obj.add(20,30);
    }
}