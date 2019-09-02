package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureControlOutputModel
 */
public class CRCardCollectionsProcedureControlOutputModel   {
  private String cardCollectionsProcedureControlActionTaskReference = null;

  private Object cardCollectionsProcedureControlActionTaskRecord = null;

  private String cardCollectionsProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Collections Procedure instance control processing service call 
   * @return cardCollectionsProcedureControlActionTaskReference
  **/

  public String getCardCollectionsProcedureControlActionTaskReference() {
    return cardCollectionsProcedureControlActionTaskReference;
  }

  public void setCardCollectionsProcedureControlActionTaskReference(String cardCollectionsProcedureControlActionTaskReference) {
    this.cardCollectionsProcedureControlActionTaskReference = cardCollectionsProcedureControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return cardCollectionsProcedureControlActionResponse
  **/

  public String getCardCollectionsProcedureControlActionResponse() {
    return cardCollectionsProcedureControlActionResponse;
  }

  public void setCardCollectionsProcedureControlActionResponse(String cardCollectionsProcedureControlActionResponse) {
    this.cardCollectionsProcedureControlActionResponse = cardCollectionsProcedureControlActionResponse;
  }


}

