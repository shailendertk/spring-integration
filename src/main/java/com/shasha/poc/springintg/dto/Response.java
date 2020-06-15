package com.shasha.poc.springintg.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "Builder", buildMethodName = "build")
public class Response {

    @NotNull
    private String status;
    
    private String desc;
    
    @NotNull
    private String timestamp;
}
