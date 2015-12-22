package com.brsanthu.googleanalytics;

/**
 * @author ZeoS (fernando[dot]otero[at]avenida[dot]com)
 */
public enum EnhancedEcommerceHitType {
  ADD_PRODUCT("addProduct");
  private final String key;

  EnhancedEcommerceHitType(String addProduct) {
    this.key = addProduct;
  }

  public String getKey() {
    return key;
  }
}
