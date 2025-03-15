public class cal{
    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public int sub(int a,int b){
        int c=a-b;
        return c;
}
public int multi(int a,int b){
        int c=a*b;
        return c;
}
public  int divid(int a,int b){
        int c=a/b;
        return c;
}
public static void main(String[] args){
    cal obj=new cal();
    int num1=obj.add(10,20);
    int num2=obj.sub(1,2);
    int num3=obj.multi(13,27);
    int num4=obj.divid(14,2);
     System.out.println(num1);
     System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
}
}