/**
 * 
 */
package com.teammatharu.cookbook.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;
import com.teammatharu.cookbook.MainLandingPage;
import com.teammatharu.cookbook.Sub_Meal_Page;

/**
 * @author jmatharu
 * 
 */
public class InitialButtonTest extends
		ActivityInstrumentationTestCase2<MainLandingPage> {

	private Solo solo;

	/**
	 * @param activityClass
	 */
	@SuppressWarnings("deprecation")
	public InitialButtonTest() {
		super("com.teammatharu.cookbook", MainLandingPage.class);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}

	public void testButtonClick() {
		// Test to run if Robotium is correctly configured
		solo.assertCurrentActivity("Check On First Activity",
				MainLandingPage.class);

		// test to see if on clicking "Search Recipe" user get pointed to
		// "Sub_Meal_Page"
		solo.clickOnButton("Search Recipe");
		solo.assertCurrentActivity("When Search Recipe button is clicked",
				Sub_Meal_Page.class);
		/*
		 * // test to see if on clicking "Search Recipe" user get pointed to //
		 * "Sub_Meal_Page" solo.clickOnButton("Search Recipe");
		 * solo.assertCurrentActivity("When Search Recipe button is clicked",
		 * Sub_Meal_Page.class);
		 * 
		 * // test to see if on clicking "Meals" user get pointed to //
		 * "Sub_Meal_Page" solo.clickOnButton("Meals");
		 * solo.assertCurrentActivity("When Meal button is clicked",
		 * Sub_Meal_Page.class);
		 * 
		 * // test to see if on clicking "Courses" user get pointed to //
		 * "Sub_Meal_Page" solo.clickOnButton("Courses");
		 * solo.assertCurrentActivity("When Courses button is clicked",
		 * Sub_Meal_Page.class);
		 * 
		 * // test to see if on clicking "Main Ingredients" user get pointed to
		 * // "Sub_Meal_Page" solo.clickOnButton("Main Ingredients");
		 * solo.assertCurrentActivity("When Main Ingredients button is clicked",
		 * Sub_Meal_Page.class);
		 * 
		 * // test to see if on clicking "Occasions and Cooking Style" user get
		 * // pointed to // "Sub_Meal_Page"
		 * solo.clickOnButton("Occasions and Cooking Style");
		 * solo.assertCurrentActivity(
		 * "When Occasions and Cooking Style button is clicked",
		 * Sub_Meal_Page.class);
		 */

	}
}
