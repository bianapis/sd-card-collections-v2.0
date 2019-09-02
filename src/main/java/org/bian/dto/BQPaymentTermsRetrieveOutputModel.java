package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentTermsRetrieveOutputModelCardCollectionsProcedureInstanceRecord;
import org.bian.dto.BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceAnalysis;
import org.bian.dto.BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceRecord;
import org.bian.dto.BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentTermsRetrieveOutputModel
 */
public class BQPaymentTermsRetrieveOutputModel   {
  private BQPaymentTermsRetrieveOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord = null;

  private BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceRecord paymentTermsInstanceRecord = null;

  private String paymentTermsRetrieveActionTaskReference = null;

  private Object paymentTermsRetrieveActionTaskRecord = null;

  private String paymentTermsRetrieveActionResponse = null;

  private BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceReport paymentTermsInstanceReport = null;

  private BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceAnalysis paymentTermsInstanceAnalysis = null;


  /**
   * Get cardCollectionsProcedureInstanceRecord
   * @return cardCollectionsProcedureInstanceRecord
  **/

  public BQPaymentTermsRetrieveOutputModelCardCollectionsProcedureInstanceRecord getCardCollectionsProcedureInstanceRecord() {
    return cardCollectionsProcedureInstanceRecord;
  }

  public void setCardCollectionsProcedureInstanceRecord(BQPaymentTermsRetrieveOutputModelCardCollectionsProcedureInstanceRecord cardCollectionsProcedureInstanceRecord) {
    this.cardCollectionsProcedureInstanceRecord = cardCollectionsProcedureInstanceRecord;
  }


  /**
   * Get paymentTermsInstanceRecord
   * @return paymentTermsInstanceRecord
  **/

  public BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceRecord getPaymentTermsInstanceRecord() {
    return paymentTermsInstanceRecord;
  }

  public void setPaymentTermsInstanceRecord(BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceRecord paymentTermsInstanceRecord) {
    this.paymentTermsInstanceRecord = paymentTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment Terms instance retrieve service call 
   * @return paymentTermsRetrieveActionTaskReference
  **/

  public String getPaymentTermsRetrieveActionTaskReference() {
    return paymentTermsRetrieveActionTaskReference;
  }

  public void setPaymentTermsRetrieveActionTaskReference(String paymentTermsRetrieveActionTaskReference) {
    this.paymentTermsRetrieveActionTaskReference = paymentTermsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentTermsRetrieveActionTaskRecord
  **/

  public Object getPaymentTermsRetrieveActionTaskRecord() {
    return paymentTermsRetrieveActionTaskRecord;
  }

  public void setPaymentTermsRetrieveActionTaskRecord(Object paymentTermsRetrieveActionTaskRecord) {
    this.paymentTermsRetrieveActionTaskRecord = paymentTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return paymentTermsRetrieveActionResponse
  **/

  public String getPaymentTermsRetrieveActionResponse() {
    return paymentTermsRetrieveActionResponse;
  }

  public void setPaymentTermsRetrieveActionResponse(String paymentTermsRetrieveActionResponse) {
    this.paymentTermsRetrieveActionResponse = paymentTermsRetrieveActionResponse;
  }


  /**
   * Get paymentTermsInstanceReport
   * @return paymentTermsInstanceReport
  **/

  public BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceReport getPaymentTermsInstanceReport() {
    return paymentTermsInstanceReport;
  }

  public void setPaymentTermsInstanceReport(BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceReport paymentTermsInstanceReport) {
    this.paymentTermsInstanceReport = paymentTermsInstanceReport;
  }


  /**
   * Get paymentTermsInstanceAnalysis
   * @return paymentTermsInstanceAnalysis
  **/

  public BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceAnalysis getPaymentTermsInstanceAnalysis() {
    return paymentTermsInstanceAnalysis;
  }

  public void setPaymentTermsInstanceAnalysis(BQPaymentTermsRetrieveOutputModelPaymentTermsInstanceAnalysis paymentTermsInstanceAnalysis) {
    this.paymentTermsInstanceAnalysis = paymentTermsInstanceAnalysis;
  }


}

