package aaFramework;

public class aaException extends Exception {
    
    public aaException(String e, String clase, String metodo) {
        //grabar el log
        //System.out.println("[ERROR APP --> LOG] " + clase + "." + metodo + " : " + e);
    }

    @Override
    public String toString() {
        return " ¿¡Ha ocurrido un error en la aplicación!? ";
    }
}
