package cn.mx.app.model.entity;

import top.onceio.core.db.annotation.Col;
import top.onceio.core.db.annotation.Tbl;
import top.onceio.core.db.tbl.OEntity;

@Tbl
public class GoodsOrder extends OEntity{
	@Col(ref=UserInfo.class)
	private Long userId;
	@Col(ref=Goods.class,nullable = false)
	private Long goodsId;
	@Col(nullable = false)
	private Integer amount;
	@Col(nullable = false)
	private Integer money;
	@Col(nullable = false)
	private Long ctime;
	@Col(nullable = true)
	private Long paytime;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public Long getCtime() {
		return ctime;
	}
	public void setCtime(Long ctime) {
		this.ctime = ctime;
	}
	public Long getPaytime() {
		return paytime;
	}
	public void setPaytime(Long paytime) {
		this.paytime = paytime;
	}
	
}
