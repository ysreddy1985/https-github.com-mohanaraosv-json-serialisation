package com.mycompany.fasterxml.jackson.model;

import java.util.List;

import lombok.Data;

@Data
public class Event {

    public String         type;
    public List<Metadata> metadata;
}
