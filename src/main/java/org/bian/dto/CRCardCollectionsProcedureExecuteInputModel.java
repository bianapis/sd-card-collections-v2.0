package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecord;
import org.bian.dto.CRCardCollectionsProcedureExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureExecuteInputModel
 */
public class CRCardCollectionsProcedureExecuteInputModel   {
  private String cardCollectionsServicingSessionReference = null;

  private String cardCollectionsProcedureInstanceReference = null;

  private CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;

  private Object cardCollectionsProcedureExecuteActionTaskRecord = null;

  private CRCardCollectionsProcedureExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecord getCardCollectionsProcedureInstanceRecord() {
    return cardCollectionsProcedureInstanceRecord;
  }

  public void setCardCollectionsProcedureInstanceRecord(CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord) {
    this.cardCollectionsProcedureInstanceRecord = cardCollectionsProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return cardCollectionsProcedureExecuteActionTaskRecord
  **/

  public Object getCardCollectionsProcedureExecuteActionTaskRecord() {
    return cardCollectionsProcedureExecuteActionTaskRecord;
  }

  public void setCardCollectionsProcedureExecuteActionTaskRecord(Object cardCollectionsProcedureExecuteActionTaskRecord) {
    this.cardCollectionsProcedureExecuteActionTaskRecord = cardCollectionsProcedureExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCardCollectionsProcedureExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCardCollectionsProcedureExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

