package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentRetrieveOutputModelCardCollectionsProcedureInstanceRecordPaymentTransactions;

import javax.validation.Valid;
  
/**
 * BQPaymentRetrieveOutputModelCardCollectionsProcedureInstanceRecord
 */
public class BQPaymentRetrieveOutputModelCardCollectionsProcedureInstanceRecord   {
  private String productInstanceReference = null;

  private String productServiceType = null;

  private String customerReference = null;

  private String cardType = null;

  private String cardAccountStatus = null;

  private BQPaymentRetrieveOutputModelCardCollectionsProcedureInstanceRecordPaymentTransactions paymentTransactions = null;

  private String cardCollectionsProcessingSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated product instance in collections 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of product 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of card 
   * @return cardType
  **/

  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the account (e.g. active, cancelled, blocked, closed,...) 
   * @return cardAccountStatus
  **/

  public String getCardAccountStatus() {
    return cardAccountStatus;
  }

  public void setCardAccountStatus(String cardAccountStatus) {
    this.cardAccountStatus = cardAccountStatus;
  }


  /**
   * Get paymentTransactions
   * @return paymentTransactions
  **/

  public BQPaymentRetrieveOutputModelCardCollectionsProcedureInstanceRecordPaymentTransactions getPaymentTransactions() {
    return paymentTransactions;
  }

  public void setPaymentTransactions(BQPaymentRetrieveOutputModelCardCollectionsProcedureInstanceRecordPaymentTransactions paymentTransactions) {
    this.paymentTransactions = paymentTransactions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing schedule for resolution of the collections process and final decision 
   * @return cardCollectionsProcessingSchedule
  **/

  public String getCardCollectionsProcessingSchedule() {
    return cardCollectionsProcessingSchedule;
  }

  public void setCardCollectionsProcessingSchedule(String cardCollectionsProcessingSchedule) {
    this.cardCollectionsProcessingSchedule = cardCollectionsProcessingSchedule;
  }


}

