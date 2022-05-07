import java.util.ArrayList;
import java.util.Scanner;
public class Planta{

    private String nombre;
    private int cantidadAgua;
    private int cantidadSol;
    private int cantidadPlagas;


    public Planta(String nombre, int cantidadAgua, int cantidadSol, int cantidadPlagas){
        this.nombre = nombre;
        this.cantidadAgua = cantidadAgua;
        this.cantidadSol = cantidadSol;
        this.cantidadPlagas = cantidadPlagas;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCantidadAgua(int cantidadAgua){
        this.cantidadAgua = cantidadAgua;
    }
    public void setCantidadSol(int cantidadSol){
        this.cantidadSol = cantidadSol;
    }
    public void setCantidadPlagas(int cantidadPlagas){
        this.cantidadPlagas = cantidadPlagas;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getCantidadAgua() {
        return this.cantidadAgua;
    }
    public int getCantidadSol(){
        return this.cantidadSol;
    }
    public int getCantidadPlagas(){
        return this.cantidadPlagas;
    }
    public String toString(){
        String infoPlanta= "Planta: " + this.getNombre()+" | Cantidad de Agua: "+ this.getCantidadAgua()+
                " | Cantidad de Sol: " +this.getCantidadSol() + " | Cantidad de Plagas: "+ this.getCantidadPlagas()+ "\r\n"+
                "      .--.\r\n"
                + "    .'_\\/_'.\r\n"
                + "    '. /\\ .'\r\n"
                + "      \"||\"\r\n"
                + "       || /\\\r\n"
                + "    /\\ ||//\\)\r\n"
                + "   (/\\\\||/\r\n"
                + "______\\||/_______" + "\n";
        return infoPlanta;
    }
    public static void adoptarPlanta(Planta planta1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un nombre para tu planta:");
        String nombre1 = scan.next();
        int cantidadAguaPorDefecto = 2;
        int cantidadSolPorDefecto = 6;
        int cantidadPlagasPorDefecto = 10;
        planta1.setNombre(nombre1);
        planta1.setCantidadAgua(cantidadAguaPorDefecto);
        planta1.setCantidadSol(cantidadSolPorDefecto);
        planta1.setCantidadPlagas(cantidadPlagasPorDefecto);
        System.out.println("-------------------¡Has adoptado una planta!------------------");
        System.out.println("");
        System.out.println("Esta es la información sobre tu planta:");
        System.out.println(planta1.toString());


    }
    public static void regarPlanta(Planta planta1) {
        planta1.setCantidadAgua(planta1.getCantidadAgua() + 4);
        planta1.setCantidadPlagas(planta1.getCantidadPlagas() + 2);
        Principal.cuentas.get(0).setCantidadExp(Principal.cuentas.get(0).getCantidadExp() + 10);
        Principal.cuentas.get(0).setCantidadSoles(Principal.cuentas.get(0).getCantidadSoles() + 50);
        System.out.println("'Ohh, agua fresca °(^ o ^)° ...esta agua no es completamente limpia... (>.<) algunas plagas podrían haberse pegado a mí...'");
        System.out.println("° ~ EXP 10+ ~ °");
        System.out.println("° ~ Soles $50+ ~ °");
    }
    public static void exponerAlSol(Planta planta1) {
        planta1.setCantidadSol(planta1.getCantidadSol() + 3);
        planta1.setCantidadAgua(planta1.getCantidadAgua() - 2);
        Principal.cuentas.get(0).setCantidadExp(Principal.cuentas.get(0).getCantidadExp() + 10);
        Principal.cuentas.get(0).setCantidadSoles(Principal.cuentas.get(0).getCantidadSoles() + 50);
        System.out.println("'¡Amo el soool! °(^ o ^)° ...aunque me produce algo de sed (>~<)'");
        System.out.println("° ~ EXP 10+ ~ °");
        System.out.println("° ~ Soles $50+ ~ °");
    }
    public static void desparasitarPlanta(Planta planta1) {
        planta1.setCantidadPlagas(planta1.getCantidadPlagas() - 3);
        planta1.setCantidadSol(planta1.getCantidadSol() - 2);
        Principal.cuentas.get(0).setCantidadExp(Principal.cuentas.get(0).getCantidadExp() + 10);
        Principal.cuentas.get(0).setCantidadSoles(Principal.cuentas.get(0).getCantidadSoles() + 50);
        System.out.println("'Esas plagas son muy malas...°(^ o ^)° ...¿Por qué me tienes que mover del sol para desparasitarme? (>~<) Quiero soool'");
        System.out.println("° ~ EXP 10+ ~ °");
        System.out.println("° ~ Soles $50+ ~ °");
    }
}
