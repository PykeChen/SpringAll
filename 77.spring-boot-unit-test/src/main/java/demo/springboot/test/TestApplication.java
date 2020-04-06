package demo.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * mapperScan必须是tk.mybatis.spring.annotation
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("demo.springboot.test.mapper")
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}
