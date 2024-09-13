package parcial01.c22022.ej03;

public enum Destinatario {
    PERSONAL("PERSONAL", 50000, 12),
    AUTOMOTOR("VEHICLE", 300000, 24),
    HIPOTECARIO("HOME", 1000000, 360);

    private int montoLimite;
    private int cantCuotasLimite;
    private String name;

    Destinatario(String name, int montoLimite, int cantCuotasLimite) {
        this.montoLimite = montoLimite;
        this.cantCuotasLimite = cantCuotasLimite;
        this.name = name;
    }

    public boolean esPrestamoValido(int monto, int cantCuotas) {
        return (monto <= montoLimite) && (cantCuotas <= cantCuotasLimite);
    }

    @Override
    public String toString() {
        return name;
    }
}
