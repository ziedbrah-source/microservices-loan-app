package com.alibou.commercialservice;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocData {
    private Integer id;
    private String fullName;
    private String email;
    private Integer loanAmount;
    private Integer loanTerm;
}
