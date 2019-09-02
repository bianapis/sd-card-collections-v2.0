package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureInitiateOutputModel
 */
public class CRCardCollectionsProcedureInitiateOutputModel   {
  private String cardCollectionsProcedureInstanceReference = null;

  private String cardCollectionsProcedureInitiateActionReference = null;

  private Object cardCollectionsProcedureInitiateActionRecord = null;

  private String cardCollectionsProcedureInstanceStatus = null;

  private CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card Collections Procedure instance 
   * @return cardCollectionsProcedureInstanceReference
  **/

  public String getCardCollectionsProcedureInstanceReference() {
    return cardCollectionsProcedureInstanceReference;
  }

  public void setCardCollectionsProcedureInstanceReference(String cardCollectionsProcedureInstanceReference) {
    this.cardCollectionsProcedureInstanceReference = cardCollectionsProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return cardCollectionsProcedureInitiateActionReference
  **/

  public String getCardCollectionsProcedureInitiateActionReference() {
    return cardCollectionsProcedureInitiateActionReference;
  }

  public void setCardCollectionsProcedureInitiateActionReference(String cardCollectionsProcedureInitiateActionReference) {
    this.cardCollectionsProcedureInitiateActionReference = cardCollectionsProcedureInitiateActionReference;
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

  public CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord getCardCollectionsProcedureInstanceRecord() {
    return cardCollectionsProcedureInstanceRecord;
  }

  public void setCardCollectionsProcedureInstanceRecord(CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord) {
    this.cardCollectionsProcedureInstanceRecord = cardCollectionsProcedureInstanceRecord;
  }


}

