package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord
 */
public class CRCardCollectionsProcedureInitiateOutputModelCardCollectionsProcedureInstanceRecord   {
  private String cardCollectionsProcessingSchedule = null;


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

