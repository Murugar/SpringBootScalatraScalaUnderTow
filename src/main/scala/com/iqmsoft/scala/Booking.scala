package com.iqmsoft.scala

import javax.persistence.{Entity, GeneratedValue, Id}

import scala.beans.BeanProperty

@Entity
case class Booking(@BeanProperty name: String) {

  def this() = this(null)

  @Id
  @GeneratedValue
  var id: Long = _


}
