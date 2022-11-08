package brian.murphy.g14projecttracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import brian.murphy.g14projecttracker.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val diaryEntries= mutableListOf<DisplayProject>()
    private lateinit var diaryRecyclerView: RecyclerView
    private lateinit var binding: ActivityMainBinding
    private lateinit var prodao: ProjectDao
    //private lateinit var notedao:NotesDao
    //private lateinit var resdao:ResourcesDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager: FragmentManager = supportFragmentManager
        val bottomNavigationBar: BottomNavigationView =findViewById(R.id.bottom_navigation)
        bottomNavigationBar.setOnItemReselectedListener { item->
            lateinit var fragment: Fragment
            when (item.itemId){
                R.id.action_listProjects -> fragment =ProjectList()
                R.id.action_newProject->fragment =NewProject()
            }
            replaceFragment(fragment)
            true
        }
        bottomNavigationBar.selectedItemId=R.id.action_listProjects
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction= fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.current_frame_layout,fragment)
        fragmentTransaction.commit()

    }


}