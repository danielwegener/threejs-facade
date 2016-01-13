package org.denigma.threejs.extras.core

import org.denigma.threejs._
import org.denigma.threejs.core.Geometry
import org.denigma.threejs.extras.geometries.{ExtrudeGeometry, ShapeGeometry}
import org.denigma.threejs.math.{Vector, Vector2}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName}

@js.native
@JSName("THREE.Curve")
class Curve[DIM <: Vector[DIM]] extends js.Object {
  def getPoint(t: Double): DIM = js.native
  def getPointAt(u: Double): DIM = js.native
  def getPoints(divisions: Double): js.Array[DIM] = js.native
  def getSpacedPoints(divisions: Double): js.Array[DIM] = js.native
  def getLength(): Double = js.native
  def getLengths(divisions: Double): js.Array[Double] = js.native
  def updateArcLengths(): Unit = js.native
  def getUtoTmapping(u: Double, distance: Double): Double = js.native
  def getTangent(t: Double): DIM = js.native
  def getTangentAt(u: Double): DIM = js.native
}

@js.native
@JSName("THREE.Curve")
object Curve extends js.Object {
  var Utils: js.Any = js.native
  def create(constructorFunc: js.Function, getPointFunc: js.Function): js.Function = js.native
}

@js.native
@JSName("THREE.CurvePath")
class CurvePath extends Curve[Vector2] {
  var curves: js.Array[Curve[Vector2]] = js.native
  var bends: js.Array[Path] = js.native
  var autoClose: Boolean = js.native
  def add(curve: Curve[Vector2]): Unit = js.native
  def checkConnection(): Boolean = js.native
  def closePath(): Unit = js.native
  override def getPoint(t: Double): Vector2 = js.native
  override def getLength(): Double = js.native
  def getCurveLengths(): Double = js.native
  def getBoundingBox(): BoundingBox = js.native
  def createPointsGeometry(divisions: Double): Geometry = js.native
  def createSpacedPointsGeometry(divisions: Double): Geometry = js.native
  def createGeometry(points: js.Array[Vector2]): Geometry = js.native
  def addWrapPath(bendpath: Path): Unit = js.native
  def getTransformedPoints(segments: Double, bends: Path = js.native): js.Array[Vector2] = js.native
  def getTransformedSpacedPoints(segments: Double, bends: js.Array[Path] = js.native): js.Array[Vector2] = js.native
  def getWrapPoints(oldPts: js.Array[Vector2], path: Path): js.Array[Vector2] = js.native
}

// TODO: type it
@js.native
trait FontData extends js.Any

/**
 * TextGeometry uses typeface.js generated fonts. Some existing fonts can be found located in /examples/fonts and must be included in the page.
 */
@js.native
@JSName("THREE.Font")
class Font(val data: FontData) extends js.Object {

  /**
   * @param size defaults to `100`
   * @param divisions defaults to `4`
   */
  def generateShapes(text: String, size: Double = js.native, divisions: Int): js.Array[Path] = js.native

}

/**
 * A 2d path representation, comprising of points, lines, and cubes, similar to the html5 2d canvas api. It extends CurvePath.
 * @see [[http://threejs.org/docs/#Reference/Extras.Core/Path]]
 */
@js.native
@JSName("THREE.Path")
class Path extends CurvePath {
  /** Creates a Path from the points. The first vector defines the offset. After that the lines get defined. */
  def this(points: Vector2 = js.native) = this()
  // TODO: Type actions array
  /** The possible actions that define the path. */
  var actions: js.Array[js.Any] = js.native
  /** Adds to the Path from the points. The first vector defines the offset. After that the lines get defined. */
  def fromPoints(vectors: js.Array[Vector2]): Unit = js.native
  /** This moves the offset to x and y */
  def moveTo(x: Double, y: Double): Unit = js.native
  /** This creates a line from the offset to X and Y and updates the offset to X and Y. */
  def lineTo(x: Double, y: Double): Unit = js.native
  /** This creates a quadratic curve from the offset to x and y with cpX and cpY as control point and updates the offset to x and y. */
  def quadraticCurveTo(cpX: Double, cpY: Double, x: Double, y: Double): Unit = js.native
  /** This creates a bezier curve from the last offset to x and y with cp1X, cp1Y and cp1X, cp1Y as control points and updates the offset to x and y. */
  def bezierCurveTo(cp1X: Double, cp1y: Double, cp2X: Double, cp2Y: Double, x: Double, y: Double): Unit = js.native
  /**
   * Connects a new SplineCurve onto the path.
   * @param points An array of Vector2s
   */
  def splineThru(points: js.Array[Vector2]): Unit = js.native

  /**
   * Draw an arc offset from the last call
   * @param x The center of the arc offset from the last call
   * @param y The center of the arc offset from the last call
   * @param radius The radius of the arc
   * @param startAngle The start angle in radians
   * @param endAngle The end angle in radians
   * @param clockwise Sweep the arc clockwise. Defaults to false
   */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, clockwise: Boolean): Unit = js.native

  /**
   * Draw an arc absolutely positioned
   * @param x The absolute center of the arc
   * @param y The absolute center of the arc
   * @param radius The radius of the arc
   * @param startAngle The start angle in radians
   * @param endAngle The end angle in radians
   * @param clockwise Sweep the arc clockwise. Defaults to false
   */
  def absarc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, clockwise: Boolean): Unit = js.native

  /**
   * Draw an ellipse offset from the last call
   * @param x The center of the ellipse offset from the last call
   * @param y The center of the ellipse offset from the last call
   * @param xRadius The radius of the ellipse in the x axis
   * @param yRadius The radius of the ellipse in the y axis
   * @param startAngle The start angle in radians
   * @param endAngle The end angle in radians
   * @param clockwise Sweep the ellipse clockwise. Defaults to false
   * @param rotation The rotation angle of the ellipse in radians, counterclockwise from the positive X axis. Optional, defaults to 0
   */
  def ellipse(x: Double, y: Double, xRadius: Double, yRadius: Double, startAngle: Double,
    endAngle: Double, clockwise: Boolean = js.native, rotation: Double = js.native): Unit = js.native

  /**
   * Draw an ellipse absolutely positioned
   * @param x The center of the ellipse offset from the last call
   * @param y The center of the ellipse offset from the last call
   * @param xRadius The radius of the ellipse in the x axis
   * @param yRadius The radius of the ellipse in the y axis
   * @param startAngle The start angle in radians
   * @param endAngle The end angle in radians
   * @param clockwise Sweep the ellipse clockwise. Defaults to false
   * @param rotation The rotation angle of the ellipse in radians, counterclockwise from the positive X axis. Optional, defaults to 0
   */
  def absellipse(x: Double, y: Double, xRadius: Double, yRadius: Double, startAngle: Double,
    endAngle: Double, clockwise: Boolean = js.native, rotation: Double = js.native): Unit = js.native

  /**
   * Converts the Path into an array of Shapes. By default solid shapes are defined
   * clockwise (CW) and holes are defined counterclockwise (CCW). If isCCW is set to true,
   * then those are flipped. If the paramater noHoles is set to true then all paths are
   * set as solid shapes and isCCW is ignored.
   * @param isCCW Changes how solids and holes are generated
   * @param noHoles Whether or not to generate holes
   */
  def toShapes(isCCW: Boolean, noHoles: Boolean): js.Array[Shape] = js.native
}

@js.native
@JSName("THREE.Shape")
class Shape extends Path {
  def this(points: js.Array[Vector2] = js.native) = this()
  var holes: js.Array[Path] = js.native
  def extrude(): ExtrudeGeometry = js.native
  def extrude(options: js.Any): ExtrudeGeometry = js.native
  def makeGeometry(): ShapeGeometry = js.native
  def makeGeometry(options: js.Any): ShapeGeometry = js.native

  def getPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
  def getSpacedPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
  def extractAllPoints(divisions: Double): js.Any = js.native
  def extractPoints(divisions: Double): js.Array[Vector2] = js.native
  def extractAllSpacedPoints(divisions: Vector2): js.Any = js.native
}