import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        VerkhovnaRada verkhRada = new VerkhovnaRada();

        while (true){
            System.out.println("1. Додати фракцію");
            System.out.println("2. Видалити конкретну фракцію");
            System.out.println("3. Вивести усі фракції");
            System.out.println("4. Очистити конкретну фракцію");
            System.out.println("5. Вивести конкретну фракцію");
            System.out.println("6. Додати депутата у фракцію");
            System.out.println("7. Видалити депутата з фракції");
            System.out.println("8. Вивести список хабарників");
            System.out.println("9. Вийти з програми");



            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input){
                case 1:
                    verkhRada.addFraction();
                    System.out.println("*********");
                    break;
                case 2:
                    verkhRada.deleteFraction();
                    System.out.println("*********");
                    break;
                case 3:
                    verkhRada.show1();
                    System.out.println("*********");
                    break;
                case 4 :
                    verkhRada.clearFraction();
                    System.out.println("*********");
                    break;
                case 5:
                    verkhRada.showOneFrak();
                    System.out.println("*********");
                    break;
                case 6:
                    verkhRada.addDepToFrac();
                    System.out.println("*********");
                    break;
                case 7:
                    verkhRada.deleteDepOfFraction();
                    System.out.println("*********");
                    break;
                case 8:
                    for (int i = 0 ; i < verkhRada.factions.size() ; i++) {
                        verkhRada.factions.get(i).habarnuku();
                    }
                    System.out.println("*********");
                    break;
                case 9:
                   System.exit(9);
                    break;
            }
        }
    }
}
