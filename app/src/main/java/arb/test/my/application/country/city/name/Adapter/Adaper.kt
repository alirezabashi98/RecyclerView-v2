package arb.test.my.application.country.city.name.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import arb.test.my.application.country.city.name.DataClass.MyDataClass
import arb.test.my.application.country.city.name.R

class Adaper(private val data : List<MyDataClass>):
    RecyclerView.Adapter<Adaper.ViewHolder>() {

    inner class ViewHolder(view : View):RecyclerView.ViewHolder(view){

        val relativeLayout = view.findViewById<RelativeLayout>(R.id.lin_custom)
        val title = view.findViewById<TextView>(R.id.tv_custom_title)
        val message = view.findViewById<TextView>(R.id.tv_custom_message)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.custom_list,parent,false))
    }

    override fun getItemCount(): Int = data.count()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.relativeLayout.setBackgroundResource(data[position].img)
        holder.title.text = data[position].title
        holder.message.text = data[position].message

    }

}