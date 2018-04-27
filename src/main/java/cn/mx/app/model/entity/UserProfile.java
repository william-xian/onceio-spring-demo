package cn.mx.app.model.entity;

import top.onceio.core.db.annotation.Col;
import top.onceio.core.db.annotation.Tbl;
import top.onceio.core.db.tbl.OEntity;

@Tbl(extend=UserInfo.class)
public class UserProfile extends OEntity{
    @Col(nullable = false, size=20)
	private String nickname;
    @Col(nullable = false)
	private Boolean gender;
    @Col(nullable = false, size=16)
	private String phone;
    
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
