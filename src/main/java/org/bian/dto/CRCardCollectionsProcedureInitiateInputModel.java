package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureInitiateInputModelCardCollectionsProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureInitiateInputModel
 */
public class CRCardCollectionsProcedureInitiateInputModel   {
  private String cardCollectionsServicingSessionReference = null;

  private Object cardCollectionsProcedureInitiateActionRecord = null;

  private String cardCollectionsProcedureInstanceStatus = null;

  private CRCardCollectionsProcedureInitiateInputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardCollectionsServicingSessionReference
  **/

  public String getCardCollectionsServicingSessionReference() {
    return cardCollectionsServicingSessionReference;
  }

  public void setCardCollectionsServicingSessionReference(String cardCollectionsServicingSessionReference) {
    this.cardCollectionsServicingSessionReference = cardCollectionsServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return cardCollectionsProcedureInitiateActionRecord
  **/

  public Object getCardCollectionsProcedureInitiateActionRecord() {
    return cardCollectionsProcedureInitiateActionRecord;
  }

  public void setCardCollectionsProcedureInitiateActionRecord(Object cardCollectionsProcedureInitiateActionRecord) {
    this.cardCollectionsProcedureInitiateActionRecord = cardCollectionsProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Card Collections Procedure instance (e.g. initialised, pending, active) 
   * @return cardCollectionsProcedureInstanceStatus
  **/

  public String getCardCollectionsProcedureInstanceStatus() {
    return cardCollectionsProcedureInstanceStatus;
  }

  public void setCardCollectionsProcedureInstanceStatus(String cardCollectionsProcedureInstanceStatus) {
    this.cardCollectionsProcedureInstanceStatus = cardCollectionsProcedureInstanceStatus;
  }


  /**
   * Get cardCollectionsProcedureInstanceRecord
   * @return cardCollectionsProcedureInstanceRecord
  **/

  public CRCardCollectionsProcedureInitiateInputModelCardCollectionsProcedureInstanceRecord getCardCollectionsProcedureInstanceRecord() {
    return cardCollectionsProcedureInstanceRecord;
  }

  public void setCardCollectionsProcedureInstanceRecord(CRCardCollectionsProcedureInitiateInputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord) {
    this.cardCollectionsProcedureInstanceRecord = cardCollectionsProcedureInstanceRecord;
  }


}

