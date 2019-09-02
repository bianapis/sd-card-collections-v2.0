/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardCollectionsApiServiceImpl implements CardCollectionsApiService {

	public SDCardCollectionsActivateOutputModel activate(SDCardCollectionsActivateInputModel request){
		return JsonReader.read("activate-SDCardCollectionsActivateOutputModel.json",new TypeReference<SDCardCollectionsActivateOutputModel>(){});
	}
	
	public SDCardCollectionsConfigureOutputModel configure(String sdReferenceId, SDCardCollectionsConfigureInputModel request){
		return JsonReader.read("configure-SDCardCollectionsConfigureOutputModel.json",new TypeReference<SDCardCollectionsConfigureOutputModel>(){});
	}
	
	public CRCardCollectionsProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCardCollectionsProcedureControlInputModel request){
		return JsonReader.read("control-CRCardCollectionsProcedureControlOutputModel.json",new TypeReference<CRCardCollectionsProcedureControlOutputModel>(){});
	}
	
	public BQPaymentTermsExchangeOutputModel exchangePaymentterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentTermsExchangeInputModel request){
		return JsonReader.read("exchange-BQPaymentTermsExchangeOutputModel.json",new TypeReference<BQPaymentTermsExchangeOutputModel>(){});
	}
	
	public BQPaymentExchangeOutputModel exchangePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentExchangeInputModel request){
		return JsonReader.read("exchange-BQPaymentExchangeOutputModel.json",new TypeReference<BQPaymentExchangeOutputModel>(){});
	}
	
	public CRCardCollectionsProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCardCollectionsProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRCardCollectionsProcedureExecuteOutputModel.json",new TypeReference<CRCardCollectionsProcedureExecuteOutputModel>(){});
	}
	
	public SDCardCollectionsFeedbackOutputModel feedback(String sdReferenceId, SDCardCollectionsFeedbackInputModel request){
		return JsonReader.read("feedback-SDCardCollectionsFeedbackOutputModel.json",new TypeReference<SDCardCollectionsFeedbackOutputModel>(){});
	}
	
	public CRCardCollectionsProcedureInitiateOutputModel initiate(String sdReferenceId, CRCardCollectionsProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCardCollectionsProcedureInitiateOutputModel.json",new TypeReference<CRCardCollectionsProcedureInitiateOutputModel>(){});
	}
	
	public BQPaymentInitiateOutputModel initiatePayment(String sdReferenceId, String crReferenceId, BQPaymentInitiateInputModel request){
		return JsonReader.read("initiate-BQPaymentInitiateOutputModel.json",new TypeReference<BQPaymentInitiateOutputModel>(){});
	}
	
	public CRCardCollectionsProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCardCollectionsProcedureRequestInputModel request){
		return JsonReader.read("request-CRCardCollectionsProcedureRequestOutputModel.json",new TypeReference<CRCardCollectionsProcedureRequestOutputModel>(){});
	}
	
	public CRCardCollectionsProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCardCollectionsProcedureRetrieveOutputModel.json",new TypeReference<CRCardCollectionsProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssignmentRetrieveOutputModel.json",new TypeReference<BQAssignmentRetrieveOutputModel>(){});
	}
	
	public BQPaymentRetrieveOutputModel retrievePayment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentRetrieveOutputModel.json",new TypeReference<BQPaymentRetrieveOutputModel>(){});
	}
	
	public BQPaymentTermsRetrieveOutputModel retrievePaymentterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentTermsRetrieveOutputModel.json",new TypeReference<BQPaymentTermsRetrieveOutputModel>(){});
	}
	
	public BQResolutionRetrieveOutputModel retrieveResolution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQResolutionRetrieveOutputModel.json",new TypeReference<BQResolutionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCardCollectionsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCardCollectionsRetrieveOutputModel.json",new TypeReference<SDCardCollectionsRetrieveOutputModel>(){});
	}
	
	public CRCardCollectionsProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardCollectionsProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCardCollectionsProcedureUpdateOutputModel.json",new TypeReference<CRCardCollectionsProcedureUpdateOutputModel>(){});
	}
	
	public BQPaymentUpdateOutputModel updatePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentUpdateInputModel request){
		return JsonReader.read("update-BQPaymentUpdateOutputModel.json",new TypeReference<BQPaymentUpdateOutputModel>(){});
	}
	
	public BQResolutionUpdateOutputModel updateResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionUpdateInputModel request){
		return JsonReader.read("update-BQResolutionUpdateOutputModel.json",new TypeReference<BQResolutionUpdateOutputModel>(){});
	}
	
}
