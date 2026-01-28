package aaInfrastructure.Tools;


import java.util.Scanner;

public class aaCMDInput {
    
    private static Scanner sc = new Scanner(System.in);

    public static String readString(String msg) {
        System.out.print(aaCMDColor.YELLOW + " ➤ " + msg + ": " + aaCMDColor.RESET);
        return sc.nextLine();
    }

    public static int readNumber(String msg) {
        int numero = 0;
        boolean entradaValida = false;
        
        do {
            System.out.print(aaCMDColor.YELLOW + " ➤ " + msg + ": " + aaCMDColor.RESET);
            try {
                String input = sc.nextLine();
                numero = Integer.parseInt(input);
                entradaValida = true;
            } catch (NumberFormatException e) {
                aaCMD.printlnError("¡Error! Debes ingresar un número válido.");
            }
        } while (!entradaValida);
        
        return numero;
    }

    public static boolean readBoolean(String msg) {
        System.out.print(aaCMDColor.YELLOW + " ➤ " + msg + " (S/N): " + aaCMDColor.RESET);
        String input = sc.nextLine().trim().toLowerCase();
        return input.equals("s") || input.equals("si") || input.equals("y");
    }
}