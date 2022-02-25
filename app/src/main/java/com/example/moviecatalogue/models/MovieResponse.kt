package com.example.moviecatalogue.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse(
    @SerializedName("resluts")
    val movies: List<Movies>
) : Parcelable {
    constructor() : this(mutableListOf())
}