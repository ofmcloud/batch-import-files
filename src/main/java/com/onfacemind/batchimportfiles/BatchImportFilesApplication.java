package com.onfacemind.batchimportfiles;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.onfacemind.batchimportfiles.write.mapper")
public class BatchImportFilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchImportFilesApplication.class, args);
	}
}
