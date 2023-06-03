package pages.components;

import com.codeborne.selenide.SelenideElement;

import java.time.Month;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    SelenideElement monthSelector = $(".react-datepicker__month-select"),
            yearSelector = $(".react-datepicker__year-select"),
            daySelector = $(".react-datepicker__month");

    public void setDateOfBirth(String day, String month, String year) {
        int monthInt = Month.valueOf(month.toUpperCase()).getValue();
        monthSelector.selectOption(monthInt - 1);
        yearSelector.selectOption(year);
        daySelector.$(byText(day)).click();
    }
}
