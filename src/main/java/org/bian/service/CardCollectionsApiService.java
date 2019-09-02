/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardCollectionsApiService {

	SDCardCollectionsActivateOutputModel activate(SDCardCollectionsActivateInputModel request);
	
	SDCardCollectionsConfigureOutputModel configure(String sdReferenceId, SDCardCollectionsConfigureInputModel request);
	
	CRCardCollectionsProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCardCollectionsProcedureControlInputModel request);
	
	BQPaymentTermsExchangeOutputModel exchangePaymentterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentTermsExchangeInputModel request);
	
	BQPaymentExchangeOutputModel exchangePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentExchangeInputModel request);
	
	CRCardCollectionsProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCardCollectionsProcedureExecuteInputModel request);
	
	SDCardCollectionsFeedbackOutputModel feedback(String sdReferenceId, SDCardCollectionsFeedbackInputModel request);
	
	CRCardCollectionsProcedureInitiateOutputModel initiate(String sdReferenceId, CRCardCollectionsProcedureInitiateInputModel request);
	
	BQPaymentInitiateOutputModel initiatePayment(String sdReferenceId, String crReferenceId, BQPaymentInitiateInputModel request);
	
	CRCardCollectionsProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCardCollectionsProcedureRequestInputModel request);
	
	CRCardCollectionsProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentRetrieveOutputModel retrievePayment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentTermsRetrieveOutputModel retrievePaymentterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQResolutionRetrieveOutputModel retrieveResolution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCardCollectionsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCardCollectionsProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardCollectionsProcedureUpdateInputModel request);
	
	BQPaymentUpdateOutputModel updatePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentUpdateInputModel request);
	
	BQResolutionUpdateOutputModel updateResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionUpdateInputModel request);
	
}
