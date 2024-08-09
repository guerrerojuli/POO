package tp01.ej01;

public class Main {
    public static void main(String[] args){
        Gear gear1 = new Gear(52, 11);
        System.out.println(gear1.getRatio());

        Gear gear2 = new Gear(30, 27);
        System.out.println(gear2.getRatio());
    }
}
