package cn.mx.app.prv;

import org.springframework.stereotype.Service;

import cn.mx.app.model.entity.Wallet;
import top.onceio.aop.annotation.Transactional;
import top.onceio.db.dao.tpl.UpdateTpl;
import top.onceio.exception.Failed;
import top.onceio.plugins.springboot.SpringDaoProvider;

@Service
public class WalletProvider extends SpringDaoProvider<Wallet> {
	
	@Transactional
	public void transfer(Long from,Long to,Integer v) {
		UpdateTpl<Wallet> subtpl = new UpdateTpl<>(Wallet.class);
		subtpl.sub().setBalance(v);
		subtpl.set().setId(from);
		int cnt = updateByTpl(subtpl);
		if(cnt != 1) {
			Failed.throwMsg("Wallet Id：%d is not found", from);
		}
		UpdateTpl<Wallet> addtpl = new UpdateTpl<>(Wallet.class);
		addtpl.add().setBalance(v);
		addtpl.set().setId(to);
		cnt = updateByTpl(addtpl);
		if(cnt != 1) {
			Failed.throwMsg("Wallet Id: %d is not found", from);
		}
	}
}
