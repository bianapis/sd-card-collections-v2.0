package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceAnalysis
 */
public class CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceAnalysis   {
  private String cardCollectionsProcedureInstanceAnalysisReference = null;

  private String cardCollectionsProcedureInstanceAnalysisReportType = null;

  private String cardCollectionsProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cardCollectionsProcedureInstanceAnalysisReference
  **/

  public String getCardCollectionsProcedureInstanceAnalysisReference() {
    return cardCollectionsProcedureInstanceAnalysisReference;
  }

  public void setCardCollectionsProcedureInstanceAnalysisReference(String cardCollectionsProcedureInstanceAnalysisReference) {
    this.cardCollectionsProcedureInstanceAnalysisReference = cardCollectionsProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cardCollectionsProcedureInstanceAnalysisParameters
  **/

  public String getCardCollectionsProcedureInstanceAnalysisParameters() {
    return cardCollectionsProcedureInstanceAnalysisParameters;
  }

  public void setCardCollectionsProcedureInstanceAnalysisParameters(String cardCollectionsProcedureInstanceAnalysisParameters) {
    this.cardCollectionsProcedureInstanceAnalysisParameters = cardCollectionsProcedureInstanceAnalysisParameters;
  }


}

