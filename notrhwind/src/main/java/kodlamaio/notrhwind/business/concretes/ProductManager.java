package kodlamaio.notrhwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.notrhwind.business.abstracts.ProductService;
import kodlamaio.notrhwind.core.utilities.results.DataResult;
import kodlamaio.notrhwind.core.utilities.results.Result;
import kodlamaio.notrhwind.core.utilities.results.SuccessDataResult;
import kodlamaio.notrhwind.core.utilities.results.SuccessResult;
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
	public DataResult<List<Product>> getAll() {
		
             return new SuccessDataResult<List<Product>>
				(this.productDao.findAll(), "Data listelendi");	
		}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}




}
