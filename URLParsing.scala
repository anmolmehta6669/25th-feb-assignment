package Assignment2

object URLParsing {
  def main(args: Array[String]): Unit = {
    val str="https://aws.amazon.com/console/home?state=hash&isauthcode=true&code=112"
    str match{
      case URL(protocol,domain,path,params)=> println(s"protocol= $protocol \ndomain=  $domain \npath= $path \nparams= $params")
      case _ => println("Incorrect URL")
    }
  }
}
/**
  *   Things that doesn't work in the program yet are:
  *   no check if the domain is absolutely correct or not fr example aws.amazon. will also work
  *   Last character if & should give incorrect but its still giving result
  *   if = is removed it should give incorrect url but its just skipping that param from the Map
  *   if we remove the LHS of param its still working
  *

 */