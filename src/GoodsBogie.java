//GoodsBogie.java
public class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}