package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentTermsRetrieveInputModelPaymentTermsInstanceReport
 */
public class BQPaymentTermsRetrieveInputModelPaymentTermsInstanceReport   {
  private String paymentTermsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return paymentTermsInstanceReportReference
  **/

  public String getPaymentTermsInstanceReportReference() {
    return paymentTermsInstanceReportReference;
  }

  public void setPaymentTermsInstanceReportReference(String paymentTermsInstanceReportReference) {
    this.paymentTermsInstanceReportReference = paymentTermsInstanceReportReference;
  }


}

