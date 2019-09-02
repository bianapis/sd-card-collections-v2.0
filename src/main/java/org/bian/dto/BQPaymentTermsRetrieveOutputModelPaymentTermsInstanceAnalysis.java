package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceAnalysis
 */
public class BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceAnalysis   {
  private Object paymentTermsInstanceAnalysisRecord = null;

  private String paymentTermsInstanceAnalysisReportType = null;

  private String paymentTermsInstanceAnalysisParameters = null;

  private Object paymentTermsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return paymentTermsInstanceAnalysisRecord
  **/

  public Object getPaymentTermsInstanceAnalysisRecord() {
    return paymentTermsInstanceAnalysisRecord;
  }

  public void setPaymentTermsInstanceAnalysisRecord(Object paymentTermsInstanceAnalysisRecord) {
    this.paymentTermsInstanceAnalysisRecord = paymentTermsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return paymentTermsInstanceAnalysisReportType
  **/

  public String getPaymentTermsInstanceAnalysisReportType() {
    return paymentTermsInstanceAnalysisReportType;
  }

  public void setPaymentTermsInstanceAnalysisReportType(String paymentTermsInstanceAnalysisReportType) {
    this.paymentTermsInstanceAnalysisReportType = paymentTermsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return paymentTermsInstanceAnalysisParameters
  **/

  public String getPaymentTermsInstanceAnalysisParameters() {
    return paymentTermsInstanceAnalysisParameters;
  }

  public void setPaymentTermsInstanceAnalysisParameters(String paymentTermsInstanceAnalysisParameters) {
    this.paymentTermsInstanceAnalysisParameters = paymentTermsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return paymentTermsInstanceAnalysisReport
  **/

  public Object getPaymentTermsInstanceAnalysisReport() {
    return paymentTermsInstanceAnalysisReport;
  }

  public void setPaymentTermsInstanceAnalysisReport(Object paymentTermsInstanceAnalysisReport) {
    this.paymentTermsInstanceAnalysisReport = paymentTermsInstanceAnalysisReport;
  }


}

