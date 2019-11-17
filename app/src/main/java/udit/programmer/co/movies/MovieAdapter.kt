package udit.programmer.co.movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.par_item.view.*

data class MovieAdapter(val movies: ArrayList<Movie>) : BaseAdapter() {

    var onItemClickListener: MovieOnItemClickListener? = null

    override fun getView(pos: Int, convertView: View?, parent: ViewGroup): View {

        val inflator = LayoutInflater.from(parent.context)
        val view: View
        view = convertView ?: inflator.inflate(R.layout.par_item, parent, false)

        view.img.setImageResource(movies[pos].image)
        view.name.text = movies[pos].name
        view.year.text = "[" + movies[pos].year + "]"

        view.img.setOnClickListener {
            onItemClickListener?.onClick(movies[pos])
        }

        return view

    }

    override fun getItem(pos: Int): Movie = movies[pos]

    override fun getItemId(pos: Int): Long = pos.toLong()

    override fun getCount(): Int = movies.size

}