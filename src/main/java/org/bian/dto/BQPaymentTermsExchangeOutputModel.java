package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentTermsExchangeOutputModel
 */
public class BQPaymentTermsExchangeOutputModel   {
  private String paymentTermsExchangeActionTaskReference = null;

  private Object paymentTermsExchangeActionTaskRecord = null;

  private String paymentTermsExchangeActionResponse = null;

  private String paymentTermsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment Terms instance exchange service call 
   * @return paymentTermsExchangeActionTaskReference
  **/

  public String getPaymentTermsExchangeActionTaskReference() {
    return paymentTermsExchangeActionTaskReference;
  }

  public void setPaymentTermsExchangeActionTaskReference(String paymentTermsExchangeActionTaskReference) {
    this.paymentTermsExchangeActionTaskReference = paymentTermsExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return paymentTermsExchangeActionTaskRecord
  **/

  public Object getPaymentTermsExchangeActionTaskRecord() {
    return paymentTermsExchangeActionTaskRecord;
  }

  public void setPaymentTermsExchangeActionTaskRecord(Object paymentTermsExchangeActionTaskRecord) {
    this.paymentTermsExchangeActionTaskRecord = paymentTermsExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return paymentTermsExchangeActionResponse
  **/

  public String getPaymentTermsExchangeActionResponse() {
    return paymentTermsExchangeActionResponse;
  }

  public void setPaymentTermsExchangeActionResponse(String paymentTermsExchangeActionResponse) {
    this.paymentTermsExchangeActionResponse = paymentTermsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payment Terms instance (e.g. accepted, rejected, verified) 
   * @return paymentTermsInstanceStatus
  **/

  public String getPaymentTermsInstanceStatus() {
    return paymentTermsInstanceStatus;
  }

  public void setPaymentTermsInstanceStatus(String paymentTermsInstanceStatus) {
    this.paymentTermsInstanceStatus = paymentTermsInstanceStatus;
  }


}

