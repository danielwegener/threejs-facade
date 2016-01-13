package org.denigma.threejs.extras.curves

import org.denigma.threejs.extras.core.Curve
import org.denigma.threejs.math.{ Vector2, Vector3 }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Alias for [[EllipseCurve]]
  * @see [[http://threejs.org/docs/#Reference/Extras.Curves/ArcCurve]]
  */
@js.native
@JSName("THREE.ArcCurve")
@deprecated(message = "Use EllipseCurve", since = "r73")
abstract class ArcCurve extends Curve[Vector2]{
}

/**
  * Create a smooth 3d spline curve from a series of points that loops back onto itself
  * @param points An array of Vector3 points
  * @see [[http://threejs.org/docs/#Reference/Extras.Curves/ClosedSplineCurve3]]
  */
@js.native
@JSName("THREE.ClosedSplineCurve3")
class ClosedSplineCurve3(var points: js.Array[Vector3]) extends Curve[Vector3]

/**
  * Create a smooth 2d cubic bezier curve.
  * @param v0 The starting point
  * @param v1 The first control point
  * @param v2 The second control point
  * @param v3 The ending point
  * @see [[http://threejs.org/docs/#Reference/Extras.Curves/CubicBezierCurve]]
  */
@js.native
@JSName("THREE.CubicBezierCurve")
class CubicBezierCurve(var v0: Vector2, var v1: Vector2, var v2: Vector2, var v3: Vector2) extends Curve[Vector2]

/**
  * Create a smooth 3d cubic bezier curve.
  * @param v0 The starting point
  * @param v1 The first control point
  * @param v2 The second control point
  * @param v3 The ending point
  * @see [[http://threejs.org/docs/#Reference/Extras.Curves/CubicBezierCurve3]]
  */
@js.native
@JSName("THREE.CubicBezierCurve3")
class CubicBezierCurve3(var v0: Vector3, var v1: Vector3, var v2: Vector3, var v3: Vector3) extends Curve[Vector3]

/**
  * Creates a 2d curve in the shape of an ellipse.
  * Note: When going clockwise it's best to set the start angle to (Math.PI * 2) and then work towards lower numbers.
  * @param aX The X center of the ellipse
  * @param aY The Y center of the ellipse
  * @param xRadius The radius of the ellipse in the x direction
  * @param yRadius The radius of the ellipse in the y direction
  * @param aStartAngle The start angle of the curve in radians starting from the middle right side
  * @param aEndAngle The end angle of the curve in radians starting from the middle right side
  * @param aClockwise Whether the ellipse is clockwise
  * @param aRotation The rotation angle of the ellipse in radians, counterclockwise from the positive X axis (optional)
  * @see [[http://threejs.org/docs/#Reference/Extras.Curves/EllipseCurve]]
  */
@js.native
@JSName("THREE.EllipseCurve")
class EllipseCurve(var aX: Double, var aY: Double, var xRadius: Double, var yRadius: Double, var aStartAngle: Double, var aEndAngle: Double, var aClockwise: Boolean, var aRotation:Double = js.native) extends Curve[Vector2]

/**
  * A curve representing a 2d line segment
  * @param v1 The start point
  * @param v2 The end point
  * @see [[http://threejs.org/docs/#Reference/Extras.Curves/LineCurve]]
  */
@js.native
@JSName("THREE.LineCurve")
class LineCurve(var v1: Vector2, var v2: Vector2) extends Curve[Vector2]

/**
  * A curve representing a 3d line segment
  * @see [[http://threejs.org/docs/#Reference/Extras.Curves/LineCurve3]]
  */
@js.native
@JSName("THREE.LineCurve3")
class LineCurve3(var v1: Vector3, var v2: Vector3) extends Curve[Vector3]

/**
  * Create a smooth 2d quadratic bezier curve.
  * @param v0 The starting point
  * @param v1 The middle control point
  * @param v2 The ending point
  * @see [[http://threejs.org/docs/#Reference/Extras.Curves/QuadraticBezierCurve]]
  */
@js.native
@JSName("THREE.QuadraticBezierCurve")
class QuadraticBezierCurve(var v0: Vector2, var v1: Vector2, var v2: Vector2) extends Curve[Vector2]

/**
  * Create a smooth 3d quadratic bezier curve.
  * @param v0 The starting point
  * @param v1 The middle control point
  * @param v2 The ending point
  * @see [[http://threejs.org/docs/#Reference/Extras.Curves/QuadraticBezierCurve3]]
  */
@js.native
@JSName("THREE.QuadraticBezierCurve3")
class QuadraticBezierCurve3(var v0: Vector3, var v1: Vector3, var v2: Vector3) extends Curve[Vector3]


/**
  * Create a smooth 2d spline curve from a series of points
  * @param points An array of [[Vector2]] points
  * @see [[http://threejs.org/docs/#Reference/Extras.Curves/SplineCurve]]
  */
@js.native
@JSName("THREE.SplineCurve")
class SplineCurve(var points: js.Array[Vector2] = js.native) extends Curve[Vector2]

/**
  * Create a smooth 2d spline curve from a series of points
  * @param points An array of [[Vector3]] points
  * @see [[http://threejs.org/docs/#Reference/Extras.Curves/SplineCurve]]
  */
@js.native
@JSName("THREE.SplineCurve3")
class SplineCurve3(var points: js.Array[Vector3] = js.native) extends Curve[Vector3]
