//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cilindro cilindro = new Cilindro();
        cilindro.setRaio(2);
        cilindro.setAltura(3);

        Cilindro cil2 = new Cilindro();
        cil2.setRaio(3);
        cil2.setAltura(4);

        System.out.println("Volume: " + cilindro.volume());

        System.out.println("Volume: " + cil2.volume());
    }
}

//Este é um teste de pull para perceber se está funcional
//Parece Funcionar
//Acho que está funcional
//Teste