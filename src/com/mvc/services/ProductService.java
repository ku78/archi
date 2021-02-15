package services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import entities.Product;
import repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
		
	}
	public Optinal<Product> findById(Long id){
		return productRepository.finById(id);
		
	}
	
	public Product save(Product product){
		return productRepository.save(product);
		
	}
	
	public void delete(Product product){
		productRepository.delete(product);
		
	}
}

