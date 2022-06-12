package com.example.api_simples.model;

import org.hibernate.annotations.ValueGenerationType;
import org.hibernate.tuple.GenerationTiming;

import java.lang.annotation.*;

@ValueGenerationType( generatedBy = UuidValueGeneration.class )
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE } )
@Inherited
public @interface GeneratedUuidValue {
    GenerationTiming timing();
}
