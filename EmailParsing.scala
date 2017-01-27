
object EmailParsing {

  def main(args: Array[String]): Unit = {

    val input="anmol.mehta93@gmail.co.in"
    val Email ="""([a-zA-Z0-9]+[\w+-\.]*)@([a-z0-9\.]+)""".r
    input match {
     case Email(user, domain) => println(user + " AT " + domain)
     case _=> print("Not valid MAil")
    }
  }

}
