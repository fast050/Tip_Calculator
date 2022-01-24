package com.example.tipcalculator

import android.app.Application
import android.os.Build
import com.google.android.material.color.DynamicColors

class TipApplication:Application()
{
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this, R.style.AppTheme_Overlay)

    }
}