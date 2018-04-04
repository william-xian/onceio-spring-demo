package cn.mx.app.model.entity;

import top.onceio.db.annotation.Col;
import top.onceio.db.annotation.Tbl;
import top.onceio.db.tbl.OEntity;

@Tbl
public class UserInfo extends OEntity {
    @Col(nullable = false, size=32,unique=true)
	private String name;
    @Col(nullable = true, size=64)
    private String passwd;
    @Col(nullable = true, size=255)
    private String avatar;
    @Col(nullable = true, size=255)
    private Integer genre;
    
	public String getName() {
		return name;
	}
	public UserInfo setName(String name) {
		this.name = name;
		return this;
	}
	public String getPasswd() {
		return passwd;
	}
	public UserInfo setPasswd(String passwd) {
		this.passwd = passwd;
		return this;
	}
	public String getAvatar() {
		return avatar;
	}
	public UserInfo setAvatar(String avatar) {
		this.avatar = avatar;
		return this;
	}
	public Integer getGenre() {
		return genre;
	}
	public UserInfo setGenre(Integer genre) {
		this.genre = genre;
		return this;
	}
}
