package com.hiriver.unbiz.mysql.lib.protocol.binlog;

import com.hiriver.unbiz.mysql.lib.ColumnType;

/**
 * 内部使用的表的列定义
 * 
 * @author hexiufeng
 *
 */
public class InternelColumnDefinition {
    private ColumnType columnType;
    /**
     * 主从复制协议中定义的每个字段的元数据，TableMapEvent会定义每一列的元数据，
     * 而元数据所占的长度跟类型有关，参见http://dev.mysql.com/doc/internals/en/table-map-event.html
     */
    private int meta;
    private boolean isNull;

    public InternelColumnDefinition(ColumnType columnType, int meta, boolean isNull) {
        this.columnType = columnType;
        this.meta = meta;
        this.isNull = isNull;
    }

    public ColumnType getColumnType() {
        return columnType;
    }

    public int getMeta() {
        return meta;
    }

    public boolean isNull() {
        return isNull;
    }
}
