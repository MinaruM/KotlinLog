package jp.techacademy.minaru.moriguchi.kotlinlog
import android.util.Log

class Human :Animal, Thinkable {
    var hobby: String

    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlintest", "「私の名前は"+this.name+"です。年は"+this.age+"歳です。」")
    }

    override fun think(){
        Log.d("kotlintest", this.name+"は"+this.hobby+"について考える。")
    }
}