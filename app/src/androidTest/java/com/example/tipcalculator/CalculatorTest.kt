package com.example.tipcalculator

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.containsString
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CalculatorTest
{

 @get:Rule()
 val activity = ActivityScenarioRule(MainActivity::class.java)


@Test
fun test_18_percent_tip_roundOn()
{
 onView(withId(R.id.cost_of_service_edit_text)).check(matches(isDisplayed()))

 onView(withId(R.id.cost_of_service_edit_text)).perform(typeText("50"))

 Espresso.pressBack()

 onView(withId(R.id.calculate_button)).perform(click())

 onView(withId(R.id.tip_result)).check(matches(withText(containsString("$9.00"))))
}

 @Test
 fun test_18_percent_tip_roundOff() {
  onView(withId(R.id.round_up_switch)).perform(click())
  onView(withId(R.id.cost_of_service_edit_text)).perform(typeText("50"))
  Espresso.pressBack()
  onView(withId(R.id.calculate_button)).perform(click())
  onView(withId(R.id.tip_result)).check(matches(withText(containsString("$9.00"))))

 }

 @Test
 fun test_20_percent_tip() {
  onView(withId(R.id.option_twenty_percent)).perform(click())
  onView(withId(R.id.cost_of_service_edit_text)).perform(typeText("50"))
  Espresso.pressBack()
  onView(withId(R.id.calculate_button)).perform(click())
  onView(withId(R.id.tip_result)).check(matches(withText(containsString("$10.00"))))

 }

 @Test
 fun test_15_percent_tip() {
  onView(withId(R.id.option_fifteen_percent)).perform(click())
  onView(withId(R.id.cost_of_service_edit_text)).perform(typeText("50"))
  Espresso.pressBack()
  onView(withId(R.id.calculate_button)).perform(click())
  onView(withId(R.id.tip_result)).check(matches(withText(containsString("$8.00"))))

 }
}