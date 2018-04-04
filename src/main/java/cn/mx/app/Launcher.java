package cn.mx.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import top.onceio.plugins.springboot.OnceIORunner;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackageClasses = {OnceIORunner.class,Launcher.class})
@EnableTransactionManagement
public class Launcher {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Launcher.class, args);
    }
	
	
}
