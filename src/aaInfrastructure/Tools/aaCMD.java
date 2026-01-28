package aaInfrastructure.Tools;


public abstract class aaCMD {

    private aaCMD() {}

    // Limpiar pantalla (funciona en terminales Unix/Linux/Mac, a veces en Windows)
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Imprimir normal (Cyan)
    public static void println(String msg){
        System.out.println(aaCMDColor.CYAN + "ℹ️ " + msg + aaCMDColor.RESET);
    } 

    // Imprimir Error (Rojo)
    public static void printlnError(String msg){
        System.out.println(aaCMDColor.RED + "❌ " + msg + aaCMDColor.RESET);
    } 

    // Imprimir Éxito (Verde) - ¡Agregué este extra para ti!
    public static void printlnSuccess(String msg){
        System.out.println(aaCMDColor.GREEN + "✅ " + msg + aaCMDColor.RESET);
    } 
}