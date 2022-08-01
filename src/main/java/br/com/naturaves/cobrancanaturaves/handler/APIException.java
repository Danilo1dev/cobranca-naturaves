package br.com.naturaves.cobrancanaturaves.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class APIException extends RuntimeException {
	private HttpStatus status;
	private ErrorApiResponse body;

	public ResponseEntity<ErrorApiResponse> buildErroResponseEntity() {
		return ResponseEntity.status(status).body(body);
	}
	private static final long serialVersionUID = 1L;

}
