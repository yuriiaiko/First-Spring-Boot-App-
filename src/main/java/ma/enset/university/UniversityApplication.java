package ma.enset.university;

import lombok.AllArgsConstructor;
import ma.enset.university.entities.Product;
import ma.enset.university.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class UniversityApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(UniversityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //productRepository.save(new Product(null,"Computer",4300,3));
        //productRepository.save(new Product(null,"Printer",2300,6));
        //productRepository.save(new Product(null,"Smartphone",5000,4));
        List<Product> products = productRepository.findAll();
        products.forEach(p->{
                System.out.printf("%s\n",p.toString());
        });
        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.printf("*******************%n");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getQuantity());
        System.out.println("**********************");
        System.out.println("---------------------------");
        List<Product> productList = productRepository.findByNameContains("C");
        productList.forEach(p->
                System.out.println(p));
        System.out.println("---------------------------");
        List<Product> productList2 = productRepository.search("%C%");
        productList2.forEach(p->
                System.out.println(p));
        System.out.println("---------------------------");
        List<Product> productList3 = productRepository.findByPriceGreaterThan(100.0);
        productList3.forEach(p->
                System.out.println(p));

        System.out.println("---------------------------");
        List<Product> productList4 = productRepository.searchByPrice(3000.0);
        productList4.forEach(p->
                System.out.println(p));

    }
}
