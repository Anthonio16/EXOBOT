//  © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code
package aaBusinessLogic;

import java.util.List;

import aaDataAccess.Interfaces.aaIDAO;
import aaInfrastructure.aaAppException;

public class FactoryBL<T>  {
    private final aaIDAO<T> oDAO;

    public FactoryBL(Class<? extends aaIDAO<T>> classDAO) {
        try {
            this.oDAO = classDAO.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            aaAppException er = new aaAppException("Error al instanciar classDAO<T>", e, getClass(), "FactoryBL(<T>)");
            throw new RuntimeException(er);
        }
    }

    // Constructor que usa un Supplier para crear la instancia de T
    // public FactoryBL(Supplier<IDAO<T>> supplier) {
    //     this.oDAO = supplier.get(); 
    // }
 
    public List<T> getAll() throws aaAppException {
         return oDAO.readAll();
    }

    public T getBy(Integer id) throws aaAppException {
        return oDAO.readBy(id);
    }

    public boolean add(T oT) throws aaAppException {
        return oDAO.create(oT);
    }

    public boolean upd(T oT) throws aaAppException {
        return oDAO.update(oT);
    }

    public boolean del(Integer id) throws aaAppException {
        return oDAO.delete(id);
    }

    public Integer getMaxReg(String cellName) throws aaAppException{
        return oDAO.getMaxReg(cellName);
    }

    public Integer getMinReg(String cellName) throws aaAppException{
        return oDAO.getMinReg(cellName);
    }

    public Integer getCountReg() throws Exception{
        return oDAO.getCountReg();
    }
}
