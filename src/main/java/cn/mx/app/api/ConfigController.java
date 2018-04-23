package cn.mx.app.api;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mx.app.holder.WalletHolder;
import cn.mx.app.model.entity.Wallet;
import top.onceio.util.OUtils;

@Controller
public class ConfigController {
    @Autowired
    private WalletHolder walletHolder;
    
    @RequestMapping("/transfer")
    @ResponseBody
    Wallet transfer(@RequestParam("from")Long from,@RequestParam("to")Long to,@RequestParam("v") Integer v) {
    	walletHolder.transfer(from, to, v);
		return walletHolder.get(to);
    }

    @Autowired
    private DataSource ds;
    @RequestMapping("/config")
    @ResponseBody
    String config(@RequestParam("name")String name) throws SQLException {
    	DatabaseMetaData dmd = ds.getConnection().getMetaData();
    	Map<String,Object> map = new HashMap<>();
    	map.put("getDatabaseProductName", dmd.getDatabaseProductName());
    	map.put("getDatabaseProductVersion", dmd.getDatabaseProductVersion());
    	map.put("getCatalogSeparator", dmd.getCatalogSeparator());
    	map.put("getDatabaseMajorVersion", dmd.getDatabaseMajorVersion());
    	map.put("getDatabaseMinorVersion", dmd.getDatabaseMinorVersion());
    	map.put("getDriverName", dmd.getDriverName());
    	map.put("getDriverVersion", dmd.getDriverVersion());
    	return OUtils.toJSON(map);
    }
}