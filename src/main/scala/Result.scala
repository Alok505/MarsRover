trait Result {
 def message: String
}

case class Success(movement: String) extends Result {

  override def message = movement

}
case class Failure(errorMessage: String) extends Result {
  override def message = errorMessage
}