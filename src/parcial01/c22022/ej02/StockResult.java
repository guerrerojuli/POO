package parcial01.c22022.ej02;

public class StockResult {
    private StockProduct product;
    private boolean alert;
    private static final String MSG_LOW = "Low Stock!";
    private static final String MSG_OK = "Stock OK";

    public StockResult(StockProduct product, boolean alert) {
        this.product = product;
        this.alert = alert;
    }

    @Override
    public String toString() {
        return product.toString() + " <> " + ((alert) ? MSG_LOW : MSG_OK);
    }
}
