package Model.DAO;

import Model.DAO.impl.SellerDAOJDBC;

public class DAOFactory {
    public static SellerDAO CreateSellerDAO() {
        return new SellerDAOJDBC();
    }
}
