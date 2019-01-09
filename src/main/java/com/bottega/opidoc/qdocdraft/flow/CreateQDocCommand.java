package com.bottega.opidoc.qdocdraft.flow;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateQDocCommand {
	UUID id;
	String type;
}
