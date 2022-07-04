package Model.DAO;

import Model.DAO.impl.SellerDAOJDBC;
import db.DB;

public class DAOFactory {
    public static SellerDAO CreateSellerDAO() {
        return new SellerDAOJDBC(DB.getConnection());
    }
}
