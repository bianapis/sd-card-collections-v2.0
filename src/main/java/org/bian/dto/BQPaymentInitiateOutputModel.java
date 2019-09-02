package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentInitiateOutputModel
 */
public class BQPaymentInitiateOutputModel   {
  private CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;

  private String paymentInstanceReference = null;

  private String paymentInitiateActionReference = null;

  private Object paymentInitiateActionRecord = null;

  private String paymentInstanceStatus = null;


  /**
   * Get cardCollectionsProcedureInstanceRecord
   * @return cardCollectionsProcedureInstanceRecord
  **/

  public CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord getCardCollectionsProcedureInstanceRecord() {
    return cardCollectionsProcedureInstanceRecord;
  }

  public void setCardCollectionsProcedureInstanceRecord(CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord) {
    this.cardCollectionsProcedureInstanceRecord = cardCollectionsProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payment instance 
   * @return paymentInstanceReference
  **/

  public String getPaymentInstanceReference() {
    return paymentInstanceReference;
  }

  public void setPaymentInstanceReference(String paymentInstanceReference) {
    this.paymentInstanceReference = paymentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return paymentInitiateActionReference
  **/

  public String getPaymentInitiateActionReference() {
    return paymentInitiateActionReference;
  }

  public void setPaymentInitiateActionReference(String paymentInitiateActionReference) {
    this.paymentInitiateActionReference = paymentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return paymentInitiateActionRecord
  **/

  public Object getPaymentInitiateActionRecord() {
    return paymentInitiateActionRecord;
  }

  public void setPaymentInitiateActionRecord(Object paymentInitiateActionRecord) {
    this.paymentInitiateActionRecord = paymentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payment instance (e.g. initialised, pending, active) 
   * @return paymentInstanceStatus
  **/

  public String getPaymentInstanceStatus() {
    return paymentInstanceStatus;
  }

  public void setPaymentInstanceStatus(String paymentInstanceStatus) {
    this.paymentInstanceStatus = paymentInstanceStatus;
  }


}

