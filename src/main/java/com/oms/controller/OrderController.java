package com.oms.controller;

import com.oms.model.Item;
import com.oms.model.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController extends AbstractController<Order> {

  public void addItem(){
    this.getSelectedObject().getItems().add(new Item());
  }

  public void refreshTotalValues(){
    Long totalUnit = new Long(0);
    Long totalPrice = new Long(0);
    for (Item item : getSelectedObject().getItems()) {
      if (item.getQuantity() != null && item.getSaledPrice() != null) {
        totalPrice += (item.getQuantity() * item.getSaledPrice());
        totalUnit += (item.getArticle().getUnitOfMeasure().isUnitarType()) ? 1 : item.getQuantity();
      }
    }
    getSelectedObject().setTotalUnit(totalUnit);
    getSelectedObject().setTotalPrice(totalPrice);
  }

  public void onItemChange(){
    for(Item item : getSelectedObject().getItems()){
      if ((item.getQuantity() != null) && (item.getSaledPrice() != null)) {
        item.setTotalPrice(item.getQuantity() * item.getSaledPrice());
      }
    }
  }

}