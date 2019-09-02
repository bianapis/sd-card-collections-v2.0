package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentTermsRetrieveInputModelPaymentTermsInstanceAnalysis
 */
public class BQPaymentTermsRetrieveInputModelPaymentTermsInstanceAnalysis   {
  private String paymentTermsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return paymentTermsInstanceAnalysisReference
  **/

  public String getPaymentTermsInstanceAnalysisReference() {
    return paymentTermsInstanceAnalysisReference;
  }

  public void setPaymentTermsInstanceAnalysisReference(String paymentTermsInstanceAnalysisReference) {
    this.paymentTermsInstanceAnalysisReference = paymentTermsInstanceAnalysisReference;
  }


}

