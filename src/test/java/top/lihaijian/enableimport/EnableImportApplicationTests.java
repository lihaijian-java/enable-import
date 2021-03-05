package top.lihaijian.enableimport;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EnableImportApplicationTests {
@Autowired
Apple apple;
    @Test
    void contextLoads() {
        System.out.println(apple);
    }

}
