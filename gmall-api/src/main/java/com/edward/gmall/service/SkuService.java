package com.edward.gmall.service;

import com.edward.gmall.bean.PmsSkuInfo;

import java.math.BigDecimal;
import java.util.List;

public interface SkuService {

    String saveSkuInfo(PmsSkuInfo pmsSkuInfo);

    PmsSkuInfo getItemById(String skuId);

    List<PmsSkuInfo> getSkuSaleAttrValueListCheckBySku(String productId);

    List<PmsSkuInfo> getAll();

    boolean checkPrice(String productSkuId, BigDecimal price);
}
