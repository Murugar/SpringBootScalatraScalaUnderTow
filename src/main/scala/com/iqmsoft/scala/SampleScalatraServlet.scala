package com.iqmsoft.scala

import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport
import org.springframework.beans.factory.annotation.Autowired

class SampleScalatraServlet extends ScalatraServlet with ScalateSupport {

  @Autowired
  var repository: BookingRepository = _

  get("/") {
    contentType = "text/html"
    val all = repository.findAll()
    all.forEach(println(_))
    ssp("/view")
  }

  get("/nossp") {
    "No SSP"
  }

}
