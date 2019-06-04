package com.packlighter.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class PackItem {
	
	private String itemName;
	private String itemDescription;
	private Double itemWeight;
	private Measurement itemMeasurement;
	private ItemPurpose itemPurpose;
	private int itemQuantity;
}
