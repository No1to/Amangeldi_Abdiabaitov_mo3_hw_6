package com.example.amangeldi_abdiabaitov_mo3_hw_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.amangeldi_abdiabaitov_mo3_hw_6.adapter.AnimeAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.amangeldi_abdiabaitov_mo3_hw_6.databinding.FragmentAnimeBinding
import com.example.amangeldi_abdiabaitov_mo3_hw_6.model.AnimeModel
import java.util.ArrayList

lateinit var binding: FragmentAnimeBinding
lateinit var adapter: AnimeAdapter
lateinit var recyclerView: RecyclerView

class AnimeFragment : Fragment() {

    private lateinit var binding: FragmentAnimeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAnimeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()


    }

    private fun initView() {
        recyclerView = binding.rvAnime
        adapter = AnimeAdapter()
        recyclerView.adapter = adapter
        adapter.setList(myAnime())
    }

    private fun myAnime(): ArrayList<AnimeModel> {
        val animeList = ArrayList<AnimeModel>()

        val anime = AnimeModel(
            "Наруто",
            "Продолжение полюбившегося многим сериала о приключениях юного ниндзя Наруто. Прошло два года с финала первой части, герои изменились и стали сильнее. ",
            "https://static.hdrezka.ac/i/2022/9/27/b77243bd0a5b5kd85x95m.jpg"
        )
        animeList.add(anime)

        val anime1 = AnimeModel(
            "Блич",
            "Встреча с потусторонним переворачивает жизнь японского школьника Ичиго Куросаки. Узнав о Сообществе Душ и Пустых, он ввязывается в безумный круговорот событий и сам в итоге становится проводником душ в загробный мир - Шинигами.",
            "https://static.hdrezka.ac/i/2016/8/6/eaebac00d56b6pf79p17x.jpg"
        )
        animeList.add(anime1)

        val anime2 = AnimeModel(
            "Ван пис",
            "Бороздящие просторы Гранд-Лайна пираты уже отчаялись найти таинственное сокровище легендарного Короля Пиратов Роджера, сулящие нашедшему их счастливчику роскошную жизнь. Спустя годы для большинства авантюристов мифический клад превратился в красивую легенду, но только не для молодого Монки Д. Луффи",
            "https://static.hdrezka.ac/i/2023/9/27/r52c2eb08d17fus21p32o.jpg"
        )
        animeList.add(anime2)

        val anime3 = AnimeModel(
            "Вольный стиль!",
            "Поступив в старшую школу Иватоби, Харука со своим другом Макото записались в плавательный клуб, подружившись ещё с двумя новыми пловцами и сделав старую знакомую своим менеджером. И пусть Хару просто любил плавать, мечта о спортивных победах таки закралась ему в голову, когда парень узнал, что ему предстоит посоревноваться в скорости с Рином - другом детства.",
            "https://static.hdrezka.ac/i/2022/12/12/tdc6eb98ee9d5im84c56n.jpg"
        )
        animeList.add(anime3)

        val anime4 = AnimeModel(
            "Невеста чародея",
            "В жизни пятнадцатилетней Чисэ Хатори нет никакого счастья, ведь она принадлежит хозяину, который эксплуатирует её на своих полях. Девчонка давно лишилась родителей, а также у неё больше нет друзей.",
            "https://static.hdrezka.ac/i/2023/3/26/h4058fb5d0824fx20i13d.jpg"
        )
        animeList.add(anime4)

        val anime5 = AnimeModel(
            "Хикару и Го",
            "Японский приключенческий аниме-сериал, основанный на популярной одноименной манге за авторством Юми Хоттой, выполненной в жанре «спокон» и посвященной одной из древнейших логических настольных игр, обладающей невероятно глубоким стратегическим содержанием.",
            "https://static.hdrezka.ac/i/2016/10/5/p1e74569331b4ln77c98y.jpg"
        )
        animeList.add(anime5)

        return animeList

    }
}