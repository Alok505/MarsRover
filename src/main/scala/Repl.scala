
import Bearing.{E, N}

import annotation.tailrec

object Repl extends App {

  @tailrec def loop(board: Board, rover: Rover): Unit = {


    //read players move
    //move validation
    //calculate new position
    //once move is valid, update rover position
    //redraw board


    val newRover = readMovement(rover)
    val updatedBoard = Board.updateBoard(newRover)
    Board.printBoard(updatedBoard)

    println(newRover.toString)

    loop(board, newRover)
  }

  def readMovement(rover: Rover): Rover = parseCommand().action(rover)

  def parseCommand(): Command = readLine match {
    case "F" => Forward()
    case "AC" => AntiClockwise()
    case "C" => Clockwise()
    case _ => InvalidCommand()

  }

  //Initial a new rover with starting coordinate and bearing
  val r = Rover(0, 0, N)

  println("---Welcome to Mars Rover Project---")
  println("Please Type:\n F to move forward \n C to turn the rover Clockwise \n AC to turn the rover AntiClockwise")
  println("------------------------------------\n")

  Board.printBoard(Board.updateBoard(r))
  loop(Board, r)

}
