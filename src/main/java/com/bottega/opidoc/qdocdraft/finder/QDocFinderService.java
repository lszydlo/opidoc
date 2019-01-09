package com.bottega.opidoc.qdocdraft.finder;

import org.springframework.jdbc.core.JdbcOperations;

import java.util.UUID;

public class QDocFinderService {


	private JdbcOperations operations;

	public QDocDraftReadModel getOne(UUID id) {
		return operations.queryForObject("select ...", QDocDraftReadModel.class);
	}

}
