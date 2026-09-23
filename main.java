import java.util.Scanner;
import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numeor: ");
        double num = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Escolha entre (* / % / + / -):");
        String op = scanner.nextLine();
        System.out.print("Escolha outro numeor: ");
        double num2 = scanner.nextDouble();

        switch (op) {
                case "+": System.out.printf("%.f2 %c %.f2 = %.f2", num, op, num2, num2);
        }
        //System.out.printf("Numero digitado foi: %.2f", num);
    }
}
