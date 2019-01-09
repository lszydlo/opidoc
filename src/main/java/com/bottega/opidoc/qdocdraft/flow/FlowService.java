package com.bottega.opidoc.qdocdraft.flow;

import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class FlowService {
	private QDocDraftRepo repo;
	// TODO: currentUser

	// ID
	// Object
	// void
	public void handle(CreateQDocCommand command) {

		QDocDraft draft = new QDocDraft(command.getId(), command.getType());
		repo.save(draft);

	}

	public void handle(ToVerificationQDocCommand command) {

		QDocDraft draft = repo.load(command.getId());
		//
		//
		repo.save(draft);
	}

	public void handle(VerifyQDocCommand command) {

	}

	public void handle(PublishQDocCommand command) {

	}

	public void handle(RejectQDocCommand command) {

	}



}
