package com.williamfeliciano.organizationservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "OrganizationDto Model Documentation"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {

    private Long id;
    @Schema(
            description = "Organization Name"
    )
    private String organizationName;
    @Schema(
            description = "Organization Description"
    )
    private String organizationDescription;
    @Schema(
            description = "Organization Code"
    )
    private String organizationCode;
    @Schema(
            description = "Organization was Created on Date"
    )
    private String createdDate;
}
