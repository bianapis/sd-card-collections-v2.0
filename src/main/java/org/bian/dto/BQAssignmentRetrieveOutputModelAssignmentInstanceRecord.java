package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssignmentRetrieveOutputModelAssignmentInstanceRecord
 */
public class BQAssignmentRetrieveOutputModelAssignmentInstanceRecord   {
  private String customerCreditRatingAssessmentInstanceReference = null;

  private String customerCreditRatingAssessment = null;

  private String collectionAgencyReference = null;

  private String collectionAgencyAgreement = null;

  private String cardCollectionsAssignmentDecision = null;

  private String cardCollectionsAssignmentWorkProduct = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the bank's credit assessment for the customer 
   * @return customerCreditRatingAssessmentInstanceReference
  **/

  public String getCustomerCreditRatingAssessmentInstanceReference() {
    return customerCreditRatingAssessmentInstanceReference;
  }

  public void setCustomerCreditRatingAssessmentInstanceReference(String customerCreditRatingAssessmentInstanceReference) {
    this.customerCreditRatingAssessmentInstanceReference = customerCreditRatingAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The internal bank credit rating/assessment 
   * @return customerCreditRatingAssessment
  **/

  public String getCustomerCreditRatingAssessment() {
    return customerCreditRatingAssessment;
  }

  public void setCustomerCreditRatingAssessment(String customerCreditRatingAssessment) {
    this.customerCreditRatingAssessment = customerCreditRatingAssessment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an established external collections service agency 
   * @return collectionAgencyReference
  **/

  public String getCollectionAgencyReference() {
    return collectionAgencyReference;
  }

  public void setCollectionAgencyReference(String collectionAgencyReference) {
    this.collectionAgencyReference = collectionAgencyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The terms and conditions governing the use of the collections agency  
   * @return collectionAgencyAgreement
  **/

  public String getCollectionAgencyAgreement() {
    return collectionAgencyAgreement;
  }

  public void setCollectionAgencyAgreement(String collectionAgencyAgreement) {
    this.collectionAgencyAgreement = collectionAgencyAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the assignment decision 
   * @return cardCollectionsAssignmentDecision
  **/

  public String getCardCollectionsAssignmentDecision() {
    return cardCollectionsAssignmentDecision;
  }

  public void setCardCollectionsAssignmentDecision(String cardCollectionsAssignmentDecision) {
    this.cardCollectionsAssignmentDecision = cardCollectionsAssignmentDecision;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the task 
   * @return cardCollectionsAssignmentWorkProduct
  **/

  public String getCardCollectionsAssignmentWorkProduct() {
    return cardCollectionsAssignmentWorkProduct;
  }

  public void setCardCollectionsAssignmentWorkProduct(String cardCollectionsAssignmentWorkProduct) {
    this.cardCollectionsAssignmentWorkProduct = cardCollectionsAssignmentWorkProduct;
  }


}

