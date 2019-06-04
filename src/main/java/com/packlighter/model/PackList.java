package com.packlighter.model;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class PackList {
	
	private String listName;
	private Double baseWeight;
	private Double totalWeight;
	private List<PackCategory> categories;
}
