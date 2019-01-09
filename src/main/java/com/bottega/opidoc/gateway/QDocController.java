package com.bottega.opidoc.gateway;

import com.bottega.opidoc.qdocdraft.editor.EditorService;
import com.bottega.opidoc.qdocdraft.flow.CreateQDocCommand;
import com.bottega.opidoc.qdocdraft.flow.FlowService;
import com.bottega.opidoc.qdocdraft.flow.ToVerificationQDocCommand;
import com.bottega.opidoc.qdocdraft.flow.VerifyQDocCommand;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class QDocController {

	private final FlowService flowService;
	private final EditorService editorService;

//	@PostMapping("/qdocs")
//	public ResponseEntity<Void> create(@RequestBody CreateQDocCommand command, UriComponentsBuilder builder) {
//
//		Long aLong = flowService.handle(command);
//
//		UriComponents uriComponents = builder.path("/{id}").buildAndExpand(aLong);
//		return ResponseEntity.created(uriComponents.toUri()).build();
//	}

	@GetMapping("/qdocs")
	public String get(){
		return "";
	}

	@PutMapping("/qdocs/{id}")
	public ResponseEntity<Void> create2(@RequestBody CreateQDocCommand command) {
		flowService.handle(command);

		return ResponseEntity.ok().build();
	}

	@PutMapping("/qdocs/{id}/toVerify")
	public ResponseEntity<Void> toVerification(@RequestBody ToVerificationQDocCommand command) {
		flowService.handle(command);

		return ResponseEntity.ok().build();
	}

	@PutMapping("/qdocs/{id}/verify")
	public ResponseEntity<Void> toVerification(@RequestBody VerifyQDocCommand command) {
		flowService.handle(command);

		return ResponseEntity.ok().build();
	}







}
