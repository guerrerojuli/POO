package parcial01.c22023.ej02;

public class LoungeCentral {
    private boolean isOpen = true;

    public void openLounges() {
        isOpen = true;
    }

    public void closeLounges() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
