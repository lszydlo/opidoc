package com.bottega.opidoc.qdocdraft.flow;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FlowService {
	private QDocDraftRepo repo;
	private CurrentUserClient userClient;

	public void handle(CreateQDocCommand command) {

		UUID userId = userClient.getId();
		QDocDraft draft = new QDocDraft(command.getId(), command.getType(),userId);
		repo.save(draft);

	}

	public void handle(ToVerificationQDocCommand command) {

		QDocDraft draft = repo.load(command.getId());

		draft.toVerification(userClient.getId());

		repo.save(draft);

	}

	public void handle(VerifyQDocCommand command) {

	}

	public void handle(PublishQDocCommand command) {

	}

	public void handle(RejectQDocCommand command) {

	}



}
