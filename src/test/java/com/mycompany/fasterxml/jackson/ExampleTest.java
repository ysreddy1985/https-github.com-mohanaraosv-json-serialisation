package com.mycompany.fasterxml.jackson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import com.mycompany.fasterxml.jackson.model.Example;

public class ExampleTest {

    @Test
    void exampleSerializationTest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper()
                .registerModule(new ParameterNamesModule())
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule());

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        Path employeePath = Paths.get("src/test/resources/message.json");
        String employeeJson = Files.readString(employeePath);
        Example exampleData = objectMapper.readValue(employeeJson, Example.class);
        System.out.println(exampleData);
    }
}
