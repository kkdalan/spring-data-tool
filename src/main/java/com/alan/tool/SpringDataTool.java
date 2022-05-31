package com.alan.tool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alan.tool.jpa.JPAGenerator;

@JPAGenerator(
        entityPackage = "com.fet.telemedicine.backend.repository.pgsql.po",
        repositoryPackage = "com.fet.telemedicine.backend.repository.pgsql",
//        managerPackage = "com.alan.batch.repository.jpa.meerkat.manager",
        repositoryPostfix = "Repository",
//        managerPostfix = "Manager",
        onlyAnnotations = false,
        debug = false,
        overwrite = true
)
@SpringBootApplication
public class SpringDataTool {
    
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringDataTool.class);
		app.run(args);
	}
    
}
