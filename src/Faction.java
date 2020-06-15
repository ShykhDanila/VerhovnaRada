import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Faction extends Deputy{
    private String nazvaFrak;

    public Faction(int weight, int growth, String prizvusche, String name, int age, boolean grafter, String nazvaFrak) {
        super(weight, growth, prizvusche, name, age, grafter);
        this.nazvaFrak = nazvaFrak;
    }

    public Faction(String nazvaFrak) {
        this.nazvaFrak = nazvaFrak;
    }

    public Faction() {
    }

    public Faction(int weight, int growth, String surname, String name, int age1, boolean grafter1, Faction faction) {
    }

    List<Deputy> deputat = new ArrayList<>();

    public void add(){
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
    }

    public void delete(int index){
        deputat.remove(index);
    }
    public void habarnuku(){
        for (Deputy s: deputat) {
            if(s.isGrafter()==true){
                System.out.println(s);
            }
        }
    }


public void show(){
    for (Deputy s: deputat) {
        System.out.println(s);
    }
    }

    public void ochustka(){
        deputat.removeAll(deputat);
    }

    public String getNazvaFrak() {
        return nazvaFrak;
    }

    public void setNazvaFrak(String nazvaFrak) {
        this.nazvaFrak = nazvaFrak;
    }

    public List<Deputy> getDeputat() {
        return deputat;
    }

    public void setDeputat(List<Deputy> deputat) {
        this.deputat = deputat;
    }

    @Override
    public String toString() {
        return "Faction{" +
                "nazvaFrak='" + nazvaFrak + '\'' +
                '}';
    }
}




