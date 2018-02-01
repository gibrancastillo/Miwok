/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbersTextView = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        /*
         * In line or inner class to set listener of that View.
         * Set the OnClickListener method on the text view passing the ClickListener object as input.
         * <> The numbersTextView.setOnClickListener() is use to attach the custom event listener to the TextView
         * <> new View.OnClickListener() {...} creates a new object instance of the custom event listener
         */
        numbersTextView.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the family category
        TextView familyTextView = (TextView) findViewById(R.id.family);

        // Set a click listener on that View
        familyTextView.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the colors category
        TextView colorsTextView = (TextView) findViewById(R.id.colors);

        // Set a click listener on that View
        colorsTextView.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);

        // Set a click listener on that View
        phrasesTextView.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }

    /**
     * This method uses an explicit intent to launch the numbers activity
     *
     * There are two types of intents:
     * 1. Implicit Intents is used when you don't care which app component handles the intent, as long as they can.
     * 2. Explicit Intents is used when you know EXACTLY which app component or activity within your app should handle your intent.
     *
     * @param view
     */
    public void openNumbersList(View view) {
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }
}
