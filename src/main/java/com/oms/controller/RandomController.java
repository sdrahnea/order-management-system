package com.oms.controller;

import com.oms.controller.data.FirstNameController;
import com.oms.controller.data.LastNameController;
import com.oms.model.*;
import com.oms.util.RandomUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/random")
@CrossOrigin("*")
public class RandomController {

  @Autowired
  private UnitController unitController;

  @Autowired
  private FirstNameController firstNameController;

  @Autowired
  private LastNameController lastNameController;

  @Autowired
  private UnitIndustryController unitIndustryController;

  @Autowired
  private UnitTypeController unitTypeController;

  @Autowired
  private InventoryStatusController inventoryStatusController;

  @Autowired
  private InventoryTypeController inventoryTypeController;

  @Autowired
  private InventoryController inventoryController;

  @Autowired
  private OrderController orderController;

  @Autowired
  private OrderStatusController orderStatusController;

  @Autowired
  private OrderTypeController orderTypeController;

  @Autowired
  private ArticleCategoryController articleCategoryController;

  @Autowired
  private ArticleController articleController;

  @Autowired
  private ItemController itemController;

  @RequestMapping(method = RequestMethod.GET, path = "/order")
  public List<Order> createRandomItem() {
    List<Order> result = new LinkedList<>();

    for(int i = 0; i < 100; i++){
      Order order = new Order();

      order.setOrderStatus(orderStatusController.getRandomObject());
      order.setOrderType(orderTypeController.getRandomObject());
      order.setUnit(unitController.getRandomObjectFromList(unitController.getClientList()));
      order.setDeliveryAddress(RandomUtility.generateSentence());
      order.setName(RandomUtility.generatWord());
      order.setNotes(RandomUtility.generateSentence());

      List<Item> items = new LinkedList<>();
      for (int index = 0; index < RandomUtility.generateNumber(5, 15); index++){
        Item item = new Item();

        ArticleCategory articleCategory = articleCategoryController.getRandomObject();
        item.setArticleCategory(articleCategory);

        Article article = articleController.getRandomObjectFromList(
            articleController.getArticleListByCategory(articleCategory));
        item.setArticle(article);
        item.setSaledPrice(article.getSalePrice());
        item.setQuantity((long) RandomUtility.generateNumber(1, 20));

        item.setName(article.getName());
        item.setNotes(article.getNotes());
        item.setUnitOfMeasure(article.getUnitOfMeasure());

        item = itemController.save(item);
        items.add(item);
      }
      order.setItems(items);

      order = orderController.save(order);
      result.add(order);
    }

    return result;
  }

  @RequestMapping(method = RequestMethod.GET, path = "/inventory")
  public List<Inventory> createRandomStatus() {
    List<Inventory> result = new LinkedList<>();

    for(int i = 0; i < 100; i++){
      Inventory inventory = new Inventory();

      inventory.setInventoryStatus(inventoryStatusController.getRandomObject());
      inventory.setInventoryType(inventoryTypeController.getRandomObject());
      inventory.setProvider(unitController.getRandomObjectFromList(unitController.getProviderList()));
      inventory.setQuantity((long) RandomUtility.generateNumber(100, 500));
      inventory.setWarnQuantity((long) RandomUtility.generateNumber(10, 100));
      inventory.setName(RandomUtility.generatWord());
      inventory.setNotes(RandomUtility.generateSentence());

      inventory = inventoryController.save(inventory);
      result.add(inventory);
    }

    return result;
  }

  @RequestMapping(method = RequestMethod.GET, path = "/unit")
  public List<Unit> createRandomUnit() {
    List<Unit> result = new LinkedList<>();

    for(int i = 0; i < 100; i++){
      Unit unit = new Unit();

      unit.setAdditionalInfo(RandomUtility.generateSentence());
      unit.setAddress(RandomUtility.generateSentence());
      unit.setEmail(RandomUtility.generateEmail());
      unit.setFax(RandomUtility.generatePhone());
      unit.setPhone(RandomUtility.generatePhone());

      List<Person> persons = new LinkedList<>();
      int numOfPerson = RandomUtility.generateNumber(1, 5);
      for (int personIndex = 0; personIndex < numOfPerson; personIndex++) {
        Person person = new Person();
        person.setFirstName(firstNameController.getRandomObject().getName());
        person.setLastName(lastNameController.getRandomObject().getName());
        person.setEmail(RandomUtility.generateEmail());
        person.setFax(RandomUtility.generatePhone());
        person.setPhone(RandomUtility.generatePhone());
        persons.add(person);
      }

      UnitIndustry unitIndustry = unitIndustryController.getRandomObject();
      unit.setName(firstNameController.getRandomObject().getName() + " " + unitIndustry.getName());
      unit.setUnitIndustry(unitIndustry);
      unit.setUnitType(unitTypeController.getRandomObject());
      unit.setPersons(persons);

      unit = unitController.save(unit);
      result.add(unit);
    }

    return result;
  }

}
