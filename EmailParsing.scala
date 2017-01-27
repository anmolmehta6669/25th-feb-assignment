
object EmailParsing {
  def main(args: Array[String]): Unit = {


    val Email ="""([a-zA-Z0-9]+[\w+-\.]*)@([a-z0-9\.]+)""".r
    val Email(user, domain) = "anmol.mehta93@gmail.co.in"
    println(user + " AT " + domain)
  }

}
