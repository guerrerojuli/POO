package tp01.ej01;

public class Gear {
    private final int chainring;
    private final double cog;

    public Gear(int chainring, double cog) {
        this.chainring = chainring;
        this.cog = cog;
    }

   public double getRatio(){
        return this.chainring / this.cog;
   }
}
