package cn.net.lcy.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DataOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataOperationApplication.class, args);
	}

}
