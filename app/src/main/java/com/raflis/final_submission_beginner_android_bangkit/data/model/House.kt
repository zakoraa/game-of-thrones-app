package com.raflis.final_submission_beginner_android_bangkit.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class House(
    val name: EnumHouse,
    val image: String,
):Parcelable
