package jp.techacademy.atsushi.kadai_human

import android.util.Log

open class Human : Animal, Thinkable {
    val hobby :String = "アプリ製作"

    constructor(name: String, age:Int): super(name,age){
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say(){
        Log.d("kotlintest","「私の名前は、"+ this.name + "です。年は" + this.age + "です。」")
    }

    override fun think() {
        Log.d("kotlintest","「私は" + hobby + "について考える。")
    }
}