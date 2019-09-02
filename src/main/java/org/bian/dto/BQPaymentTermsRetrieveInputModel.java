package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentTermsRetrieveInputModelPaymentTermsInstanceAnalysis;
import org.bian.dto.BQPaymentTermsRetrieveInputModelPaymentTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentTermsRetrieveInputModel
 */
public class BQPaymentTermsRetrieveInputModel   {
  private Object paymentTermsRetrieveActionTaskRecord = null;

  private String paymentTermsRetrieveActionRequest = null;

  private BQPaymentTermsRetrieveInputModelPaymentTermsInstanceReport paymentTermsInstanceReport = null;

  private BQPaymentTermsRetrieveInputModelPaymentTermsInstanceAnalysis paymentTermsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentTermsRetrieveActionTaskRecord
  **/

  public Object getPaymentTermsRetrieveActionTaskRecord() {
    return paymentTermsRetrieveActionTaskRecord;
  }

  public void setPaymentTermsRetrieveActionTaskRecord(Object paymentTermsRetrieveActionTaskRecord) {
    this.paymentTermsRetrieveActionTaskRecord = paymentTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentTermsRetrieveActionRequest
  **/

  public String getPaymentTermsRetrieveActionRequest() {
    return paymentTermsRetrieveActionRequest;
  }

  public void setPaymentTermsRetrieveActionRequest(String paymentTermsRetrieveActionRequest) {
    this.paymentTermsRetrieveActionRequest = paymentTermsRetrieveActionRequest;
  }


  /**
   * Get paymentTermsInstanceReport
   * @return paymentTermsInstanceReport
  **/

  public BQPaymentTermsRetrieveInputModelPaymentTermsInstanceReport getPaymentTermsInstanceReport() {
    return paymentTermsInstanceReport;
  }

  public void setPaymentTermsInstanceReport(BQPaymentTermsRetrieveInputModelPaymentTermsInstanceReport paymentTermsInstanceReport) {
    this.paymentTermsInstanceReport = paymentTermsInstanceReport;
  }


  /**
   * Get paymentTermsInstanceAnalysis
   * @return paymentTermsInstanceAnalysis
  **/

  public BQPaymentTermsRetrieveInputModelPaymentTermsInstanceAnalysis getPaymentTermsInstanceAnalysis() {
    return paymentTermsInstanceAnalysis;
  }

  public void setPaymentTermsInstanceAnalysis(BQPaymentTermsRetrieveInputModelPaymentTermsInstanceAnalysis paymentTermsInstanceAnalysis) {
    this.paymentTermsInstanceAnalysis = paymentTermsInstanceAnalysis;
  }


}

