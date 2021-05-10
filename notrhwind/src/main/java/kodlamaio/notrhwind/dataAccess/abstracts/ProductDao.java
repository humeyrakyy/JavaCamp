package kodlamaio.notrhwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.notrhwind.entities.concretes.Product;


public interface ProductDao extends JpaRepository<Product,Integer> {
        
}
