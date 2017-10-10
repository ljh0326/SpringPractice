package com.study.common.util;

public class CommonUtil {
	public static String getSelect() {
		String sComboScript = "<select id='searchdate'>"
				+ "<option value='all' seleted=''>-select-</option>"
				+ "<option value='1d'>1일</option>"
				+ "<option value='1w'>1주</option>"
				+ "<option value='1m'>1개월</option>"
				+ "<option value='6'>6개월</option>"
				+ "</select>";
		
		return sComboScript;
	}
}
