import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true){
            System.out.println("1. Додати фракцію");
            System.out.println("2. Видалити конкретну фракцію");
            System.out.println("3. Вивести усі фракції");
            System.out.println("4. Очистити конкретну фракцію");
            System.out.println("5. Вивести конкретну фракцію");
            System.out.println("6. Додати депутата у фракцію");
            System.out.println("7. Видалити депутата з фракції");
            System.out.println("8. Вивести список хабарників");
            System.out.println("9. Вивести найбільшого хабарника");

            VerkhovnaRada verkhRada = new VerkhovnaRada();

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input){
                case 1:
                    verkhRada.addFraction();
                    break;
                case 2:
                    verkhRada.deleteFraction();
                    break;
                case 3:
                    verkhRada.show1();
                    break;
                case 4 :

                    break;
                case 5:

                    break;
                case 6:
                    verkhRada.addDepToFrac();
                    break;
                case 7:

                    break;
                case 8:

                    break;



            }
verkhRada.show1();

        }



/*

        VerkhovnaRada verkhRada = new VerkhovnaRada();
        verkhRada.addFraction();
        verkhRada.addFraction();
        verkhRada.addFraction();
        verkhRada.show1();
        verkhRada.addFraction();
        verkhRada.addFraction();
        verkhRada.show1();
*/
    }

}
