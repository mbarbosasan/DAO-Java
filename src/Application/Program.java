package Application;

import Model.Entities.Department;
import Model.Entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bobo@gmail.com", new Date(),
                3000.00, obj);

        System.out.println(obj);
        System.out.println(seller);
    }
}
