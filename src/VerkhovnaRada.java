import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class VerkhovnaRada extends Faction {
    public VerkhovnaRada(int weight, int growth, String prizvusche, String name, int age, boolean grafter, String nazvaFrak) {
        super(weight, growth, prizvusche, name, age, grafter, nazvaFrak);
    }

    public VerkhovnaRada() {
    }

    List<Faction> factions = new ArrayList<>();

    public void addFraction(){
        System.out.println("Введіть назву фракції");
        Scanner sc = new Scanner(System.in);
        String nazva = sc.nextLine();
        factions.add(new Faction(nazva));

    }
    public void deleteFraction(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Виберіть фракцію, щоб її видалити ");
        int lich=0;
        for (Faction f: factions) {
            lich++;
            System.out.println(lich+" "+f);
        }
        int index = scan.nextInt();
        factions.remove(index-1);
    }
    public void addDepToFrac(){
        System.out.println("Введіть прізвище нового депутата ");
        Scanner sc = new Scanner(System.in);
        String surname = sc.next();
        System.out.println("Введіть ім'я нового депутата ");
        Scanner sccanner = new Scanner(System.in);
        String name = sccanner.next();
        System.out.println("Введіть вік нового депутата ");
        Scanner scan = new Scanner(System.in);
        int age1 = scan.nextInt();
        System.out.println("Введіть вагу нового депутата ");
        Scanner scannne = new Scanner(System.in);
        int weight = scannne.nextInt();
        System.out.println("Введіть ріст нового депутата ");
        Scanner l = new Scanner(System.in);
        int growth = l.nextInt();
        System.out.println("Депутата хабарник? (true or f) ");
        Scanner scann = new Scanner(System.in);
        boolean grafter1 = scann.hasNextBoolean();
        deputat.add(new Deputy(weight,growth,surname,name,age1,grafter1));


        Scanner scam = new Scanner(System.in);
        System.out.println("Виберіть фракцію, до якої додати депутата ");
        int lich=0;
        Faction[] st = new Faction[factions.size()];
        for (Faction f: factions) {
            lich++;
            System.out.println(lich+" "+f);
            for (int i = 0; i < st.length; i++) {
                st[i] = f;
            }
        }
            int index = scam.nextInt();
            factions.add(new Faction(weight, growth, surname, name, age1, grafter1,st[index]));
        }
        public void show1(){
            for (Faction f: factions) {
                System.out.println(f);

            }
        }



/*
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Назвіть фрацію ");
        String frakNazva = sc.next();
        fraction.add(frakNazva);
    }
    public void delete(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Виберіть фракцію, щоб її видалити ");
        int lich=0;
        for (String s: fraction) {
            lich++;
            System.out.println(lich+" "+s);
        }
        int index = scan.nextInt();
        fraction.remove(index-1);
    }
    public void show(){
        for (String s: fraction) {
            System.out.println(s);
        }
    }
    public void showOneFrak() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву фракції ");
        String nazvaFrak = scanner.nextLine();
        for (String s : fraction) {
            if (nazvaFrak.equalsIgnoreCase(s)) {
                System.out.println("Ця фракція існує");// тут потрібно вивести конкретну фракцію
            }
        }
    }


 */

    @Override
    public String toString() {
        return "VerkhovnaRada{" +
                "factions=" + factions +
                ", deputat=" + deputat +
                '}';
    }
}
