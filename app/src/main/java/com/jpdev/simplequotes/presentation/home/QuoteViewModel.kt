package com.jpdev.simplequotes.presentation.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.jpdev.simplequotes.data.model.Quote
import com.jpdev.simplequotes.data.repository.QuoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor() : ViewModel() {

    private val _quote = mutableStateOf(QuoteRepository.getRandomQuote())
    val quote: State<Quote> = _quote

    fun loadNextQuote() {
        _quote.value = QuoteRepository.getRandomQuote()
    }
}
