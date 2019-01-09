package com.khalykbayev.kolesatest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment

class EntryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)
        showAuth()

        /*
            При работе с FirebaseAuth можно получить проверить выполнил ли логин user.
            Если не использовать Firebase, но получить аналог auth, то можно проверить зашел ли пользователь, вызвать
             главный фрагмент через onAuthSuccess() и удалить фрагмент авторизации.

                auth = FirebaseAuth.getInstance()

                if (auth.currentUser!=null){
                    supportFragmentManager.beginTransaction()
                    .remove(fragment)
                    .commit()
                }

         */
    }

    private fun showAuth() {
        val fragment = AuthFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.entry_container, fragment)
            .addToBackStack(null)
            .commit()

    }

    private fun showMain() {
        // TODO(“show main frament”)
    }

    //override кнопки назад
    /*
     override fun onBackPressed() {
        super.onBackPressed()
    }
    */
}

class AuthFragment : Fragment() {

    fun onAuthSuccess(){
        // TODO(“show main fragment”)
    }
}

class MainFragment : Fragment()
