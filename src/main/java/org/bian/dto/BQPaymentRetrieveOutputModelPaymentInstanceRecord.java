package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentRetrieveOutputModelPaymentInstanceRecord
 */
public class BQPaymentRetrieveOutputModelPaymentInstanceRecord   {
  private String paymentTransactionReference = null;

  private String paymentTransaction = null;

  private Object cardCollectionsPaymentNotificationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the received payment 
   * @return paymentTransactionReference
  **/

  public String getPaymentTransactionReference() {
    return paymentTransactionReference;
  }

  public void setPaymentTransactionReference(String paymentTransactionReference) {
    this.paymentTransactionReference = paymentTransactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Payment transaction details 
   * @return paymentTransaction
  **/

  public String getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Processing record received for payments made against the collections account 
   * @return cardCollectionsPaymentNotificationRecord
  **/

  public Object getCardCollectionsPaymentNotificationRecord() {
    return cardCollectionsPaymentNotificationRecord;
  }

  public void setCardCollectionsPaymentNotificationRecord(Object cardCollectionsPaymentNotificationRecord) {
    this.cardCollectionsPaymentNotificationRecord = cardCollectionsPaymentNotificationRecord;
  }


}

