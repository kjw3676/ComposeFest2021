package com.example.compose.rally

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class RallyAppTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun prepareRallyApp() {
        composeTestRule.setContent {
            RallyApp()
        }
    }

    @Test
    fun rallyAppTest_selectAccount() {

    }
}