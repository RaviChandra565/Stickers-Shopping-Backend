package com.avn.model;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class MetaData {

	@CreationTimestamp
	@Column(updatable = false)
	private Instant createdAt;
	
	@Column(nullable = false)
	private String createdBy;
	
	@UpdateTimestamp
	private Instant updatedAt;
	
	private String updatedBy;

}