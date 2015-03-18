package com.larroy.ibclient

/**
 * @author piotr 2/10/15
 */
case class IBApiError(code: Int, msg: String) extends Exception(msg) {
  def this(msg: String) = this(-1, msg)
}
