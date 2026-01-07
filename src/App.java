import aaBusinessLogic.aaEstadoCivilBL;
import aaBusinessLogic.aaSexoBL;
import aaDataAccess.aaDTO.SexoDTO2;
import aaDataAccess.aaDTO.aaEstadoCivilDTO;

public class App {
    public static void main(String[] args) throws Exception {

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
    try {
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


    } catch (Exception e) {
        System.out.println(e.toString());
        }
    
    }
    }