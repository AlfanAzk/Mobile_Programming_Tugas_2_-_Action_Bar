package com.example.tugas2widget_responsivedesign_webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.action_menu1 -> {
                Toast.makeText(this,"Menu 1 Dipilih", Toast.LENGTH_SHORT);
                return true
            }
            R.id.action_menu2 -> {
                Toast.makeText(this,"Menu 2 Dipilih", Toast.LENGTH_SHORT);
                return true
            }
            else ->
                return super.onOptionsItemSelected(item)
        }
    }
}
