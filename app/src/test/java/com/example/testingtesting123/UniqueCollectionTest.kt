package com.example.testingtesting123

import android.icu.text.Transliterator.Position
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }

    @Test
    fun addAnItem() {
        collection.addItem(Item("Item1"))
        val item = collection.get(0)
        assert(item.name == "Item1")
    }

    @Test
    fun addUniqueItem() {
        collection.addItem(Item("Item1"))
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        assert (collection.size() == 2)
    }

    @Test
    fun getAnItem() {
        collection.addItem(Item("Item1"))
        val item = collection.get(0)
        assert(item.name == "Item1")
    }

    @Test
    fun getItemFromEmpty() {
        val item = collection.get(0)
        assert(item.name == "")
    }

    @Test
    fun removeAnItem() {
        val item = Item("Item1")
        collection.addItem(Item("item"))
        collection.remove(item)
        assert(collection.size() == 0)
    }

    @Test
    fun removeItemFromEmpty() {
        val item = Item("Item1")
        collection.remove(item)
        assert(collection.size() == 1)
    }
}