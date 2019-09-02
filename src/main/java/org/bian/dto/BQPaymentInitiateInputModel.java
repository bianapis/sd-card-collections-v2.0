package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentInitiateInputModelCardCollectionsProcedureInstanceRecord;
import org.bian.dto.BQPaymentInitiateInputModelPaymentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentInitiateInputModel
 */
public class BQPaymentInitiateInputModel   {
  private BQPaymentInitiateInputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;

  private String cardCollectionsProcedureInstanceReference = null;

  private Object paymentInitiateActionRecord = null;

  private BQPaymentInitiateInputModelPaymentInstanceRecord paymentInstanceRecord = null;


  /**
   * Get cardCollectionsProcedureInstanceRecord
   * @return cardCollectionsProcedureInstanceRecord
  **/

  public BQPaymentInitiateInputModelCardCollectionsProcedureInstanceRecord getCardCollectionsProcedureInstanceRecord() {
    return cardCollectionsProcedureInstanceRecord;
  }

  public void setCardCollectionsProcedureInstanceRecord(BQPaymentInitiateInputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord) {
    this.cardCollectionsProcedureInstanceRecord = cardCollectionsProcedureInstanceRecord;
  }


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
   * Get paymentInstanceRecord
   * @return paymentInstanceRecord
  **/

  public BQPaymentInitiateInputModelPaymentInstanceRecord getPaymentInstanceRecord() {
    return paymentInstanceRecord;
  }

  public void setPaymentInstanceRecord(BQPaymentInitiateInputModelPaymentInstanceRecord paymentInstanceRecord) {
    this.paymentInstanceRecord = paymentInstanceRecord;
  }


}

