package cn.mx.app.model.entity;

import top.onceio.core.db.annotation.Col;
import top.onceio.core.db.annotation.Tbl;
import top.onceio.core.db.tbl.OEntity;

@Tbl(extend=Goods.class)
public class GoodsDesc extends OEntity{
	@Col(size = 255,nullable = true)
	private String content;
	@Col(nullable = false)
	private Integer saled;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getSaled() {
		return saled;
	}
	public void setSaled(Integer saled) {
		this.saled = saled;
	}
	
}
