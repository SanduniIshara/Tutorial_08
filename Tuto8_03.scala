object Tuto8_03 {

  
    def main(args: Array[String]): Unit = {
      val toUpper: String => String = _.toUpperCase
      val toLower: String => String = _.toLowerCase

      val formatNames: (String, String => String) => String = (name, formatFunction) => formatFunction(name)

      val names = List("Benny", "Niroshan", "Saman", "Kumara")

      println(formatNames(names.head, toUpper))
      println(names(1).head + formatNames(names(1).charAt(1).toString, toUpper) + names(1).drop(2))
      println(formatNames(names(2), toLower))
      println(names.last.init + formatNames(names.last.last.toString, toUpper))
    }
  }
}