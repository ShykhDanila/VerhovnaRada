import java.util.*;


public class VerkhovnaRada extends Faction {

    public VerkhovnaRada(String nazvaFrak) {
        super(nazvaFrak);
    }

    public VerkhovnaRada() {
    }

    List<Faction> factions = new ArrayList<>();
    Faction faction = new Faction();

    int lich=0;

    public void addFraction(){
        System.out.println("Введіть назву фракції");
        Scanner sc = new Scanner(System.in);
        String nazva = sc.nextLine();
        faction = new Faction(nazva);
        factions.add(faction);

    }
    public void deleteFraction(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Виберіть фракцію, щоб її видалити ");
        for (Faction f: factions) {
            lich++;
            System.out.println(lich+" "+f);
        }
        lich = 0;
        int index = scan.nextInt();
        factions.remove(index-1);
    }
    public void clearFraction(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Виберіть фракцію, щоб її очистити ");
        for (Faction f: factions) {
            lich++;
            System.out.println(lich+" "+f);
        }
        lich = 0;
        int index = scan.nextInt();
        //factions.get(index-1).deputat.removeAll(deputat);
        faction.ochustka();
    }
    public void maxumumHabar(){
        List<Deputy> deputies = new ArrayList<>();
        for (Faction f:
             factions) {
            f.deputat.sort(Collections.reverseOrder());
            deputies.add(f.deputat.get(0));
        }
        deputies.sort(Collections.reverseOrder());
        System.out.println(deputies.get(0));
    }
    public void maxHabarnuk() {
        for (Faction faction :
                factions) {
            lich++;
            System.out.println(lich + ". " + faction);
        }
        lich = 0;
        Scanner scanner = new Scanner(System.in);
        int numFaction = scanner.nextInt();
        factions.get(numFaction - 1).deputat.sort(Collections.reverseOrder());
        System.out.println("У фракції " + factions.get(numFaction-1).getNazvaFrak() + " найбільший хабарник:");
        System.out.println(factions.get(numFaction-1).deputat.get(0));

    }
    public void deleteDepOfFraction(){
        System.out.println("Виберіть депутат, щоб його видалити ");
        for (Faction value : factions) {
            for (Deputy deputys : value.deputat) {
                lich++;
                System.out.println(lich + " " + deputys);
            }
        }
        lich = 0;
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        //deputat.remove(index-1);
        faction.delete(index-1);
    }
    public void addDepToFrac(){
        System.out.println("Виберіть фракцію, до якої додати депутата ");
        for (Faction f: factions) {
            lich++;
            System.out.println(lich+" "+f);
        }
        lich = 0;
        Scanner scam = new Scanner(System.in);
            int index = scam.nextInt();
            faction = factions.get(index-1);
            faction.add();
        }

        public void show1(){
            for (Faction f: factions) {
                System.out.println(f + f.deputat.toString());

            }
        }
    public void showOneFrak() {
        System.out.println("Виберіть фракцію:");
        for (Faction s : factions) {
            lich++;
            System.out.println(lich + ". " + s);
            }
        lich = 0;
        Scanner scanner = new Scanner(System.in);
        int numberNazvaFrak = scanner.nextInt();
        System.out.println(factions.get(numberNazvaFrak-1).toString() +  factions.get(numberNazvaFrak-1).deputat.toString());
        }
}





