public class Cafetera {
    private int cantidadCafe;

    public Cafetera() {
    }

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public boolean hasCafe(int cantidadCafe){
        if(this.cantidadCafe>cantidadCafe){
            return true;
        }else{
            return false;
        }
    }
    public void giveCafe(int cantidadCafe){
        this.cantidadCafe-=cantidadCafe;
    }
}
