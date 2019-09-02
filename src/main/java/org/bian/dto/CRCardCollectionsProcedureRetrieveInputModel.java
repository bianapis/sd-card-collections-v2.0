package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceAnalysis;
import org.bian.dto.CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureRetrieveInputModel
 */
public class CRCardCollectionsProcedureRetrieveInputModel   {
  private Object cardCollectionsProcedureRetrieveActionTaskRecord = null;

  private String cardCollectionsProcedureRetrieveActionRequest = null;

  private CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceReportRecord cardCollectionsProcedureInstanceReportRecord = null;

  private CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceAnalysis cardCollectionsProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cardCollectionsProcedureRetrieveActionRequest
  **/

  public String getCardCollectionsProcedureRetrieveActionRequest() {
    return cardCollectionsProcedureRetrieveActionRequest;
  }

  public void setCardCollectionsProcedureRetrieveActionRequest(String cardCollectionsProcedureRetrieveActionRequest) {
    this.cardCollectionsProcedureRetrieveActionRequest = cardCollectionsProcedureRetrieveActionRequest;
  }


  /**
   * Get cardCollectionsProcedureInstanceReportRecord
   * @return cardCollectionsProcedureInstanceReportRecord
  **/

  public CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceReportRecord getCardCollectionsProcedureInstanceReportRecord() {
    return cardCollectionsProcedureInstanceReportRecord;
  }

  public void setCardCollectionsProcedureInstanceReportRecord(CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceReportRecord cardCollectionsProcedureInstanceReportRecord) {
    this.cardCollectionsProcedureInstanceReportRecord = cardCollectionsProcedureInstanceReportRecord;
  }


  /**
   * Get cardCollectionsProcedureInstanceAnalysis
   * @return cardCollectionsProcedureInstanceAnalysis
  **/

  public CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceAnalysis getCardCollectionsProcedureInstanceAnalysis() {
    return cardCollectionsProcedureInstanceAnalysis;
  }

  public void setCardCollectionsProcedureInstanceAnalysis(CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceAnalysis cardCollectionsProcedureInstanceAnalysis) {
    this.cardCollectionsProcedureInstanceAnalysis = cardCollectionsProcedureInstanceAnalysis;
  }


}

