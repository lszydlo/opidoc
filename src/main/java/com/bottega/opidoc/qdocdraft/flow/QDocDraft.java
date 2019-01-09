package com.bottega.opidoc.qdocdraft.flow;

import java.util.UUID;

import static com.bottega.opidoc.qdocdraft.flow.DraftStatus.*;

class QDocDraft {
	private final UUID id;
	private final String type;
	private DraftStatus status;
	private Long contentLength;
	private UUID ownerId;

	QDocDraft(UUID id, String type, UUID ownerId) {
		this.id = id;
		this.type = type;
		this.status = DRAFT;
		this.ownerId = ownerId;
	}

	void toVerification(UUID currentUserId) {

		if ((status.equals(DRAFT) || status.equals(REJECTED)) && contentLength > 0 && ownerId.equals(currentUserId)) {
			status = TO_VERIFICATION;
		} else {
			throw new RuntimeException();
		}

	}
}
