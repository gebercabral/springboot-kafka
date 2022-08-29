package br.com.gbr.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gbr.service.MessageService;

@RestController
@RequestMapping("/message")
public class MessageResource {
	
	@Autowired
	MessageService messageService;
	
	@PostMapping
	public ResponseEntity<String> sendMessage(@RequestBody String message){
		messageService.sendMessage(message);
		return ResponseEntity.ok().body("Message sent  : " + message);
	}

}
