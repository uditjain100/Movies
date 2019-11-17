package udit.programmer.co.movies


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_base.*

/**
 * A simple [Fragment] subclass.
 */
class BaseFragment : Fragment() {

    val list: ArrayList<Movie> = arrayListOf()

    val mmoviename = arrayOf(
        "Captain America(Serial)",
        "Howard The Duck",
        "The Puniser",
        "Captain America(Movie)",
        "The Fantistic Four",
        "Blade",
        "X-Men",
        "Blade II",
        "Spider Man",
        "Daredevil",
        "X2",
        "Hulk",
        "The Puniser(Movie)",
        "SpiderMan 2",
        "Blade: Trinity",
        "Elektra",
        "Fantastic Four",
        "X-Men : The Last Stand",
        "Ghost Rider",
        "SpiderMan 3",
        "Fantastic Four: Rise of the Silver Surfer",
        "Iron Man",
        "The Incredible Hulk",
        "Iron Man 2",
        "Thor",
        "Captain America: The First Avenger",
        "The Avengers",
        "Iron Man 3",
        "Thor: The Dark World",
        "Captain America: The Winter Soldier",
        "Guardians of the Galaxy",
        "Avengers: Age of Ultron",
        "Ant-Man",
        "Captain America: Civil War",
        "Doctor Strange",
        "Guardians of the Galaxy Vol. 2",
        "Spider-Man: Homecoming",
        "Thor: Ragnarok",
        "Black Panther",
        "Avengers: Infinity War",
        "Ant-Man and the Wasp",
        "Captain Marvel",
        "Avengers: Endgame",
        "Spider-Man: Far From Home"
    )

    val myear = arrayOf(
        "1944", "1986", "1989", "1990",
        "1994", "1998", "2000", "2002",
        "2002", "2003", "2003", "2003",
        "2004", "2004", "2004", "2005",
        "2005", "2006", "2007", "2007",
        "2007",
        "2008", "2008", "2010", "2011",
        "2011", "2012", "2013", "2013",
        "2014", "2014", "2015", "2015",
        "2016", "2016", "2017", "2017",
        "2017", "2018", "2018", "2018",
        "2019", "2019", "2019"
    )

    val mimage = arrayOf(

        R.drawable.captainamericaserial,
        R.drawable.howard,
        R.drawable.thepuniser,
        R.drawable.captainamericaserial2,
        R.drawable.fantastic,
        R.drawable.blade,
        R.drawable.xmen,
        R.drawable.blade2,
        R.drawable.spiderman,
        R.drawable.daredevil,
        R.drawable.x2,
        R.drawable.hulk001,
        R.drawable.puniser,
        R.drawable.spiderman2,
        R.drawable.blade3,
        R.drawable.elektra,
        R.drawable.fantastic2,
        R.drawable.xmen2,
        R.drawable.ghost,
        R.drawable.spiderman3,
        R.drawable.fantastic3,
        R.drawable.ironman,
        R.drawable.hulk,
        R.drawable.ironman2,
        R.drawable.thor,
        R.drawable.captainamerica,
        R.drawable.avengers,
        R.drawable.ironman3,
        R.drawable.thorthedarkworld,
        R.drawable.captainamericathewintersoldier,
        R.drawable.guardiansofthegalaxy,
        R.drawable.avengersageofultron,
        R.drawable.antman,
        R.drawable.captainamericacivilwar,
        R.drawable.doctorstrange,
        R.drawable.guardiansofthegalaxyvol2,
        R.drawable.spidermanhomecoming,
        R.drawable.thorrangnrock,
        R.drawable.blackpanther,
        R.drawable.avengersinfinitywar,
        R.drawable.antmanandthewasp,
        R.drawable.captainmarvel,
        R.drawable.avengersendgame,
        R.drawable.spidermanfarfromhome
    )

    val mlinks = arrayOf(
        "en.wikipedia.org/wiki/Captain_America_(serial)",
        "en.wikipedia.org/wiki/Howard_the_Duck_(film)",
        "en.wikipedia.org/wiki/The_Punisher_(1989_film)",
        "en.wikipedia.org/wiki/Captain_America_(1990_film)",
        "en.wikipedia.org/wiki/The_Fantastic_Four_(unreleased_film)",
        "en.wikipedia.org/wiki/Blade_(film)",
        "en.wikipedia.org/wiki/X-Men_(film)",
        "en.wikipedia.org/wiki/Blade_II",
        "en.wikipedia.org/wiki/Spider-Man_(2002_film)",
        "en.wikipedia.org/wiki/Daredevil_(film)",
        "en.wikipedia.org/wiki/X2_(film)",
        "en.wikipedia.org/wiki/Hulk_(film)",
        "en.wikipedia.org/wiki/The_Punisher_(2004_film)",
        "en.wikipedia.org/wiki/Spider-Man_2",
        "en.wikipedia.org/wiki/Blade:_Trinity",
        "en.wikipedia.org/wiki/Elektra_(2005_film)",
        "en.wikipedia.org/wiki/Fantastic_Four_(2005_film)",
        "en.wikipedia.org/wiki/X-Men:_The_Last_Stand",
        "en.wikipedia.org/wiki/Ghost_Rider_(2007_film)",
        "en.wikipedia.org/wiki/Spider-Man_3",
        "en.wikipedia.org/wiki/Fantastic_Four:_Rise_of_the_Silver_Surfer",
        "en.wikipedia.org/wiki/Iron_Man_(2008_film)",
        "en.wikipedia.org/wiki/The_Incredible_Hulk_(film)",
        "en.wikipedia.org/wiki/Iron_Man_2",
        "en.wikipedia.org/wiki/Thor_(film)",
        "en.wikipedia.org/wiki/Captain_America:_The_First_Avenger",
        "en.wikipedia.org/wiki/The_Avengers_(2012_film)",
        "en.wikipedia.org/wiki/Iron_Man_3",
        "en.wikipedia.org/wiki/Thor:_The_Dark_World",
        "en.wikipedia.org/wiki/Captain_America:_The_Winter_Soldier",
        "en.wikipedia.org/wiki/Guardians_of_the_Galaxy_(film)",
        "en.wikipedia.org/wiki/Avengers:_Age_of_Ultron",
        "en.wikipedia.org/wiki/Ant-Man_(film)",
        "en.wikipedia.org/wiki/Captain_America:_Civil_War",
        "en.wikipedia.org/wiki/Doctor_Strange_(2016_film)",
        "en.wikipedia.org/wiki/Guardians_of_the_Galaxy_Vol._2",
        "en.wikipedia.org/wiki/Spider-Man:_Homecoming",
        "en.wikipedia.org/wiki/Thor:_Ragnarok",
        "en.wikipedia.org/wiki/Black_Panther_(film)",
        "en.wikipedia.org/wiki/Avengers:_Infinity_War",
        "en.wikipedia.org/wiki/Ant-Man_and_the_Wasp",
        "en.wikipedia.org/wiki/Captain_Marvel_(film)",
        "en.wikipedia.org/wiki/Avengers:_Endgame",
        "en.wikipedia.org/wiki/Spider-Man:_Far_From_Home"
    )

    val dcmoviesn = arrayOf(
        "Superman and the Mole Men",
        "Stamp Day for Superman",
        "Batman",
        "Superman",
        "Superman II",
        "Swamp Thing",
        "SuperMan3",
        "SuperGirl",
        "Superman 4",
        "The Return Of Swamp Things",
        "Batman",
        "Batman Returns",
        "Batman Foreever",
        "Batman & Robin",
        "Steel",
        "CatWomen",
        "Constantine",
        "Batman Begins",
        "Superman Returns",
        "The Dark Knight",
        "WatchMan",
        "jonah Hex",
        "Green Lantern",
        "The Dark Knight Rises",
        "Man Of Steel",
        "Batman v Superman: Dawn of Justice",
        "Suicide Squad",
        "Wonder Women",
        "Justice League",
        "Aquaman",
        "Shazam",
        "Joker"
    )

    val dcyears = arrayOf(
        "1951", "1954", "1966", "1978",
        "1980", "1982", "1983", "1984",
        "1987", "1989", "1989", "1992",
        "1995", "1997", "1997", "2004",
        "2005", "2005", "2006", "2008",
        "2009", "2010", "2011", "2012",
        "2013", "2016", "2016", "2017",
        "2017", "2018", "2019", "2019"
    )

    val dcimages = arrayOf(
        R.drawable.supermanmolemen,
        R.drawable.stampday,
        R.drawable.batman,
        R.drawable.superman,
        R.drawable.superman2,
        R.drawable.swampthing,
        R.drawable.superman3,
        R.drawable.supergirl,
        R.drawable.superman4,
        R.drawable.returnofswampthing,
        R.drawable.batman1989,
        R.drawable.batmanreturns,
        R.drawable.batmanforever,
        R.drawable.batmanandfore,
        R.drawable.steel,
        R.drawable.catwomen,
        R.drawable.constatine,
        R.drawable.batmanbegins,
        R.drawable.supermanreturns,
        R.drawable.thedarkknight,
        R.drawable.watchman,
        R.drawable.johanhex,
        R.drawable.greenlantern,
        R.drawable.thedarkknightrises,
        R.drawable.manofsteel,
        R.drawable.batmanvssuperman,
        R.drawable.suicide,
        R.drawable.wonderwoman,
        R.drawable.justiceleague,
        R.drawable.aquaman,
        R.drawable.shazam,
        R.drawable.jokar
    )

    val dclinks = arrayOf(
        "en.wikipedia.org/wiki/Superman_and_the_Mole_Men",
        "en.wikipedia.org/wiki/Stamp_Day_for_Superman",
        "en.wikipedia.org/wiki/Batman_(1966_film)",
        "en.wikipedia.org/wiki/Superman_(1978_film)",
        "en.wikipedia.org/wiki/Superman_II",
        "en.wikipedia.org/wiki/Swamp_Thing_(film)",
        "en.wikipedia.org/wiki/Superman_III",
        "en.wikipedia.org/wiki/Supergirl_(1984_film)",
        "en.wikipedia.org/wiki/Superman_IV:_The_Quest_for_Peace",
        "en.wikipedia.org/wiki/The_Return_of_Swamp_Thing",
        "en.wikipedia.org/wiki/Batman_(1989_film)",
        "en.wikipedia.org/wiki/Batman_Returns",
        "en.wikipedia.org/wiki/Batman_Forever",
        "en.wikipedia.org/wiki/Batman_%26_Robin_(film)",
        "en.wikipedia.org/wiki/Steel_(1997_film)",
        "en.wikipedia.org/wiki/Catwoman_(film)",
        "en.wikipedia.org/wiki/Constantine_(film)",
        "en.wikipedia.org/wiki/Batman_Begins",
        "en.wikipedia.org/wiki/Superman_Returns",
        "en.wikipedia.org/wiki/The_Dark_Knight_(film)",
        "en.wikipedia.org/wiki/Watchmen_(film)",
        "en.wikipedia.org/wiki/Jonah_Hex_(film)",
        "en.wikipedia.org/wiki/Green_Lantern_(film)",
        "en.wikipedia.org/wiki/The_Dark_Knight_Rises",
        "en.wikipedia.org/wiki/Man_of_Steel_(film)",
        "en.wikipedia.org/wiki/Batman_v_Superman:_Dawn_of_Justice",
        "en.wikipedia.org/wiki/Suicide_Squad_(film)",
        "en.wikipedia.org/wiki/Wonder_Woman_(2017_film)",
        "en.wikipedia.org/wiki/Justice_League_(film)",
        "en.wikipedia.org/wiki/Aquaman_(film)",
        "en.wikipedia.org/wiki/Shazam!_(film)",
        "en.wikipedia.org/wiki/Joker_(2019_film)"

    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_base, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = arguments?.getString("NAME")

        if (text == "MARVEL") {
            for (i in 0..43) {
                list.add(
                    Movie(
                        mmoviename[i],
                        myear[i],
                        mimage[i],
                        mlinks[i]
                    )
                )
            }

        } else {
            for (i in 0..31) {
                list.add(
                    Movie(
                        dcmoviesn[i],
                        dcyears[i],
                        dcimages[i],
                        dclinks[i]
                    )
                )
            }
        }

        val adapter = MovieAdapter(list)
        adapter.onItemClickListener = object : MovieOnItemClickListener {
            override fun onClick(movie: Movie) {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://${movie.link}"))
                startActivity(Intent.createChooser(i, "Select Browser"))
            }
        }
        lv.adapter = adapter
    }

}