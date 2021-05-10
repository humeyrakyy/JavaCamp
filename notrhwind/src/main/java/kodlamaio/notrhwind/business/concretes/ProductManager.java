package kodlamaio.notrhwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.notrhwind.business.abstracts.ProductService;
import kodlamaio.notrhwind.dataAccess.abstracts.ProductDao;
import kodlamaio.notrhwind.entities.concretes.Product;

@Service
public class ProductManager  implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
