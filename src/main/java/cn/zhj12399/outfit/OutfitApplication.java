package cn.zhj12399.outfit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.zhj12399.outfit.mapper")
public class OutfitApplication {

    public static void main(String[] args) {
        SpringApplication.run(OutfitApplication.class, args);
    }

}
