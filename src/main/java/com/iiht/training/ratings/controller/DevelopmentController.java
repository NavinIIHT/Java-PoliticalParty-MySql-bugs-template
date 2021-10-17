package com.iiht.training.ratings.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.ratings.dto.DevelopmentDto;
import com.iiht.training.ratings.service.DevelopmentService;

@RestController
@RequestMapping("/developments")
public class DevelopmentController {

	@Autowired
	private DevelopmentService developmentService;

	@PostMapping
	public ResponseEntity<?> addDevelopments(@Valid @RequestBody DevelopmentDto developmentDto, BindingResult result) {
		return null;

	}

	@PutMapping
	public ResponseEntity<?> updateDevelopments(@Valid @RequestBody DevelopmentDto developmentDto,
			BindingResult result) {
		return null;

	}

	@DeleteMapping("/{developmentId}")
	public ResponseEntity<?> deleteDevelopment(@PathVariable Long developmentId) {

		return null;

	}

	@GetMapping("/{developmentId}")
	public ResponseEntity<?> getDevelopmentById(@PathVariable Long developmentId) {

		return null;

	}

	@GetMapping
	public ResponseEntity<?> getAllDevelopments() {
		return null;

	}

	@GetMapping("by-leader-id/{politicalLeaderId}")
	public ResponseEntity<?> getAllDevelopmentsByPoliticalLeaderId(@PathVariable Long politicalLeaderId) {

		return null;

	}

}
