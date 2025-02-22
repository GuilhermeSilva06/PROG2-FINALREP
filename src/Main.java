import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Automovel a1 = new Automovel("11-11-AA", "Toyota", 1400);
        System.out.println(a1);

        System.out.println("A matricula do a1 é: " + a1.getMatricula());
        System.out.println("Foram criadas, " + Automovel.getTotalAutomoveis() + " instâncias.");
        System.out.println("\n");
        Automovel a2 = new Automovel("22-22-BB", "Fiat");
        System.out.println(a2);
        a2.setCilindrada(1800);
        System.out.println(a2);
        System.out.println("Foram criadas, " + Automovel.getTotalAutomoveis() + " instâncias.");

        System.out.println("A diferença de cilindradas entre os dois automoveis é: " + a1.calcularDiferencaCilindrada(a2) + "cc");

        String matriculaMaiorCilindrada;
        if (a1.isCilindradaMaior(a2)) {
            matriculaMaiorCilindrada = a1.getMatricula();
        } else {
            matriculaMaiorCilindrada = a2.getMatricula();
        }
        System.out.println("Matrícula do automóvel com maior cilindrada: " + matriculaMaiorCilindrada);

        if (a1.isCilindradaMaior(2000)) {
            System.out.println("A cilindrada de a1 é superior a 2000cc");
        } else {
            System.out.println("A cilindrada de a1 é inferior a 2000cc");
        }

        Automovel a3 = new Automovel("33-33-CC", "Toyota", 1400);
        Automovel a4 = new Automovel("30-RB-53", "Peugeot", 1200);


        Automovel[] JornalDeAutomoveis = new Automovel[Automovel.getTotalAutomoveis()];
        JornalDeAutomoveis[0] = a1;
        JornalDeAutomoveis[1] = a2;
        JornalDeAutomoveis[2] = a3;
        JornalDeAutomoveis[3] = a4;

        for (int i = 0; i < JornalDeAutomoveis.length; i++) {
            System.out.println(JornalDeAutomoveis[i]);
        }

// qual a maior cilindrada
       for ( int j = 0; j< JornalDeAutomoveis.length; j++){

       }

        if (a1.isCilindradaMaior(a2)) {
            matriculaMaiorCilindrada = a1.getMatricula();
        } else {
            matriculaMaiorCilindrada = a2.getMatricula();
        }
        System.out.println("Matrícula do automóvel com maior cilindrada: " + matriculaMaiorCilindrada);

    }
}

//Teste de Pull
