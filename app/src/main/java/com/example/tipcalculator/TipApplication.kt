package com.example.tipcalculator

import android.app.Application
import com.google.android.material.color.DynamicColors

class TipApplication:Application()
{
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this);

    }
}