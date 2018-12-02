package cn.eastseven;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @author d7
 */
@Data
@Document(collection = "t_product")
public class ProductEntity implements Serializable {

    public ProductEntity() {
        this.createTime = new Date();
    }

    @Id
    private String id;

    private String name;

    private Double price;

    private String image;

    private Date createTime;
}
