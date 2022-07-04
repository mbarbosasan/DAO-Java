package Application;

import Model.DAO.DAOFactory;
import Model.DAO.SellerDAO;
import Model.Entities.Department;
import Model.Entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

//        Seller seller2 = new Seller(1, "Moises", "moisesbarbosa23@gmail.com", new Date(), 4000.0, department);
//        System.out.println(seller2);


        System.out.println("=== TEST 5: Seller update");
        seller = sellerDao.findById(1);
        seller.setName("Marta Wayne");
        sellerDao.update(seller);
        System.out.println("Update completed!");

        System.out.println("=== TEST 6: Delete Seller");
        System.out.println("Enter id for delete test");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed!");
    }
}
