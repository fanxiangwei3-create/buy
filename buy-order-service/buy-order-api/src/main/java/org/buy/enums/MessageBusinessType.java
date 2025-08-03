package org.buy.enums;

public enum MessageBusinessType {
    // 博主动态
    BLOGGER_POST(1, "博主动态"),
    // 商品导入
    PRODUCT_IMPORT(2, "商品导入"),

    PRODUCT_IMPORT_DETAIL(4, "商品导入详情"),

    POST_SUCCESS(5, "帖子发布成功"),
    POST_FAIL(6, "帖子发布失败"),

    //审核消息
    BLOGGER_REVIEW(3, "审核消息");

    private final Integer code;
    private final String description;

    MessageBusinessType(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
