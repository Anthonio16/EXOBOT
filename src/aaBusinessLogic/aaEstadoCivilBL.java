package aaBusinessLogic;

import aaDataAccess.aaDTO.aaEstadoCivilDTO;
import aaDataAccess.aaEstadoCivilDAO;
import java.util.List;


public class aaEstadoCivilBL {

    private aaEstadoCivilDTO estadoCivil;
    private aaEstadoCivilDAO ecDAO = new aaEstadoCivilDAO();
    public aaEstadoCivilBL() {}

    public List<aaEstadoCivilDTO> getAll() throws Exception {
        List<aaEstadoCivilDTO> lst = ecDAO.readAll();
        for (aaEstadoCivilDTO ec : lst) {
            ec.setNombre(ec.getNombre().toUpperCase());
        }
        return lst;
    }

    public aaEstadoCivilDTO getByIdEstadoCivil(int id) throws Exception {
        estadoCivil = ecDAO.readBy(id);
        return estadoCivil;
    }

    public boolean add(aaEstadoCivilDTO regDTO)  throws Exception {
        return ecDAO.create(regDTO);
    }

    public boolean update(aaEstadoCivilDTO regDTO)  throws Exception {
        return ecDAO.update(regDTO);
    }

    public boolean delete(int id)  throws Exception {
        return ecDAO.delete(id);
    }

    public Integer getRowCount() throws Exception {
        return ecDAO.getRowCount();
    }

}
