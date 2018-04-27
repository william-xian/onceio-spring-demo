package cn.mx.app.common;

import top.onceio.core.annotation.I18nCfg;
import top.onceio.core.annotation.I18nCfgBrief;

@I18nCfg("zh")
public class User {
	@I18nCfgBrief("苹果IOS系统")
	public static final int OS_IOS = 1;
	@I18nCfgBrief("Android系统")
	public static final int OS_ANDROID = 2;
	@I18nCfgBrief("微信")
	public static final int OS_WX = 3;
}
