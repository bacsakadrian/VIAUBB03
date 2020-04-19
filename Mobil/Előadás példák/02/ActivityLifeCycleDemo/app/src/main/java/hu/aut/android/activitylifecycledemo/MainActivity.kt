package hu.aut.android.activitylifecycledemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG_LIFE = "TAG_LIFE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG_LIFE, "onCreate called")
        Log.d(TAG_LIFE, "Score: " + savedInstanceState?.getInt("KEY_SCORE").toString())
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        Log.d(TAG_LIFE, "onSaveInstanceState called")

        outState?.putInt("KEY_SCORE",10)
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG_LIFE, "onStart called")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG_LIFE, "onResume called")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG_LIFE, "onPause called")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG_LIFE, "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG_LIFE, "onDestroy called")
    }

}
