package edu.co.icesi.moviless3

import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import edu.co.icesi.moviless3.fragments.ConfigFragment
import edu.co.icesi.moviless3.fragments.ContentFragment
import edu.co.icesi.moviless3.fragments.HomeFragment


class MainActivity : AppCompatActivity() {

    private lateinit var container: ConstraintLayout
    private lateinit var navigator: BottomNavigationView
    private lateinit var toolbar: Toolbar

    //Fragments
    private lateinit var homeFragment: HomeFragment
    private lateinit var contentFragment: ContentFragment
    private lateinit var configFragment: ConfigFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Referenciar
        toolbar = findViewById(R.id.toolbar)
        container = findViewById(R.id.container)
        navigator = findViewById(R.id.navigator)
        homeFragment = HomeFragment.newInstance()
        contentFragment = ContentFragment.newInstance()
        configFragment = ConfigFragment.newInstance()

        //Configurar la barra superior
        toolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(toolbar)

        //Acción del bottom nav bar
        navigator.setOnItemSelectedListener { option: MenuItem ->
            when (option.itemId) {
                R.id.home -> showFragment(homeFragment)
                R.id.content -> showFragment(contentFragment)
                R.id.config -> showFragment(configFragment)
            }
            true
        }

        //Inicialmente mostrar la homeFragment
        showFragment(homeFragment)
    }

    fun showFragment(fragment: Fragment?) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.container, fragment!!)
        transaction.commit()
    }
}