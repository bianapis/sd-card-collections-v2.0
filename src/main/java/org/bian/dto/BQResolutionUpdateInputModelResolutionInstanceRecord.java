package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResolutionUpdateInputModelResolutionInstanceRecord
 */
public class BQResolutionUpdateInputModelResolutionInstanceRecord   {
  private String cardCollectionsResolutionDecision = null;

  private String cardCollectionsResolutionWorkProduct = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the resolution decision 
   * @return cardCollectionsResolutionDecision
  **/

  public String getCardCollectionsResolutionDecision() {
    return cardCollectionsResolutionDecision;
  }

  public void setCardCollectionsResolutionDecision(String cardCollectionsResolutionDecision) {
    this.cardCollectionsResolutionDecision = cardCollectionsResolutionDecision;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the task 
   * @return cardCollectionsResolutionWorkProduct
  **/

  public String getCardCollectionsResolutionWorkProduct() {
    return cardCollectionsResolutionWorkProduct;
  }

  public void setCardCollectionsResolutionWorkProduct(String cardCollectionsResolutionWorkProduct) {
    this.cardCollectionsResolutionWorkProduct = cardCollectionsResolutionWorkProduct;
  }


}

