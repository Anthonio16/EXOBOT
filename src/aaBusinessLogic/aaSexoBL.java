package aaBusinessLogic;

import aaDataAccess.SexoDAO;
import aaDataAccess.aaDTO.SexoDTO2;
import java.util.List;

public class aaSexoBL {
    private SexoDTO2 sexo;
    private SexoDAO sDAO = new SexoDAO();
    
    public aaSexoBL() {}

    public List<SexoDTO2> getAll() throws Exception {
        List<SexoDTO2> lst = sDAO.readAll();
        for (SexoDTO2 s : lst) {
            s.setNombre(s.getNombre().toUpperCase());
        }
        return lst;
    }

    public SexoDTO2 getByIdSexo(int idSexo) throws Exception {
        sexo = sDAO.readBy(idSexo);
        return sexo;
    }

    public boolean add(SexoDTO2 sexoDTO)  throws Exception {
        return sDAO.create(sexoDTO);
    }

    public boolean update(SexoDTO2 sexoDTO)  throws Exception {
        return sDAO.update(sexoDTO);
    }

    public boolean delete(int idSexo)  throws Exception {
        return sDAO.delete(idSexo);
    }

    public Integer getRowCount() throws Exception {
        return sDAO.getRowCount();
    }

}
