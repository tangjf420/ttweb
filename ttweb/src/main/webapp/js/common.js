var StringUtil = {

	BLANK_STR : '',

	isBlank : function(str) {
		return !str;
	},
	isNullDefaultVal : function(str, deaultVal) {
		if (!StringUtil.isBlank(str)) {
			return str;
		}

		if (StringUtil.isBlank(deaultVal)) {
			return StringUtil.BLANK_STR;
		}

		return deaultVal;
	}
};