public class MaquinaDeCafe {
    private Cafetera cafe;
    private Vaso vasosPequenos;
    private Vaso vasosMedianos;
    private Vaso vasosGrandes;

    private Azucarero azucar;

    public Cafetera getCafe() {
        return cafe;
    }

    public void setCafe(Cafetera cafe) {
        this.cafe = cafe;
    }

    public Vaso getVasosPequenos() {
        return vasosPequenos;
    }

    public void setVasosPequenos(Vaso vasosPequenos) {
        this.vasosPequenos = vasosPequenos;
    }

    public Vaso getVasosMedianos() {
        return vasosMedianos;
    }

    public void setVasosMedianos(Vaso vasosMedianos) {
        this.vasosMedianos = vasosMedianos;
    }

    public Vaso getVasosGrandes() {
        return vasosGrandes;
    }

    public void setVasosGrandes(Vaso vasosGrandes) {
        this.vasosGrandes = vasosGrandes;
    }

    public Azucarero getAzucar() {
        return azucar;
    }

    public void setAzucar(Azucarero azucar) {
        this.azucar = azucar;
    }

    public Vaso getTipoDeVaso(String tipoDeVaso){
        if(tipoDeVaso.equalsIgnoreCase("pequeño")){
            return this.vasosPequenos;
        }else if(tipoDeVaso.equalsIgnoreCase("mediano")){
            return this.vasosMedianos;
        } else if (tipoDeVaso.equalsIgnoreCase("grande")) {
            return this.vasosGrandes;
        }else{
            return vasosPequenos;
        }
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadDeVasos, int cantidadDeAzucar){
        if(vaso.getCantidadVasos()<cantidadDeVasos){
            return "No hay Vasos";
        }else if(vaso.getContenido()> this.cafe.getCantidadCafe()){
            return "No hay Cafe";
        } else if (azucar.getCantidadDeAzucar()<cantidadDeAzucar) {
            return "No hay Azucar";
        }else {
            vaso.giveVasos(cantidadDeVasos);
            azucar.giveAzucar(cantidadDeAzucar);
            this.cafe.giveCafe(vaso.getContenido());
            return "Felicitaciones";
        }
    }
}
