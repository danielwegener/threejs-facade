package org.denigma.threejs.math

import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.Object3D

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.typedarray.{TypedArray}


@js.native
trait Box[B <: Box[B, VEC], VEC <: Vector[VEC]] extends js.Object {
  /** Sets the lower and upper (x, y) boundaries of this box. */
  def set(min: VEC, max: VEC): B = js.native
  /**
   * Expands the boundaries of this box to include point.
   *
   * @param point Point that should be included in the box.
   */
  def expandByPoint(point: VEC): this.type = js.native
  /**
   * Clamps point within the bounds of this box.
   *
   * @param point          Position to clamp.
   * @param optionalTarget If specified, the clamped result will be copied here.
   */
  def clampPoint(point: VEC, optionalTarget: VEC = js.native): VEC = js.native

  @deprecated(message = ".isIntersectionBox() has been renamed to .intersectsBox().", since = "r74")
  def isIntersectionBox(box: B): Boolean = js.native

  /**
   * Determines whether or not this box intersects box.
   *
   * @param box Box to check for intersection against.
   */
  def intersectsBox(box: B): Boolean = js.native
  /**
   * Sets the upper and lower bounds of this box to include all of the points in points.
   *
   * @param points Set of points that the resulting box will envelop.
   */
  def setFromPoints(points: js.Array[VEC]): this.type = js.native
  /**
   * Returns the width and height of this box.
   *
   * @param optionalTarget If specified, the result will be copied here.
   */
  def size(optionalTarget: VEC = js.native): VEC = js.native
  /**
   * Unions this box with box setting the upper bound of this box to the greater
   * of the two boxes' upper bounds and the lower bound of this box to the lesser of the two boxes' lower bounds.
   *
   * @param box Box that will be unioned with this box.
   */
  def union(box: B): this.type = js.native
  /**
   * Returns a point as a proportion of this box's width and height.
   */
  def getParameter(point: VEC, optionalTarget: VEC): VEC = js.native
  /**
   * Expands each dimension of the box by scalar. If negative, the dimensions
   * of the box will be contracted.
   *
   * @param scalar Distance to expand.
   */
  def expandByScalar(scalar: Double): this.type = js.native
  /**
   * Returns the intersection of this and box, setting the upper bound of this
   * box to the lesser of the two boxes' upper bounds and the lower bound of
   * this box to the greater of the two boxes' lower bounds.
   *
   * @param box Box to intersect with.
   */
  def intersect(box: B): this.type = js.native
  /**
   * Returns true if this box includes the entirety of box.
   * If this and box overlap exactly, this function also returns true.
   *
   * @param box Box to test for inclusion.
   */
  def containsBox(box: B): Boolean = js.native
  /**
   * Adds offset to both the upper and lower bounds of this box, effectively
   * moving this box offset units in 2D space.
   *
   * @param offset Direction and distance of offset.
   */
  def translate(offset: VEC): this.type = js.native

  @deprecated(message = ".empty() has been renamed to .isEmpty().", since = "r74")
  def empty(): Boolean = js.native

  /**
   * Returns true if this box includes zero points within its bounds.
   * Note that a box with equal lower and upper bounds still includes one point, the one both bounds share.
   */
  def isEmpty(): Boolean = js.native

  /**
   * Returns true if this box and box share the same lower and upper bounds.
   *
   * @param box Box to compare.
   */
  override def equals(box: Any): Boolean = js.native
  /**
   * Expands this box equilaterally by vector. The width of this box will be
   * expanded by the x component of vector in both directions.
   * The height of this box will be expanded by the  Amount to expand this box
   * in each dimension.y component of vector in both directions.
   *
   * @param vector Amount to expand this box in each dimension.
   */
  def expandByVector(vector: VEC): this.type = js.native
  /**
   * Copies the values of box to this box.
   *
   * @param box Box to copy.
   */
  def copy(box: B): this.type = js.native
  /** Makes this box empty. */
  def makeEmpty(): this.type = js.native
  /**
   * Returns the center point of this box.
   *
   * @param optionalTarget If specified, the result will be copied here.
   */
  def center(optionalTarget: VEC = js.native): this.type = js.native
  /**
   * Returns the distance from any edge of this box to the specified point.
   * If the point lies inside of this box, the distance will be 0.
   *
   * @param point Point to measure distance to.
   */
  def distanceToPoint(point: VEC): Double = js.native
  /**
   * Returns true if the specified point lies within the boundaries of this box.
   *
   * @param point Vector2 to check for inclusion.
   */
  def containsPoint(point: VEC): Boolean = js.native
  /**
   * Centers this box on center and sets this box's width and height to the values specified in size.
   *
   * @param center Desired center position of the box.
   * @param size   Desired x and y dimensions of the box.
   */
  def setFromCenterAndSize(center: VEC, size: Double): B = js.native
  /** Returns a copy of this box. */
  override def clone(): B = js.native
}

/**
 * Represents a boundary box in 2D space.
 *
 * @constructor Creates a box bounded by min and max.
 * @param min Lower (x, y) boundary of the box.
 * @param max Upper (x, y) boundary of the box.
 */
@js.native
@JSName("THREE.Box2")
class Box2(var min: Vector2 = js.native, var max: Vector2 = js.native) extends Box[Box2, Vector2]

/**
 * Represents a boundary box in 3D space.
 *
 * @constructor Creates a box bounded by min and max.
 * @param min Lower (x, y) boundary of the box.
 * @param max Upper (x, y) boundary of the box.
 */
@js.native
@JSName("THREE.Box3")
class Box3(var min: Vector3 = js.native, var max: Vector3 = js.native) extends Box[Box3, Vector3] {

  def setFromArray(array: Array[Array[Double]]): Unit = js.native

  @deprecated(message = ".isIntersectionSphere() has been renamed to .intersectsSphere().", since = "r74")
  def isIntersectionSphere(sphere: Sphere): Boolean = js.native
  def intersectsPlane(plane: Plane): Boolean = js.native
  def intersectsSphere(sphere: Sphere): Boolean = js.native
}

@js.native
trait HSL extends js.Object {
  var h: Double = js.native
  var s: Double = js.native
  var l: Double = js.native
}

/**
 * Represents a color.
 */
@js.native
@JSName("THREE.Color")
class Color extends js.Object {
  /** @param color initial color */
  def this(color: Color = js.native) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(hex: Double) = this()
  def this(cssColor: String) = this()
  /** Red channel value between 0 and 1. Default is 1. */
  var r: Double = js.native
  /** Green channel value between 0 and 1. Default is 1. */
  var g: Double = js.native
  /** Blue channel value between 0 and 1. Default is 1. */
  var b: Double = js.native
  /**
   * Copies given color.
   *
   * @param color Color to copy.
   */
  def copy(color: Color): this.type = js.native
  /**
   * Copies given color making conversion from gamma to linear space.
   *
   * @param color Color to copy.
   */
  def copyGammaToLinear(color: Color): this.type = js.native
  /** Converts this color from linear to gamma space. */
  def copyLinearToGamma(color: Color): this.type = js.native
  /** Converts this color from gamma to linear space. */
  def convertGammaToLinear(): this.type = js.native
  /** Converts this color from linear to gamma space. */
  def convertLinearToGamma(): this.type = js.native
  /**
   * Sets this color from RGB values.
   *
   * @param r Red channel value between 0 and 1.
   * @param g Green channel value between 0 and 1.
   * @param b Blue channel value between 0 and 1.
   */
  def setRGB(r: Double, g: Double, b: Double): Color = js.native
  /** Returns the hexadecimal value of this color. */
  def getHex(): Double = js.native
  /** Returns the string formated hexadecimal value of this color. */
  def getHexString(): String = js.native
  /**
   * Sets this color from a hexadecimal value.
   *
   * @param hex Color in hexadecimal.
   */
  def setHex(hex: Double): Color = js.native
  /**
   * Sets this color from a CSS-style string. For example, "rgb(250, 0,0)",
   * "rgb(100%, 0%, 0%)", "hsl(0, 100%, 50%)", "#ff0000", "#f00", or "red".
   * Transluent colors such as "rgba(255, 0, 0, 0.5)" and "hsla(0, 100%, 50%, 0.5)"
   * are also accepted, but the alpha-channel coordinate will be discarded.
   *
   * @param style color as a CSS-style string.
   */
  def setStyle(style: String): Color = js.native
  /** Returns the value of this color as a CSS-style string. Example: rgb(255,0,0) */
  def getStyle(): String = js.native
  /**
   * Sets color from hsl
   *
   * @param h hue value between 0.0 and 1.0
   * @param s saturation value between 0.0 and 1.0
   * @param l lightness value between 0.0 and 1.0
   */
  def setHSL(h: Double, s: Double, l: Double): this.type = js.native
  /** Returns an object with properties h, s, and l. */
  def getHSL(target: HSL = js.native): HSL = js.native
  /** Adds given h, s, and l to this color's existing h, s, and l values. */
  def offsetHSL(h: Double, s: Double, l: Double): this.type = js.native
  /** Adds rgb values of given color to rgb values of this color */
  def add(color: Color): this.type = js.native
  /** Sets this color to the sum of color1 and color2 */
  def addColors(color1: Color, color2: Color): this.type = js.native
  /** Adds s to the rgb values of this color */
  def addScalar(s: Double): this.type = js.native
  /** Multiplies this color's rgb values by given color's rgb values */
  def multiply(color: Color): this.type = js.native
  /** Multiplies this color's rgb values by s */
  def multiplyScalar(s: Double): this.type = js.native
  /**
   * Linear interpolation of this colors rgb values and the rgb values of the
   * first argument. The alpha argument can be thought of as the percent between
   * the two colors, where 0 is this color and 1 is the first argument.
   *
   * @param alpha a number between 0 and 1.
   */
  def lerp(color: Color, alpha: Double): this.type = js.native
  /**
   * Returns an array [r,g,b]
   *
   * @param array Optional array to store the color.
   */
  def toArray(array: js.Array[Double] = js.native): js.Array[Double] = js.native
  /** Compares this color and c and returns true if they are the same, false otherwise. */
  def equals(color: Color): Boolean = js.native
  /** Clones this color. */
  override def clone(): Color = js.native
  /**
   * Delegates to .copy, .setStyle, or .setHex depending on input type.
   *
   * @param value either an instance of Color, a hexadecimal value, or a css style string
   */
  def set(value: Color): this.type = js.native
  def setScalar(value: Double): this.type = js.native
}

@js.native
@JSName("THREE.ColorKeywords")
class ColorKeywords extends js.Object

@js.native
@JSName("THREE.ColorKeywords")
object ColorKeywords extends js.Object {
  val aliceblue: Double = js.native
  val antiquewhite: Double = js.native
  val aqua: Double = js.native
  val aquamarine: Double = js.native
  val azure: Double = js.native
  val beige: Double = js.native
  val bisque: Double = js.native
  val black: Double = js.native
  val blanchedalmond: Double = js.native
  val blue: Double = js.native
  val blueviolet: Double = js.native
  val brown: Double = js.native
  val burlywood: Double = js.native
  val cadetblue: Double = js.native
  val chartreuse: Double = js.native
  val chocolate: Double = js.native
  val coral: Double = js.native
  val cornflowerblue: Double = js.native
  val cornsilk: Double = js.native
  val crimson: Double = js.native
  val cyan: Double = js.native
  val darkblue: Double = js.native
  val darkcyan: Double = js.native
  val darkgoldenrod: Double = js.native
  val darkgray: Double = js.native
  val darkgreen: Double = js.native
  val darkgrey: Double = js.native
  val darkkhaki: Double = js.native
  val darkmagenta: Double = js.native
  val darkolivegreen: Double = js.native
  val darkorange: Double = js.native
  val darkorchid: Double = js.native
  val darkred: Double = js.native
  val darksalmon: Double = js.native
  val darkseagreen: Double = js.native
  val darkslateblue: Double = js.native
  val darkslategray: Double = js.native
  val darkslategrey: Double = js.native
  val darkturquoise: Double = js.native
  val darkviolet: Double = js.native
  val deeppink: Double = js.native
  val deepskyblue: Double = js.native
  val dimgray: Double = js.native
  val dimgrey: Double = js.native
  val dodgerblue: Double = js.native
  val firebrick: Double = js.native
  val floralwhite: Double = js.native
  val forestgreen: Double = js.native
  val fuchsia: Double = js.native
  val gainsboro: Double = js.native
  val ghostwhite: Double = js.native
  val gold: Double = js.native
  val goldenrod: Double = js.native
  val gray: Double = js.native
  val green: Double = js.native
  val greenyellow: Double = js.native
  val grey: Double = js.native
  val honeydew: Double = js.native
  val hotpink: Double = js.native
  val indianred: Double = js.native
  val indigo: Double = js.native
  val ivory: Double = js.native
  val khaki: Double = js.native
  val lavender: Double = js.native
  val lavenderblush: Double = js.native
  val lawngreen: Double = js.native
  val lemonchiffon: Double = js.native
  val lightblue: Double = js.native
  val lightcoral: Double = js.native
  val lightcyan: Double = js.native
  val lightgoldenrodyellow: Double = js.native
  val lightgray: Double = js.native
  val lightgreen: Double = js.native
  val lightgrey: Double = js.native
  val lightpink: Double = js.native
  val lightsalmon: Double = js.native
  val lightseagreen: Double = js.native
  val lightskyblue: Double = js.native
  val lightslategray: Double = js.native
  val lightslategrey: Double = js.native
  val lightsteelblue: Double = js.native
  val lightyellow: Double = js.native
  val lime: Double = js.native
  val limegreen: Double = js.native
  val linen: Double = js.native
  val magenta: Double = js.native
  val maroon: Double = js.native
  val mediumaquamarine: Double = js.native
  val mediumblue: Double = js.native
  val mediumorchid: Double = js.native
  val mediumpurple: Double = js.native
  val mediumseagreen: Double = js.native
  val mediumslateblue: Double = js.native
  val mediumspringgreen: Double = js.native
  val mediumturquoise: Double = js.native
  val mediumvioletred: Double = js.native
  val midnightblue: Double = js.native
  val mintcream: Double = js.native
  val mistyrose: Double = js.native
  val moccasin: Double = js.native
  val navajowhite: Double = js.native
  val navy: Double = js.native
  val oldlace: Double = js.native
  val olive: Double = js.native
  val olivedrab: Double = js.native
  val orange: Double = js.native
  val orangered: Double = js.native
  val orchid: Double = js.native
  val palegoldenrod: Double = js.native
  val palegreen: Double = js.native
  val paleturquoise: Double = js.native
  val palevioletred: Double = js.native
  val papayawhip: Double = js.native
  val peachpuff: Double = js.native
  val peru: Double = js.native
  val pink: Double = js.native
  val plum: Double = js.native
  val powderblue: Double = js.native
  val purple: Double = js.native
  val red: Double = js.native
  val rosybrown: Double = js.native
  val royalblue: Double = js.native
  val saddlebrown: Double = js.native
  val salmon: Double = js.native
  val sandybrown: Double = js.native
  val seagreen: Double = js.native
  val seashell: Double = js.native
  val sienna: Double = js.native
  val silver: Double = js.native
  val skyblue: Double = js.native
  val slateblue: Double = js.native
  val slategray: Double = js.native
  val slategrey: Double = js.native
  val snow: Double = js.native
  val springgreen: Double = js.native
  val steelblue: Double = js.native
  val tan: Double = js.native
  val teal: Double = js.native
  val thistle: Double = js.native
  val tomato: Double = js.native
  val turquoise: Double = js.native
  val violet: Double = js.native
  val wheat: Double = js.native
  val white: Double = js.native
  val whitesmoke: Double = js.native
  val yellow: Double = js.native
  val yellowgreen: Double = js.native
}

/**
 * Euler Angles.
 *
 * Euler angles describe a rotation transformation by rotating an object on its
 * various axes in specified amounts per axis, and a specified axis order. (More information on Wikipedia)
 *
 * @param x     the angle of the x axis in radians
 * @param y     the angle of the y axis in radians
 * @param z     the angle of the z axis in radians
 * @param order A string representing the order that the rotations are applied, defaults to 'XYZ' (must be upper case).
 * @see [[http://threejs.org/docs/#Reference/Math/Euler]]
 */
@js.native
@JSName("THREE.Euler")
class Euler(var x: Double = js.native, var y: Double = js.native, var z: Double = js.native, var order: String = js.native) extends js.Object {
  /**
   * Sets the angles of this euler transform.
   *
   * @param x     the angle of the x axis in radians
   * @param y     the angle of the y axis in radians
   * @param z     the angle of the z axis in radians
   * @param order A string representing the order that the rotations are applied, defaults to 'XYZ' (must be upper case).
   * @return
   */
  def set(x: Double, y: Double, z: Double, order: String = js.native): this.type = js.native
  /** Copies value of euler to this euler. */
  def copy(euler: Euler): this.type = js.native
  /**
   * Sets the angles of this euler transform from a pure rotation matrix based on the orientation specified by order.
   *
   * @param m     assumes upper 3x3 of matrix is a pure rotation matrix (i.e. unscaled)
   * @param order Order of axes, defaults to 'XYZ' (must be upper case)
   */
  def setFromRotationMatrix(m: Matrix4, order: String = js.native): this.type = js.native
  /**
   * Sets the angles of this euler transform from a normalized quaternion based on the orientation specified by order.
   *
   * @param q     quaternion must be normalized
   * @param order Order of axes, defaults to 'XYZ' (must be upper case)
   */
  def setFromQuaternion(q: Quaternion, order: String = js.native): this.type = js.native
  /**
   * Resets the euler angle with a new order by creating a quaternion from this
   * euler angle and then setting this euler angle with the quaternion and the new order.
   * WARNING: this discards revolution information.
   */
  def reorder(newOrder: String): this.type = js.native
  /**
   * Optionally Vector3 to the XYZ parameters of Euler, and order to the Euler's order property.
   *
   * @param order Order of axes, defaults to 'XYZ' (must be upper case)
   */
  def setFromVector3(vector: Vector3, order: String): this.type = js.native
  /**
   * Returns the Euler's XYZ properties as a Vector3.
   */
  def toVector3(): Vector3 = js.native
  /**
   * Assigns this euler's x angle to array[0].
   * Assigns this euler's y angle to array[1].
   * Assigns this euler's z angle to array[2].
   * Optionally assigns this euler's order to array[3].
   *
   * @param array Array of length 3 or 4. array[3] is an optional order argument.
   */
  def fromArray(array: js.Array[js.Any]): this.type = js.native
  /**
   * Returns an array [x, y, z, order]
   *
   * @param array Optional array to store the euler.
   */
  def toArray(array: js.Array[js.Any] = js.native): js.Array[js.Any] = js.native
  /** Checks for strict equality of this euler and euler. */
  def equals(euler: Euler): Boolean = js.native
  /** Returns a new euler created from this euler. */
  override def clone(): Euler = js.native
}

/**
 * Frustums are used to determine what is inside the camera's field of view. They help speed up the rendering process.
 *
 * @constructor Creates a frustum from the designated planes.
 * @see [[http://threejs.org/docs/#Reference/Math/Frustum]]
 */
@js.native
@JSName("THREE.Frustum")
class Frustum(p0: Plane = js.native, p1: Plane = js.native, p2: Plane = js.native, p3: Plane = js.native, p4: Plane = js.native, p5: Plane = js.native) extends js.Object {
  /** Creates a frustum from the designated planes. */
  var planes: js.Array[Plane] = js.native
  def setFromMatrix(m: Matrix4): this.type = js.native
  /** Sets the current frustum from the passed planes. No plane order is implicitely implied. */
  def set(p0: Double = js.native, p1: Double = js.native, p2: Double = js.native, p3: Double = js.native, p4: Double = js.native, p5: Double = js.native): Frustum = js.native
  /**
   * Copies the values of the passed frustum.
   *
   * @param frustum The frustum to copy
   */
  def copy(frustum: Frustum): this.type = js.native
  /**
   * Checks to see if the frustum contains the point.
   *
   * @param point Vector3 to test
   */
  def containsPoint(point: Vector3): Boolean = js.native
  /** Checks whether the object's bounding sphere is intersecting the Frustum. */
  def intersectsObject(`object`: Object3D): Boolean = js.native
  /** Check to see if the sphere intersects with the frustum. */
  def intersectsSphere(sphere: Sphere): Boolean = js.native
  override def clone(): Frustum = js.native
}

/**
 * A geometric line segment represented by a start and end point.
 *
 * @see [[http://threejs.org/docs/#Reference/Math/Line3]]
 */
@js.native
@JSName("THREE.Line3")
class Line3 extends js.Object {
  def this(start: Vector3 = js.native, end: Vector3 = js.native) = this()
  var start: Vector3 = js.native
  var end: Vector3 = js.native
  def set(start: Vector3 = js.native, end: Vector3 = js.native): Line3 = js.native
  def copy(line: Line3): Line3 = js.native
  def center(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def delta(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def distanceSq(): Double = js.native
  def distance(): Double = js.native
  def at(t: Double, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def closestPointToPointParameter(point: Vector3, clampToLine: Boolean = js.native): Double = js.native
  def closestPointToPoint(point: Vector3, clampToLine: Boolean = js.native, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def applyMatrix4(matrix: Matrix4): Line3 = js.native
  def equals(line: Line3): Boolean = js.native
  override def clone(): Line3 = js.native
}

@js.native
trait Math extends js.Object {
  def generateUUID(): String = js.native
  def clamp(x: Double, a: Double, b: Double): Double = js.native
  def clampBottom(x: Double, a: Double): Double = js.native
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double = js.native
  def smoothstep(x: Double, min: Double, max: Double): Double = js.native
  def smootherstep(x: Double, min: Double, max: Double): Double = js.native
  def random16(): Double = js.native
  def randInt(low: Double, high: Double): Double = js.native
  def randFloat(low: Double, high: Double): Double = js.native
  def randFloatSpread(range: Double): Double = js.native
  def sign(x: Double): Double = js.native
  def degToRad(degrees: Double): Double = js.native
  def radToDeg(radians: Double): Double = js.native
  def isPowerOfTwo(value: Double): Boolean = js.native
}

@js.native
trait Matrix[T <: Matrix[T]] extends js.Object {
  var elements: scala.scalajs.js.typedarray.Float32Array = js.native
  /** Resets this matrix to identity. */
  def identity(): this.type = js.native
  /** Copies the values of matrix m into this matrix. */
  def copy(m: T): this.type = js.native
  /** Multiplies every component of the matrix by the scalar value s. */
  def multiplyScalar(s: Double): this.type = js.native
  /** Computes and returns the determinant of this matrix. */
  def determinant(): Double = js.native

  /**
   * Set this matrix to the inverse of the passed matrix.
   *
   * @param matrix            todo: ???
   * @param throwOnDegenerate If true, throw an error if the matrix is degenerate (not invertible).
   * @return
   */
  def getInverse(matrix: T, throwOnDegenerate: Boolean = js.native): this.type = js.native
  /** Transposes this matrix in place. */
  def transpose(): this.type = js.native
  /** Creates a copy of this matrix. */
  override def clone(): T = js.native
}

/**
 * A 3x3 matrix.
 *
 * @see [[http://threejs.org/docs/#Reference/Math/Matrix3]]
 */
@js.native
@JSName("THREE.Matrix3")
class Matrix3 extends Matrix[Matrix3] {
  def this(n11: Double, n12: Double, n13: Double, n21: Double, n22: Double, n23: Double, n31: Double, n32: Double, n33: Double) = this()

  def set(n11: Double, n12: Double, n13: Double, n21: Double, n22: Double, n23: Double, n31: Double, n32: Double, n33: Double): Matrix3 = js.native
  override def identity(): this.type = js.native
  override def copy(m: Matrix3): this.type = js.native
  def applyToVector3Array(array: js.Array[Double], offset: Double = js.native, length: Double = js.native): js.Array[Double] = js.native
  override def multiplyScalar(s: Double): this.type = js.native
  override def determinant(): Double = js.native
  override def getInverse(matrix: Matrix3, throwOnInvertible: Boolean = js.native): this.type = js.native
  override def transpose(): this.type = js.native
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def getNormalMatrix(m: Matrix4): Matrix3 = js.native
  /** Transposes this matrix into the supplied array, and returns itself unchanged. */
  def transposeIntoArray(r: js.Array[Double]): js.Array[Double] = js.native
  def fromArray(array: js.Array[Double]): Matrix3 = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Matrix3 = js.native
}

@js.native
@JSName("THREE.Matrix4")
class Matrix4 extends Matrix[Matrix4] {
  def this(n11: Double = js.native, n12: Double = js.native, n13: Double = js.native, n14: Double = js.native, n21: Double = js.native, n22: Double = js.native, n23: Double = js.native, n24: Double = js.native, n31: Double = js.native, n32: Double = js.native, n33: Double = js.native, n34: Double = js.native, n41: Double = js.native, n42: Double = js.native, n43: Double = js.native, n44: Double = js.native) = this()
  /** Sets all fields of this matrix to the supplied row-major values n11..n44. */
  def set(n11: Double, n12: Double, n13: Double, n14: Double, n21: Double, n22: Double, n23: Double, n24: Double, n31: Double, n32: Double, n33: Double, n34: Double, n41: Double, n42: Double, n43: Double, n44: Double): Matrix4 = js.native
  override def identity(): this.type = js.native
  override def copy(m: Matrix4): this.type = js.native
  /** Copies the translation component of the supplied matrix m into this matrix translation component. */
  def copyPosition(m: Matrix4): this.type = js.native
  /** Creates the basis matrix consisting of the three provided axis vectors. Returns the current matrix. */
  def makeBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): this.type = js.native
  /** Extracts basis of into the three axis vectors provided. Returns the current matrix. */
  def extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): this.type = js.native
  /** Extracts the rotation of the supplied matrix m into this matrix rotation component. */
  def extractRotation(m: Matrix4): this.type = js.native
  /** Constructs a rotation matrix, looking from eye towards center with defined up vector. */
  def lookAt(eye: Vector3, center: Vector3, up: Vector3): this.type = js.native
  /** Multiplies this matrix by m. */
  def multiply(m: Matrix4): this.type = js.native
  /** Sets this matrix to a x b. */
  def multiplyMatrices(a: Matrix4, b: Matrix4): this.type = js.native
  /**
   * Sets this matrix to a x b and stores the result into the flat array r.
   * r can be either a regular Array or a TypedArray.
   */
  def multiplyToArray(a: Matrix4, b: Matrix4, r: js.Array[Double] | TypedArray[Float, _]): this.type = js.native
  override def multiplyScalar(s: Double): this.type = js.native
  override def determinant(): Double = js.native
  override def transpose(): this.type = js.native
  /** Flattens this matrix into supplied flat array starting from offset position in the array. */
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  /** Sets the position component for this matrix from vector v. */
  def setPosition(v: Vector3): this.type = js.native
  override def getInverse(m: Matrix4, throwOnInvertible: Boolean): this.type = js.native
  /**
   * Sets the rotation submatrix of this matrix to the rotation specified by Euler angles,
   * the rest of the matrix is identity. Default order is "XYZ".
   *
   * @param euler Rotation vector followed by order of rotations, e.g., "XYZ".
   */
  def makeRotationFromEuler(euler: Euler): this.type = js.native
  /** Sets the rotation submatrix of this matrix to the rotation specified by q. The rest of the matrix is identity. */
  def makeRotationFromQuaternion(q: Quaternion): this.type = js.native
  /** Multiplies the columns of this matrix by vector v. */
  def scale(v: Vector3): this.type = js.native
  /** Sets this matrix to the transformation composed of translation, quaternion and scale. */
  def compose(translation: Vector3, rotation: Quaternion, scale: Vector3): this.type = js.native
  /** Decomposes this matrix into the translation, quaternion and scale components. */
  def decompose(translation: Vector3 = js.native, rotation: Quaternion = js.native, scale: Vector3 = js.native): js.Array[Object] = js.native
  /** Sets this matrix as translation transform. */
  def makeTranslation(x: Double, y: Double, z: Double): this.type = js.native

  /**
   * Sets this matrix as rotation transform around x axis by theta radians.
   *
   * @param theta Rotation angle in radians.
   */
  def makeRotationX(theta: Double): this.type = js.native
  /**
   * Sets this matrix as rotation transform around y axis by theta radians.
   *
   * @param theta Rotation angle in radians.
   */
  def makeRotationY(theta: Double): this.type = js.native
  /**
   * Sets this matrix as rotation transform around z axis by theta radians.
   *
   * @param theta Rotation angle in radians.
   */
  def makeRotationZ(theta: Double): this.type = js.native
  /**
   * Sets this matrix as rotation transform around axis by angle radians.
   * Based on http://www.gamedev.net/reference/articles/article1199.asp.
   *
   * @param axis  Rotation axis, should be normalized.
   * @param theta Rotation angle in radians.
   */
  def makeRotationAxis(axis: Vector3, theta: Double): this.type = js.native
  /** Sets this matrix as scale transform. */
  def makeScale(x: Double, y: Double, z: Double): this.type = js.native
  /** Creates a frustum matrix. */
  def makeFrustum(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): this.type = js.native
  /** Creates a perspective projection matrix. */
  def makePerspective(fov: Double, aspect: Double, near: Double, far: Double): this.type = js.native
  /** Creates an orthographic projection matrix. */
  def makeOrthographic(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double): this.type = js.native
  override def clone(): Matrix4 = js.native
  /**
   * Multiplies (applies) this matrix to every vector3 in the array.
   *
   * @param a An array in the form [vector1x, vector1y, vector1z, vector2x, vector2y, vector2z, ...]
   */
  def applyToVector3Array(a: js.Array[Vector3]): js.Array[Vector3] = js.native
  /** Gets the maximum scale value of the 3 axes. */
  def getMaxScaleOnAxis(): Double = js.native
}

/**
 * A two dimensional surface that extends infinitely in 3d space.
 *
 * @param normal   normal vector defining the plane pointing towards the origin
 * @param constant the negative distance from the origin to the plane along the normal vector
 * @see [[http://threejs.org/docs/#Reference/Math/Plane]]
 */
@js.native
@JSName("THREE.Plane")
class Plane(var normal: Vector3 = js.native, var constant: Double = js.native) extends js.Object {
  /** Normalizes the normal vector, and adjusts the constant value accordingly. */
  def normalize(): this.type = js.native
  /** Sets the plane's values. */
  def set(normal: Vector3, constant: Double): this.type = js.native
  /** Copies the values of the passed plane to this plane. */
  def copy(plane: Plane): this.type = js.native

  /**
   * Apply a Matrix4 to the plane. The second parameter is optional.
   *
   * @param matrix               Matrix4 to apply
   * @param optionalNormalMatrix (optional) pre-computed normal Matrix3 of the Matrix4 to apply
   */
  def applyMatrix4(matrix: Matrix4, optionalNormalMatrix: Matrix3 = js.native): this.type = js.native
  /** Returns a vector in the same direction as the Plane's normal, but the magnitude is passed point's original distance to the plane. */
  def orthoPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  /** Tests whether a line segment intersects with the plane. (Do not mistake this for a collinear check.) */
  def intersectsLine(line: Line3): Boolean = js.native
  /**
   * Returns the intersection point of the passed line and the plane.
   * Returns undefined if the line does not intersect.
   * Returns the line's starting point if the line is coplanar with the plane.
   */
  def intersectLine(line: Line3, optionalTarget: Vector3 = js.native): js.UndefOr[Vector3] = js.native
  def intersectsBox(box: Box3): Boolean = js.native
  def intersectsSphere(sphere: Sphere): Boolean = js.native
  /** Sets the plane's values as defined by a normal and arbitrary coplanar point. */
  def setFromNormalAndCoplanarPoint(normal: Vector3, point: Vector3): this.type = js.native
  /** Returns a new copy of this plane. */
  override def clone(): Plane = js.native
  /** Returns the smallest distance from the point to the plane. */
  def distanceToPoint(point: Vector3): Double = js.native
  /** Checks to see if two planes are equal (their normals and constants match) */
  override def equals(plane: Any): Boolean = js.native
  /**
   * Set the individual components that make up the plane.
   *
   * @param x x of the normal vector
   * @param y y of the normal vector
   * @param z z of the normal vector
   * @param w distance of the plane from the origin along the normal vector
   */
  def setComponents(x: Double, y: Double, z: Double, w: Double): this.type = js.native
  /** Returns the smallest distance from an edge of the sphere to the plane. */
  def distanceToSphere(sphere: Sphere): Double = js.native
  /** Defines the plane based on the 3 provided points. The winding order is counter clockwise, and determines which direction the normal will point. */
  def setFromCoplanarPoints(a: Vector3, b: Vector3, c: Vector3): this.type = js.native
  /**
   * Projects a point onto the plane. The projected point is the closest point
   * on the plane to the passed point, so a line drawn from the projected point and the passed point would be orthogonal to the plane.
   */
  def projectPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  /** Negates both the normal vector and constant, effectively mirroring the plane across the origin. */
  def negate(): this.type = js.native
  /** Translates the plane the distance defined by the vector. Note that this
   * only affects the constant (distance from origin) and will not affect the normal vector.
   */
  def translate(offset: Vector3): this.type = js.native
  /** Returns a coplanar point. (The projection of the normal vector at the origin onto the plane.) */
  def coplanarPoint(optionalTarget: Boolean = js.native): Vector3 = js.native
}

/**
 * Implementation of a quaternion. This is used for rotating things without encountering the dreaded gimbal lock issue, amongst other advantages.
 *
 * @param x x coordinate
 * @param y y coordinate
 * @param z z coordinate
 * @param w w coordinate
 * @see [[http://threejs.org/docs/#Reference/Math/Quaternion]]
 */
@js.native
@JSName("THREE.Quaternion")
class Quaternion(var x: Double = js.native, var y: Double = js.native, var z: Double = js.native, var w: Double = js.native) extends js.Object {
  /** Sets values of this quaternion. */
  def set(x: Double, y: Double, z: Double, w: Double): this.type = js.native
  /** Copies values of q to this quaternion. */
  def copy(q: Quaternion): this.type = js.native
  /** Sets this quaternion from rotation specified by Euler angle. */
  def setFromEuler(euler: Euler, update: Boolean = js.native): Quaternion = js.native

  /**
   * Sets this quaternion from rotation specified by axis and angle.
   * Adapted from http://www.euclideanspace.com/maths/geometry/rotations/conversions/angleToQuaternion/index.htm.
   * Axis is assumed to be normalized, angle is in radians.
   */
  def setFromAxisAngle(axis: Vector3, angle: Double): this.type = js.native
  /** Sets this quaternion from rotation component of m. */
  def setFromRotationMatrix(m: Matrix4): this.type = js.native

  /**
   * Sets this quaternion to the rotation required to rotate direction vector
   * vFrom to direction vector vTo. Adapted from
   * http://lolengine.net/blog/2013/09/18/beautiful-maths-quaternion-from-vectors.
   * vFrom and vTo are assumed to be normalized.
   */
  def setFromUnitVectors(vFrom: Vector3, vTo: Vector4): this.type = js.native
  /** Inverts this quaternion. */
  def inverse(): this.type = js.native
  /** Computes length of this quaternion. */
  def length(): Double = js.native
  /** Normalizes this quaternion. */
  def normalize(): this.type = js.native
  /** Multiplies this quaternion by b. */
  def multiply(q: Quaternion): this.type = js.native
  /** Sets this quaternion to a x b Adapted from
   * http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/code/index.htm.
   */
  def multiplyQuaternions(a: Quaternion, b: Quaternion): this.type = js.native
  /** Rotates vector by this quaternion into dest. If dest is not specified, result goes to vec. */
  def multiplyVector3(vector: Vector3, dest: Vector3 = js.native): Unit = js.native
  /** Clones this quaternion. */
  override def clone(): Quaternion = js.native
  /**
   * Returns the numerical elements of this quaternion in an array of format (x, y, z, w).
   *
   * @param array Array to store the quaternion.
   */
  def toArray(array: js.Array[Double] = js.native): js.Array[Double] = js.native
  /**
   * Compares each component of v to each component of this quaternion to determine if they represent the same rotation.
   *
   * @param v Quaternion that this quaternion will be compared to.
   */
  def equals(v: Quaternion): Boolean = js.native
  /** Calculates the squared length of the quaternion. */
  def lengthSq(): Double = js.native
  /**
   * Sets this quaternion's component values from an array.
   *
   * @param array Array of format (x, y, z, w) used to construct the quaternion.
   */
  def fromArray(array: js.Array[Double]): this.type = js.native
  /**
   * Returns the rotational conjugate of this quaternion.
   * The conjugate of a quaternion represents the same rotation in the opposite
   * direction about the rotational axis.
   */
  def conjugate(): this.type = js.native
  /**
   * Handles the spherical linear interpolation between quaternions.
   * t represents the amount of rotation between this quaternion (where t is 0)
   * and quaternionB (where t is 1). This quaternion is set to the result.
   * Also see the static version of the slerp [[Quaternion.slerp()]].
   *
   * @param quaternionB The other quaternion rotation
   * @param t           Normalized 0 to 1 interpolation factor
   */
  def slerp(quaternionB: Quaternion, t: Double): this.type = js.native
}

@js.native
@JSName("THREE.Quaternion")
object Quaternion extends js.Object {
  /**
   * @param qStart  The starting quaternion (where t is 0)
   * @param qEnd    The ending quaternion (where t is 1)
   * @param qTarget The target quaternion that gets set with the result
   * @param t       Normalized 0 to 1 interpolation factor
   */
  def slerp(qStart: Quaternion, qEnd: Quaternion, qTarget: Quaternion, t: Double): Quaternion = js.native
}

/**
 * A ray that emits from an origin in a certain direction.
 *
 * @constructor Initialises the origin and direction properties to the provided values.
 * @param origin    The origin of the Ray.
 * @param direction The direction of the Ray. This must be normalized (with [[Vector3.normalize]]) for the methods to operate properly.
 * @see [[http://threejs.org/docs/#Reference/Math/Ray]]
 */
@js.native
@JSName("THREE.Ray")
class Ray(var origin: Vector3 = js.native, var direction: Vector3 = js.native) extends js.Object {
  /**
   * Transform this Ray by the Matrix4.
   *
   * @param matrix4 matrix4 -- Matrix4 The Matrix4 to transform this Ray by.
   */
  def applyMatrix4(matrix4: Matrix4): this.type = js.native
  /**
   * Get a Vector3 that is a given distance along this Ray.
   *
   * @param t              The distance along the Ray to retrieve a position for.
   * @param optionalTarget Receives the position along the Ray if passed; otherwise a new Vector3 is created.
   */
  def at(t: Double, optionalTarget: Vector3 = js.native): Vector3 = js.native
  /** Create a clone of this Ray. */
  override def clone(): Ray = js.native

  /**
   * Get the point along this Ray that is closest to the Vector3 provided.
   *
   * @param point          The point to get the closest approach to.
   * @param optionalTarget Receives the return value if passed; otherwise a new Vector3 is created.
   */
  def closestPointToPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  /**
   * Copy the properties of the provided Ray, then return this Ray.
   *
   * @param ray Ray The Ray to copy values from.
   */
  def copy(ray: Ray): this.type = js.native
  /**
   * Get the squared distance between this Ray and a line segment.
   *
   * @param v0                     The start of the line segment.
   * @param v1                     The end of the line segment.
   * @param optionalPointOnRay     If this is provided, it receives the point on this Ray that is closest to the segment.
   * @param optionalPointOnSegment If this is provided, it receives the point on the line segment that is closest to this Ray.
   */
  def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3 = js.native, optionalPointOnSegment: Vector3 = js.native): Double = js.native
  /**
   * Get the distance from the origin to the Plane, or null if the Ray doesn't intersect the Plane.
   *
   * @param plane Plane The Plane to get the distance to.
   */
  def distanceToPlane(plane: Plane): Double = js.native
  /**
   * Get the distance of the closest approach between the Ray and the Vector3.
   *
   * @param point The Vector3 to compute a distance to.
   */
  def distanceToPoint(point: Vector3): Double = js.native
  /**
   * Get the squared distance of the closest approach between the Ray and the Vector3.
   *
   * @param point The Vector3 to compute a distance to.
   */
  def distanceSqToPoint(point: Vector3): Double = js.native
  /**
   * Return whether this and the other Ray have equal offsets and directions.
   *
   * @param ray Ray The Ray to compare to.
   */
  override def equals(ray: Any): Boolean = js.native
  /**
   * Intersect this Ray with a Box3, returning the intersection point or null if there is no intersection.
   *
   * @param box            The Box3 to intersect with.
   * @param optionalTarget The Vector3 to store the result in, or null to create a new Vector3.
   */
  def intersectBox(box: Box3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  /**
   * Intersect this Ray with a Plane, returning the intersection point or null if there is no intersection.
   *
   * @param plane          The Plane to intersect with.
   * @param optionalTarget The Vector3 to store the result in, or null to create a new Vector3.
   */
  def intersectPlane(plane: Plane, optionalTarget: Vector3 = js.native): Vector3 = js.native
  /**
   * Intersect this Ray with a triangle, returning the intersection point or null if there is no intersection.
   *
   * @param a               The Vector3 points on the triangle.
   * @param b               The Vector3 points on the triangle.
   * @param c               The Vector3 points on the triangle.
   * @param backfaceCulling Whether to use backface culling.
   * @param optionalTarget  The Vector3 to store the result in, or null to create a new Vector3.
   */
  def intersectTriangle(a: Vector3, b: Vector3, c: Vector3, backfaceCulling: Boolean, optionalTarget: Vector3 = js.native): Vector3 = js.native
  /**
   * Return whether or not this Ray intersects with the Box3.
   *
   * @param box The Box3 to intersect with.
   */
  def intersectsBox(box: Box3): Boolean = js.native
  /**
   * Return whether or not this Ray intersects with the Plane.
   *
   * @param plane The Plane to intersect with.
   */
  def intersectsPlane(plane: Plane): Boolean = js.native
  /**
   * Return whether or not this Ray intersects with the Sphere.
   *
   * @param sphere The Sphere to intersect with.
   */
  def intersectsSphere(sphere: Sphere): Boolean = js.native
  /**
   * Shift the origin of this Ray along its direction by the distance given.
   *
   * @param t The distance along the Ray to interpolate.
   */
  def recast(t: Double): Ray = js.native
  /**
   * Copy the parameters to the origin and direction properties.
   *
   * @param origin    The origin of the Ray.
   * @param direction The direction of the Ray. This must be normalized (with Vector3.normalize) for the methods to operate properly.
   */
  def set(origin: Vector3, direction: Vector3): this.type = js.native
  /**
   * Adjusts the direction of the ray to point at the vector in world coordinates.
   *
   * @param v The vector to look at.
   */
  def lookAt(v: Vector3): this.type = js.native
}

/**
 * A geometric sphere defined by a center position and radius.
 *
 * @see [[http://threejs.org/docs/#Reference/Math/Sphere]]
 */
@js.native
@JSName("THREE.Sphere")
class Sphere(var center: Vector3 = js.native, var radius: Double = js.native) extends js.Object {
  /** Sets the center and radius. */
  def set(center: Vector3, radius: Double): this.type = js.native
  /** Transforms this sphere with the provided Matrix4. */
  def applyMatrix4(matrix: Matrix4): this.type = js.native
  /**
   * Clamps a point within the sphere. If the point is is outside the sphere, it will clamp it to the closets point on the edge of the sphere.
   *
   * @param point          The point to clamp
   * @param optionalTarget The optional target point to return
   */
  def clampPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  /** Translate the sphere's center by the provided offset vector. */
  def translate(offset: Vector3): this.type = js.native
  /** Copies the values of the passed sphere to this sphere. */
  def copy(sphere: Sphere): this.type = js.native
  /** Checks to see if the two spheres' centers and radii are equal. */
  def equals(sphere: Sphere): Boolean = js.native
  /**
   * Computes the minimum bounding sphere for points. If optionalCenter is given, it is used as the sphere's center. Otherwise, the center of the axis-aligned bounding box encompassing points is calculated.
   *
   * @param points         Array of Vector3 positions.
   * @param optionalCenter Optional Vector3 position for the sphere's center.
   */
  def setFromPoints(points: js.Array[Vector3], optionalCenter: Vector3 = js.native): this.type = js.native
  /** Returns the closest distance from the boundary of the sphere to the point. If the sphere contains the point, the distance will be negative. */
  def distanceToPoint(point: Vector3): Double = js.native
  /** Returns a bounding box for the sphere, optionally setting a provided box target. */
  def getBoundingBox(optionalTarget: Box3 = js.native): Box3 = js.native
  /** Checks to see if the sphere contains the provided point inclusive of the edge of the sphere. */
  def containsPoint(point: Vector3): Boolean = js.native
  /** Checks to see if two spheres intersect. */
  def intersectsSphere(sphere: Sphere): Boolean = js.native
  def intersectsPlane(plane: Plane): Boolean = js.native
  /** Checks to see if the sphere is empty (the radius set to 0). */
  def empty(): Boolean = js.native
  /** Provides a new copy of the sphere. */
  override def clone(): Sphere = js.native
}

@js.native
trait SplineControlPoint extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
}

/**
 * Represents a spline.
 *
 * @constructor Initialises the spline with points, which are the places through which the spline will go.
 * @see [[http://threejs.org/docs/#Reference/Math/Spline]]
 */
@js.native
@JSName("THREE.Spline")
class Spline(var points: js.Array[SplineControlPoint]) extends js.Object {
  /**
   * Initialises using the data in the array as a series of points. Each value in a must be another array with three values,
   * where a[n] is v, the value for the nth point, and v[0], v[1] and v[2] are the x, y and z coordinates of that point n, respectively.
   *
   * @param a array of triplets containing x, y, z coordinates
   */
  def initFromArray(a: js.Array[js.Array[Double]]): Unit = js.native

  /**
   * Return the interpolated point at k.
   *
   * @param k index
   */
  def getPoint(k: Double): SplineControlPoint = js.native
  /** Returns an array with triplets of x, y, z coordinates that correspond to the current control points. */
  def getControlPointsArray(): js.Array[js.Array[Double]] = js.native
  /**
   * Returns an object with the two properties. The property .total contains the length of the spline when using nSubDivisions.
   * The property .chunkLength contains an array with the total length from the beginning of the spline to the end of that chunk.
   *
   * @param nSubDivisions number of subdivisions between control points. Default is 100.
   */
  def getLength(nSubDivisions: Double = js.native): SplineLength = js.native

  /**
   * Modifies the spline so that it looks similar to the original but has its points distributed in such way that moving
   * along the spline it's done at a more or less constant speed. The points should also appear more uniformly spread along the curve.
   *
   * This is done by resampling the original spline, with the density of sampling controlled by samplingCoef.
   * Here it's interesting to note that denser sampling is not necessarily better: if sampling is too high, you may get weird kinks in curvature.
   *
   * @param samplingCoef how many intermediate values to use between spline points
   */
  def reparametrizeByArcLength(samplingCoef: Double): Unit = js.native
}


@js.native
trait SplineLength extends js.Any {
  /** contains the length of the spline when using nSubDivisions. */
  var total: Double
  /** contains an array with the total length from the beginning of the spline to the end of that chunk. */
  var chunkLength: js.Array[Double]
}

/**
 * A geometric triangle as defined by three vectors.
 *
 * @constructor Sets the triangle's vectors to the passed vectors.
 * @param a The first Vector3 of the triangle.
 * @param b The second Vector3 of the triangle.
 * @param c The third Vector3 of the triangle.
 * @see [[http://threejs.org/docs/#Reference/Math/Triangle]]
 */
@js.native
@JSName("THREE.Triangle")
class Triangle(var a: Vector3 = js.native, var b: Vector3 = js.native, var c: Vector3 = js.native) extends js.Object {
  /**
   * Sets the triangle's vectors to the vectors in the array.
   *
   * @param points Array of Vector3s
   * @param i0     index
   * @param i1     index
   * @param i2     index
   */
  def setFromPointsAndIndices(points: js.Array[Vector3], i0: Double, i1: Double, i2: Double): this.type = js.native
  /** Sets the triangle's vectors to the passed vectors. */
  def set(a: Vector3, b: Vector3, c: Vector3): this.type = js.native
  /**
   * Return the calculated normal of the triangle.
   *
   * @param optionalTarget Optional Vector3 target to set the result.
   */
  def normal(optionalTarget: Vector3 = js.native): Vector3 = js.native
  /**
   * Return a barycentric coordinate from the given vector.
   *
   * [[http://commons.wikimedia.org/wiki/File:Barycentric_coordinates_1.png Picture of barycentric coordinates]]
   *
   * @param optionalTarget Optional Vector3 target to set the result.
   */
  def barycoordFromPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def copy(triangle: Triangle): Triangle = js.native
  /** Return the area of the triangle. */
  def area(): Double = js.native
  /**
   * Return the midpoint of the triangle. Optionally sets a target vector.
   *
   * @param optionalTarget Optional Vector3 target to set the result.
   */
  def midpoint(optionalTarget: Vector3 = js.native): Vector3 = js.native
  /** Checks to see if two triangles are equal (share the same vectors). */
  def equals(triangle: Triangle): Boolean = js.native
  /**
   * Return a plane based on the triangle. Optionally sets a target plane.
   *
   * @param optionalTarget Optional Plane target to set the result.
   */
  def plane(optionalTarget: Plane = js.native): Plane = js.native
  /** Checks to see if the passed vector is within the triangle. */
  def containsPoint(point: Vector3): Boolean = js.native
  /** Return a new copy of this triangle. */
  override def clone(): Triangle = js.native
}


@js.native
sealed trait Vector[VT <: Vector[VT]] extends js.Object {
  /** Copies value of v to this vector. */
  def copy(v: VT): this.type = js.native
  /** Adds v to this vector. */
  def add(v: VT): this.type = js.native
  /** Sets this vector to a + b. */
  def addVectors(a: VT, b: VT): this.type = js.native
  /** Adds the multiple of v and s to this vector. */
  def addScaledVector(v: VT, s: Double): this.type = js.native
  /** Subtracts v from this vector. */
  def sub(v: VT): this.type = js.native
  /** Sets this vector to a - b. */
  def subVectors(a: VT, b: VT): this.type = js.native
  /** Multiplies this vector by scalar s. */
  def multiplyScalar(s: Double): this.type = js.native
  /**
   * Divides this vector by scalar s.
   * Set vector to ( 0, 0, 0 ) if s == 0.
   */
  def divideScalar(s: Double): this.type = js.native
  /** Inverts this vector. */
  def negate(): this.type = js.native
  /** Computes dot product of this vector and v. */
  def dot(v: VT): Double = js.native
  /** Computes squared length of this vector. */
  def lengthSq(): Double = js.native
  /** Computes length of this vector. */
  def length(): Double = js.native

  /** Computes Manhattan length of this vector.
   *
   * @see [[http://en.wikipedia.org/wiki/Taxicab_geometry]] */
  def lengthManhattan(): Double = js.native
  /** Normalizes this vector. */
  def normalize(): this.type = js.native
  /** Computes distance of this vector to v. */
  def distanceTo(v: VT): Double = js.native
  /** Computes squared distance of this vector to v. */
  def distanceToSquared(v: VT): Double = js.native
  /** Normalizes this vector and multiplies it by l. */
  def setLength(l: Double): this.type = js.native
  def setScalar(scalar: Double): this.type = js.native
  /** Checks for strict equality of this vector and v. */
  def equals(v: VT): Boolean = js.native

  /**
   * If this vector's x or y value is greater than the max vector's x or y value, it is replaced by the corresponding value.
   *
   * If this vector's x or y value is less than the min vector's x or y value, it is replaced by the corresponding value.
   *
   * @param min Vector containing the min values in the desired range
   * @param max Vector containing the max x and y values in the desired range
   */
  def clamp(min: VT, max: VT): this.type = js.native
  /**
   * If this vector's x or y values are greater than the max value, they are replaced by the max value.
   *
   * If this vector's x or y values are less than the min value, they are replaced by the min value.
   *
   * @param min the minimum value the components will be clamped to
   * @param max the maximum value the components will be clamped to
   */
  def clampScalar(min: Double, max: Double): this.type = js.native
  /** The components of the vector are rounded downwards (towards negative infinity) to an integer value. */
  def floor(): Unit = js.native
  /** The components of the vector are rounded upwards (towards positive infinity) to an integer value. */
  def ceil(): Unit = js.native
  /** The components of the vector are rounded towards the nearest integer value. */
  def round(): Unit = js.native
  /** The components of the vector are rounded towards zero (up if negative, down if positive) to an integer value. */
  def roundToZero(): Unit = js.native

  /**
   * Linear interpolation between this vector and v, where alpha is the percent along the line.
   *
   * @param alpha Float between 0 and 1
   */
  def lerp(v: VT, alpha: Double): this.type = js.native

  /**
   * Sets this vector to be the vector linearly interpolated between v1 and v2 with alpha factor.
   *
   * @param alpha Float between 0 and 1.
   */
  def lerpVectors(v1: VT, v2: VT, alpha: Double): this.type = js.native

  def setComponent(index: Double, value: Double): Unit = js.native

  def getComponent(index: Double): Double = js.native
  def fromArray(array: js.Array[Double]): this.type = js.native

  /**
   * Returns an array [x, y, ...].
   *
   * @param array Optional array to store the vector.
   */
  def toArray(array: js.Array[Double] = js.native): js.Array[Double]

  /**
   * If this vector's nth value is greater than vector v's nth value, that value is replaced by the corresponding vector v value.
   */
  def min(v: VT): this.type = js.native

  /** If this vector's nth value is less than vector v's nth value, that value is replaced by the corresponding vector v value. */
  def max(v: VT): this.type = js.native

  /** Adds a s to this vector. */
  def addScalar(s: Double): this.type = js.native


  override def clone(): VT = js.native
}

/**
 * 2D vector.
 * @see [[http://threejs.org/docs/#Reference/Math/Vector2]]
 */
@js.native
@JSName("THREE.Vector2")
class Vector2 extends Vector[Vector2] {
  def this(x: Double = js.native, y: Double = js.native) = this()
  var x: Double = js.native
  var y: Double = js.native
  override def setComponent(index: Double, value: Double): Unit = js.native
  override def getComponent(index: Double): Double = js.native
  override def copy(v: Vector2): this.type = js.native
  override def add(v: Vector2): this.type = js.native
  override def addVectors(a: Vector2, b: Vector2): this.type = js.native
  override def addScalar(s: Double): this.type = js.native
  override def sub(v: Vector2): this.type = js.native
  override def subVectors(a: Vector2, b: Vector2): this.type = js.native
  override def multiplyScalar(s: Double): this.type = js.native
  override def divideScalar(s: Double): this.type = js.native
  override def min(v: Vector2): this.type = js.native
  override def max(v: Vector2): this.type = js.native
  override def clamp(min: Vector2, max: Vector2): this.type = js.native
  override def clampScalar(min: Double, max: Double): this.type = js.native
  override def floor(): Unit = js.native
  override def ceil(): Unit = js.native
  override def round(): Unit = js.native
  override def roundToZero(): Unit = js.native
  override def negate(): this.type = js.native
  override def dot(v: Vector2): Double = js.native
  override def lengthSq(): Double = js.native
  override def length(): Double = js.native
  override def lengthManhattan(): Double = js.native
  override def normalize(): this.type = js.native
  override def distanceTo(v: Vector2): Double = js.native
  override def distanceToSquared(v: Vector2): Double = js.native
  override def setLength(l: Double): this.type = js.native
  override def lerp(v: Vector2, alpha: Double): this.type = js.native
  override def equals(v: Vector2): Boolean = js.native
  override def fromArray(xy: js.Array[Double]): this.type = js.native
  override def toArray(array: js.Array[Double] = js.native): js.Array[Double] = js.native
  override def clone(): Vector2 = js.native
  /** Sets value of this vector. */
  def set(x: Double, y: Double): this.type = js.native
  /** replace this vector's x value with x. */
  def setX(x: Double): this.type = js.native
  /** replace this vector's y value with x. */
  def setY(y: Double): this.type = js.native
  /** Computes the angle in radians of this vector with respect to the positive x-axis. */
  def angle(): Double = js.native
}

/**
 * 3D vector.
 *
 * @see [[http://threejs.org/docs/#Reference/Math/Vector3]]
 */
@js.native
@JSName("THREE.Vector3")
class Vector3 extends Vector[Vector3] {
  /**
   * @param x the vector's x value
   * @param y the vector's y value
   * @param z the vector's y value
   */
  def this(x: Double = js.native, y: Double = js.native, z: Double = js.native) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  override def setComponent(index: Double, value: Double): Unit = js.native
  override def getComponent(index: Double): Double = js.native
  override def copy(v: Vector3): this.type = js.native
  override def add(a: Vector3): this.type = js.native
  override def addScalar(s: Double): this.type = js.native
  override def addVectors(a: Vector3, b: Vector3): this.type = js.native
  override def sub(a: Vector3): this.type = js.native
  override def subVectors(a: Vector3, b: Vector3): this.type = js.native
  override def multiplyScalar(s: Double): this.type = js.native
  override def divideScalar(s: Double): this.type = js.native
  override def min(v: Vector3): this.type = js.native
  override def max(v: Vector3): this.type = js.native
  override def clamp(min: Vector3, max: Vector3): this.type = js.native
  override def clampScalar(min: Double, max: Double): this.type = js.native
  override def floor(): Unit = js.native
  override def ceil(): Unit = js.native
  override def round(): Unit = js.native
  override def roundToZero(): Unit = js.native
  override def negate(): this.type = js.native
  override def dot(v: Vector3): Double = js.native
  override def lengthSq(): Double = js.native
  override def length(): Double = js.native
  override def lengthManhattan(): Double = js.native
  override def normalize(): this.type = js.native
  override def setLength(l: Double): this.type = js.native
  override def lerp(v: Vector3, alpha: Double): this.type = js.native
  override def distanceTo(v: Vector3): Double = js.native
  override def distanceToSquared(v: Vector3): Double = js.native
  override def equals(v: Vector3): Boolean = js.native
  override def fromArray(xyz: js.Array[Double]): this.type = js.native
  override def toArray(array: js.Array[Double]): js.Array[Double] = js.native
  /** Sets value of this vector. */
  def set(x: Double, y: Double, z: Double): this.type = js.native
  /** Sets x value of this vector. */
  def setX(x: Double): this.type = js.native
  /** Sets y value of this vector. */
  def setY(y: Double): this.type = js.native
  /** Sets z value of this vector. */
  def setZ(z: Double): this.type = js.native
  /** Sets this vector to cross product of itself and v. */
  def cross(a: Vector3): this.type = js.native
  /** Sets this vector to cross product of a and b. */
  def crossVectors(a: Vector3, b: Vector3): this.type = js.native
  /**
   * Projects the vector with the camera.
   * @param camera camera to use in the projection.
   */
  def project(camera: Camera): Unit = js.native
  /**
   * Unprojects the vector with the camera.
   * @param camera camera to use in the projection.
   */
  def unproject(camera: Camera): Unit = js.native
  /** Projects this vector onto another vector. */
  def projectOnVector(v: Vector3): this.type = js.native
  /**
   * Projects this vector onto a plane by subtracting this vector projected onto the plane's normal from this vector.
   * @param planeNormal A vector representing a plane normal.
   */
  def projectOnPlane(planeNormal: Vector3): this.type = js.native
  /**
   * Reflect incident vector off of plane orthogonal to normal. normal is assumed to have unit length.
   * @param vector Vector3 the normal to the reflecting plane
   */
  def reflect(vector: Vector3): this.type = js.native
  /** Multipies this vector by vector v. */
  def multiply(v: Vector3): this.type = js.native
  /**
   * Multiplies this vector and m, and divides by perspective.
   * @param m Matrix4 projection matrix.
   */
  def applyProjection(m: Matrix4): this.type = js.native
  /** Applies euler transform to this vector by converting the Euler obect to a Quaternion and applying. */
  def applyEuler(euler: Euler): this.type = js.native
  /** Applies a Quaternion transform to this vector. */
  def applyQuaternion(q: Quaternion): this.type = js.native
  /** Sets this vector equal to the result of multiplying vector a by vector b. */
  def multiplyVectors(a: Vector3, b: Vector3): this.type = js.native
  /**
   * Applies a rotation specified by an axis and an angle to this vector.
   * @param axis  A normalized Vector3
   * @param angle An angle in radians
   */
  def applyAxisAngle(axis: Vector3, angle: Double): this.type = js.native
  /** Multiplies this vector times a 3 x 3 matrix. */
  def applyMatrix3(m: Matrix3): this.type = js.native
  /** Multiplies this vector by 4 x 3 subset of a Matrix4. */
  def applyMatrix4(m: Matrix4): this.type = js.native
  def transformDirection(m: Matrix4): this.type = js.native
  def divide(v: Vector3): this.type = js.native
  /** Returns the angle between this vector and vector v in radians. */
  def angleTo(v: Vector3): Double = js.native
  /** Sets this vector extracting position from matrix transform. */
  def setFromMatrixPosition(m: Matrix4): this.type = js.native
  /** Sets this vector extracting scale from matrix transform. */
  def setFromMatrixScale(m: Matrix4): this.type = js.native
  /**
   * Sets this vector's x, y, and z equal to the column of the matrix specified by the index.
   * @param index 0, 1, 2, or 3
   */
  def setFromMatrixColumn(index: Double, matrix: Matrix4): this.type = js.native

  override def clone(): Vector3 = js.native
}

/**
 * 4D vector.
 * @see [[http://threejs.org/docs/#Reference/Math/Vector4]]
 */
@js.native
@JSName("THREE.Vector4")
class Vector4 extends Vector[Vector4] {
  def this(x: Double = js.native, y: Double = js.native, z: Double = js.native, w: Double = js.native) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var w: Double = js.native
  /** Sets value of this vector. */
  def set(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
  /** Sets x value of this vector. */
  def setX(x: Double): Vector4 = js.native
  /** Sets y value of this vector. */
  def setY(y: Double): Vector4 = js.native
  /** Sets z value of this vector. */
  def setZ(z: Double): Vector4 = js.native
  /** Sets w value of this vector. */
  def setW(w: Double): Vector4 = js.native
  override def setComponent(index: Double, value: Double): Unit = js.native
  override def getComponent(index: Double): Double = js.native
  override def copy(v: Vector4): this.type = js.native
  override def add(v: Vector4): this.type = js.native
  override def addScalar(s: Double): this.type = js.native
  override def addVectors(a: Vector4, b: Vector4): this.type = js.native
  override def sub(v: Vector4): this.type = js.native
  override def subVectors(a: Vector4, b: Vector4): this.type = js.native
  override def multiplyScalar(s: Double): this.type = js.native
  override def divideScalar(s: Double): this.type = js.native
  override def min(v: Vector4): this.type = js.native
  override def max(v: Vector4): this.type = js.native
  override def clamp(min: Vector4, max: Vector4): this.type = js.native
  override def clampScalar(min: Double, max: Double): this.type = js.native
  override def floor(): Unit = js.native
  override def ceil(): Unit = js.native
  override def round(): Unit = js.native
  override def roundToZero(): Unit = js.native
  override def negate(): this.type = js.native
  override def dot(v: Vector4): Double = js.native
  override def lengthSq(): Double = js.native
  override def length(): Double = js.native
  override def lengthManhattan(): Double = js.native
  override def normalize(): this.type = js.native
  override def setLength(l: Double): this.type = js.native
  override def lerp(v: Vector4, alpha: Double): this.type = js.native
  override def equals(v: Vector4): Boolean = js.native
  override def fromArray(xyzw: js.Array[Double]): this.type = js.native
  override def toArray(array: js.Array[Double] = js.native): js.Array[Double] = js.native
  override def clone(): Vector4 = js.native
  /** Transforms the vector by the matrix. */
  def applyMatrix4(m: Matrix4): this.type = js.native
  /**
   * Sets this Vector4 to the computed axis-angle representation of the rotation defined by Quaternion q.
   * The axis is stored in components (x, y, z) of the vector, and the rotation in radians is stored in component w
   */
  def setAxisAngleFromQuaternion(q: Quaternion): this.type = js.native
  /**
   * Sets this Vector4 to the computed axis-angle representation of the rotation defined by Matrix4 m. Assumes the upper
   * 3x3 of m is a pure rotation matrix (i.e, unscaled).
   *
   * The axis is stored in components (x, y, z) of the vector, and the rotation in radians is stored in component w
   */
  def setAxisAngleFromRotationMatrix(m: Matrix3): this.type = js.native
}
