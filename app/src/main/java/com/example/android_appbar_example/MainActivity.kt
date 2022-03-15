package com.example.android_appbar_example

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.android_appbar_example.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val personList = listOf(
                Person(R.drawable.ic_profile_1, "AAA"),
                Person(R.drawable.ic_profile_2, "BBB"),
                Person(R.drawable.ic_profile_3, "CCC"),
                Person(R.drawable.ic_profile_4, "DDD"),
                Person(R.drawable.ic_profile_5, "EEE"),
                Person(R.drawable.ic_profile_6, "FFF"),
                Person(R.drawable.ic_profile_7, "GGG"),
                Person(R.drawable.ic_profile_8, "HHH"),
                Person(R.drawable.ic_profile_9, "III"),
                Person(R.drawable.ic_profile_10, "JJJ")
        )

        binding.personList.adapter = PersonAdapter(
                personList,
                clickCallback = { name ->
                    Snackbar.make(binding.root, name, Snackbar.LENGTH_SHORT).show()
                }
        )
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
            R.id.action_1 -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

}