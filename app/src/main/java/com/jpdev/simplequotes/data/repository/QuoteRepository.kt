package com.jpdev.simplequotes.data.repository

import android.content.Context
import com.jpdev.simplequotes.data.model.Quote
import org.json.JSONArray


//class QuoteRepository(context: Context) {
object QuoteRepository {
    /*  private val quotes: List<Quote> = loadQuotes(context)

      private fun loadQuotes(context: Context): List<Quote> {
          val json = context.assets.open("quotes.json")
              .bufferedReader()
              .use { it.readText() }

          val jsonArray = JSONArray(json)
          val list = mutableListOf<Quote>()

          for (i in 0 until jsonArray.length()) {
              list.add(Quote(jsonArray.getString(i)))
          }
          return list
      }*/
    /*    private val quotes = listOf(
            Quote("Consistency beats motivation"),
            Quote("Small steps every day"),
            Quote("Discipline creates freedom"),
            Quote("Focus on progress, not perfection"),
            Quote("Start simple, stay consistent"),
            Quote("Action creates clarity"),
            Quote("Build habits, not excuses")
        )*/
    private val quotes = listOf(
        Quote("Consistency beats motivation"),
        Quote("Small steps every day matter"),
        Quote("Discipline creates freedom"),
        Quote("Progress is better than perfection"),
        Quote("Start simple and stay consistent"),
        Quote("Action brings clarity"),
        Quote("Habits build results"),
        Quote("Focus creates momentum"),
        Quote("Show up even on hard days"),
        Quote("Effort compounds over time"),

        Quote("Do the work quietly"),
        Quote("Growth comes from repetition"),
        Quote("Today’s effort shapes tomorrow"),
        Quote("Simplicity leads to clarity"),
        Quote("Stay patient and persistent"),
        Quote("Improvement is a daily choice"),
        Quote("One step is enough to start"),
        Quote("Calm mind works better"),
        Quote("Consistency creates confidence"),
        Quote("Results follow discipline"),

        Quote("Learn a little every day"),
        Quote("Focus on what you control"),
        Quote("Progress takes time"),
        Quote("Action beats overthinking"),
        Quote("Direction matters more than speed"),
        Quote("Start before you feel ready"),
        Quote("Discipline outlasts motivation"),
        Quote("Simple habits create strong foundations"),
        Quote("Clarity comes through action"),
        Quote("Daily effort brings long-term results"),

        Quote("Build systems, not excuses"),
        Quote("Quiet effort leads to visible success"),
        Quote("Momentum grows with consistency"),
        Quote("Focus reduces noise"),
        Quote("Small wins build confidence"),
        Quote("Persistence beats intensity"),
        Quote("Consistency builds trust"),
        Quote("Patience strengthens progress"),
        Quote("Action creates direction"),
        Quote("Discipline simplifies decisions"),

        Quote("Progress rewards patience"),
        Quote("Show up with intent"),
        Quote("Consistency builds identity"),
        Quote("Simple actions repeated work"),
        Quote("Growth happens daily"),
        Quote("Focus fuels progress"),
        Quote("Effort creates opportunity"),
        Quote("Calm effort wins"),
        Quote("Discipline keeps you moving"),
        Quote("Clarity grows with practice"),

        Quote("Consistency creates reliability"),
        Quote("Small actions shape outcomes"),
        Quote("Progress starts with action"),
        Quote("Discipline removes confusion"),
        Quote("Focus builds momentum"),
        Quote("Effort defines results"),
        Quote("Daily actions matter most"),
        Quote("Persistence creates strength"),
        Quote("Patience builds endurance"),
        Quote("Action turns ideas real"),

        Quote("Consistency turns effort into results"),
        Quote("Small habits create big change"),
        Quote("Focus simplifies progress"),
        Quote("Discipline creates direction"),
        Quote("Progress is built daily"),
        Quote("Effort beats intention"),
        Quote("Action builds confidence"),
        Quote("Patience supports growth"),
        Quote("Consistency builds mastery"),
        Quote("Simple work done daily wins")
    )

    fun getRandomQuote(): Quote {
        return quotes.random()
    }
}

