package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordBillingTransactions;
import org.bian.dto.CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordPaymentTransactions;
import org.bian.dto.CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordProductTransactions;
import org.bian.dto.CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordStatements;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecord
 */
public class CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecord   {
  private String productInstanceReference = null;

  private String productServiceType = null;

  private String customerReference = null;

  private String cardType = null;

  private String cardAccountStatus = null;

  private String cardAccountLimits = null;

  private String configurationOptions = null;

  private String taxReference = null;

  private CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordBillingTransactions billingTransactions = null;

  private CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordPaymentTransactions paymentTransactions = null;

  private CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordProductTransactions productTransactions = null;

  private CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordStatements statements = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Card account limits (e.g. spend limits and credit limits for different access types, e.g. POS/ATM) 
   * @return cardAccountLimits
  **/

  public String getCardAccountLimits() {
    return cardAccountLimits;
  }

  public void setCardAccountLimits(String cardAccountLimits) {
    this.cardAccountLimits = cardAccountLimits;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A wide range of processing options and rules that apply, including the applicable delinquency penalties‚Äö√Ñ¬∂ 
   * @return configurationOptions
  **/

  public String getConfigurationOptions() {
    return configurationOptions;
  }

  public void setConfigurationOptions(String configurationOptions) {
    this.configurationOptions = configurationOptions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * Get billingTransactions
   * @return billingTransactions
  **/

  public CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordBillingTransactions getBillingTransactions() {
    return billingTransactions;
  }

  public void setBillingTransactions(CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordBillingTransactions billingTransactions) {
    this.billingTransactions = billingTransactions;
  }


  /**
   * Get paymentTransactions
   * @return paymentTransactions
  **/

  public CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordPaymentTransactions getPaymentTransactions() {
    return paymentTransactions;
  }

  public void setPaymentTransactions(CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordPaymentTransactions paymentTransactions) {
    this.paymentTransactions = paymentTransactions;
  }


  /**
   * Get productTransactions
   * @return productTransactions
  **/

  public CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordProductTransactions getProductTransactions() {
    return productTransactions;
  }

  public void setProductTransactions(CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordProductTransactions productTransactions) {
    this.productTransactions = productTransactions;
  }


  /**
   * Get statements
   * @return statements
  **/

  public CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordStatements getStatements() {
    return statements;
  }

  public void setStatements(CRCardCollectionsProcedureExecuteInputModelCardCollectionsProcedureInstanceRecordStatements statements) {
    this.statements = statements;
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

