package com.example.api_simples.model;

import lombok.Data;
import org.hibernate.tuple.GenerationTiming;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class BookModel {

    @Id
    @GeneratedUuidValue( timing = GenerationTiming.INSERT )
    private UUID id;
    private String title;


}
