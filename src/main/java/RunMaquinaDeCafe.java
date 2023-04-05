import java.util.Scanner;

public class RunMaquinaDeCafe {
    public static void main(String[] args) {
        int vaso;
        Cafetera cafetera;
        Vaso vasosPequeno;
        Vaso vasosMediano;
        Vaso vasosGrande;
        Azucarero azucarero;
        MaquinaDeCafe maquinaDeCafe;
        cafetera=new Cafetera(50);
        vasosPequeno= new Vaso(5,10);
        vasosMediano= new Vaso(5,20);
        vasosGrande= new Vaso(5,30);
        azucarero= new Azucarero(20);
        maquinaDeCafe= new MaquinaDeCafe();
        maquinaDeCafe.setCafe (cafetera);
        maquinaDeCafe.setVasosPequenos (vasosPequeno);
        maquinaDeCafe.setVasosMedianos(vasosMediano);
        maquinaDeCafe.setVasosGrandes(vasosGrande);
        maquinaDeCafe.setAzucar(azucarero);
        do{
            System.out.println("Bienvenido a la maquina de cafe Santo Domingo\n"+
                    "Seleccione el tipo de vaso:\n"+
                    "- Escriba 1 para vaso pequeño\n"+
                    "- Escriba 2 para vaso mediano\n"+
                    "- Escriba 3 para vaso grande\n"+
                    "- Escriba 0 para salir");
            Scanner scanner = new Scanner(System.in);
            vaso = scanner.nextInt();
            if (vaso>3) {
                System.out.println("El numero introducido no es valido");
                System.out.println(" ");
            }else if(vaso!=0){
                System.out.println("Seleccione la cantidad de vasos");
                int cantidadVasos = scanner.nextInt();
                System.out.println("Seleccione la cantidad de azucar");
                int cantidadAzucar = scanner.nextInt();
                Vaso vasoObj= new Vaso();
                if(vaso == 1){
                    vasoObj = maquinaDeCafe.getTipoDeVaso("pequeno");
                } else if (vaso == 2) {
                    vasoObj = maquinaDeCafe.getTipoDeVaso("mediano");
                }else if (vaso == 3) {
                    vasoObj = maquinaDeCafe.getTipoDeVaso("grande");
                }
                System.out.println(maquinaDeCafe.getVasoDeCafe(vasoObj,cantidadVasos,cantidadAzucar));
                System.out.println(" ");

            } else{
                System.out.println("Gracias por preferirnos");
            }

        }while (vaso!=0);

    }
}
