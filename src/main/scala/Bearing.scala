sealed trait Bearing{
  val shift:(Int,Int)
  val nextClockWiseBearing: Bearing
  val nextAntiClockWiseBearing: Bearing
}

/**
  * Bearing trait to determine which way the rover is facing and
  * where to go when moving forward in that particular direction
  * */

object Bearing {

  case object N extends Bearing{ val shift: (Int, Int) = (-1, 0)
    override val nextClockWiseBearing: Bearing = E
    override val nextAntiClockWiseBearing: Bearing = W
  }

  case object E extends Bearing{ val shift: (Int, Int) = (0, 1)
    override val nextClockWiseBearing: Bearing = S
    override val nextAntiClockWiseBearing: Bearing = N
  }

  case object S extends Bearing{ val shift: (Int, Int) = (1, 0)
    override val nextClockWiseBearing: Bearing = W
    override val nextAntiClockWiseBearing: Bearing = E
  }

  case object W extends Bearing{ val shift: (Int, Int) = (0, -1)
    override val nextClockWiseBearing: Bearing = N
    override val nextAntiClockWiseBearing: Bearing = S
  }


}
