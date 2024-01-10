package com.android.soloassignment

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MyItem(val picture : Int, val title : String, val address : String, val price : String, val chat : String, val like : String, val nickname : String, val detail : String):Parcelable{
}