package com.hunter.dt.base.common.enumerate;

/**
 * 日期格式枚举，期待后续填充
 */
public enum DateFormatPatternEnum {

    DATE_TIME_PATTERN("yyyy-MM-dd HH:mm:ss"),
    TIME_PATTERN("HH:mm:ss"),
    MINUTE_PATTERN("yyyy-MM-dd HH:mm"),
    DATE_PATTERN("yyyy-MM-dd"),
    MONTH_PATTERN("yyyy-MM")

    ;

    DateFormatPatternEnum(String pattern) {
        this.pattern = pattern;
    }

    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
