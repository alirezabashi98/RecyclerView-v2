package arb.test.my.application.country.city.name

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import arb.test.my.application.country.city.name.Adapter.Adaper
import arb.test.my.application.country.city.name.DataClass.MyDataClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val data = listOf(
        MyDataClass(R.drawable.ilam,
            "Ilam",
            "Ilam is the capital of Ilam province. The population of this city according to the 2016 census was equal to 194,030 people. The city of Ilam is located in a fence of mountains and forested heights and has a temperate mountainous and spring climate. Ilam University of Medical Sciences and Ilam University are two important universities in this city. Ilam has good gas and oil resources."),
        MyDataClass(R.drawable.japan,
            "Japan",
            "The Archipelago of Japan is a country in the Pacific Ocean in East Asia, one of the world's major economic powers and the world's third largest GDP. Japan is a monarchy governed by the Constitution of Japan.") ,
        MyDataClass(R.drawable.china,
        "China",
        "China, officially known as the PRC People's Republic of China, is a country located in East Asia. It is the most populous country in the world according to the list of countries by population with more than 1.433 billion inhabitants and is governed by the Chinese Communist Party in the form of a one-party system.") ,
        MyDataClass(R.drawable.thailand,
            "Thailand",
        "Thailand, officially the Kingdom of Thailand and formerly Siam, is a country in the Indochina Peninsula in Southeast Asia. It is bordered on the north by Myanmar and Laos, on the east by Laos and Cambodia, on the south by Malaysia and the Gulf of Thailand, and on the west by Burma and the Andaman Sea.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adaper(data)
    }
}