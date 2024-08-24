package taller02.ej01;

public abstract class SubwayCard {
    private SubwayCentral subwayCentral;

    public SubwayCard(SubwayCentral subwayCentral) {
        this.subwayCentral = subwayCentral;
    }

    protected abstract boolean canRide();

    protected SubwayCentral getSubwayCentral() {
        return subwayCentral;
    }

    public abstract void ride();

}
