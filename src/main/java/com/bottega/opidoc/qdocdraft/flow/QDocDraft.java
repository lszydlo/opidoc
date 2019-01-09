package com.bottega.opidoc.qdocdraft.flow;

import java.util.UUID;

import static com.bottega.opidoc.qdocdraft.flow.DraftStatus.DRAFT;

public class QDocDraft {
	private final UUID id;
	private final String type;
	private final DraftStatus status;

	public QDocDraft(UUID id, String type) {
		this.id = id;
		this.type = type;
		this.status = DRAFT;

	}
}
