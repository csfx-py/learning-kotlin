package com.example.recycle

class DataSource {
    fun loadMyListData(): List<MyListData> {
        return listOf<MyListData>(
            MyListData(R.string.list_text1, R.drawable.my_icon),
            MyListData(R.string.list_text2, R.drawable.my_icon),
            MyListData(R.string.list_text3, R.drawable.my_icon),
            MyListData(R.string.list_text4, R.drawable.my_icon),
            MyListData(R.string.list_text5, R.drawable.my_icon),
            MyListData(R.string.list_text6, R.drawable.my_icon),
            MyListData(R.string.list_text7, R.drawable.my_icon),
            MyListData(R.string.list_text8, R.drawable.my_icon),
            MyListData(R.string.list_text9, R.drawable.my_icon),
            MyListData(R.string.list_text10, R.drawable.my_icon)
        )
    }
}