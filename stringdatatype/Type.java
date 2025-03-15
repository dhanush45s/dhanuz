public class Type{
    public static void main(String[] args){
        String text = "Hello,Java!";
        System.out.println("Original String: " + text);
        System.out.println("Length of String: " + text.length());
        System.out.println("Uppercase String: " + text.toUpperCase());
        String replacedText = text.replace("Java", "World");
        System.out.println("Replaced String: " + replacedText);
        String substring = text.substring(7);
        System.out.println("Substring: " + substring);
    }
}