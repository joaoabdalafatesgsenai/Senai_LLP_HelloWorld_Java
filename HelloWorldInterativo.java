import java.util.Scanner;

public class HelloWorldInterativo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Hello World "+nome);
    }
}
