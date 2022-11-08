package brian.murphy.g14projecttracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class ProjectList : Fragment() {
    //private lateinit var diaryRecView: RecyclerView
    // private lateinit var diaryAdapter: DiaryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.project_list_fragment, container, false)
        // Configure the adapter and the layout for it
        /*
        lifecycleScope.launch(Dispatchers.IO) {
            val application= DiaryApplication()
            sumTextView.text= "Overall Mood Summary: "+application.db.diaryDao().moodAvg().toString()
        }*/
        return view
    }


}