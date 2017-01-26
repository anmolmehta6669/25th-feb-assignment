package Assignment2

/**
  * Created by Anil Mehta on 26-01-2017.
  */
object URL {
  def apply(protocal:String,domain:String,path:String, params:Map[String,String]):String = {
    protocal + "://" + domain + "/" + path + "?" + params.map(x=>x._1 + "=" + x._2).toString
  }

  def unapply(url:String):Option[(String , String, String,Map[String,String])] = {
    val res1=url.split("://")
    if (res1.length==2) {
      val res2 = res1(1).split("/")
      if (res2.nonEmpty) {
        val res = res2.dropWhile(x => x == res2(0)).takeWhile(x => x != res2(res2.size - 1)).mkString("")
        if (res.nonEmpty) {
          val res3 = res2(res2.size - 1).split("\\?")
          if (res3.length == 2) {
            val res4 = res3(1).split("&").toList
            if (res4.length>1) {
              val res5 = res4.flatMap(x => if (x.split("=").length == 2) Some(x.split("=")(0), x.split("=")(1)) else None).toMap
              if (res5.nonEmpty) Some((res1(0), res2(0), res + "/" + res3(0), res5))
              else None
            }
            else None
          }
          else Some((res1(0), res2(0), res + "/" + res3(0), Map("empty" -> "Params")))
        }
        else Some((res1(0),res2(0),"No Path",Map("empty" -> "Params")))
      }
      else None
    }
    else None
  }

}
