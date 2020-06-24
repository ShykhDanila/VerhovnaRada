import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Faction {
    private String nazvaFrak;

    public Faction(String nazvaFrak) {
        this.nazvaFrak = nazvaFrak;
    }

    public Faction() {
    }

    List<Deputy> deputat = new ArrayList<>();
    Deputy deputy = new Deputy();

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
        deputy = new Deputy(weight,growth,surname,name,age1,grafter1);
        deputy.give_grafter();
        deputat.add(deputy);

    }

    public void delete(int index){
        deputat.remove(index);
    }
    public void habarnuku(){
        for (Deputy s: deputat) {
            if(s.isGrafter()){
                System.out.println(s);
            }
        }
    }

    public void ochustka(){
        //deputat.removeAll(deputat);
        deputat.clear();
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
                "nazvaFrak='" + nazvaFrak +
                '}';
    }
}




