package com.example.example.android.launch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.example.Greeting
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _greetList = MutableStateFlow<List<String>>(listOf())
    val greetingList: StateFlow<List<String>> get() = _greetList

    init {
        viewModelScope.launch {
            Greeting().greet().collect { phrase ->
                _greetList.update { list -> list + phrase }
            }
        }
    }
}