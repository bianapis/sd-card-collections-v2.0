package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceReportRecord
 */
public class CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceReportRecord   {
  private String cardCollectionsProcedureInstanceReportData = null;

  private String cardCollectionsProcedureInstanceReportType = null;

  private Object cardCollectionsProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cardCollectionsProcedureInstanceReportData
  **/

  public String getCardCollectionsProcedureInstanceReportData() {
    return cardCollectionsProcedureInstanceReportData;
  }

  public void setCardCollectionsProcedureInstanceReportData(String cardCollectionsProcedureInstanceReportData) {
    this.cardCollectionsProcedureInstanceReportData = cardCollectionsProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cardCollectionsProcedureInstanceReportType
  **/

  public String getCardCollectionsProcedureInstanceReportType() {
    return cardCollectionsProcedureInstanceReportType;
  }

  public void setCardCollectionsProcedureInstanceReportType(String cardCollectionsProcedureInstanceReportType) {
    this.cardCollectionsProcedureInstanceReportType = cardCollectionsProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cardCollectionsProcedureInstanceReport
  **/

  public Object getCardCollectionsProcedureInstanceReport() {
    return cardCollectionsProcedureInstanceReport;
  }

  public void setCardCollectionsProcedureInstanceReport(Object cardCollectionsProcedureInstanceReport) {
    this.cardCollectionsProcedureInstanceReport = cardCollectionsProcedureInstanceReport;
  }


}

