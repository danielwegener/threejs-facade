package org.denigma.threejs.extras.curves

import org.denigma.threejs.extras.core.Curve
import org.denigma.threejs.math.{ Vector2, Vector3 }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.ArcCurve")
class ArcCurve extends EllipseCurve {
  def this(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean) = this()
}

@js.native
@JSName("THREE.ClosedSplineCurve3")
class ClosedSplineCurve3 extends Curve[Vector3] {
  def this(points: js.Array[Vector3] = js.native) = this()
  var points: js.Array[Vector3] = js.native
  override def getPoint(t: Double): Vector3 = js.native
}

@js.native
@JSName("THREE.CubicBezierCurve")
class CubicBezierCurve extends Curve[Vector2] {
  def this(v0: Vector2, v1: Vector2, v2: Vector2, v3: Vector2) = this()
  var v0: Vector2 = js.native
  var v1: Vector2 = js.native
  var v2: Vector2 = js.native
  var v3: Vector2 = js.native
  override def getPoint(t: Double): Vector2 = js.native
  override def getTangent(t: Double): Vector2 = js.native
}

@js.native
@JSName("THREE.CubicBezierCurve3")
class CubicBezierCurve3 extends Curve[Vector3] {
  def this(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3) = this()
  var v0: Vector3 = js.native
  var v1: Vector3 = js.native
  var v2: Vector3 = js.native
  var v3: Vector3 = js.native
  override def getPoint(t: Double): Vector3 = js.native
}

@js.native
@JSName("THREE.EllipseCurve")
class EllipseCurve extends Curve[Vector2] {
  def this(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean) = this()
  var aX: Double = js.native
  var aY: Double = js.native
  var xRadius: Double = js.native
  var yRadius: Double = js.native
  var aStartAngle: Double = js.native
  var aEndAngle: Double = js.native
  var aClockwise: Boolean = js.native
  override def getPoint(t: Double): Vector2 = js.native
}

@js.native
@JSName("THREE.LineCurve")
class LineCurve extends Curve[Vector2] {
  def this(v1: Vector2, v2: Vector2) = this()
  var v1: Vector2 = js.native
  var v2: Vector2 = js.native
  override def getPoint(t: Double): Vector2 = js.native
  override def getPointAt(u: Double): Vector2 = js.native
  override def getTangent(t: Double): Vector2 = js.native
}

@js.native
@JSName("THREE.LineCurve3")
class LineCurve3 extends Curve[Vector3] {
  def this(v1: Vector3, v2: Vector3) = this()
  var v1: Vector3 = js.native
  var v2: Vector3 = js.native
  override def getPoint(t: Double): Vector3 = js.native
}

@js.native
@JSName("THREE.QuadraticBezierCurve")
class QuadraticBezierCurve extends Curve[Vector2] {
  def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
  var v0: Vector2 = js.native
  var v1: Vector2 = js.native
  var v2: Vector2 = js.native
  override def getPoint(t: Double): Vector2 = js.native
  override def getTangent(t: Double): Vector2 = js.native
}

@js.native
@JSName("THREE.QuadraticBezierCurve3")
class QuadraticBezierCurve3 extends Curve[Vector3] {
  def this(v0: Vector3, v1: Vector3, v2: Vector3) = this()
  var v0: Vector3 = js.native
  var v1: Vector3 = js.native
  var v2: Vector3 = js.native
  override def getPoint(t: Double): Vector3 = js.native
}

@js.native
@JSName("THREE.SplineCurve")
class SplineCurve extends Curve[Vector2] {
  def this(points: js.Array[Vector2] = js.native) = this()
  var points: js.Array[Vector2] = js.native
  override def getPoint(t: Double): Vector2 = js.native
}

@js.native
@JSName("THREE.SplineCurve3")
class SplineCurve3 extends Curve[Vector3] {
  def this(points: js.Array[Vector3] = js.native) = this()
  var points: js.Array[Vector3] = js.native
  override def getPoint(t: Double): Vector3 = js.native
}
