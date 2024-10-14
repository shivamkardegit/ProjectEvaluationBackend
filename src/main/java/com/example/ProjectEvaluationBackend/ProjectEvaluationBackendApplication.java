package com.example.ProjectEvaluationBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com"})
@EntityScan(basePackages= {"com.beanfiles"})
@EnableJpaRepositories("com.repositories")
public class ProjectEvaluationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectEvaluationBackendApplication.class, args);
	}

}
