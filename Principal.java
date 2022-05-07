import java.util.Scanner;
import java.util.ArrayList;

public class Principal{

    public static ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
    public static ArrayList<Accesorio> accesoriosComprados = new ArrayList<Accesorio>();
    public static Accesorio[] prendas = new Accesorio[10];
    public static Accesorio[] macetas = new Accesorio[5];
    public static Accesorio[] fondos = new Accesorio[5];

    public static void main(String[] args) {

        Planta planta1 = new Planta("nombre", 0, 0, 0);

        prendas[0] = new Accesorio("Sombrero Verde", 75);
        prendas[1] = new Accesorio("Sombrero Blanco", 100);
        prendas[2] = new Accesorio("Collar Brillante", 200);
        prendas[3] = new Accesorio("Collar de Esmeraldas", 175);
        prendas[4] = new Accesorio("Gafas de Corazón", 215);
        prendas[5] = new Accesorio("Gafas de Sol Negras", 130);
        prendas[6] = new Accesorio("Gafas de Sol Moradas", 150);
        prendas[7] = new Accesorio("Bufanda Rayada", 190);
        prendas[8] = new Accesorio("Bufanda Rosada", 230);
        prendas[9] = new Accesorio("Gorra Anaranjada", 110);

        macetas[0] = new Accesorio("Maceta Verde", 50);
        macetas[1] = new Accesorio("Maceta Azúl", 175);
        macetas[2] = new Accesorio("Maceta Rosada", 100);
        macetas[3] = new Accesorio("Maceta Amarilla", 120);
        macetas[4] = new Accesorio("Maceta Roja", 130);

        fondos[0] = new Accesorio("Fondo Blanco", 80);
        fondos[1] = new Accesorio("Fondo Verde", 50);
        fondos[2] = new Accesorio("Fondo Azúl", 120);
        fondos[3] = new Accesorio("Fondo Amarillo", 100);
        fondos[4] = new Accesorio("Fondo Café", 100);


        Scanner scan = new Scanner(System.in);

        System.out.println("------------------------------------ECOPLAY---------------------------------------");
        System.out.println("Bienvenido a EcoPlay,"
                + " para ingresar al juego, debe registrarse creando una cuenta.");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Seleccione una opción:");
        System.out.println("0 | CREAR NUEVA CUENTA");
        System.out.println("1 | SALIR");
        System.out.println("        ,,,                      ,,,\r\n"
                + "       {{{}}    ,,,             {{{}}    ,,,\r\n"
                + "    ,,, ~Y~    {{{}},,,      ,,, ~Y~    {{{}},,,\r\n"
                + "   {{}}} |/,,,  ~Y~{{}}}    {{}}} |/,,,  ~Y~{{}}}\r\n"
                + "    ~Y~ \\|{{}}}/\\|/ ~Y~  ,,, ~Y~ \\|{{}}}/\\|/ ~Y~  ,,,\r\n"
                + "    \\|/ \\|/~Y~  \\|,,,|/ {{}}}\\|/ \\|/~Y~  \\|,,,|/ {{}}}\r\n"
                + "    \\|/ \\|/\\|/  \\{{{}}/  ~Y~ \\|/ \\|/\\|/  \\{{{}}/  ~Y~\r\n"
                + "    \\|/\\\\|/\\|/ \\\\|~Y~//  \\|/ \\|/\\\\|/\\|/ \\\\|~Y~//  \\|/\r\n"
                + "    \\|//\\|/\\|/,\\\\|/|/|// \\|/ \\|//\\|/\\|/,\\\\|/|/|// \\|/\r\n"
                + "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Cuenta.crearNuevaCuenta();
        System.out.println("¡Bienvenidx, "+ cuentas.get(0).getNombreCuenta() + "!");
        System.out.println("                    _\r\n"
                + "                  _(_)_                          wWWWw   _\r\n"
                + "      @@@@       (_)@(_)   vVVVv     _     @@@@  (___) _(_)_\r\n"
                + "     @@()@@ wWWWw  (_)\\    (___)   _(_)_  @@()@@   Y  (_)@(_)\r\n"
                + "      @@@@  (___)     `|/    Y    (_)@(_)  @@@@   \\|/   (_)\\\r\n"
                + "       /      Y       \\|    \\|/    /(_)    \\|      |/      |\r\n"
                + "    \\ |     \\ |/       | / \\ | /  \\|/       |/    \\|      \\|/\r\n"
                + "   \\\\|//   \\\\|///  \\\\\\|//\\\\\\|/// \\|///  \\\\\\|//  \\\\|//  \\\\\\|// \r\n"
                + "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Ahora, vamos a adoptar una planta :)");
        Planta.adoptarPlanta(planta1);
        System.out.println("¡Perfecto! Ahora podrás empezar a jugar y cuidar de tu planta");
        System.out.println(" _,-._\r\n"
                + "/ \\_/ \\\r\n"
                + ">-(_)-<    \r\n"
                + "\\_/ \\_/\r\n"
                + "  `-'");
        System.out.println("°---Ahora vas a encontrar el menú principal, te recomendamos que primero sigas el comando que especifica las instrucciones del juego.---°");
        System.out.println("Presiona cualquier número del teclado para continuar. ");
        int teclado = scan.nextInt();
        Principal.mostrarMenu(planta1, prendas, macetas, fondos, cuentas, accesoriosComprados);


    }
    public static void mostrarMenu(Planta planta1, Accesorio [] prendas, Accesorio [] macetas, Accesorio [] fondos, ArrayList<Cuenta> cuentas, ArrayList<Accesorio> accesoriosComprados) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("\n|--------------------------------------------------------- ---------------------|");
            System.out.println("|------------------------------MENÚ PRINCIPAL-----------------------------------|");
            System.out.println("|" + planta1.toString() +"|");
            System.out.println("|-------------------------------------------------------------------------------|");
            System.out.println("|                        ~~Selecciona lo que quieres hacer~~                    |");
            System.out.println("| 0. Cerrar el Programa.                                                        |");
            System.out.println("| 1. Instrucciones de Juego.                                                    |");
            System.out.println("| 2. Visualizar información de la cuenta.                                       |");
            System.out.println("| 3. Visualizar Nivel de Jugador.                                               |");
            System.out.println("| 4. Visualizar Cantidad de EXP.                                                |");
            System.out.println("| 5. Visualizar Cantidad de Soles $$$.                                          |");
            System.out.println("| 6. Regar Planta.                                                              |");
            System.out.println("| 7. Exponer al Sol a la Planta.                                                |");
            System.out.println("| 8. Desparasitar a la Planta.                                                  |");
            System.out.println("| 9. Personalizar la Planta.                                                    |");
            System.out.println("| 10. Visualizar Accesorios Comprados.                                          |");
            int opcion = scan.nextInt();
            System.out.println("|-------------------------------------------------------------------------------|\n\n\n");

            if(opcion == 0){
                System.out.println("El programa se ha cerrado correctamente.");
                System.out.println("¡Vuelve Pronto!");
                System.out.println("              __/)\r\n"
                        + "           .-(__(=:\r\n"
                        + "        |\\ |    \\)\r\n"
                        + "        \\ ||\r\n"
                        + "         \\||\r\n"
                        + "          \\|\r\n"
                        + "           |");
                break;

            }
            switch(opcion){
                case 1:
                    Cuenta.visualizarInstrucciones();
                    System.out.println("Pulsa cualquier número del teclado para volver al menú principal.");
                    int continuar = scan.nextInt();
                    break;
                case 2:
                    Cuenta.visualizarCuenta();
                    System.out.println("Pulsa cualquier número del teclado para volver al menú principal.");
                    int continuar2 = scan.nextInt();
                    break;
                case 3:
                    Cuenta.visualizarNivel();
                    System.out.println("Pulsa cualquier número del teclado para volver al menú principal.");
                    int continuar3 = scan.nextInt();
                    break;
                case 4:
                    Cuenta.visualizarCantidadEXP();
                    System.out.println("Pulsa cualquier número del teclado para volver al menú principal.");
                    int continuar4 = scan.nextInt();
                    break;
                case 5:
                    Cuenta.visualizarCantidadSoles();
                    System.out.println("Pulsa cualquier número del teclado para volver al menú principal.");
                    int continuar5 = scan.nextInt();
                    break;
                case 6:
                    Planta.regarPlanta(planta1);
                    System.out.println("Pulsa cualquier número del teclado para volver al menú principal.");
                    int continuar6 = scan.nextInt();
                    break;
                case 7:
                    Planta.exponerAlSol(planta1);
                    System.out.println("Pulsa cualquier número del teclado para volver al menú principal.");
                    int continuar8 = scan.nextInt();
                    break;
                case 8:
                    Planta.desparasitarPlanta(planta1);
                    System.out.println("Pulsa cualquier número del teclado para volver al menú principal.");
                    int continuar9 = scan.nextInt();
                    break;
                case 9:
                    Accesorio.personalizarPlanta(prendas, macetas, fondos, cuentas, accesoriosComprados);
                    System.out.println("Pulsa cualquier número del teclado para volver al menú principal.");
                    int continuar10 = scan.nextInt();
                    break;
                case 10:
                    Accesorio.visualizarAccesoriosComprados(accesoriosComprados);
                    System.out.println("Pulsa cualquier número del teclado para volver al menú principal.");
                    int continuar11 = scan.nextInt();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    System.out.println("Pulsa cualquier número del teclado para volver al menú principal.");
                    int continuar12 = scan.nextInt();

            }
        }

    }
}
 
