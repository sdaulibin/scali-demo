package com.sdjictec.scalidemo.warehouse.dubbo;

import com.sdjictec.scalidemo.warehouse.dto.Stock;

public interface WarehouseService {
    //查询库存
    public Stock getStock(Long skuId);
}
