package com.espresso.databinding;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void showTransactionDetails() {
        User user = User.getTestUser();

        onView(withText(String.format("Name: %s", user.name)))
                .check(matches(isDisplayed()));

        onView(withText(String.format("Age: %s", user.age)))
                .check(matches(isDisplayed()));
    }
}
