public class Vaso {

    private int cantidadVasos;
    private int contenido;

    public Vaso() {
    }

    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public void setCantidadVasos(int cantidadVasos) {
        this.cantidadVasos = cantidadVasos;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public boolean hasVasos(int cantidadVasos){
        if(this.cantidadVasos>cantidadVasos){
            return true;
        }else {
            return false;
        }
    }

    public void giveVasos(int cantidadVasos){
        this.cantidadVasos-=cantidadVasos;
    }
}
