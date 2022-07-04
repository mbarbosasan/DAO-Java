package Application;

import Model.DAO.DAOFactory;
import Model.DAO.SellerDAO;
import Model.Entities.Department;
import Model.Entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDAO sellerDao = DAOFactory.CreateSellerDAO();
        System.out.println("=== TEST 1: Seller find By Id ===");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

        System.out.println("=== TEST 2: Seller find by Department");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller item: list) {
            System.out.println(item);
        }

        System.out.println("=== TEST 3: Seller find all");
        list = sellerDao.findAll();
        System.out.println(list);
        System.out.println("=== TEST 4: Insert seller");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! new id = " + newSeller.getId());
    }
}
