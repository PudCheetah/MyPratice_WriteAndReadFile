package com.example.mypratice_writeandreadfile

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileReader
import java.io.FileWriter

class WithBufferedReader {

    //寫入檔案
    fun writeFileBuffered(filePath: String, content: String){
        val file = File(filePath)
        BufferedWriter(FileWriter(file)).use { writer ->
            writer.write(content)
            writer.newLine() //寫入換行符號
        }//use 會自動關閉BufferedWriter
    }

    //追加寫入檔案(不會刪除現有資料)
    fun appendTOFile(filePath: String, content: String){
        val file = File(filePath)
        BufferedWriter(FileWriter(file)).use { writer ->
            writer.append(content)
            writer.newLine()
        }
    }

    //一次性讀取檔案
    fun readFileBuffered(filePath: String): String{
        val file = File(filePath)
        return BufferedReader(FileReader(file)).use { it.readText()}
    }

    //逐行讀取檔案
    fun readFileBuffered_lineByLine(filePath: String): MutableList<String>{
        val file = File(filePath)
        var stringList = mutableListOf<String>()
        BufferedReader(FileReader(file)).use { reader ->
            reader.forEachLine { line ->
                stringList.add(line)
            }
        }
        return stringList
    }
}