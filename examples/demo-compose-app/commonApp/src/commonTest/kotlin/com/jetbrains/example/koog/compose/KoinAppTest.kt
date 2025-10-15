package com.jetbrains.example.koog.compose

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.printToLog
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
class KoinAppTest {

    @Test
    fun simpleCheck() = runComposeUiTest {
        setContent {
            KoinApp()
        }

        onRoot().printToLog("0_StartScreenTag")

        // Open Settings screen
        onNodeWithContentDescription("Settings").performClick()

        // Enter empty value to OpenAI token field (only one token field is visible based on selected provider)
        onNodeWithText("OpenAI Token").performTextInput("")

        // Press save settings button
        onNodeWithContentDescription("Save").performClick()

        // Open Calculator screen
        onNodeWithText("Calculator").performClick()

        // Type a test message
        onNodeWithText("Type a message...").performTextInput("What is 2+2?")

        // Press send button
        onNodeWithContentDescription("Send").performClick()

        onRoot().printToLog("1_CalculatorScreenEmptyTokenTag")

        // Press back button
        onNodeWithContentDescription("Back").performClick()

        // Open Weather Forecast screen
        onNodeWithText("Weather Forecast").performClick()

        // Type a test message
        onNodeWithText("Type a message...").performTextInput("What's the weather in New York?")

        // Press send button
        onNodeWithContentDescription("Send").performClick()

        onRoot().printToLog("2_WeatherForecastScreenEmptyTokenTag")

        // Press back button
        onNodeWithContentDescription("Back").performClick()

        // Open Settings screen
        onNodeWithContentDescription("Settings").performClick()

        // Enter "IncorrectApiKey" value to OpenAI token field (only one token field is visible based on selected provider)
        onNodeWithText("OpenAI Token").performTextInput("IncorrectApiKey")

        // Press save settings button
        onNodeWithContentDescription("Save").performClick()

        // Open Calculator screen
        onNodeWithText("Calculator").performClick()

        // Type a test message
        onNodeWithText("Type a message...").performTextInput("What is 2+2?")

        // Press send button
        onNodeWithContentDescription("Send").performClick()

        onRoot().printToLog("3_CalculatorScreenIncorrectKeyTag")

        // Press back button
        onNodeWithContentDescription("Back").performClick()

        // Open Weather Forecast screen
        onNodeWithText("Weather Forecast").performClick()

        // Type a test message
        onNodeWithText("Type a message...").performTextInput("What's the weather in New York?")

        // Press send button
        onNodeWithContentDescription("Send").performClick()

        onRoot().printToLog("4_WeatherForecastScreenIncorrectKeyTag")

        // Press back button
        onNodeWithContentDescription("Back").performClick()
    }
}
