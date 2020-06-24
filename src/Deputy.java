import java.util.Scanner;

public class Deputy extends Human {

    private String prizvusche;
    private String name;
    private int age;
    private boolean grafter;
    private int giveGrafter;


    public Deputy(int weight, int growth, String prizvusche, String name, int age, boolean grafter) {
        super(weight, growth);
        this.prizvusche = prizvusche;
        this.name = name;
        this.age = age;
        this.grafter = grafter;
    }

    public Deputy() {
    }


    public void give_grafter(){
        if(!grafter){
            System.out.println("&quot;Цей депутат не бере хабарів&quot;");
        }
        else{
            System.out.println("Введіть суму хабаря ");
            Scanner sc = new Scanner(System.in);
            int suma = sc.nextInt();
            if (suma > 5000) {
                System.out.println("&quot;Міліція ув'язнить депутата&quot;");
                setGiveGrafter(suma);
            }
            else {
                setGiveGrafter(suma);
            }
        }
    }

    public String getPrizvusche() {
        return prizvusche;
    }

    public void setPrizvusche(String prizvusche) {
        this.prizvusche = prizvusche;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGrafter() {
        return grafter;
    }

    public void setGrafter(boolean grafter) {
        this.grafter = grafter;
    }

    public int getGiveGrafter() {
        return giveGrafter;
    }

    public void setGiveGrafter(int giveGrafter) {
        this.giveGrafter = giveGrafter;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "prizvusche='" + prizvusche + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grafter=" + grafter +
                ", giveGrafter=" + giveGrafter +
                '}';
    }
}
