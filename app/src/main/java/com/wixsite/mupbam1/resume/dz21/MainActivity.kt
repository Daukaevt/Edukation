package com.wixsite.mupbam1.resume.dz21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gradeArray.forEachIndexed{index, i ->
            if (gradeArray[index] in bad) badArray.add("Плохие оценки: Ученик ${nameArray[index]} - ${gradeArray[index]} ")
            if (gradeArray[index] in normal) normalArray.add("Нормальные оценки: Ученик ${nameArray[index]} - ${gradeArray[index]} ")
            if (gradeArray[index] in nice) niceArray.add("Хорошие оценки: Ученик ${nameArray[index]} - ${gradeArray[index]} ")
            if (gradeArray[index] == excellent) excellentArray.add("Отличные оценки: Ученик ${nameArray[index]} - ${gradeArray[index]} ")
            /* лучше использовать when(el){
            in ...}
            */

        }
        badArray.forEach{el -> Log.d("MyLog","$el")}
        normalArray.forEach{el -> Log.d("MyLog","$el")}
        niceArray.forEach{el -> Log.d("MyLog","$el")}
        excellentArray.forEach{el -> Log.d("MyLog","$el")}


    }

}