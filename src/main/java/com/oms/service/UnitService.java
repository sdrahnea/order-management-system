package com.oms.service;

import com.oms.model.Unit;
import com.oms.model.UnitType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sdrahnea
 */
@Component
public class UnitService extends AbstractService<Unit> {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private UnitTypeService unitTypeService;

  /**
   * Returns the providers list
   * @return list
   */
  public List<Unit> getProviderList() {
        try {
            return getListByUnitType(unitTypeService.getProviderEntity());
        } catch (Exception exception) {
            return new LinkedList();
        }
    }

  /**
   * Returns the clients list
   * @return list
   */
    public List<Unit> getClientList() {
      try {
        return getListByUnitType(unitTypeService.getClientEntity());
      } catch (Exception exception) {
        return new LinkedList();
      }

    }

  /**
   * Returns the persons list
   * @return list
   */
    public List<Unit> getPersonList() {
        try {
            return getListByUnitType(unitTypeService.getPersonEntity());
        } catch (Exception exception) {
            return new LinkedList();
        }
    }

  /**
   * Returns the a custom list based on unitType value
   * @param unitType can be PERSON, PROVIDER, CLIENT
   * @return list of units
   */
    private List<Unit> getListByUnitType(UnitType unitType) {
        List<Unit> result =
                entityManager.createQuery("FROM Unit unit WHERE unit.unitType = :unitType")
                        .setParameter("unitType", unitType)
                        .getResultList();
        return result.isEmpty() ? new LinkedList<>() : result;
    }

}
