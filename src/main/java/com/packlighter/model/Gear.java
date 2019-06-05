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
public class Gear {

    private List<PackItem> previouslyAddedItems;
}
