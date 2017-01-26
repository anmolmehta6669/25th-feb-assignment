package Assignment2


/**
  * Created by Anil Mehta on 26-01-2017.
  */
object EmailParsing {
  def main(args: Array[String]): Unit = {


    val Email ="""([a-zA-Z0-9_+-\.]+)@([a-zA-Z0-9\.]+)""".r
    val Email(user, domain) = "anmol.mehta93@gmail.co.in"
    println(user + " AT " + domain)
  }

}
