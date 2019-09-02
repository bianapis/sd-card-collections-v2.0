package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureUpdateInputModelCardCollectionsProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureUpdateInputModel
 */
public class CRCardCollectionsProcedureUpdateInputModel   {
  private String cardCollectionsServicingSessionReference = null;

  private String cardCollectionsProcedureInstanceReference = null;

  private CRCardCollectionsProcedureUpdateInputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;

  private Object cardCollectionsProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get cardCollectionsProcedureInstanceRecord
   * @return cardCollectionsProcedureInstanceRecord
  **/

  public CRCardCollectionsProcedureUpdateInputModelCardCollectionsProcedureInstanceRecord getCardCollectionsProcedureInstanceRecord() {
    return cardCollectionsProcedureInstanceRecord;
  }

  public void setCardCollectionsProcedureInstanceRecord(CRCardCollectionsProcedureUpdateInputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord) {
    this.cardCollectionsProcedureInstanceRecord = cardCollectionsProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardCollectionsProcedureUpdateActionTaskRecord
  **/

  public Object getCardCollectionsProcedureUpdateActionTaskRecord() {
    return cardCollectionsProcedureUpdateActionTaskRecord;
  }

  public void setCardCollectionsProcedureUpdateActionTaskRecord(Object cardCollectionsProcedureUpdateActionTaskRecord) {
    this.cardCollectionsProcedureUpdateActionTaskRecord = cardCollectionsProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

