package org.buy.enums;


public enum ClientType {
    WEB("web"),
    H5("h5"),
    APP("app"), // 您可以根据需要添加或修改这些值
    PC("pc");   // 例如，如果还有PC客户端

    private final String databaseValue;

    ClientType(String databaseValue) {
        this.databaseValue = databaseValue;
    }

    public String getDatabaseValue() {
        return databaseValue;
    }

    // 可选: 如果需要从数据库字符串反向获取枚举，可以添加此方法
    public static ClientType fromDatabaseValue(String value) {
        for (ClientType type : values()) {
            if (type.databaseValue.equalsIgnoreCase(value)) {
                return type;
            }
        }
        // 根据您的错误处理策略，找不到时可以返回null或抛出异常
        // throw new IllegalArgumentException("Unknown client type database value: " + value);
        return null;
    }
}