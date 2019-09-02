package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentRetrieveOutputModelAssignmentInstanceAnalysis;
import org.bian.dto.BQAssignmentRetrieveOutputModelAssignmentInstanceRecord;
import org.bian.dto.BQAssignmentRetrieveOutputModelAssignmentInstanceReport;
import org.bian.dto.BQAssignmentRetrieveOutputModelCardCollectionsProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentRetrieveOutputModel
 */
public class BQAssignmentRetrieveOutputModel   {
  private BQAssignmentRetrieveOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;

  private BQAssignmentRetrieveOutputModelAssignmentInstanceRecord assignmentInstanceRecord = null;

  private String assignmentRetrieveActionTaskReference = null;

  private Object assignmentRetrieveActionTaskRecord = null;

  private String assignmentRetrieveActionResponse = null;

  private BQAssignmentRetrieveOutputModelAssignmentInstanceReport assignmentInstanceReport = null;

  private BQAssignmentRetrieveOutputModelAssignmentInstanceAnalysis assignmentInstanceAnalysis = null;


  /**
   * Get cardCollectionsProcedureInstanceRecord
   * @return cardCollectionsProcedureInstanceRecord
  **/

  public BQAssignmentRetrieveOutputModelCardCollectionsProcedureInstanceRecord getCardCollectionsProcedureInstanceRecord() {
    return cardCollectionsProcedureInstanceRecord;
  }

  public void setCardCollectionsProcedureInstanceRecord(BQAssignmentRetrieveOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord) {
    this.cardCollectionsProcedureInstanceRecord = cardCollectionsProcedureInstanceRecord;
  }


  /**
   * Get assignmentInstanceRecord
   * @return assignmentInstanceRecord
  **/

  public BQAssignmentRetrieveOutputModelAssignmentInstanceRecord getAssignmentInstanceRecord() {
    return assignmentInstanceRecord;
  }

  public void setAssignmentInstanceRecord(BQAssignmentRetrieveOutputModelAssignmentInstanceRecord assignmentInstanceRecord) {
    this.assignmentInstanceRecord = assignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Assignment instance retrieve service call 
   * @return assignmentRetrieveActionTaskReference
  **/

  public String getAssignmentRetrieveActionTaskReference() {
    return assignmentRetrieveActionTaskReference;
  }

  public void setAssignmentRetrieveActionTaskReference(String assignmentRetrieveActionTaskReference) {
    this.assignmentRetrieveActionTaskReference = assignmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return assignmentRetrieveActionTaskRecord
  **/

  public Object getAssignmentRetrieveActionTaskRecord() {
    return assignmentRetrieveActionTaskRecord;
  }

  public void setAssignmentRetrieveActionTaskRecord(Object assignmentRetrieveActionTaskRecord) {
    this.assignmentRetrieveActionTaskRecord = assignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return assignmentRetrieveActionResponse
  **/

  public String getAssignmentRetrieveActionResponse() {
    return assignmentRetrieveActionResponse;
  }

  public void setAssignmentRetrieveActionResponse(String assignmentRetrieveActionResponse) {
    this.assignmentRetrieveActionResponse = assignmentRetrieveActionResponse;
  }


  /**
   * Get assignmentInstanceReport
   * @return assignmentInstanceReport
  **/

  public BQAssignmentRetrieveOutputModelAssignmentInstanceReport getAssignmentInstanceReport() {
    return assignmentInstanceReport;
  }

  public void setAssignmentInstanceReport(BQAssignmentRetrieveOutputModelAssignmentInstanceReport assignmentInstanceReport) {
    this.assignmentInstanceReport = assignmentInstanceReport;
  }


  /**
   * Get assignmentInstanceAnalysis
   * @return assignmentInstanceAnalysis
  **/

  public BQAssignmentRetrieveOutputModelAssignmentInstanceAnalysis getAssignmentInstanceAnalysis() {
    return assignmentInstanceAnalysis;
  }

  public void setAssignmentInstanceAnalysis(BQAssignmentRetrieveOutputModelAssignmentInstanceAnalysis assignmentInstanceAnalysis) {
    this.assignmentInstanceAnalysis = assignmentInstanceAnalysis;
  }


}

