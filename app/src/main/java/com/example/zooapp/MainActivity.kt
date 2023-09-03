package com.example.zooapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter


class MainActivity : AppCompatActivity() {

    var listOfAnimals = ArrayList<Animal>()
    var adapter:AnimalAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // load animals
        listOfAnimals.add(
            Animal("Baboo", "Baboon lives in big place...", R.drawable.baboon)
        )

        listOfAnimals.add(
            Animal("Baboo", "Baboon lives in big place...", R.drawable.baboon)
        )

        listOfAnimals.add(
            Animal("Bulldog", "Bulldog lives in big place...", R.drawable.bulldog)
        )


        listOfAnimals.add(
            Animal("Panda", "Panda lives in big place...", R.drawable.panda)
        )


        listOfAnimals.add(
            Animal("Swallow", "Swallow Bird lives in big place...", R.drawable.swallow_bird)
        )

        listOfAnimals.add(
            Animal("Tiger", "Tiger lives in big place...", R.drawable.white_tiger)
        )


        listOfAnimals.add(
            Animal("Zebra", "Zebra lives in big place...", R.drawable.zebra)
        )

        adapter = AnimalAdapter(listOfAnimals)

    }
        class AnimalAdapter:BaseAdapter{

           var listOfAnimals =  ArrayList<Animal>()
            constructor( listOfAnimals: ArrayList<Animal>):super()
            {

                this.listOfAnimals = listOfAnimals
            }
            override fun getCount(): Int {

                return listOfAnimals.size
            }

            override fun getItem(position: Int): Any {
               return listOfAnimals[position]
            }

            override fun getItemId(position: Int): Long {
                return position.toLong()

            }



            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val animal = listOfAnimals[position]
                /*
                var myView = LayoutInflator.infalte(R.layout.animal_ticket, null)
                myView.tvName.text = animal.name
                myView.tvDes.text = animal.des
                myView.tvAnimalImage.image.setImageResource(animal.image)
                */
                return myView
            }

        }

}