package kodlamaio.notrhwind.api.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.notrhwind.core.utilities.results.Result;
import kodlamaio.notrhwind.business.abstracts.ProductService;
import kodlamaio.notrhwind.core.utilities.results.DataResult;
import kodlamaio.notrhwind.entities.concretes.Product;


@RestController
@RequestMapping( "/api/products")
public class ProductsController {
	
	
	 private ProductService productService;
	 
	 @Autowired
	 public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping("/getall")
     public DataResult<List<Product>> getAll(){
    	return this.productService.getAll();
     }
	
	@PostMapping("/add")	
	public Result add(Product product) {
		return this.productService.add(product);
	}
	
}
