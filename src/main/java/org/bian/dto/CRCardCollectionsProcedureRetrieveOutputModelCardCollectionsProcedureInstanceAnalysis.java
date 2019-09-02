package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceAnalysis
 */
public class CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceAnalysis   {
  private String cardCollectionsProcedureInstanceAnalysisData = null;

  private String cardCollectionsProcedureInstanceAnalysisReportType = null;

  private Object cardCollectionsProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cardCollectionsProcedureInstanceAnalysisData
  **/

  public String getCardCollectionsProcedureInstanceAnalysisData() {
    return cardCollectionsProcedureInstanceAnalysisData;
  }

  public void setCardCollectionsProcedureInstanceAnalysisData(String cardCollectionsProcedureInstanceAnalysisData) {
    this.cardCollectionsProcedureInstanceAnalysisData = cardCollectionsProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cardCollectionsProcedureInstanceAnalysisReportType
  **/

  public String getCardCollectionsProcedureInstanceAnalysisReportType() {
    return cardCollectionsProcedureInstanceAnalysisReportType;
  }

  public void setCardCollectionsProcedureInstanceAnalysisReportType(String cardCollectionsProcedureInstanceAnalysisReportType) {
    this.cardCollectionsProcedureInstanceAnalysisReportType = cardCollectionsProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cardCollectionsProcedureInstanceAnalysisReport
  **/

  public Object getCardCollectionsProcedureInstanceAnalysisReport() {
    return cardCollectionsProcedureInstanceAnalysisReport;
  }

  public void setCardCollectionsProcedureInstanceAnalysisReport(Object cardCollectionsProcedureInstanceAnalysisReport) {
    this.cardCollectionsProcedureInstanceAnalysisReport = cardCollectionsProcedureInstanceAnalysisReport;
  }


}

