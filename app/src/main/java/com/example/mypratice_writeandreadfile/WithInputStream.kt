package com.example.mypratice_writeandreadfile

import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class WithInputStream {

    //使用 OutputStream寫入二進制資料流
    fun writeFileWithOutputStream(filePath: String, string: String){
        val file = File(filePath)

        //將string轉為ByteArray
        val data = "${string}".toByteArray()

        FileOutputStream(file).use { outputStream ->
            outputStream.write(data)
        }
    }

    //使用InputStream讀取二進制資料流
    fun readFileWithInputStream(filePath: String): ByteArray{
        val file = File(filePath)
        val fileData = ByteArray(file.length().toInt())

        FileInputStream(file).use { inputStream ->
            inputStream.read(fileData)
        }
        return fileData
    }

    //使用 OutputStream寫入二進制資料流(Buffered版)
    fun writeFileWithBuffer(filePath: String, string: String){
        val file = File(filePath)
        //將string轉為ByteArray
        val data = string.toByteArray()

        BufferedOutputStream(FileOutputStream(file)).use { outputStream ->
            outputStream.write(data)
        }
    }

    //使用InputStream讀取二進制資料流(Buffered版)
    fun readFileWithBuffer(filePath: String): ByteArray{
        val file = File(filePath)
        val fileDate = ByteArray(file.length().toInt())

        BufferedInputStream(FileInputStream(file)).use { inputStream ->
            inputStream.read(fileDate)
        }
        return fileDate
    }
}