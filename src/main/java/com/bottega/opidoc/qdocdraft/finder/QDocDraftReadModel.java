package com.bottega.opidoc.qdocdraft.finder;

import lombok.Data;

import java.util.UUID;

@Data
public class QDocDraftReadModel {

	UUID id;
	String content;
	UUID ownerId;
	String ownerName;
	String status;
	String title;

}
