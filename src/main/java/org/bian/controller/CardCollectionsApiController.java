/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CardCollectionsApiController {

	@Autowired
	CardCollectionsApiService service;
	
	@Process.Activate
	public BianResponse<SDCardCollectionsActivateOutputModel> activate(@RequestBody BianRequest<SDCardCollectionsActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDCardCollectionsConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardCollectionsConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Control
	public BianResponse<CRCardCollectionsProcedureControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCardCollectionsProcedureControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("paymentterms")
	@Process.Exchange
	public BianResponse<BQPaymentTermsExchangeOutputModel> exchangePaymentterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentTermsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangePaymentterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payment")
	@Process.Exchange
	public BianResponse<BQPaymentExchangeOutputModel> exchangePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangePayment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Execute
	public BianResponse<CRCardCollectionsProcedureExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCardCollectionsProcedureExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDCardCollectionsFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardCollectionsFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRCardCollectionsProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCardCollectionsProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("payment")
	@Process.Initiate
	public BianResponse<BQPaymentInitiateOutputModel> initiatePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPaymentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiatePayment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Request
	public BianResponse<CRCardCollectionsProcedureRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCardCollectionsProcedureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRCardCollectionsProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("assignment")
	@Process.Retrieve
	public BianResponse<BQAssignmentRetrieveOutputModel> retrieveAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("payment")
	@Process.Retrieve
	public BianResponse<BQPaymentRetrieveOutputModel> retrievePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("paymentterms")
	@Process.Retrieve
	public BianResponse<BQPaymentTermsRetrieveOutputModel> retrievePaymentterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePaymentterms(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("resolution")
	@Process.Retrieve
	public BianResponse<BQResolutionRetrieveOutputModel> retrieveResolution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveResolution(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDCardCollectionsRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRCardCollectionsProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCardCollectionsProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payment")
	@Process.Update
	public BianResponse<BQPaymentUpdateOutputModel> updatePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePayment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("resolution")
	@Process.Update
	public BianResponse<BQResolutionUpdateOutputModel> updateResolution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQResolutionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateResolution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
