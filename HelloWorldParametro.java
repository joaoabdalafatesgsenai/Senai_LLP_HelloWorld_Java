public class HelloWorldParametro {
    public static void main(String[] args) {
        System.out.print("Hello World");
        for (String arg : args) {
            System.out.print(" " + arg);
        }
        System.out.println();
    }
}
