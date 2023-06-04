package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    SelenideElement monthSelector = $(".react-datepicker__month-select"),
            yearSelector = $(".react-datepicker__year-select"),
            daySelector = $(".react-datepicker__month:not(.react-datepicker__day--outside-month");

    public void setDateOfBirth(String day, String month, String year) {
        monthSelector.selectOption(month);
        yearSelector.selectOption(year);
        daySelector.$(byText(day)).click();
    }
}
