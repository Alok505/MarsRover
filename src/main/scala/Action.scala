import Board.checkRoverPosition

trait Command {
  def action(rover: Rover): Rover
}

case class Forward() extends Command {
    override def action(rover: Rover): Rover = {
      val bearing = rover.bearing
      val newXP = checkRoverPosition(rover.px+bearing.shift._1)
      val newYP = checkRoverPosition(rover.py+bearing.shift._2)
      Rover(newXP, newYP, bearing)

  }
}
case class Clockwise() extends Command {
  override def action(rover: Rover): Rover = {
    rover.copy(bearing = rover.bearing.nextClockWiseBearing)
  }
}
case class AntiClockwise() extends Command {
  override def action(rover: Rover): Rover = {
    rover.copy(bearing = rover.bearing.nextClockWiseBearing)
  }
}

case class InvalidCommand() extends Command {
  override def action(rover: Rover): Rover = {
    println(message)
    rover
  }

  def message = "Invalid Move Please Type:\n F to move forward \n C to turn the rover Clockwise \n AC to turn the rover AntiClockwise \n"

}
