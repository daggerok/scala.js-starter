package webapp

import com.daggerok.Calc._
import scala.scalajs.js.JSApp

// gradle run
object Main extends App {
  WebApp.main()
}

// sbt run
object WebApp extends JSApp {
  def main(): Unit = {
    println(s"""

      Hello, world! I'm sure, you know, but...

      anyway, I have to tell you this!

      1 + 2 = ${add(1,2)} 

      :)
      
    """)
  }
}
