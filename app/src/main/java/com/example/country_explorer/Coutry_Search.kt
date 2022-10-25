package com.example.country_explorer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.country_explorer.databinding.CountrySearchBinding
import retrofit2.Retrofit

class Coutry_Search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.country_search)
        val binding = CountrySearchBinding.inflate(layoutInflater) //클래스 객체화
        val view = binding.root //객체화한 뷰
        setContentView(view) //뷰를 메모리상으로 올림(화면 표시)

//        val retrofit = Retrofit.Builder()
//            .baseUrl()

    }
}