package prepare_data;

import models.LoginPageModel;
import utilities.TestDataGenerator;

public class PrepareLoginData {

    public static LoginPageModel getData() {
        return LoginPageModel
                .builder()
                .username(TestDataGenerator.generateUsername())
                .password(TestDataGenerator.generatePassword())
                .build();
    }
}
