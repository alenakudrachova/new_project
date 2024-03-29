package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataJsonModel {
    private Occupation occupation;
    private MaritalStatus maritalStatus;
    private Education education;
}
