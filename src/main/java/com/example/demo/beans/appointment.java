package com.example.demo.beans;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class appointment {
	
	private Long id;
	private LocalDateTime appointmentTime;
	private LocalDateTime appointmentDate;
	private String reason;

}
