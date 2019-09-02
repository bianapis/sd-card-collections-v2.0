package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureControlInputModelCardCollectionsProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureControlInputModel
 */
public class CRCardCollectionsProcedureControlInputModel   {
  private String cardCollectionsServicingSessionReference = null;

  private String cardCollectionsProcedureInstanceReference = null;

  private Object cardCollectionsProcedureControlActionTaskRecord = null;

  private CRCardCollectionsProcedureControlInputModelCardCollectionsProcedureControlActionRequest cardCollectionsProcedureControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return cardCollectionsProcedureControlActionTaskRecord
  **/

  public Object getCardCollectionsProcedureControlActionTaskRecord() {
    return cardCollectionsProcedureControlActionTaskRecord;
  }

  public void setCardCollectionsProcedureControlActionTaskRecord(Object cardCollectionsProcedureControlActionTaskRecord) {
    this.cardCollectionsProcedureControlActionTaskRecord = cardCollectionsProcedureControlActionTaskRecord;
  }


  /**
   * Get cardCollectionsProcedureControlActionRequest
   * @return cardCollectionsProcedureControlActionRequest
  **/

  public CRCardCollectionsProcedureControlInputModelCardCollectionsProcedureControlActionRequest getCardCollectionsProcedureControlActionRequest() {
    return cardCollectionsProcedureControlActionRequest;
  }

  public void setCardCollectionsProcedureControlActionRequest(CRCardCollectionsProcedureControlInputModelCardCollectionsProcedureControlActionRequest cardCollectionsProcedureControlActionRequest) {
    this.cardCollectionsProcedureControlActionRequest = cardCollectionsProcedureControlActionRequest;
  }


}

