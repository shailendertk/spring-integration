package com.shasha.poc.springintg.dto;


import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Builder(builderClassName = "Builder", buildMethodName = "build")
public class Borrower {

    @NotNull
    private String firstName;
    private String middleName;
    @NotNull
    private String lastName;
    private String suffix;
    @NotNull
//    @Min(9)
//    @Max(10)
    private String dob;
    @NotNull
    private boolean joint;
    private String maritalStatus;

    /*static class Builder {
        Borrower build() {
            if(Objects.isNull(firstName)) {
                throw new RuntimeException("firstName is null");
            }
            if(Objects.isNull(lastName)) {
                throw new RuntimeException("lastName is null");
            }
            if(Objects.isNull(dob)) {
                throw new RuntimeException("dob is null");
            }
            if(Objects.isNull(joint)) {
                throw new RuntimeException("joint is null");
            }
            if(Objects.isNull(maritalStatus)) {
                throw new RuntimeException("maritalStatus is null");
            }
            return new Borrower(firstName, middleName, lastName, suffix, dob, joint, maritalStatus);
        }
    }*/

}
