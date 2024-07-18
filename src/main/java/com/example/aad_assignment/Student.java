package com.example.aad_assignment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Student implements Serializable {

        private String id;
        private String name;
        private String address;

}
