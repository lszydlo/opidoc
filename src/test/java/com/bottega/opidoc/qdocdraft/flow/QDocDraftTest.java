package com.bottega.opidoc.qdocdraft.flow;

import org.junit.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class QDocDraftTest {

	@Test
	public void should_throw_when_not_owner() {

		QDocDraft draft = new QDocDraft(UUID.randomUUID(), "sds", UUID.randomUUID());

		assertThatThrownBy(() -> draft.toVerification(UUID.randomUUID()))
				.isInstanceOf(RuntimeException.class);


	}
}