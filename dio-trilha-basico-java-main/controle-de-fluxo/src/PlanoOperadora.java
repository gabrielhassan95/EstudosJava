import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Qual Plano você deseja? para Turbo digite 'T', para Mega digite 'M' e para Básico digite 'B'");
        String plano = scanner.next();

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
