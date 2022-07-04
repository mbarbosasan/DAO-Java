package Application;

import Model.DAO.DAOFactory;
import Model.DAO.SellerDAO;
import Model.Entities.Department;
import Model.Entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SellerDAO sellerDao = DAOFactory.CreateSellerDAO();
        System.out.println("=== TEST 1: Seller find By Id ===");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);
    }
}
