package models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MaritalStatus {
    @SerializedName("1")
    private String one;

    @SerializedName("2")
    private String two;

    @SerializedName("3")
    private String three;

    @SerializedName("4")
    private String four;

    @SerializedName("5")
    private String five;
}
