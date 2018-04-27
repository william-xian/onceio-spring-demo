package cn.mx.app.model.entity;

import top.onceio.core.db.annotation.Col;
import top.onceio.core.db.annotation.Tbl;
import top.onceio.core.db.tbl.OEntity;

@Tbl
public class GoodsShipping extends OEntity {
	@Col(ref=GoodsOrder.class, nullable = false)
	private long goodsOrderId;
	@Col(ref=UserInfo.class,nullable = false)
	private long buyerId;
	@Col(ref=UserInfo.class,nullable = false)
	private long receiverId;
	@Col(size = 255)
	private String addr;
	
	public long getGoodsOrderId() {
		return goodsOrderId;
	}
	public void setGoodsOrderId(long goodsOrderId) {
		this.goodsOrderId = goodsOrderId;
	}
	
	public long getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(long buyerId) {
		this.buyerId = buyerId;
	}
	public long getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(long receiverId) {
		this.receiverId = receiverId;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
