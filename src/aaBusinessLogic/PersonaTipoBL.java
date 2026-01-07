package aaBusinessLogic;

import aaDataAccess.aaDTO.aaPersonaTipoDTO;
import aaDataAccess.aaPersonaTipoDAO;
import java.util.List;


public class PersonaTipoBL {

    private aaPersonaTipoDTO personaTipo;
    private aaPersonaTipoDAO personaTipoDAO = new aaPersonaTipoDAO();
    
    public PersonaTipoBL() {}

    public List<aaPersonaTipoDTO> getAll() throws Exception {
        return personaTipoDAO.readAll();
    }

    public aaPersonaTipoDTO getByIdPersonaTipo(int id) throws Exception {
        personaTipo = personaTipoDAO.readBy(id);
        return personaTipo;
    }

    public boolean create(aaPersonaTipoDTO regDTO)  throws Exception {
        return personaTipoDAO.create(regDTO);
    }

    public boolean update(aaPersonaTipoDTO regDTO)  throws Exception {
        return personaTipoDAO.update(regDTO);
    }

    public boolean delete(int id)  throws Exception {
        return personaTipoDAO.delete(id);
    }

    public Integer getRowCount() throws Exception {
        return personaTipoDAO.getRowCount();
    }

}
