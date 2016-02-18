package org.denigma.threejs.math

import org.denigma.threejs._
import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.Object3D

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.typedarray.{TypedArray, Float32Array}


@js.native
trait Box[B <: Box[B, VEC], VEC <: Vector[VEC]] extends js.Object {
  /** Sets the lower and upper (x, y) boundaries of this box.*/
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
   * @param point Position to clamp.
   * @param optionalTarget  If specified, the clamped result will be copied here.
   */
  def clampPoint(point: VEC, optionalTarget: VEC = js.native): VEC = js.native
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
  /**
   * Returns true if this box includes zero points within its bounds.
   * Note that a box with equal lower and upper bounds still includes one point, the one both bounds share.
   */
  def empty(): Boolean = js.native
  /**
   * Returns true if this box and box share the same lower and upper bounds.
   *
   * @param box Box to compare.
   */
  def equals(box: B): Boolean = js.native
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
  /** Makes this box empty.*/
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
   * @param size Desired x and y dimensions of the box.
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
class Box3(var min: Vector3 = js.native, var max: Vector3 = js.native) extends Box[Box3, Vector3]

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
  /** Blue channel value between 0 and 1. Default is 1.*/
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
  /** Returns an object with properties h, s, and l.*/
  def getHSL(): HSL = js.native
  /** Adds given h, s, and l to this color's existing h, s, and l values. */
  def offsetHSL(h: Double, s: Double, l: Double): this.type = js.native
  /** Adds rgb values of given color to rgb values of this color */
  def add(color: Color): this.type = js.native
  /** Sets this color to the sum of color1 and color2 */
  def addColors(color1: Color, color2: Color): this.type = js.native
  /** Adds s to the rgb values of this color */
  def addScalar(s: Double): this.type = js.native
  /** Multiplies this color's rgb values by given color's rgb values*/
  def multiply(color: Color): this.type = js.native
  /** Multiplies this color's rgb values by s*/
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
  def toArray(array:js.Array[Double] = js.native): js.Array[Double] = js.native
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
}

/**
 * Euler Angles.
 *
 * Euler angles describe a rotation transformation by rotating an object on its
 * various axes in specified amounts per axis, and a specified axis order. (More information on Wikipedia)
 *
 * @param x the angle of the x axis in radians
 * @param y the angle of the y axis in radians
 * @param z the angle of the z axis in radians
 * @param order A string representing the order that the rotations are applied, defaults to 'XYZ' (must be upper case).
 * @see [[http://threejs.org/docs/#Reference/Math/Euler]]
 */
@js.native
@JSName("THREE.Euler")
class Euler(var x: Double = js.native, var y: Double = js.native, var z: Double = js.native, var order: String = js.native) extends js.Object {
  /**
   * Sets the angles of this euler transform.
   *
   * @param x the angle of the x axis in radians
   * @param y the angle of the y axis in radians
   * @param z the angle of the z axis in radians
   * @param order A string representing the order that the rotations are applied, defaults to 'XYZ' (must be upper case).
   * @return
   */
  def set(x: Double, y: Double, z: Double, order: String = js.native): this.type = js.native
  /** Copies value of euler to this euler. */
  def copy(euler: Euler): this.type = js.native
  /**
   * Sets the angles of this euler transform from a pure rotation matrix based on the orientation specified by order.
   *
   * @param m assumes upper 3x3 of matrix is a pure rotation matrix (i.e. unscaled)
   * @param order Order of axes, defaults to 'XYZ' (must be upper case)
   */
  def setFromRotationMatrix(m: Matrix4, order: String = js.native): this.type = js.native
  /**
   * Sets the angles of this euler transform from a normalized quaternion based on the orientation specified by order.
   *
   * @param q quaternion must be normalized
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
  def setFromVector3 (vector: Vector3, order:String): this.type = js.native
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
  /** Copies the translation component of the supplied matrix m into this matrix translation component.*/
  def copyPosition(m: Matrix4): this.type = js.native
  /** Creates the basis matrix consisting of the three provided axis vectors. Returns the current matrix. */
  def makeBasis(xAxis:Vector3, yAxis:Vector3, zAxis:Vector3): this.type = js.native
  /** Extracts basis of into the three axis vectors provided. Returns the current matrix. */
  def extractBasis(xAxis:Vector3, yAxis:Vector3, zAxis:Vector3): this.type = js.native
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
  def multiplyToArray(a: Matrix4, b: Matrix4, r: js.Array[Double] | TypedArray[Float,_]): this.type = js.native
  override def multiplyScalar(s: Double): this.type = js.native
  override def determinant(): Double = js.native
  override def transpose(): this.type = js.native
  /** Flattens this matrix into supplied flat array starting from offset position in the array. */
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  /** Sets the position component for this matrix from vector v.*/
  def setPosition(v: Vector3): this.type = js.native
  override def getInverse(m: Matrix4, throwOnInvertible: Boolean): this.type = js.native
  /**
   * Sets the rotation submatrix of this matrix to the rotation specified by Euler angles,
   * the rest of the matrix is identity. Default order is "XYZ".
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
  /** Sets this matrix as translation transform.*/
  def makeTranslation(x: Double, y: Double, z: Double): this.type = js.native

  /**
   * Sets this matrix as rotation transform around x axis by theta radians.
   * @param theta Rotation angle in radians.
   */
  def makeRotationX(theta: Double): this.type = js.native
  /**
   * Sets this matrix as rotation transform around y axis by theta radians.
   * @param theta Rotation angle in radians.
   */
  def makeRotationY(theta: Double): this.type = js.native
  /**
   * Sets this matrix as rotation transform around z axis by theta radians.
   * @param theta Rotation angle in radians.
   */
  def makeRotationZ(theta: Double): this.type = js.native
  /**
   * Sets this matrix as rotation transform around axis by angle radians.
   * Based on http://www.gamedev.net/reference/articles/article1199.asp.
   * @param axis Rotation axis, should be normalized.
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
    * @param a An array in the form [vector1x, vector1y, vector1z, vector2x, vector2y, vector2z, ...]
   */
  def applyToVector3Array(a: js.Array[Vector3]): js.Array[Vector3] = js.native
  /** Gets the maximum scale value of the 3 axes.*/
  def getMaxScaleOnAxis(): Double = js.native
}

/**
 * A two dimensional surface that extends infinitely in 3d space.
 * @param normal normal vector defining the plane pointing towards the origin
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
   * @param matrix Matrix4 to apply
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
  /** Sets the plane's values as defined by a normal and arbitrary coplanar point. */
  def setFromNormalAndCoplanarPoint(normal: Vector3, point: Vector3): this.type = js.native
  /** Returns a new copy of this plane. */
  override def clone(): Plane = js.native
  /** Returns the smallest distance from the point to the plane. */
  def distanceToPoint(point: Vector3): Double = js.native
  /** Checks to see if two planes are equal (their normals and constants match) */
  def equals(plane: Plane): Boolean = js.native
  /**
   * Set the individual components that make up the plane.
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
  /** Sets this quaternion from rotation specified by Euler angle.*/
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
  /** Inverts this quaternion.*/
  def inverse(): this.type = js.native
  /** Computes length of this quaternion. */
  def length(): Double = js.native
  /** Normalizes this quaternion.*/
  def normalize(): this.type = js.native
  /** Multiplies this quaternion by b. */
  def multiply(q: Quaternion): this.type = js.native
  /** Sets this quaternion to a x b Adapted from
   * http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/code/index.htm.
   */
  def multiplyQuaternions(a: Quaternion, b: Quaternion): this.type = js.native
  /** Rotates vector by this quaternion into dest. If dest is not specified, result goes to vec. */
  def multiplyVector3(vector: Vector3, dest: Vector = js.native): Unit = js.native
  /** Clones this quaternion.*/
  override def clone(): Quaternion = js.native

  /**
   * Returns the numerical elements of this quaternion in an array of format (x, y, z, w).
   * @param array Array to store the quaternion.
   */
  def toArray(array:js.Array[Double] = js.native): js.Array[Double] = js.native

  /**
   * Compares each component of v to each component of this quaternion to determine if they represent the same rotation.
   * @param v Quaternion that this quaternion will be compared to.
   */
  def equals(v: Quaternion): Boolean = js.native
  /** Calculates the squared length of the quaternion.*/
  def lengthSq(): Double = js.native

  /**
   * Sets this quaternion's component values from an array.
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
   * @param quaternionB The other quaternion rotation
   * @param t Normalized 0 to 1 interpolation factor
   */
  def slerp(quaternionB: Quaternion, t: Double): this.type = js.native
}

@js.native
@JSName("THREE.Quaternion")
object Quaternion extends js.Object {
  /**
   * @param qStart The starting quaternion (where t is 0)
   * @param qEnd The ending quaternion (where t is 1)
   * @param qTarget The target quaternion that gets set with the result
   * @param t Normalized 0 to 1 interpolation factor
   */
  def slerp(qStart: Quaternion, qEnd: Quaternion, qTarget: Quaternion, t: Double): Quaternion = js.native
}

@js.native
@JSName("THREE.Ray")
class Ray extends js.Object {
  def this(origin: Vector3 = js.native, direction: Vector3 = js.native) = this()
  var origin: Vector3 = js.native
  var direction: Vector3 = js.native
  def set(origin: Vector3, direction: Vector3): Ray = js.native
  def copy(ray: Ray): Ray = js.native
  def at(t: Double, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def recast(t: Double): Ray = js.native
  def closestPointToPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def distanceToPoint(point: Vector3): Double = js.native
  def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3 = js.native, optionalPointOnSegment: Vector3 = js.native): Double = js.native
  def isIntersectionSphere(sphere: Sphere): Boolean = js.native
  def intersectSphere(sphere: Sphere, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def isIntersectionPlane(plane: Plane): Boolean = js.native
  def distanceToPlane(plane: Plane): Double = js.native
  def intersectPlane(plane: Plane, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def isIntersectionBox(box: Box3): Boolean = js.native
  def intersectBox(box: Box3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def intersectTriangle(a: Vector3, b: Vector3, c: Vector3, backfaceCulling: Boolean, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def applyMatrix4(matrix4: Matrix4): Ray = js.native
  def equals(ray: Ray): Boolean = js.native
  override def clone(): Ray = js.native
}

@js.native
@JSName("THREE.Sphere")
class Sphere extends js.Object {
  def this(center: Vector3 = js.native, radius: Double = js.native) = this()
  var center: Vector3 = js.native
  var radius: Double = js.native
  def set(center: Vector3, radius: Double): Sphere = js.native
  def setFromPoints(points: js.Array[Vector3], optionalCenter: Vector3 = js.native): Sphere = js.native
  def copy(sphere: Sphere): Sphere = js.native
  def empty(): Boolean = js.native
  def containsPoint(point: Vector3): Boolean = js.native
  def distanceToPoint(point: Vector3): Double = js.native
  def intersectsSphere(sphere: Sphere): Boolean = js.native
  def clampPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def getBoundingBox(optionalTarget: Box3 = js.native): Box3 = js.native
  def applyMatrix4(matrix: Matrix4): Sphere = js.native
  def translate(offset: Vector3): Sphere = js.native
  def equals(sphere: Sphere): Boolean = js.native
  override def clone(): Sphere = js.native
}

@js.native
@JSName("THREE.Spline")
class Spline extends js.Object {
  def this(points: js.Array[SplineControlPoint]) = this()
  var points: js.Array[SplineControlPoint] = js.native
  def initFromArray(a: js.Array[js.Array[Double]]): Unit = js.native
  def getPoint(k: Double): SplineControlPoint = js.native
  def getControlPointsArray(): js.Array[js.Array[Double]] = js.native
  def getLength(nSubDivisions: Double = js.native): js.Any = js.native
  def reparametrizeByArcLength(samplingCoef: Double): Unit = js.native
}

@js.native
@JSName("THREE.Triangle")
class Triangle extends js.Object {
  def this(a: Vector3 = js.native, b: Vector3 = js.native, c: Vector3 = js.native) = this()
  var a: Vector3 = js.native
  var b: Vector3 = js.native
  var c: Vector3 = js.native
  def set(a: Vector3, b: Vector3, c: Vector3): Triangle = js.native
  def setFromPointsAndIndices(points: js.Array[Vector3], i0: Double, i1: Double, i2: Double): Triangle = js.native
  def copy(triangle: Triangle): Triangle = js.native
  def area(): Double = js.native
  def midpoint(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def normal(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def plane(optionalTarget: Vector3 = js.native): Plane = js.native
  def barycoordFromPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def containsPoint(point: Vector3): Boolean = js.native
  def equals(triangle: Triangle): Boolean = js.native
  override def clone(): Triangle = js.native
}

@js.native
@JSName("THREE.Triangle")
object Triangle extends js.Object {
  def normal(a: Vector3, b: Vector3, c: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def barycoordFromPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3, optionalTarget: Vector3): Vector3 = js.native
  def containsPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3): Boolean = js.native
}

@js.native
sealed trait Vector[VT <: Vector[VT]] extends js.Object {
  def setComponent(index: Double, value: Double): Unit = js.native
  def getComponent(index: Double): Double = js.native
  def copy(v: VT): VT = js.native
  def add(v: VT): VT = js.native
  def addVectors(a: VT, b: VT): VT = js.native
  def sub(v: VT): VT = js.native
  def subVectors(a: VT, b: VT): VT = js.native
  def multiplyScalar(s: Double): VT = js.native
  def divideScalar(s: Double): VT = js.native
  def negate(): VT = js.native
  def dot(v: VT): Double = js.native
  def lengthSq(): Double = js.native
  def length(): Double = js.native
  def normalize(): VT = js.native
  def distanceTo(v: VT): Double = js.native
  def distanceToSquared(v: VT): Double = js.native
  def setLength(l: Double): VT = js.native
  def lerp(v: VT, alpha: Double): VT = js.native
  def equals(v: VT): Boolean = js.native
  override def clone(): VT = js.native
}

@js.native
@JSName("THREE.Vector2")
class Vector2 extends Vector[Vector2] {
  def this(x: Double = js.native, y: Double = js.native) = this()
  var x: Double = js.native
  var y: Double = js.native
  /** Sets value of this vector. */
  def set(x: Double, y: Double): this.type = js.native
  def setX(x: Double): this.type  = js.native
  def setY(y: Double): this.type  = js.native
  override def setComponent(index: Double, value: Double): Unit = js.native
  override def getComponent(index: Double): Double = js.native
  override def copy(v: Vector2): this.type  = js.native
  override def add(v: Vector2): this.type  = js.native
  override def addVectors(a: Vector2, b: Vector2): this.type  = js.native
  def addScalar(s: Double): Vector2 = js.native
  override def sub(v: Vector2): this.type = js.native
  override def subVectors(a: Vector2, b: Vector2): this.type  = js.native
  def multiply(v: Vector2): Vector2 = js.native
  override def multiplyScalar(s: Double): Vector2 = js.native
  def divide(v: Vector2): Vector2 = js.native
  override def divideScalar(s: Double): Vector2 = js.native
  def min(v: Vector2): Vector2 = js.native
  def max(v: Vector2): Vector2 = js.native
  def clamp(min: Vector2, max: Vector2): Vector2 = js.native
  def clampScalar(min: Double, max: Double): Vector2 = js.native
  def floor(): this.type = js.native
  def ceil(): this.type = js.native
  def round(): this.type = js.native
  def roundToZero(): this.type = js.native
  override def negate(): this.type = js.native
  override def dot(v: Vector2): Double = js.native
  override def lengthSq(): Double = js.native
  override def length(): Double = js.native
  override def normalize(): this.type = js.native
  override def distanceTo(v: Vector2): Double = js.native
  override def distanceToSquared(v: Vector2): Double = js.native
  override def setLength(l: Double): this.type = js.native
  override def lerp(v: Vector2, alpha: Double): Vector2 = js.native
  override def equals(v: Vector2): Boolean = js.native
  def fromArray(xy: js.Array[Double]): Vector2 = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Vector2 = js.native
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
  /** Sets value of this vector. */
  def set(x: Double, y: Double, z: Double): this.type = js.native
  /** Sets x value of this vector. */
  def setX(x: Double): this.type = js.native
  /** Sets y value of this vector. */
  def setY(y: Double): this.type = js.native
  /** Sets z value of this vector. */
  def setZ(z: Double): this.type = js.native
  override def setComponent(index: Double, value: Double): Unit = js.native
  override def getComponent(index: Double): Double = js.native
  override def copy(v: Vector3): this.type = js.native
  override def add(a: Vector3): this.type = js.native
  def addScalar(s: Double): this.type = js.native
  override def addVectors(a: Vector3, b: Vector3): this.type = js.native
  override def sub(a: Vector3): this.type = js.native
  override def subVectors(a: Vector3, b: Vector3): this.type = js.native
  def multiply(v: Vector3): this.type = js.native
  override def multiplyScalar(s: Double): this.type = js.native
  def multiplyVectors(a: Vector3, b: Vector3): this.type = js.native
  def applyEuler(euler: Euler): this.type = js.native
  def applyAxisAngle(axis: Vector3, angle: Double): this.type = js.native
  def applyMatrix3(m: Matrix3): this.type = js.native
  def applyMatrix4(m: Matrix4): this.type = js.native
  def applyProjection(m: Matrix4): this.type = js.native
  def applyQuaternion(q: Quaternion): this.type = js.native
  def transformDirection(m: Matrix4): this.type = js.native
  def divide(v: Vector3): this.type = js.native
  override def divideScalar(s: Double): this.type = js.native
  /** If this vector's x, y, or z value is greater than vector v's x, y, or z value, that value is replaced by the corresponding vector v value. */
  def min(v: Vector3): this.type = js.native
  /** If this vector's x, y, or z value is less than vector v's x, y, or z value, that value is replaced by the corresponding vector v value. */
  def max(v: Vector3): this.type = js.native
  def clamp(min: Vector3, max: Vector3): Vector3 = js.native
  def clampScalar(min: Double, max: Double): Vector3 = js.native
  def floor(): Vector3 = js.native
  def ceil(): Vector3 = js.native
  def round(): Vector3 = js.native
  def roundToZero(): Vector3 = js.native
  override def negate(): this.type = js.native
  override def dot(v: Vector3): Double = js.native
  override def lengthSq(): Double = js.native
  override def length(): Double = js.native
  def lengthManhattan(): Double = js.native
  override def normalize(): Vector3 = js.native
  override def setLength(l: Double): Vector3 = js.native
  override def lerp(v: Vector3, alpha: Double): Vector3 = js.native
  def cross(a: Vector3): Vector3 = js.native
  def crossVectors(a: Vector3, b: Vector3): Vector3 = js.native
  def project(camera: Camera): Vector3 = js.native
  def unproject(camera: Camera): Vector3 = js.native
  def projectOnVector(v: Vector3): Vector3 = js.native
  def projectOnPlane(planeNormal: Vector3): Vector3 = js.native
  def reflect(vector: Vector3): Vector3 = js.native
  def angleTo(v: Vector3): Double = js.native
  /** Computes distance of this vector to v. */
  override def distanceTo(v: Vector3): Double = js.native
  override def distanceToSquared(v: Vector3): Double = js.native
  def setFromMatrixPosition(m: Matrix4): Vector3 = js.native
  def setFromMatrixScale(m: Matrix4): Vector3 = js.native
  def setFromMatrixColumn(index: Double, matrix: Matrix4): Vector3 = js.native
  override def equals(v: Vector3): Boolean = js.native
  def fromArray(xyz: js.Array[Double]): Vector3 = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Vector3 = js.native
}

@js.native
@JSName("THREE.Vector4")
class Vector4 extends Vector[Vector4] {
  def this(x: Double = js.native, y: Double = js.native, z: Double = js.native, w: Double = js.native) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var w: Double = js.native
  def set(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
  def setX(x: Double): Vector4 = js.native
  def setY(y: Double): Vector4 = js.native
  def setZ(z: Double): Vector4 = js.native
  def setW(w: Double): Vector4 = js.native
  override def setComponent(index: Double, value: Double): Unit = js.native
  override def getComponent(index: Double): Double = js.native
  override def copy(v: Vector4): Vector4 = js.native
  override def add(v: Vector4): Vector4 = js.native
  def addScalar(s: Double): Vector4 = js.native
  override def addVectors(a: Vector4, b: Vector4): this.type = js.native
  override def sub(v: Vector4): this.type = js.native
  override def subVectors(a: Vector4, b: Vector4): this.type = js.native
  override def multiplyScalar(s: Double): this.type = js.native
  def applyMatrix4(m: Matrix4): this.type = js.native
  override def divideScalar(s: Double): this.type = js.native
  def setAxisAngleFromQuaternion(q: Quaternion): this.type = js.native
  def setAxisAngleFromRotationMatrix(m: Matrix3): this.type = js.native
  def min(v: Vector4): this.type = js.native
  def max(v: Vector4): this.type = js.native
  def clamp(min: Vector4, max: Vector4): this.type = js.native
  def clampScalar(min: Double, max: Double): this.type = js.native
  def floor(): this.type = js.native
  def ceil(): this.type = js.native
  def round(): this.type = js.native
  def roundToZero(): this.type = js.native
  override def negate(): this.type = js.native
  override def dot(v: Vector4): Double = js.native
  override def lengthSq(): Double = js.native
  override def length(): Double = js.native
  def lengthManhattan(): Double = js.native
  override def normalize(): this.type = js.native
  override def setLength(l: Double): this.type = js.native
  override def lerp(v: Vector4, alpha: Double): this.type = js.native
  override def equals(v: Vector4): Boolean = js.native
  def fromArray(xyzw: js.Array[Double]): js.Array[Double] = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Vector4 = js.native
}
