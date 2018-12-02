package cn.eastseven;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    @Test
    public void contextLoads() {
        log.debug(">>> start");

        ProductEntity product = new ProductEntity();
        product.setPrice(new BigDecimal(RandomUtils.nextDouble(1, 99)).setScale(2, RoundingMode.HALF_DOWN).doubleValue());
        product.setName("测试");

        assertNull(product.getId());

        productRepository.save(product);
        assertNotNull(product.getId());

        log.debug("\n{}", product);
    }

}
