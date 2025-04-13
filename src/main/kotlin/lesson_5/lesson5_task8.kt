package org.example.lesson5_task8

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
    val quotes= doc.getElementsByTag("article")
    quotes.forEach() {
        println("${quotes.text()}\n")
    }

}