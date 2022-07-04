package Application;

import Model.DAO.DAOFactory;
import Model.DAO.SellerDAO;
import Model.Entities.Department;
import Model.Entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SellerDAO sellerDao = DAOFactory.CreateSellerDAO();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
