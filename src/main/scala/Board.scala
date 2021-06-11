import Bearing.{E, N, S, W}

import scala.util.Random

class Board {
  val size = 8
  val board: Vector[Vector[Char]] = Vector.fill(size,size)('x')
}
object Board extends Board {

  def printBoard(board: Vector[Vector[Any]]) = {
    print(board.map(_.mkString).mkString("\n"))
    println()

  }

  def updateBoard(rover: Rover): Vector[Vector[Any]] = {
    val validatedX = rover.px
    val validatedY = rover.py

    board.updated(validatedX, board(validatedX).updated(validatedY,"R"))

  }

  def checkRoverPosition(int: Int): Int = {
    int match {
      case num  if num > size => 0
      case num  if num < 0 => size-1
      case num => num
    }
  }










}
