package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceRecordStatements
 */
public class CRCardCollectionsProcedureRetrieveOutputModelCardCollectionsProcedureInstanceRecordStatements   {
  private String statementsReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to individual statements 
   * @return statementsReference
  **/

  public String getStatementsReference() {
    return statementsReference;
  }

  public void setStatementsReference(String statementsReference) {
    this.statementsReference = statementsReference;
  }


}

