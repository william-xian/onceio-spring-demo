package cn.mx.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mx.app.prv.WalletProvider;
import top.onceio.plugins.springboot.OnceIORunner;

@Controller
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackageClasses = {OnceIORunner.class,Launcher.class})
@EnableTransactionManagement
public class Launcher {
    @Autowired
    private WalletProvider walletProvider;    
    
    @RequestMapping("/")
    @ResponseBody
    String home(@RequestParam("from")Long from,@RequestParam("to")Long to,@RequestParam("v") Integer v) {
    	walletProvider.transfer(from, to, v);
		return System.currentTimeMillis() + "";
    }
    
    public static void main(String[] args) throws Exception {
		SpringApplication.run(Launcher.class, args);
    }
}