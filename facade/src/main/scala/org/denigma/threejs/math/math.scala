package org.denigma.threejs.math

import org.denigma.threejs._
import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.Object3D

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.Box2")
class Box2 extends js.Object {
  def this(min: Vector2 = js.native, max: Vector2 = js.native) = this()
  var max: Vector2 = js.native
  var min: Vector2 = js.native
  def set(min: Vector2, max: Vector2): Box2 = js.native
  def setFromPoints(points: js.Array[Vector2]): Box2 = js.native
  def setFromCenterAndSize(center: Vector2, size: Double): Box2 = js.native
  def copy(box: Box2): Box2 = js.native
  def makeEmpty(): Box2 = js.native
  def empty(): Boolean = js.native
  def center(optionalTarget: Vector2 = js.native): Vector2 = js.native
  def size(optionalTarget: Vector2 = js.native): Vector2 = js.native
  def expandByPoint(point: Vector2): Box2 = js.native
  def expandByVector(vector: Vector2): Box2 = js.native
  def expandByScalar(scalar: Double): Box2 = js.native
  def containsPoint(point: Vector2): Boolean = js.native
  def containsBox(box: Box2): Boolean = js.native
  def getParameter(point: Vector2): Vector2 = js.native
  def isIntersectionBox(box: Box2): Boolean = js.native
  def clampPoint(point: Vector2, optionalTarget: Vector2 = js.native): Vector2 = js.native
  def distanceToPoint(point: Vector2): Double = js.native
  def intersect(box: Box2): Box2 = js.native
  def union(box: Box2): Box2 = js.native
  def translate(offset: Vector2): Box2 = js.native
  def equals(box: Box2): Boolean = js.native
  override def clone(): Box2 = js.native
}

@js.native
@JSName("THREE.Box3")
class Box3 extends js.Object {
  def this(min: Vector3 = js.native, max: Vector3 = js.native) = this()
  var max: Vector3 = js.native
  var min: Vector3 = js.native
  def set(min: Vector3, max: Vector3): Box3 = js.native
  def setFromPoints(points: js.Array[Vector3]): Box3 = js.native
  def setFromCenterAndSize(center: Vector3, size: Double): Box3 = js.native
  def setFromObject(`object`: Object3D): Box3 = js.native
  def copy(box: Box3): Box3 = js.native
  def makeEmpty(): Box3 = js.native
  def empty(): Boolean = js.native
  def center(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def size(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def expandByPoint(point: Vector3): Box3 = js.native
  def expandByVector(vector: Vector3): Box3 = js.native
  def expandByScalar(scalar: Double): Box3 = js.native
  def containsPoint(point: Vector3): Boolean = js.native
  def containsBox(box: Box3): Boolean = js.native
  def getParameter(point: Vector3): Vector3 = js.native
  def isIntersectionBox(box: Box3): Boolean = js.native
  def clampPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def distanceToPoint(point: Vector3): Double = js.native
  def getBoundingSphere(): Sphere = js.native
  def intersect(box: Box3): Box3 = js.native
  def union(box: Box3): Box3 = js.native
  def applyMatrix4(matrix: Matrix4): Box3 = js.native
  def translate(offset: Vector3): Box3 = js.native
  def equals(box: Box3): Boolean = js.native
  override def clone(): Box3 = js.native
}

@js.native
@JSName("THREE.Color")
class Color extends js.Object {
  def this(color: Color = js.native) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(hex: Double) = this()
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  def set(color: Color): Color = js.native
  def setHex(hex: Double): Color = js.native
  def setRGB(r: Double, g: Double, b: Double): Color = js.native
  def setHSL(h: Double, s: Double, l: Double): Color = js.native
  def setStyle(style: String): Color = js.native
  def copy(color: Color): Color = js.native
  def copyGammaToLinear(color: Color): Color = js.native
  def copyLinearToGamma(color: Color): Color = js.native
  def convertGammaToLinear(): Color = js.native
  def convertLinearToGamma(): Color = js.native
  def getHex(): Double = js.native
  def getHexString(): String = js.native
  def getHSL(): HSL = js.native
  def getStyle(): String = js.native
  def offsetHSL(h: Double, s: Double, l: Double): Color = js.native
  def add(color: Color): Color = js.native
  def addColors(color1: Color, color2: Color): Color = js.native
  def addScalar(s: Double): Color = js.native
  def multiply(color: Color): Color = js.native
  def multiplyScalar(s: Double): Color = js.native
  def lerp(color: Color, alpha: Double): Color = js.native
  def equals(color: Color): Boolean = js.native
  def fromArray(rgb: js.Array[Double]): Color = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Color = js.native
}

@js.native
@JSName("THREE.Euler")
class Euler extends js.Object {
  def this(x: Double = js.native, y: Double = js.native, z: Double = js.native, order: String = js.native) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var order: String = js.native
  def set(x: Double, y: Double, z: Double, order: String = js.native): Euler = js.native
  def copy(euler: Euler): Euler = js.native
  def setFromRotationMatrix(m: Matrix4, order: String = js.native): Euler = js.native
  def setFromQuaternion(q: Quaternion, order: String = js.native, update: Boolean = js.native): Euler = js.native
  def reorder(newOrder: String): Euler = js.native
  def equals(euler: Euler): Boolean = js.native
  def fromArray(xyzo: js.Array[js.Any]): Euler = js.native
  def toArray(): js.Array[js.Any] = js.native
  var onChange: js.Function0[Unit] = js.native
  override def clone(): Euler = js.native
}

@js.native
@JSName("THREE.Frustum")
class Frustum extends js.Object {
  def this(p0: Plane = js.native, p1: Plane = js.native, p2: Plane = js.native, p3: Plane = js.native, p4: Plane = js.native, p5: Plane = js.native) = this()
  var planes: js.Array[Plane] = js.native
  def set(p0: Double = js.native, p1: Double = js.native, p2: Double = js.native, p3: Double = js.native, p4: Double = js.native, p5: Double = js.native): Frustum = js.native
  def copy(frustum: Frustum): Frustum = js.native
  def setFromMatrix(m: Matrix4): Frustum = js.native
  def intersectsObject(`object`: Object3D): Boolean = js.native
  def intersectsSphere(sphere: Sphere): Boolean = js.native
  def intersectsBox(box: Box3): Boolean = js.native
  def containsPoint(point: Vector3): Boolean = js.native
  override def clone(): Frustum = js.native
}

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
 * @see [[http://threejs.org/docs/#Reference/Math/Matrix3]]
 */
@js.native
@JSName("THREE.Matrix3")
class Matrix3 extends Matrix[Matrix3] {
  def this(n11: Double, n12: Double, n13: Double, n21: Double, n22: Double, n23: Double, n31: Double, n32: Double, n33: Double) = this()

  def set(n11: Double, n12: Double, n13: Double, n21: Double, n22: Double, n23: Double, n31: Double, n32: Double, n33: Double): Matrix3 = js.native
  override def identity(): Matrix3 = js.native
  override def copy(m: Matrix3): Matrix3 = js.native
  def applyToVector3Array(array: js.Array[Double], offset: Double = js.native, length: Double = js.native): js.Array[Double] = js.native
  override def multiplyScalar(s: Double): Matrix3 = js.native
  override def determinant(): Double = js.native
  override def getInverse(matrix: Matrix3, throwOnInvertible: Boolean = js.native): Matrix3 = js.native
  override def transpose(): Matrix3 = js.native
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

  def set(n11: Double, n12: Double, n13: Double, n14: Double, n21: Double, n22: Double, n23: Double, n24: Double, n31: Double, n32: Double, n33: Double, n34: Double, n41: Double, n42: Double, n43: Double, n44: Double): Matrix4 = js.native
  override def identity(): Matrix4 = js.native
  override def copy(m: Matrix4): Matrix4 = js.native
  def copyPosition(m: Matrix4): Matrix4 = js.native
  def extractRotation(m: Matrix4): Matrix4 = js.native
  def makeRotationFromEuler(euler: Euler): Matrix4 = js.native
  def makeRotationFromQuaternion(q: Quaternion): Matrix4 = js.native
  def lookAt(eye: Vector3, target: Vector3, up: Vector3): Matrix4 = js.native
  def multiply(m: Matrix4): Matrix4 = js.native
  def multiplyMatrices(a: Matrix4, b: Matrix4): Matrix4 = js.native
  def multiplyToArray(a: Matrix4, b: Matrix4, r: js.Array[Double]): Matrix4 = js.native
  override def multiplyScalar(s: Double): Matrix4 = js.native
  def applyToVector3Array(array: js.Array[Double], offset: Double = js.native, length: Double = js.native): js.Array[Double] = js.native
  override def determinant(): Double = js.native
  override def transpose(): Matrix4 = js.native
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def setPosition(v: Vector3): Vector3 = js.native
  override def getInverse(m: Matrix4, throwOnInvertible: Boolean): Matrix4 = js.native
  def scale(v: Vector3): Matrix4 = js.native
  def getMaxScaleOnAxis(): Double = js.native
  def makeTranslation(x: Double, y: Double, z: Double): Matrix4 = js.native
  def makeRotationX(theta: Double): Matrix4 = js.native
  def makeRotationY(theta: Double): Matrix4 = js.native
  def makeRotationZ(theta: Double): Matrix4 = js.native
  def makeRotationAxis(axis: Vector3, angle: Double): Matrix4 = js.native
  def makeScale(x: Double, y: Double, z: Double): Matrix4 = js.native
  def compose(translation: Vector3, rotation: Quaternion, scale: Vector3): Matrix4 = js.native
  def decompose(translation: Vector3 = js.native, rotation: Quaternion = js.native, scale: Vector3 = js.native): js.Array[Object] = js.native
  def makeFrustum(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4 = js.native
  def makePerspective(fov: Double, aspect: Double, near: Double, far: Double): Matrix4 = js.native
  def makeOrthographic(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double): Matrix4 = js.native
  def fromArray(array: js.Array[Double]): Matrix4 = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Matrix4 = js.native
}

@js.native
@JSName("THREE.Plane")
class Plane extends js.Object {
  def this(normal: Vector3 = js.native, constant: Double = js.native) = this()
  var normal: Vector3 = js.native
  var constant: Double = js.native
  def set(normal: Vector3, constant: Double): Plane = js.native
  def setComponents(x: Double, y: Double, z: Double, w: Double): Plane = js.native
  def setFromNormalAndCoplanarPoint(normal: Vector3, point: Vector3): Plane = js.native
  def setFromCoplanarPoints(a: Vector3, b: Vector3, c: Vector3): Plane = js.native
  def copy(plane: Plane): Plane = js.native
  def normalize(): Plane = js.native
  def negate(): Plane = js.native
  def distanceToPoint(point: Vector3): Double = js.native
  def distanceToSphere(sphere: Sphere): Double = js.native
  def projectPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def orthoPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def isIntersectionLine(line: Line3): Boolean = js.native
  def intersectLine(line: Line3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def coplanarPoint(optionalTarget: Boolean = js.native): Vector3 = js.native
  def applyMatrix4(matrix: Matrix4, optionalNormalMatrix: Matrix3 = js.native): Plane = js.native
  def translate(offset: Vector3): Plane = js.native
  def equals(plane: Plane): Boolean = js.native
  override def clone(): Plane = js.native
}

@js.native
@JSName("THREE.Quaternion")
class Quaternion extends js.Object {
  def this(x: Double = js.native, y: Double = js.native, z: Double = js.native, w: Double = js.native) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var w: Double = js.native
  def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
  def copy(q: Quaternion): Quaternion = js.native
  def setFromEuler(euler: Euler, update: Boolean = js.native): Quaternion = js.native
  def setFromAxisAngle(axis: Vector3, angle: Double): Quaternion = js.native
  def setFromRotationMatrix(m: Matrix4): Quaternion = js.native
  def setFromUnitVectors(vFrom: Vector3, vTo: Vector4): Quaternion = js.native
  def inverse(): Quaternion = js.native
  def conjugate(): Quaternion = js.native
  def dot(v: Vector3): Double = js.native
  def lengthSq(): Double = js.native
  def length(): Double = js.native
  def normalize(): Quaternion = js.native
  def multiply(q: Quaternion): Quaternion = js.native
  def multiplyQuaternions(a: Quaternion, b: Quaternion): Quaternion = js.native
  def multiplyVector3(vector: Vector3): Vector3 = js.native
  def slerp(qb: Quaternion, t: Double): Quaternion = js.native
  def equals(v: Quaternion): Boolean = js.native
  def fromArray(n: js.Array[Double]): Quaternion = js.native
  def toArray(): js.Array[Double] = js.native
  var onChange: js.Function0[Unit] = js.native
  override def clone(): Quaternion = js.native
}

@js.native
@JSName("THREE.Quaternion")
object Quaternion extends js.Object {
  def slerp(qa: Quaternion, qb: Quaternion, qm: Quaternion, t: Double): Quaternion = js.native
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
