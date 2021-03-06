package com.robot.design.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.robot.design.R
import com.robot.lighting.widget.BottomSheet


/**
 * <pre>
 *     e-mail : majingze@shuangke.net.cn
 *     time   : 2018/6/14
 *     desc   :
 *     version: 1.0
 *     Copyright: Copyright（c）2017
 *     Company:爽客智能设备有限公司
 * </pre>
 * @author majingze
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.action).setOnClickListener {
            val dialog = BottomSheet()
            dialog.show(supportFragmentManager,"")
        }

    }
}