package com.kzuferdy.mayapss_10119194.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Friend (
    var desc: String ?="",
    var judul: String ?="",
    var poster: String ?="",
): Parcelable