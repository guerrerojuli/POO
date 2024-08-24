package taller02.ej01;

public class FixedSubwayCard extends SubwayCard{
   private int rides;

    public FixedSubwayCard(SubwayCentral subwayCentral, int rides) {
        super(subwayCentral);
        this.rides = rides;
    }

    @Override
    public boolean canRide() {
        return rides > 0;
    }

    @Override
    public void ride() {
        if(!canRide()) {
            System.out.println("No more trips");
            return;
        }
        rides--;
    }
}
