package com.example.RequirementsProject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class FileObject {
    private byte[] bytes;
    private String name;
    private String contentType;
}
