package com.main.inventory;

import java.util.ArrayList;
import java.util.List;

abstract interface InventoryInterface {
  public List<Product> getProducts();

  public void addProduct(Product product);

  public void removeProduct(Product product);

  public void checkLowInventory();
}

public class Inventory implements InventoryInterface {

  private List<Product> products;

  public Inventory() {
    products = new ArrayList<Product>();
  }

  public List<Product> getProducts() {
    return this.products;
  }

  public void addProduct(Product product) {
    this.products.add(product);
  }

  public void removeProduct(Product product) {
    this.products.remove(product);
  }

  public void checkLowInventory() {
    for (Product product : this.products) {
      if (product.getQuantity() < 10) {
        System.out.printf(
          "%s is running low on inventory. Current quantity: %d\n",
          product.getName(),
          product.getQuantity()
        );
      }
    }
  }
}
