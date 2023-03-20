package com.example.myapplication

import com.example.myapplication.view.FragmentCharacterSlotList
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    fun inject(firstFragment: FragmentCharacterSlotList)


}