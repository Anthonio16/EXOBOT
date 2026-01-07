import aaUserinterface.aaForms.aaMainForm;
import aaUserinterface.aaForms.aaSplashScreenForm;

public class App {
    public static void main(String[] args) throws Exception {


        aaSplashScreenForm.show();
        aaMainForm fromMain = new aaMainForm("IABOT - Sistema de Gestión");

    // testing: DAO
    /*try {
        SexoDAO sDAO = new SexoDAO();
        for (SexoDTO2 s : sDAO.readAll()) {
            System.out.println(s.toString());
        }

        System.out.println("---------------------");

        aaEstadoCivilDAO ecDAO = new aaEstadoCivilDAO();
        for (aaEstadoCivilDTO reg : ecDAO.readAll()) {
            System.out.println(reg.toString());
        }

        System.out.println("---------------------");

        aaPersonaTipoDAO pDAO = new aaPersonaTipoDAO();
        for (aaPersonaTipoDTO reg : pDAO.readAll()) {
            System.out.println(reg.toString());
        }
    } catch (Exception e) {
        System.out.println(e.toString());
    }*/

 // testing: BL
       /* try {

         int a[] = {10, 0}, b = 10;

            try {
                int resultadoA = a[1] / b;
                int resultadoB = b / a[0];
                new Exception("Te quiero fregar la vida"); // Nota: Esto instancia la excepción pero no la lanza (falta el 'throw')
            } 
            catch (ArithmeticException e) {
                System.out.println("El denominado no deber cero"); // + e.getMessage());
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Esta fuera de rango"); // + e.getMessage());
            } 
            catch (Exception e) {
                System.out.println("Ups... lo siento ocurrio un error" + e.getMessage());
            } 
            finally {
            b = 10;
            //System.out.println("finally : Ejecucion con o sin error");
            }   

        aaSexoBL sBL = new aaSexoBL();
        //sBL.add(new SexoDTO2(0, 0, "nuevo sexo", "prueba", null, null, null));
        for (SexoDTO2 s : sBL.getAll()) {
            System.out.println(s.toString());
        }
    
        System.out.println("---------------------");

        aaEstadoCivilBL ecBL = new aaEstadoCivilBL();
        for (aaEstadoCivilDTO reg : ecBL.getAll()) {
            System.out.println(reg.toString());
        }

        System.out.println("---------------------");

        aaPersonaTipoBL pBL = new aaPersonaTipoBL();
        for (aaPersonaTipoDTO reg : pBL.getAll()) {
            System.out.println(reg.toString());
        }

    } catch (Exception e) {
        System.out.println(e.toString());
        }
    
    }*/
    }
}       