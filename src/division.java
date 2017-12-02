import java.util.Scanner;

public class division {
    double division, modulo, cociente;


    public void calculardivision(){
        Scanner TR= new Scanner(System.in);

        System.out.print(" escriba un numero entero: ");
        double numero1=TR.nextInt();

        System.out.print(" escriba un numero entero: ");
        double numero2=TR.nextInt();


        division=(numero1/numero2);
        modulo=(numero1%numero2);



        if(modulo==0 ){
            System.out.println("la division es exacta. El resultado es "+division);
        }else {
            System.out.println("la division  no es exacta. El resultado es "+division);

        }


        }

    }


