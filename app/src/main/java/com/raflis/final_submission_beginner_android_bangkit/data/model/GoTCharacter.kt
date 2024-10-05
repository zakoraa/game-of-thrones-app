package com.raflis.final_submission_beginner_android_bangkit.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GoTCharacter(
    val name: String,
    val house: House,
    val title: String,
    val age: Int,
    val culture: String,
    val episodeCount: Int,
    val actorName: String,
    val description: String,
    val image: String,
): Parcelable
