package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceAnalysis;
import org.bian.dto.CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceRecord;
import org.bian.dto.CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureRetrieveOutputModel
 */
public class CRCardCollectionsProcedureRetrieveOutputModel   {
  private CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;

  private String cardCollectionsProcedureRetrieveActionTaskReference = null;

  private Object cardCollectionsProcedureRetrieveActionTaskRecord = null;

  private String cardCollectionsProcedureRetrieveActionResponse = null;

  private CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceReportRecord cardCollectionsProcedureInstanceReportRecord = null;

  private CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceAnalysis cardCollectionsProcedureInstanceAnalysis = null;


  /**
   * Get cardCollectionsProcedureInstanceRecord
   * @return cardCollectionsProcedureInstanceRecord
  **/

  public CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceRecord getCardCollectionsProcedureInstanceRecord() {
    return cardCollectionsProcedureInstanceRecord;
  }

  public void setCardCollectionsProcedureInstanceRecord(CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord) {
    this.cardCollectionsProcedureInstanceRecord = cardCollectionsProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Collections Procedure instance retrieve service call 
   * @return cardCollectionsProcedureRetrieveActionTaskReference
  **/

  public String getCardCollectionsProcedureRetrieveActionTaskReference() {
    return cardCollectionsProcedureRetrieveActionTaskReference;
  }

  public void setCardCollectionsProcedureRetrieveActionTaskReference(String cardCollectionsProcedureRetrieveActionTaskReference) {
    this.cardCollectionsProcedureRetrieveActionTaskReference = cardCollectionsProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardCollectionsProcedureRetrieveActionTaskRecord
  **/

  public Object getCardCollectionsProcedureRetrieveActionTaskRecord() {
    return cardCollectionsProcedureRetrieveActionTaskRecord;
  }

  public void setCardCollectionsProcedureRetrieveActionTaskRecord(Object cardCollectionsProcedureRetrieveActionTaskRecord) {
    this.cardCollectionsProcedureRetrieveActionTaskRecord = cardCollectionsProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cardCollectionsProcedureRetrieveActionResponse
  **/

  public String getCardCollectionsProcedureRetrieveActionResponse() {
    return cardCollectionsProcedureRetrieveActionResponse;
  }

  public void setCardCollectionsProcedureRetrieveActionResponse(String cardCollectionsProcedureRetrieveActionResponse) {
    this.cardCollectionsProcedureRetrieveActionResponse = cardCollectionsProcedureRetrieveActionResponse;
  }


  /**
   * Get cardCollectionsProcedureInstanceReportRecord
   * @return cardCollectionsProcedureInstanceReportRecord
  **/

  public CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceReportRecord getCardCollectionsProcedureInstanceReportRecord() {
    return cardCollectionsProcedureInstanceReportRecord;
  }

  public void setCardCollectionsProcedureInstanceReportRecord(CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceReportRecord cardCollectionsProcedureInstanceReportRecord) {
    this.cardCollectionsProcedureInstanceReportRecord = cardCollectionsProcedureInstanceReportRecord;
  }


  /**
   * Get cardCollectionsProcedureInstanceAnalysis
   * @return cardCollectionsProcedureInstanceAnalysis
  **/

  public CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceAnalysis getCardCollectionsProcedureInstanceAnalysis() {
    return cardCollectionsProcedureInstanceAnalysis;
  }

  public void setCardCollectionsProcedureInstanceAnalysis(CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceAnalysis cardCollectionsProcedureInstanceAnalysis) {
    this.cardCollectionsProcedureInstanceAnalysis = cardCollectionsProcedureInstanceAnalysis;
  }


}

