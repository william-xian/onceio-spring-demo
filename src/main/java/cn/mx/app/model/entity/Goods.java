package cn.mx.app.model.entity;

import cn.mx.app.constant.GoodsGenre;
import top.onceio.db.annotation.Col;
import top.onceio.db.annotation.Tbl;
import top.onceio.db.tbl.OEntity;

@Tbl
public class Goods extends OEntity{
	
	@Col(size = 32,nullable = true)
	private String name;
	
	@Col(nullable = true,valRef=GoodsGenre.class)
	private Integer genre;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGenre() {
		return genre;
	}
	public void setGenre(Integer genre) {
		this.genre = genre;
	}
}
