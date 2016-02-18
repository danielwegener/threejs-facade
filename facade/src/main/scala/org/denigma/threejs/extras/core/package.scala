package org.denigma.threejs.extras.core

import org.denigma.threejs._
import org.denigma.threejs.extras.geometries.{ ShapeGeometry, ExtrudeGeometry }
import org.denigma.threejs.math.{ Vector2, Vector }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

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

/**
 * TextGeometry uses typeface.js generated fonts. Some existing fonts can be found located in /examples/fonts and must be included in the page.
 */
@js.native
@JSName("THREE.Font")
//TODO: type me
class Font(val data:js.Any) extends js.Object {

}

@js.native
@JSName("THREE.Path")
class Path extends CurvePath {
  def this(points: Vector2 = js.native) = this()
  var actions: js.Array[PathAction] = js.native
  def fromPoints(vectors: js.Array[Vector2]): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def lineTo(x: Double, y: Double): Unit = js.native
  def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): Unit = js.native
  def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): Unit = js.native
  def splineThru(pts: js.Array[Vector2]): Unit = js.native
  def arc(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = js.native
  def absarc(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = js.native
  def ellipse(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = js.native
  def absellipse(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = js.native
  def getSpacedPoints(): js.Array[Vector2] = js.native
  def getSpacedPoints(divisions: Double, closedPath: Boolean): js.Array[Vector2] = js.native
  def getPoints(): js.Array[Vector2] = js.native
  def getPoints(divisions: Double, closedPath: Boolean): js.Array[Vector2] = js.native
  def toShapes(): js.Array[Shape] = js.native
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