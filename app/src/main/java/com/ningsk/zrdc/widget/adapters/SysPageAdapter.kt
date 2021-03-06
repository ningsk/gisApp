package com.ningsk.zrdc.widget.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ningsk.zrdc.ui.sys.camera.CameraSettingFragment
import com.ningsk.zrdc.ui.sys.coordinate.CoordinateSettingFragment
import com.ningsk.zrdc.ui.sys.diff.DiffSettingFragment
import com.ningsk.zrdc.ui.sys.getpoint.GetPointFragment
import com.ningsk.zrdc.ui.sys.gps.GpsSettingFragment
import com.ningsk.zrdc.ui.sys.layertemp.LayerTempSettingFragment
import com.ningsk.zrdc.ui.sys.us.UsSettingFragment

/**
 * =======================================
 *
 * Create by ningsikai 2020/5/31:11:09 AM
 * ========================================
 */

const val GPS_SETTING_SETTING_PAGE_INDEX = 0
const val GET_POINT_SETTING_PAGE_INDEX  = 1
const val CAMERA_SETTING_PAGE_INDEX = 2
const val DIFF_SETTING_PAGE_INDEX = 3
const val COORDINATE_SETTING_PAGE_INDEX = 4
const val LAYER_TEMP_SETTING_PAGE_INDEX = 5
const val GRID_SETTING_PAGE_INDEX = 6
const val US_SETTING_PAGE_INDEX = 7


class SysPageAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {

    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf(
        GPS_SETTING_SETTING_PAGE_INDEX to { GpsSettingFragment() },
        GET_POINT_SETTING_PAGE_INDEX to { GetPointFragment() },
        CAMERA_SETTING_PAGE_INDEX to { CameraSettingFragment() },
        DIFF_SETTING_PAGE_INDEX to { DiffSettingFragment() },
        COORDINATE_SETTING_PAGE_INDEX to { CoordinateSettingFragment() },
        LAYER_TEMP_SETTING_PAGE_INDEX to { LayerTempSettingFragment() },
        US_SETTING_PAGE_INDEX to { UsSettingFragment() }
    )
    override fun getItemCount() = tabFragmentsCreators.size

    override fun createFragment(position: Int): Fragment {
        return tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}
