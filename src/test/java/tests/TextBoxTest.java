package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static data.TestDataTextBox.*;

public class TextBoxTest extends TestBase{
    TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    void successfulInputTest(){
        textBoxPage.openPage()
                .setFirstName(name)
                .setUserEmail(email)
                .setCurrentAddress(currentAddress)
                .setPermanentAddress(permanentAddress)
                .submitBtnClick();

        textBoxPage.resultCheck(name, email, currentAddress, permanentAddress);
    }
}
