package cn.eastseven;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author d7
 */
public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}
