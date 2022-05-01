import java.util.ArrayList;
import java.util.Scanner;
public class Cuenta {
	
	private String nombreCuenta;
	private String correoElectronico;
	private String contraseña;
	public int nivelJugador;
	public int cantidadExp;
	public int cantidadSoles;
	
	public Cuenta(String nombreCuenta, String correoElectronico, String contraseña, int nivelJugador, int cantidadExp, int cantidadSoles) {
		this.nombreCuenta = nombreCuenta;
		this.correoElectronico = correoElectronico;
		this.contraseña = contraseña;
		this.nivelJugador = nivelJugador;
		this.cantidadExp = cantidadExp;
		this.cantidadSoles = cantidadSoles;
	}
	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public void setContraseña(String contraseña){
		this.contraseña = contraseña;
	}
	public void setNivelJugador(int nivelJugador){
		this.nivelJugador = nivelJugador;
	}
	public void setCantidadExp(int cantidadExp){
		this.cantidadExp = cantidadExp;
	}
	public void setCantidadSoles(int cantidadSoles){
		this.cantidadSoles = cantidadSoles;
	}
	public String getNombreCuenta(){
		return this.nombreCuenta;
	}
	public String getCorreoElectronico(){
		return this.correoElectronico;
	}
	public String getContraseña(){
		return this.contraseña;		
	}
	public int getNivelJugador(){
		return this.nivelJugador;
	}
	public int getCantidadExp(){
		return this.cantidadExp;
	}
	public int getCantidadSoles(){
		return this.cantidadSoles;
	}
	public String toString(){
        String infoCuenta= "Usuario: "+this.getNombreCuenta()+" | Correo Electrónico: "+this.getCorreoElectronico()+" | Contraseña: "+ this.getContraseña()+
        		" | Nivel: " +this.getNivelJugador() + " | Cantidad EXP: "+ this.getCantidadExp()+ " | Cantidad Soles: "+this.getCantidadSoles()+ "\n";
        return infoCuenta;
    }
	public static void crearNuevaCuenta() {
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		if(opcion == 0) {
			System.out.println("Usted ha seleccionado 'CREAR CUENTA'");
			System.out.println("Ingrese el nombre de usuario");
			String usuario = scan.next();
			System.out.println("Ingrese un correo electrónico");
			String usuario2 = scan.next();
			System.out.println("Ingrese una contraseña");
			String usuario3 = scan.next();
			int nivelPorDefecto = 0;
			int cantidadExpPorDefecto = 10;
			int cantidadSolesPorDefecto = 25;
			Cuenta cuenta1 = new Cuenta(usuario, usuario2, usuario3, nivelPorDefecto, cantidadExpPorDefecto, cantidadSolesPorDefecto);
			Principal.cuentas.add(cuenta1);
			System.out.println(""
					+ "¡Cuenta creada con éxito!");
			System.out.println("");
			System.out.println("Tu cuenta es:");
			System.out.println(Principal.cuentas.get(0).toString());
		}else if(opcion == 1) {
			System.out.println("¡Vuelve Pronto!");
				System.exit(1);
			}
						
	}
	public static void visualizarInstrucciones() {
		System.out.println("---------------------------------------------Instrucciones------------------------------------------------");
		System.out.println("-Al crear tu planta, se le asignaron valores por defecto, puedes volver al menú principal y comprobarlo revisando la información de la planta.");
		System.out.println("-El programa cuenta con un sistema de nivel del jugador el cual aumenta dependiendo de la cantidad de EXP que el jugador haya conseguido.");
		System.out.println("-'¿EXP?' --> Es la 'Experiencia' que gana el jugador al completar una actividad dentro de los cuidados de la planta.");
		System.out.println("-Tu planta cuenta con 3 necesidades: Agua, Exposición al Sol y Desparasitación");
		System.out.println("-Si tu planta está deshidratada, debes regarla. --> (esto hará que algunas plagas acuáticas se peguen a tu planta)");
		System.out.println("-Si tu planta tiene poca cantidad de sol, entonces debes exponerla al sol --> (esto hará que pierda parte del agua que conserva)");
		System.out.println("-Si tu planta tiene muchas plagas, debes desparasitarla ---> (esto hará que tu planta disminuya la cantidad de sol porque la quitaste del patío para desparasitarla)");
		System.out.println("-Al completar actividades de tu planta se te recompensará con Soles, un sistema monetario con el que puedes comprar accesorios para tu planta. ");
		System.out.println("-Puedes comprar accesorios con Soles en 'Personalizar Planta'");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
	}
	public static void visualizarCuenta() {
		System.out.println("--------Tu Cuenta---------");
		System.out.println(Principal.cuentas.get(0).toString());
	}
	public static void visualizarNivel() {
		System.out.println("-----------Nivel------------");
		System.out.println(Principal.cuentas.get(0).getNivelJugador());
	}
	public static void visualizarCantidadEXP() {
		System.out.println("----------Cantidad de EXP------------");
		System.out.println(Principal.cuentas.get(0).getCantidadExp());
	}
	public static void visualizarCantidadSoles() {
		System.out.println("----------$$ Cantidad de Soles $$------------");
		System.out.println("$"+Principal.cuentas.get(0).getCantidadSoles());
		
	}
	

	
	
	}
