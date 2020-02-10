package app.aoyagi.makkan.jankenlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun goo(view: View?){
        player.setImageResource(R.drawable.goo)

        when (Random().nextInt(3)){
            0 -> {
                cpu.setImageResource(R.drawable.goo)
                result.text = "引き分けです"
                result.setTextColor(Color.BLACK)

            }

            1 -> {
                cpu.setImageResource(R.drawable.choki)
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.RED)
            }

            2 -> {
                cpu.setImageResource(R.drawable.paa)
                result.text = "あなたの負けです"
                result.setTextColor(Color.BLACK)

            }
        }
    }
    fun choki(view: View?){
        player.setImageResource(R.drawable.choki)

        when (Random().nextInt(3)){
            0 -> {
                cpu.setImageResource(R.drawable.choki)
                result.text = "引き分けです"
                result.setTextColor(Color.BLACK)
            }

            1 -> {
                cpu.setImageResource(R.drawable.paa)
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.RED)
            }

            2 -> {
                cpu.setImageResource(R.drawable.goo)
                result.text = "あなたの負けです"
                result.setTextColor(Color.BLACK)
            }
        }
    }
    fun paa(view: View?){
        player.setImageResource(R.drawable.paa)

        when (Random().nextInt(3)){
            0 -> {
                cpu.setImageResource(R.drawable.paa)
                result.text = "引き分けです"
                result.setTextColor(Color.BLACK)

            }

            1 -> {
                cpu.setImageResource(R.drawable.goo)
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.RED)
            }

            2 -> {
                cpu.setImageResource(R.drawable.choki)
                result.text = "あなたの負けです"
                result.setTextColor(Color.BLACK)

            }
        }
    }
}
