package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentTermsExchangeInputModelPaymentTermsExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQPaymentTermsExchangeInputModel
 */
public class BQPaymentTermsExchangeInputModel   {
  private String cardCollectionsProcedureInstanceReference = null;

  private String paymentTermsInstanceReference = null;

  private Object paymentTermsExchangeActionTaskRecord = null;

  private BQPaymentTermsExchangeInputModelPaymentTermsExchangeActionRequest paymentTermsExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Card Collections Procedure instance 
   * @return cardCollectionsProcedureInstanceReference
  **/

  public String getCardCollectionsProcedureInstanceReference() {
    return cardCollectionsProcedureInstanceReference;
  }

  public void setCardCollectionsProcedureInstanceReference(String cardCollectionsProcedureInstanceReference) {
    this.cardCollectionsProcedureInstanceReference = cardCollectionsProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payment Terms instance 
   * @return paymentTermsInstanceReference
  **/

  public String getPaymentTermsInstanceReference() {
    return paymentTermsInstanceReference;
  }

  public void setPaymentTermsInstanceReference(String paymentTermsInstanceReference) {
    this.paymentTermsInstanceReference = paymentTermsInstanceReference;
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
   * Get paymentTermsExchangeActionRequest
   * @return paymentTermsExchangeActionRequest
  **/

  public BQPaymentTermsExchangeInputModelPaymentTermsExchangeActionRequest getPaymentTermsExchangeActionRequest() {
    return paymentTermsExchangeActionRequest;
  }

  public void setPaymentTermsExchangeActionRequest(BQPaymentTermsExchangeInputModelPaymentTermsExchangeActionRequest paymentTermsExchangeActionRequest) {
    this.paymentTermsExchangeActionRequest = paymentTermsExchangeActionRequest;
  }


}

