package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureRequestInputModelCardCollectionsProcedureInstanceRecord;
import org.bian.dto.CRCardCollectionsProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureRequestInputModel
 */
public class CRCardCollectionsProcedureRequestInputModel   {
  private String cardCollectionsServicingSessionReference = null;

  private String cardCollectionsProcedureInstanceReference = null;

  private CRCardCollectionsProcedureRequestInputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;

  private Object cardCollectionsProcedureRequestActionTaskRecord = null;

  private CRCardCollectionsProcedureRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCardCollectionsProcedureRequestInputModelCardCollectionsProcedureInstanceRecord getCardCollectionsProcedureInstanceRecord() {
    return cardCollectionsProcedureInstanceRecord;
  }

  public void setCardCollectionsProcedureInstanceRecord(CRCardCollectionsProcedureRequestInputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord) {
    this.cardCollectionsProcedureInstanceRecord = cardCollectionsProcedureInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCardCollectionsProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCardCollectionsProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

