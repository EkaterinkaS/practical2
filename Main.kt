@file:Suppress("UNUSED_EXPRESSION")

package com.example.myday.view
import  com.example.myday.model.Carnivorous
import com.example.myday.model.Herbivores

fun main () {
    var Herbivore1 =Herbivores("заяц")
    var Herbivore2 =Herbivores("слон")

    val herbivores1 = Herbivores("Заяц")
    herbivores1.favouriteFood = "Морковка"
    val herbivores2 = Herbivores("Слон")
    herbivores2.favouriteFood = "Трава"

    val predator1 = Carnivorous("Волк")
    predator1.favouriteFood = herbivores1

    val listOfHerbivores:List<Herbivores> = listOf(herbivores1, herbivores2)
    val listOfCarnivorous:List<Carnivorous> = listOf(predator1)

    for(index in listOfHerbivores.indices){
        println("Это животное ${listOfHerbivores[index].animalName1} его любимая еда ${listOfHerbivores[index].favouriteFood}")
    }

    for(index in listOfCarnivorous.indices){
        println("Это животное ${listOfCarnivorous[index].animalName2} его любимая еда ${listOfCarnivorous[index].favouriteFood?.animalName1}")
    }


}





