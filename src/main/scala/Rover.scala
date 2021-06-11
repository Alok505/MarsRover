import Board.size

case class Rover(px:Int, py:Int, bearing:Bearing) {

override def toString = s"Rover is at coordinates ($px, $py) facing ${bearing.toString}"

}
