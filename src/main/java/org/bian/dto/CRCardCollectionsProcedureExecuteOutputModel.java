package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureExecuteOutputModel
 */
public class CRCardCollectionsProcedureExecuteOutputModel   {
  private CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;

  private String cardCollectionsProcedureExecuteActionTaskReference = null;

  private Object cardCollectionsProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Collections Procedure instance execute service call 
   * @return cardCollectionsProcedureExecuteActionTaskReference
  **/

  public String getCardCollectionsProcedureExecuteActionTaskReference() {
    return cardCollectionsProcedureExecuteActionTaskReference;
  }

  public void setCardCollectionsProcedureExecuteActionTaskReference(String cardCollectionsProcedureExecuteActionTaskReference) {
    this.cardCollectionsProcedureExecuteActionTaskReference = cardCollectionsProcedureExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

