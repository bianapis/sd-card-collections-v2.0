package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureRequestOutputModel
 */
public class CRCardCollectionsProcedureRequestOutputModel   {
  private CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;

  private String cardCollectionsProcedureRequestActionTaskReference = null;

  private Object cardCollectionsProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Collections Procedure instance request service call 
   * @return cardCollectionsProcedureRequestActionTaskReference
  **/

  public String getCardCollectionsProcedureRequestActionTaskReference() {
    return cardCollectionsProcedureRequestActionTaskReference;
  }

  public void setCardCollectionsProcedureRequestActionTaskReference(String cardCollectionsProcedureRequestActionTaskReference) {
    this.cardCollectionsProcedureRequestActionTaskReference = cardCollectionsProcedureRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return cardCollectionsProcedureRequestActionTaskRecord
  **/

  public Object getCardCollectionsProcedureRequestActionTaskRecord() {
    return cardCollectionsProcedureRequestActionTaskRecord;
  }

  public void setCardCollectionsProcedureRequestActionTaskRecord(Object cardCollectionsProcedureRequestActionTaskRecord) {
    this.cardCollectionsProcedureRequestActionTaskRecord = cardCollectionsProcedureRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

