package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceReport
 */
public class BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceReport   {
  private Object paymentTermsInstanceReportRecord = null;

  private String paymentTermsInstanceReportType = null;

  private String paymentTermsInstanceReportParameters = null;

  private Object paymentTermsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return paymentTermsInstanceReportRecord
  **/

  public Object getPaymentTermsInstanceReportRecord() {
    return paymentTermsInstanceReportRecord;
  }

  public void setPaymentTermsInstanceReportRecord(Object paymentTermsInstanceReportRecord) {
    this.paymentTermsInstanceReportRecord = paymentTermsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentTermsInstanceReportType
  **/

  public String getPaymentTermsInstanceReportType() {
    return paymentTermsInstanceReportType;
  }

  public void setPaymentTermsInstanceReportType(String paymentTermsInstanceReportType) {
    this.paymentTermsInstanceReportType = paymentTermsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return paymentTermsInstanceReportParameters
  **/

  public String getPaymentTermsInstanceReportParameters() {
    return paymentTermsInstanceReportParameters;
  }

  public void setPaymentTermsInstanceReportParameters(String paymentTermsInstanceReportParameters) {
    this.paymentTermsInstanceReportParameters = paymentTermsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return paymentTermsInstanceReport
  **/

  public Object getPaymentTermsInstanceReport() {
    return paymentTermsInstanceReport;
  }

  public void setPaymentTermsInstanceReport(Object paymentTermsInstanceReport) {
    this.paymentTermsInstanceReport = paymentTermsInstanceReport;
  }


}

