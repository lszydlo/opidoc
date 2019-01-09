package com.bottega.opidoc.qdocdraft.flow;

import java.util.UUID;

public interface QDocDraftRepo {
	void save(QDocDraft draft);

	QDocDraft load(UUID id);
}
