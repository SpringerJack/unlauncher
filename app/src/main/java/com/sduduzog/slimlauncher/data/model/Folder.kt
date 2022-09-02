package com.sduduzog.slimlauncher.data.model

import androidx.lifecycle.LiveData
import com.sduduzog.slimlauncher.models.HomeApp

data class Folder(
    override val appName: String,
    override val packageName: String,
    override val activityName: String,
    override val userSerial: Long,
    val content: LiveData<List<HomeApp>>?
                  ) : Entry {
    companion object{
        fun from(homeApp: HomeApp) = Folder(homeApp.appName, homeApp.packageName, homeApp.activityName, homeApp.userSerial, null)
    }
}
