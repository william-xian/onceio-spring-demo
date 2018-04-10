package cn.mx.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mx.app.constant.SysConfig;
import cn.mx.app.holder.WalletHolder;
import cn.mx.app.model.entity.Wallet;

@Controller
public class ConfigController {
    @Autowired
    private WalletHolder walletProvider;    
    
    @RequestMapping("/transfer")
    @ResponseBody
    Wallet home(@RequestParam("from")Long from,@RequestParam("to")Long to,@RequestParam("v") Integer v) {
    	walletProvider.transfer(from, to, v);
		return walletProvider.get(to);
    }
    @RequestMapping("/config")
    @ResponseBody
    String home(@RequestParam("name")String name) {
    	return "pagesize - " + SysConfig.PAGE_SIZE;
    }
}