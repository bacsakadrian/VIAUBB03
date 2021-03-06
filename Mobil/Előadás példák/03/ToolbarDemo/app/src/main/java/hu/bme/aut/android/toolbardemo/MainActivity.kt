package hu.bme.aut.android.toolbardemo

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        etHello.setOnClickListener{
            val intent = Intent(this,DialogActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_about -> {

                showAboutDialog()

                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showAboutDialog() {
        AlertDialog.Builder(this)
            .setMessage("@Laszlo Gazdi")
            .setNeutralButton("OK", null)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(MainActivity@this,"positive",Toast.LENGTH_LONG).show()
            }
            .setTitle("About")
            .setCancelable(false)
            .show()
    }
}
