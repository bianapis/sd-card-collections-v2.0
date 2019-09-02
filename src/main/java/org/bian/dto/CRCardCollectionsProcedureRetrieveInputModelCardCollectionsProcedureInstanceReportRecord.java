package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceReportRecord
 */
public class CRCardCollectionsProcedureRetrieveInputModelCardCollectionsProcedureInstanceReportRecord   {
  private String cardCollectionsProcedureInstanceReportReference = null;

  private String cardCollectionsProcedureInstanceReportType = null;

  private String cardCollectionsProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cardCollectionsProcedureInstanceReportReference
  **/

  public String getCardCollectionsProcedureInstanceReportReference() {
    return cardCollectionsProcedureInstanceReportReference;
  }

  public void setCardCollectionsProcedureInstanceReportReference(String cardCollectionsProcedureInstanceReportReference) {
    this.cardCollectionsProcedureInstanceReportReference = cardCollectionsProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cardCollectionsProcedureInstanceReportParameters
  **/

  public String getCardCollectionsProcedureInstanceReportParameters() {
    return cardCollectionsProcedureInstanceReportParameters;
  }

  public void setCardCollectionsProcedureInstanceReportParameters(String cardCollectionsProcedureInstanceReportParameters) {
    this.cardCollectionsProcedureInstanceReportParameters = cardCollectionsProcedureInstanceReportParameters;
  }


}

