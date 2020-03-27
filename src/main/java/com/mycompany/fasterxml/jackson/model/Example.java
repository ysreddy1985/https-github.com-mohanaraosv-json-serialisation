package com.mycompany.fasterxml.jackson.model;

import java.util.List;

import lombok.Data;

@Data
public class Example {

    public Source      source;
    public List<Event> events;
}