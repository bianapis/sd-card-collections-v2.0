package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceRecordCardCollectionsPaymentTermsContactRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceRecord
 */
public class BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceRecord   {
  private BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceRecordCardCollectionsPaymentTermsContactRecord cardCollectionsPaymentTermsContactRecord = null;

  private String cardCollectionsPaymentTermsRenegotiationDecision = null;

  private String cardCollectionsPaymentTermsWorkProduct = null;


  /**
   * Get cardCollectionsPaymentTermsContactRecord
   * @return cardCollectionsPaymentTermsContactRecord
  **/

  public BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceRecordCardCollectionsPaymentTermsContactRecord getCardCollectionsPaymentTermsContactRecord() {
    return cardCollectionsPaymentTermsContactRecord;
  }

  public void setCardCollectionsPaymentTermsContactRecord(BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceRecordCardCollectionsPaymentTermsContactRecord cardCollectionsPaymentTermsContactRecord) {
    this.cardCollectionsPaymentTermsContactRecord = cardCollectionsPaymentTermsContactRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The payment terms renegotiation decision, includes renegotiated terms and repayment schedule 
   * @return cardCollectionsPaymentTermsRenegotiationDecision
  **/

  public String getCardCollectionsPaymentTermsRenegotiationDecision() {
    return cardCollectionsPaymentTermsRenegotiationDecision;
  }

  public void setCardCollectionsPaymentTermsRenegotiationDecision(String cardCollectionsPaymentTermsRenegotiationDecision) {
    this.cardCollectionsPaymentTermsRenegotiationDecision = cardCollectionsPaymentTermsRenegotiationDecision;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the task 
   * @return cardCollectionsPaymentTermsWorkProduct
  **/

  public String getCardCollectionsPaymentTermsWorkProduct() {
    return cardCollectionsPaymentTermsWorkProduct;
  }

  public void setCardCollectionsPaymentTermsWorkProduct(String cardCollectionsPaymentTermsWorkProduct) {
    this.cardCollectionsPaymentTermsWorkProduct = cardCollectionsPaymentTermsWorkProduct;
  }


}

