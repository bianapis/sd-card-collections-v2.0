package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureUpdateInputModelCardCollectionsProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureUpdateOutputModel
 */
public class CRCardCollectionsProcedureUpdateOutputModel   {
  private CRCardCollectionsProcedureUpdateInputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;

  private String cardCollectionsProcedureUpdateActionTaskReference = null;

  private Object cardCollectionsProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return cardCollectionsProcedureUpdateActionTaskReference
  **/

  public String getCardCollectionsProcedureUpdateActionTaskReference() {
    return cardCollectionsProcedureUpdateActionTaskReference;
  }

  public void setCardCollectionsProcedureUpdateActionTaskReference(String cardCollectionsProcedureUpdateActionTaskReference) {
    this.cardCollectionsProcedureUpdateActionTaskReference = cardCollectionsProcedureUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

