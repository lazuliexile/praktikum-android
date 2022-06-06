package com.example.rv_recyclerview

object dataSample {
    private val namaData = arrayOf(
        "Joni",
        "Jona",
        "Jonu",
        "Jone",
        "Jono"
    )

    private val jenisKelaminData = arrayOf(
        "Laki-Laki",
        "Laki-Laki",
        "Laki-Laki",
        "Laki-Laki",
        "Laki-Laki"
    )

    val listData: ArrayList<dataLatihan>
        get() {
            val listDataLatihan = arrayListOf<dataLatihan>()
            for (position in  namaData.indices){
                val data = dataLatihan()
                data.nama = namaData[position]
                data.jenisKelamin = jenisKelaminData[position]
                listDataLatihan.add(data)
            }
            return listDataLatihan
        }
}