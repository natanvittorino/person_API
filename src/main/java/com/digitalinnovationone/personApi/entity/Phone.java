package com.digitalinnovationone.personApi.entity;

import com.digitalinnovationone.personApi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    private Long id;
    private String number;
    private PhoneType type;
}
