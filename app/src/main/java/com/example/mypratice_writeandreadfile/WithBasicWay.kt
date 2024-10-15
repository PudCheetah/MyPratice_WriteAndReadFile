package com.example.mypratice_writeandreadfile

import java.io.File

class WithBasicWay {

    //寫入檔案
    fun writeFileContent(filePath: String, content: String){
        val file = File(filePath)
        file.writeText(content)
    }

    //追加寫入檔案(不會刪除現有資料)
    fun appendToFile(filePath: String, content: String){
        val file = File(filePath)
        file.appendText(content)
    }

    //一次性讀取檔案
    fun readFileContent(filePath: String): String{
        val file = File(filePath)
        return file.readText()
    }

    //逐行讀取檔案
    fun readFileLineByLine(filePath: String): MutableList<String>{
        val file = File(filePath)
        var stringList = mutableListOf<String>()
        file.forEachLine { line ->
            stringList.add(line)
        }
        return stringList
    }
}