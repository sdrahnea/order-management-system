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
 *
 * @author sdrahnea
 */
@Component
public class UnitService extends AbstractService<Unit> {

  @PersistenceContext
  EntityManager entityManager;

  @Autowired
  private UnitTypeService unitTypeService;

  public List<Unit> getProviderList(){
    return getListByUnitType(unitTypeService.getProviderEntity());
  }

  public List<Unit> getClientList(){
    return getListByUnitType(unitTypeService.getClientEntity());
  }

  public List<Unit> getPersonList(){
    return getListByUnitType(unitTypeService.getPersonEntity());
  }

  private List<Unit> getListByUnitType(UnitType unitType){
    List<Unit> result =
        entityManager.createQuery("FROM Unit unit WHERE unit.unitType = :unitType")
            .setParameter("unitType", unitType)
            .getResultList();
    return result.isEmpty() ? new LinkedList<>() : result;
  }



}
