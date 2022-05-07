import java.util.ArrayList;
import java.util.Scanner;
public class Accesorio {

    private String nombre;
    private int precio;

    public Accesorio(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public void setNombreAccesorio(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getNombreAccesorio() {
        return this.nombre;
    }
    public int getPrecio() {
        return this.precio;
    }
    public String toString(){
        String infoAccesorio = "Accesorio: "+this.getNombreAccesorio() +" | Precio: $"+this.getPrecio() + "\n";
        return infoAccesorio;
    }
    public static void personalizarPlanta(Accesorio[] prendas, Accesorio[] macetas, Accesorio[] fondos, ArrayList<Cuenta> cuentas, ArrayList<Accesorio> accesoriosComprados) {

        Scanner scan = new Scanner(System.in);

        System.out.println("-----Bienvenidx a la tienda de accesorios de EcoPlay, con tus Soles puedes comprar accesorios.-----");
        System.out.println("Los accesorios se clasifican en prendas para que vistas a tu planta, macetas para la tierra de tu planta y fondos de la pared en la que está tu planta.");
        System.out.println("---Pulsa 0 para continuar a la tienda---");
        System.out.println("---Pulsa 1 para volver al menú principal---");
        int opcion = scan.nextInt();
        if(opcion == 0){ //continuar a la tienda
            Accesorio.visualizarTienda();
            int opcion2 = scan.nextInt();
            if(opcion2 == 1){ //escoge VER PRENDAS
                for(int i = 0; i < prendas.length ; i++) {
                    System.out.println(prendas[i].toString());

                }
                Cuenta.visualizarCantidadSoles();
                System.out.println("\n Pulsa: \n");
                System.out.println("1 | COMPRAR UN ACCESORIO");
                System.out.println("2 | REGRESAR");
                int opcion3 = scan.nextInt();
                if(opcion3 == 1) { //comprar un accesorio prendas
                    Accesorio.comprarAccesorioPrendas(prendas, cuentas, accesoriosComprados);
                }
                else if(opcion3 == 2) { //regresa
                    Accesorio.visualizarTienda();
                    int opcion4 = scan.nextInt();

                }
            }else if(opcion2 == 2) { //escoger VER MACETAS
                for(int i = 0; i < macetas.length ; i++) {
                    System.out.println(macetas[i].toString());
                }
                Cuenta.visualizarCantidadSoles();
                System.out.println("\n Pulsa: \n");
                System.out.println("1 | COMPRAR UN ACCESORIO");
                System.out.println("2 | REGRESAR");
                int opcion3 = scan.nextInt();
                if(opcion3 == 1) { //compra un accesorio maceta
                    Accesorio.comprarAccesorioMacetas(macetas, cuentas, accesoriosComprados); //check
                }
                else if(opcion3 == 2) { //regresa
                    Accesorio.visualizarTienda();
                    int opcion4 = scan.nextInt();

                }
            }else if(opcion2 == 3) { //escoge VER FONDOS
                for(int i = 0; i < fondos.length ; i++) {
                    System.out.println(fondos[i].toString());
                }Cuenta.visualizarCantidadSoles();
                System.out.println("\n Pulsa: \n");
                System.out.println("1 | COMPRAR UN ACCESORIO");
                System.out.println("2 | REGRESAR");
                int opcion3 = scan.nextInt();
                if(opcion3 == 1) { //compra un accesorio maceta
                    Accesorio.comprarAccesorioFondos(fondos, cuentas, accesoriosComprados); //check
                }
                else if(opcion3 == 2) { //regresa
                    Accesorio.personalizarPlanta(prendas, macetas, fondos, cuentas, accesoriosComprados);

                }
            }else if(opcion2 == 4) {
                Accesorio.personalizarPlanta(prendas, macetas, fondos, cuentas, accesoriosComprados);
            }

        }
    }
    public static void visualizarTienda() {
        System.out.println("------Bienvenido a la Tienda de Accesorios----\n");
        System.out.println("Pulsa para ver: \n");
        System.out.println("1 | PRENDAS");
        System.out.println("2 | MACETAS");
        System.out.println("3 | FONDOS");
        System.out.println("4 | REGRESAR");
    }
    public static void comprarAccesorioPrendas(Accesorio[] prendas, ArrayList<Cuenta> cuentas, ArrayList<Accesorio> accesoriosComprados) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Qué Accesorio deseas comprar? \n");
        for(int i = 0; i < prendas.length; i++) {
            System.out.println(i +" | " + prendas[i].toString());
        }
        System.out.println("10 | REGRESAR");
        int entrada = scan.nextInt();
        switch(entrada) {
            case 0:
                Accesorio.comprobarPagoPrendas(prendas, cuentas, accesoriosComprados, 0);
            case 1:
                Accesorio.comprobarPagoPrendas(prendas, cuentas, accesoriosComprados, 1);
                break;
            case 2:
                Accesorio.comprobarPagoPrendas(prendas, cuentas, accesoriosComprados,2);
                break;
            case 3:
                Accesorio.comprobarPagoPrendas(prendas, cuentas, accesoriosComprados,3);
                break;
            case 4:
                Accesorio.comprobarPagoPrendas(prendas, cuentas, accesoriosComprados,4);
                break;
            case 5:
                Accesorio.comprobarPagoPrendas(prendas, cuentas, accesoriosComprados,5);
                break;
            case 6:
                Accesorio.comprobarPagoPrendas(prendas, cuentas, accesoriosComprados,6);
                break;
            case 7:
                Accesorio.comprobarPagoPrendas(prendas, cuentas, accesoriosComprados,7);
                break;
            case 8:
                Accesorio.comprobarPagoPrendas(prendas, cuentas, accesoriosComprados,8);
                break;
            case 9:
                Accesorio.comprobarPagoPrendas(prendas, cuentas, accesoriosComprados,9);
                break;
            case 10:
                Accesorio.visualizarTienda();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    public static void comprobarPagoPrendas(Accesorio[] prendas, ArrayList<Cuenta> cuentas, ArrayList<Accesorio> accesoriosComprados, int num) {
        Scanner scan = new Scanner(System.in);
        if(cuentas.get(0).getCantidadSoles() >= prendas[num].getPrecio()){
            cuentas.get(0).setCantidadSoles(cuentas.get(0).getCantidadSoles() - prendas[num].getPrecio());
            System.out.println("¡Has comprado --> " + prendas[num].getNombreAccesorio());
            accesoriosComprados.add(prendas[num]);
            System.out.println("1 | COMPRAR OTRO ACCESORIO");
            System.out.println("2 | VOLVER A LA TIENDA");
            int entrada2 = scan.nextInt();
            if(entrada2 == 1){
                Accesorio.comprarAccesorioPrendas(prendas, cuentas, accesoriosComprados);
            }
            else if(entrada2 == 2) {
                Accesorio.visualizarTienda();
                int opcion4 = scan.nextInt();
            }
        }else {
            System.out.println("No cuentas con Soles suficientes.");
        }

    }
    public static void comprarAccesorioMacetas(Accesorio[] macetas, ArrayList<Cuenta> cuentas, ArrayList<Accesorio> accesoriosComprados) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Qué Accesorio deseas comprar? \n");
        for(int i= 0; i < macetas.length; i++) {
            System.out.println(i + " | " + macetas[i].toString());

        }
        System.out.println("5 | REGRESAR");
        int entrada = scan.nextInt();
        switch(entrada) {
            case 0:
                Accesorio.comprobarPagoMacetas(macetas, cuentas, accesoriosComprados, 0);
            case 1:
                Accesorio.comprobarPagoMacetas(macetas, cuentas, accesoriosComprados, 1);
                break;
            case 2:
                Accesorio.comprobarPagoMacetas(macetas, cuentas, accesoriosComprados,2);
                break;
            case 3:
                Accesorio.comprobarPagoMacetas(macetas, cuentas, accesoriosComprados,3);
                break;
            case 4:
                Accesorio.comprobarPagoMacetas(macetas, cuentas, accesoriosComprados,4);
                break;
            case 5:
                Accesorio.visualizarTienda();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    public static void comprobarPagoMacetas(Accesorio[] macetas, ArrayList<Cuenta> cuentas, ArrayList<Accesorio> accesoriosComprados, int num) {
        Scanner scan = new Scanner(System.in);
        if(cuentas.get(0).getCantidadSoles() >= macetas[num].getPrecio()){
            cuentas.get(0).setCantidadSoles(cuentas.get(0).getCantidadSoles() - macetas[num].getPrecio());
            System.out.println("¡Has comprado --> " + macetas[num].getNombreAccesorio());
            accesoriosComprados.add(macetas[num]);
            System.out.println("1 | COMPRAR OTRO ACCESORIO");
            System.out.println("2 | VOLVER A LA TIENDA");
            int entrada2 = scan.nextInt();
            if(entrada2 == 1){
                Accesorio.comprarAccesorioMacetas(macetas, cuentas, accesoriosComprados);
            }
            else if(entrada2 == 2) {
                Accesorio.visualizarTienda();
                int opcion4 = scan.nextInt();
            }
        }else {
            System.out.println("No cuentas con Soles suficientes.");
        }
    }public static void comprarAccesorioFondos(Accesorio[] fondos, ArrayList<Cuenta> cuentas, ArrayList<Accesorio> accesoriosComprados) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Qué Accesorio deseas comprar? \n");
        for(int i = 0; i < fondos.length; i++) {
            System.out.println(i +" | " + fondos[i].toString());
        }
        System.out.println("5 | REGRESAR");
        int entrada = scan.nextInt();
        switch(entrada) {
            case 0:
                Accesorio.comprobarPagoFondos(fondos, cuentas, accesoriosComprados, 0);
            case 1:
                Accesorio.comprobarPagoFondos(fondos, cuentas, accesoriosComprados, 1);
                break;
            case 2:
                Accesorio.comprobarPagoFondos(fondos, cuentas, accesoriosComprados,2);
                break;
            case 3:
                Accesorio.comprobarPagoFondos(fondos, cuentas, accesoriosComprados,3);
                break;
            case 4:
                Accesorio.comprobarPagoFondos(fondos, cuentas, accesoriosComprados,4);
                break;
            case 5:
                Accesorio.visualizarTienda();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    public static void comprobarPagoFondos(Accesorio[] fondos, ArrayList<Cuenta> cuentas, ArrayList<Accesorio> accesoriosComprados, int num) {
        Scanner scan = new Scanner(System.in);
        if(cuentas.get(0).getCantidadSoles() >= fondos[num].getPrecio()){
            cuentas.get(0).setCantidadSoles(cuentas.get(0).getCantidadSoles() - fondos[num].getPrecio());
            System.out.println("¡Has comprado --> " + fondos[num].getNombreAccesorio());
            accesoriosComprados.add(fondos[num]);
            System.out.println("1 | COMPRAR OTRO ACCESORIO");
            System.out.println("2 | VOLVER A LA TIENDA");
            int entrada2 = scan.nextInt();
            if(entrada2 == 1){
                Accesorio.comprarAccesorioFondos(fondos, cuentas, accesoriosComprados);
            }
            else if(entrada2 == 2) {
                Accesorio.visualizarTienda();
                int opcion4 = scan.nextInt();
            }
        }else {
            System.out.println("No cuentas con Soles suficientes.");
        }

    }
    public static void visualizarAccesoriosComprados(ArrayList<Accesorio> accesoriosComprados) {
        System.out.println("----Accesorios Comprados:-----");
        System.out.println(accesoriosComprados.toString());
    }
}
