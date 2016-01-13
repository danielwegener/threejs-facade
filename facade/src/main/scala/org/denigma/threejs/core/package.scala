package org.denigma.threejs.core

import org.denigma.threejs._
import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.math._
import scala.scalajs.js.typedarray._
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


/**
 * This class stores data for an attribute associated with a [[BufferGeometry]]. See that page for details and a usage example.
 * This class is used to store builtin attributes such as vertex position, normals, color, etc., but can also be
 * used in your code to store custom attributes in a BufferGeometry.
 * @see [[http://threejs.org/docs/#Reference/Core/BufferAttribute]]
 */
@js.native
@JSName("THREE.BufferAttribute")
class BufferAttribute[T, REPR <: TypedArray[T,REPR]] extends js.Object {
  def this(array: REPR, itemSize: Double) = this()
  var array: REPR = js.native
  /**
    * Records how many items of the array are associated with a particular vertex. For instance, if this attribute is
    * storing a 3-component vector (such as a position, normal, or color), then itemSize should be 3.
    **/
  def itemSize: Double = js.native

  @deprecated(message = "THREE.BufferAttribute: .length has been deprecated. Please use .count.", since = "r73")
  def length: Double = js.native

  /** Gives the total number of elements in the array. */
  def count: Double = js.native

  /**
    * Flag to indicate that this attribute has changed and should be re-send to the GPU.
    * Set this to true when you modify the value of the array.
    **/
  def needsUpdate_=(value:Boolean):Unit = js.native

  /** Sets the associated array with values from the passed array. */
  def set(value: REPR): this.type = js.native

  /**
    * Sets the value of the array at
    * {{{index * itemSize}}}
    * to x
    */
  def setX(index: Double, x: T): this.type = js.native
  /**
    * Sets the value of the array at
    * {{{index * itemSize + 1}}}
    * to y
    */
  def setY(index: Double, y: T): this.type = js.native
  /**
    * Sets the value of the array at
    * {{{index * itemSize + 2}}}
    * to z
    */
  def setZ(index: Double, z: T): this.type = js.native

  /**
    * Sets the value of the array at
    * {{{index * itemSize to x}}}
    * and sets the value of the array at
    * {{{index * itemSize + 1}}}
    * to y
    */
  def setXY(index: Double, x: T, y: T): this.type = js.native

  /**
    * Sets the value of the array at
    * {{{index * itemSize}}
    * to x, the value of the array at
    * {{{index * itemSize + 1}}}
    * to y, and the value of the array at
    * {{{index * itemSize + 2}}}
    * to z.
    */
  def setXYZ(index: Double, x: T, y: T, z: T): this.type = js.native
  /**
    * Sets the value of the array at
    * {{{index * itemSize}}
    * to x, the value of the array at
    * {{{index * itemSize + 1}}}
    * to y, and the value of the array at
    * {{{index * itemSize + 2}}}
    * to z, and the value of the array at
    * {{{index * itemSize + 3}}}
    * to w.
    */
  def setXYZW(index: Double, x: T, y: T, z: T, w: T): this.type = js.native
}

@js.native
@JSName("THREE.Int8Attribute")
class Int8Attribute extends BufferAttribute[Byte, Int8Array] {
  def this(array: Int8Array, itemSize: Double) = this()
}

@js.native
@JSName("THREE.Uint8Attribute")
class Uint8Attribute extends BufferAttribute[Short, Uint8Array] {
  def this(data: Uint8Array, itemSize: Double) = this()
}

@js.native
@JSName("THREE.Uint8ClampedAttribute")
class Uint8ClampedAttribute extends BufferAttribute[Int, Uint8ClampedArray] {
  def this(data: Uint8ClampedArray, itemSize: Double) = this()
}

@js.native
@JSName("THREE.Int16Attribute")
class Int16Attribute extends BufferAttribute[Short, Int16Array] {
  def this(data: js.Any, itemSize: Double) = this()
}

@js.native
@JSName("THREE.Uint16Attribute")
class Uint16Attribute extends BufferAttribute[Int, Uint16Array] {
  def this(data: Uint16Array, itemSize: Double) = this()
}

@js.native
@JSName("THREE.Int32Attribute")
class Int32Attribute extends BufferAttribute[Int, Int32Array] {
  def this(data: Int32Array, itemSize: Double) = this()
}

@js.native
@JSName("THREE.Uint32Attribute")
class Uint32Attribute extends BufferAttribute[Double, Uint32Array] {
  def this(data: Uint32Array, itemSize: Double) = this()
}

@js.native
@JSName("THREE.Float32Attribute")
class Float32Attribute extends BufferAttribute[Float,Float32Array] {
  def this(data: Float32Array, itemSize: Double) = this()
}

@js.native
@JSName("THREE.Float64Attribute")
class Float64Attribute extends BufferAttribute[Double,Float64Array] {
  def this(data: Float64Array, itemSize: Double) = this()
}

/**
 * This class is an efficient alternative to Geometry, because it stores all data, including vertex positions,
 * face indices, normals, colors, UVs, and custom attributes within buffers; this reduces the cost of passing all
 * this data to the GPU. This also makes BufferGeometry harder to work with than [[Geometry]]; rather than accessing
 * position data as [[Vector3]] objects, color data as [[Color]] objects, and so on, you have to access the raw data from
 * the appropriate attribute buffer. This makes BufferGeometry best-suited for static objects where you don't
 * need to manipulate the geometry much after instantiating it.
 *
 * ==Accessing attributes==
 *
 * WebGL stores data associated with individual vertices of a geometry in attributes. Examples include the position of the vertex, the normal vector for the vertex, the vertex color, and so on. When using Geometry, the renderer takes care of wrapping up this information into typed array buffers and sending this data to the shader. With BufferGeometry, all of this data is stored in buffers associated with an individual attributes. This means that to get the position data associated with a vertex (for instance), you must call .getAttribute to access the 'position' attribute, then access the individual x, y, and z coordinates of the position.
 *
 * The following attributes are set by various members of this class:
 *
 * `position (itemSize: 3)`
 *
 * Stores the x, y, and z coordinates of each vertex in this geometry. Set by [[fromGeometry]].
 *
 * `normal (itemSize: 3)`
 *
 * Stores the x, y, and z components of the face or vertex normal vector of each vertex in this geometry. Set by [[fromGeometry]].
 *
 * `color (itemSize: 3)`
 *
 * Stores the red, green, and blue channels of vertex color of each vertex in this geometry. Set by [[fromGeometry]].
 *
 * `index (itemSize: 3)`
 *
 * Allows for vertices to be re-used across multiple triangles; this is called using "indexed triangles," and works much the same as it does in Geometry: each triangle is associated with the index of three vertices. This attribute therefore stores the index of each vertex for each triangular face. If this attribute is not set, the renderer assumes that each three contiguous positions represent a single triangle.
 *
 * In addition to the the built-in attributes, you can set your own custom attributes using the addAttribute method. With Geometry, these attributes are set and stored on the Material. In BufferGeometry, the attributes are stored with the geometry itself. Note that you still need to set the attributes information on the material as well, but the value of each attribute is stored in the BufferGeometry.
 *
 * @constructor This creates a new BufferGeometry. It also sets several properties to a default value.
 * @see [[http://threejs.org/docs/#Reference/Core/BufferGeometry]]
 */
@js.native
@JSName("THREE.BufferGeometry")
class BufferGeometry extends Geometry {
  /**
   * This hashmap has as id the name of the attribute to be set and as value the buffer to set it to.
   * Rather than accessing this property directly, use addAttribute and getAttribute to access attributes of this geometry.
   */
  var attributes: js.Array[BufferAttribute[_,_]] = js.native
  /**
   * For geometries that use indexed triangles, this Array can be used to split the object into multiple WebGL draw calls.
   * Each draw call will draw some subset of the vertices in this geometry using the configured shader.
   * This may be necessary if, for instance, you have more than 65535 vertices in your object. Each element is an object of the form:
   * {{{{ start: Integer, count: Integer, index: Integer }}}}
   * where start specifies the index of the first vertex in this draw call, count specifies how many vertices are included,
   * and index specifies an optional offset. Use addDrawCall to add draw calls, rather than modifying this array directly.
   */
  @deprecated(message="THREE.BufferGeometry: .drawcalls has been renamed to .groups." ,since="r73")
  def drawcalls: js.Any = js.native

  @deprecated(message = "THREE.BufferGeometry: .offsets has been renamed to .groups.", since = "r73")
  def offsets: js.Any = js.native

  var groups: js.Array[_] = js.native

  /**
   * Adds an attribute to this geometry. Use this rather than the attributes property,
   * because an internal array of attributes is maintained to speed up iterating over attributes.
   */
  def addAttribute(name: String, attribute: BufferAttribute[_,_]): js.Dynamic = js.native
  def addAttribute(name: String, array: js.Any, itemSize: Double): js.Dynamic = js.native
  /** Returns the attribute with the specified name. */
  def getAttribute(name: String): js.Dynamic = js.native
  /** Removes the attribute with the specified name. */
  def removeAttribute(name: String): js.Dynamic = js.native

  /** Todo: This should normally be a BufferAttribute[Long, Uint32Array], but Uint32Array has the wrong signature */
  def setIndex(index : BufferAttribute[_, _]):Unit = js.native
  /** Todo: This should normally be a BufferAttribute[Long, Uint32Array], but Uint32Array has the wrong signature */
  def getIndex():BufferAttribute[_, _] = js.native

  /** Adds a draw call to this geometry; see the [[drawcalls]] property for details. */
  @deprecated(message="THREE.BufferGeometry: .addDrawCall() is now .addGroup().", since="r73")
  def addDrawCall(start: Double, count: Double, indexOffset: Double): Unit = js.native

  def setDrawRange(start:Double, count:Double): Unit = js.native

  def addGroup(start: Double, count: Double, materialIndex:Double=js.native): Unit = js.native

  /** Clears all draw calls. */
  @deprecated(message= "THREE.BufferGeometry: .clearDrawCalls() is now .clearGroups().", since="r73")
  def clearDrawCalls(): Unit = js.native

  /** Clears all draw calls. */
  def clearGroups(): Unit = js.native


  /** Populates this BufferGeometry with data from a Geometry object. */
  def fromGeometry(geometry: Geometry, settings: js.Any = js.native): BufferGeometry = js.native

  /** Merge in another BufferGeometry with an optional offset of where to start merging in. */
  def merge(other: BufferGeometry, offset: Int = js.native): Unit = js.native
  /** Every normal vector in a geometry will have a magnitude of 1. This will correct lighting on the geometry surfaces. */
  def normalizeNormals(): Unit = js.native
  def reorderBuffers(indexBuffer: Double, indexMap: js.Array[Double], vertexCount: Double): Unit = js.native
  /** Returns a raw object representation of the BufferGeometry. */
  def toJson(): js.Any = js.native
  /** Creates a clone of this BufferGeometry. */
  override def clone(): BufferGeometry = js.native
}

/**
 * Object for keeping track of time.
 * @see [[http://threejs.org/docs/#Reference/Core/Clock]]
 */
@js.native
@JSName("THREE.Clock")
class Clock extends js.Object {
  /** @param autoStart Automatically start the clock. */
  def this(autoStart: Boolean = js.native) = this()
  /** If set, starts the clock automatically when the first update is called. */
  var autoStart: Boolean = js.native
  /**
   * When the clock is running, It holds the start time of the clock.
   * This counted from the number of milliseconds elapsed since 1 January 1970 00:00:00 UTC.
   */
  var startTime: Double = js.native
  /**
   * When the clock is running, It holds the previous time from a update.
   * This counted from the number of milliseconds elapsed since 1 January 1970 00:00:00 UTC.
   */
  var oldTime: Double = js.native
  /**
   * When the clock is running, It holds the time elapsed between the start of the clock to the previous update.
   * This counted from the number of milliseconds elapsed since 1 January 1970 00:00:00 UTC.
   */
  var elapsedTime: Double = js.native
  /** This property keeps track whether the clock is running or not. */
  var running: Boolean = js.native
  /** Starts clock. */
  def start(): Unit = js.native
  /** Stops clock. */
  def stop(): Unit = js.native
  /** Get the seconds passed since the clock started. */
  def getElapsedTime(): Double = js.native
  /** Get the seconds passed since the last call to this method. */
  def getDelta(): Double = js.native
}

@js.native
@JSName("THREE.EventDispatcher")
class EventDispatcher extends js.Object {
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def dispatchEvent(event: js.Any): Unit = js.native
}

@js.native
@JSName("THREE.Face3")
class Face3 extends js.Object {
  def this(a: Double, b: Double, c: Double) = this()
  def this(a: Double, b: Double, c: Double, normal: Vector3) = this()
  def this(a: Double, b: Double, c: Double, normal: Vector3, color: Color) = this()
  def this(a: Double, b: Double, c: Double, normal: Vector3, color: Color, materialIndex: Double) = this()
  def this(a: Double, b: Double, c: Double, normal: Vector3, vertexColors: js.Array[Color]) = this()
  def this(a: Double, b: Double, c: Double, normal: Vector3, vertexColors: js.Array[Color], materialIndex: Double) = this()
  def this(a: Double, b: Double, c: Double, vertexNormals: js.Array[Vector3], color: Color, materialIndex: Double) = this()
  def this(a: Double, b: Double, c: Double, vertexNormals: js.Array[Vector3], vertexColors: js.Array[Color], materialIndex: Double) = this()
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var normal: Vector3 = js.native
  var vertexNormals: js.Array[Vector3] = js.native
  var color: Color = js.native
  var vertexColors: js.Array[Color] = js.native
  var vertexTangents: js.Array[Double] = js.native
  var materialIndex: Double = js.native
  override def clone(): Face3 = js.native
}

/**
 * Base class for geometries.
 * A geometry holds all data necessary to describe a 3D model.
 * @example {{{
 * var geometry = new THREE.Geometry();
 *
 * geometry.vertices.push(
 *   new THREE.Vector3( -10,  10, 0 ),
 *   new THREE.Vector3( -10, -10, 0 ),
 *   new THREE.Vector3(  10, -10, 0 )
 * );
 *
 * geometry.faces.push( new THREE.Face3( 0, 1, 2 ) );
 *
 * geometry.computeBoundingSphere();
 * }}}
 * @see [[http://threejs.org/docs/#Reference/Core/Geometry]]
 */
@js.native
@JSName("THREE.Geometry")
class Geometry extends js.Object {
  /** Unique number for this geometry instance. */
  var id: Double = js.native
  var uuid: String = js.native
  /** Name for this geometry. Default is an empty string. */
  var name: String = js.native
  var vertices: js.Array[Vector3] = js.native
  var colors: js.Array[Color] = js.native
  var faces: js.Array[Face3] = js.native
  var faceVertexUvs: js.Array[js.Array[js.Array[Vector2]]] = js.native
  /** Array of morph targets. */
  var morphTargets: js.Array[MorphTarget] = js.native
  var morphColors: js.Array[MorphColor] = js.native
  var morphNormals: js.Array[MorphNormals] = js.native
  var skinWeights: js.Array[Double] = js.native
  var skinIndices: js.Array[Double] = js.native
  var lineDistances: js.Array[Double] = js.native
  /** Bounding box. */
  var boundingBox: BoundingBox3D = js.native
  /** Bounding sphere. */
  var boundingSphere: BoundingSphere = js.native
  var hasTangents: Boolean = js.native
  var dynamic: Boolean = js.native
  var verticesNeedUpdate: Boolean = js.native
  var elementsNeedUpdate: Boolean = js.native
  var uvsNeedUpdate: Boolean = js.native
  var normalsNeedUpdate: Boolean = js.native
  var tangentsNeedUpdate: Boolean = js.native
  var colorsNeedUpdate: Boolean = js.native
  var lineDistancesNeedUpdate: Boolean = js.native
  var buffersNeedUpdate: Boolean = js.native
  var groupsNeedUpdate: Boolean = js.native
  /** Bakes matrix transform directly into vertex coordinates. */
  def applyMatrix(matrix: Matrix4): Unit = js.native
  /** Center the geometry based on the bounding box. */
  def center(): Vector3 = js.native
  /** Computes face normals. */
  def computeFaceNormals(): Unit = js.native
  /** Computes vertex normals by averaging face normals. Face normals must be existing / computed beforehand. */
  def computeVertexNormals(areaWeighted: Boolean = js.native): Unit = js.native
  /** Computes morph normals. */
  def computeMorphNormals(): Unit = js.native
  /** Computes bounding box of the geometry, updating Geometry.boundingBox attribute. */
  def computeBoundingBox(): Unit = js.native
  /**
   * Computes bounding sphere of the geometry, updating Geometry.boundingSphere attribute.
   *
   * Neither bounding boxes or bounding spheres are computed by default. They need to be explicitly computed, otherwise they are null.
   */
  def computeBoundingSphere(): Unit = js.native
  def computeTangents(): Unit = js.native
  def computeLineDistances(): Unit = js.native
  /** Merge two geometries or geometry and geometry from object (using object's transform) */
  def merge(geometry: Geometry, matrix: Matrix[_], materialIndexOffset: Double): Unit = js.native
  /** Checks for duplicate vertices using hashmap. Duplicated vertices are removed and faces' vertices are updated. */
  def mergeVertices(): Double = js.native
  def makeGroups(usesFaceMaterial: Boolean, maxVerticesInGroup: Double): Unit = js.native
  /** Normalize the geometry. Make the geometry centered and has a bounding sphere whose radius equals to 1.0. */
  def normalize(): Unit = js.native
  override def clone(): Geometry = js.native
  /** Disposes the object from memory.You need to call this when you want the bufferGeometry removed while the application is running. */
  def dispose(): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def dispatchEvent(event: js.Any): Unit = js.native
}

/**
 * Base class for scene graph objects.
 * @see [[http://threejs.org/docs/#Reference/Core/Object3D]]
 */
@js.native
@JSName("THREE.Object3D")
class Object3D extends js.Object {
  /** Unique number for this object instance. */
  def id: Double = js.native

  /** UUID of this object instance. This gets automatically assigned, so this shouldn't be edited. */
  var uuid: String = js.native
  /** Optional name of the object (doesn't need to be unique). */
  var name: String = js.native
  /** Object's parent in the scene graph. */
  var parent: js.UndefOr[Object3D] = js.native
  /** Array with object's children. */
  var children: js.Array[Object3D] = js.native
  /** Object's local position. */
  var position: Vector3 = js.native
  /** Object's local rotation (Euler angles), in radians. */
  var rotation: Euler = js.native
  /** Up direction. Default is THREE.Vector3( 0, 1, 0 ). */
  var up: Vector3 = js.native
  /** Local transform. */
  var matrix: Matrix4 = js.native
  /** Object's local rotation as Quaternion. */
  var quaternion: Quaternion = js.native
  /** Object gets rendered if true. */
  var visible: Boolean = js.native
  def scale: Vector3 = js.native

  @deprecated("renderDepth has been removed. Use .renderOrder, instead.", since = "r73")
  var renderDepth: Double = js.native

  var renderOrder: Double = js.native
  var rotationAutoUpdate: Boolean = js.native
  var matrixWorld: Matrix4 = js.native
  var matrixAutoUpdate: Boolean = js.native
  var matrixWorldNeedsUpdate: Boolean = js.native
  var castShadow: Boolean = js.native

  /**
   * Material gets baked in shadow receiving.
   * defaults to false
   */
  var receiveShadow: Boolean = js.native
  /**
   * When this is set, it checks every frame if the object is in the frustum of the camera.
   * Otherwise the object gets drawn every frame even if it isn't visible.
   * defaults to true
   */
  var frustumCulled: Boolean = js.native
  var userData: js.Any = js.native
  var eulerOrder: String = js.native
  /** This updates the position, rotation and scale with the matrix. */
  def applyMatrix(matrix: Matrix4): Unit = js.native
  def setRotationFromAxisAngle(axis: Vector3, angle: Double): Unit = js.native
  def setRotationFromEuler(euler: Euler): Unit = js.native
  def setRotationFromMatrix(m: Matrix4): Unit = js.native
  def setRotationFromQuaternion(q: Quaternion): Unit = js.native
  def rotateOnAxis(axis: Vector3, angle: Double): this.type = js.native
  def rotateX(angle: Double): Object3D = js.native
  def rotateY(angle: Double): Object3D = js.native
  def rotateZ(angle: Double): Object3D = js.native

  /**
   * Translate an object by distance along an axis in object space. The axis is assumed to be normalized.
   * @param axis A normalized vector in object space.
   * @param distance The distance to translate.
   */
  def translateOnAxis(axis: Vector3, distance: Double): this.type = js.native
  def translate(distance: Double, axis: Vector3): this.type = js.native
  /** Translates object along x axis by distance. */
  def translateX(distance: Double): this.type = js.native
  /** Translates object along y axis by distance. */
  def translateY(distance: Double): this.type = js.native
  /** Translates object along z axis by distance. */
  def translateZ(distance: Double): this.type = js.native
  def localToWorld(vector: Vector3): Vector3 = js.native
  def worldToLocal(vector: Vector3): Vector3 = js.native

  /**
   * Rotates object to face point in space.
   * @param vector A world vector to look at.
   */
  def lookAt(vector: Vector3): Unit = js.native
  /** Adds object as child of this object. An arbitrary number of objects may be added. */
  def add(`object`: Object3D): Unit = js.native
  /** Removes object as child of this object. An arbitrary number of objects may be removed. */
  def remove(`object`: Object3D): Unit = js.native
  /**
   * Abstract method to get intersections between a casted ray and this object.
   * Subclasses such as Mesh, Line, and Points implement this method in order to participate in raycasting.
   */
  def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  /** Executes the callback on this object and all descendants. */
  def traverse(callback: js.Function1[Object3D, _]): Unit = js.native
  /**
   * Like traverse, but the callback will only be executed for visible objects.
   * Descendants of invisible objects are not traversed.
   */
  def traverseVisible(callback: js.Function1[Object3D, _]): Unit = js.native
  /** Executes the callback on this object and all ancestors. */
  def traverseAncestors(callback: js.Function1[Object3D, _]): Unit = js.native
  /** Searches through the object's children and returns the first with a matching id. */
  def getObjectById(id: String, recursive: Boolean): Object3D = js.native
  /** Searches through the object's children and returns the first with a matching name. */
  def getObjectByName(name: String, recursive: Boolean = js.native): Object3D = js.native
  def getChildByName(name: String, recursive: Boolean = js.native): Object3D = js.native
  /** Updates local transform. */
  def updateMatrix(): Unit = js.native
  /** Updates global transform of the object and its children. */
  def updateMatrixWorld(force: Boolean = js.native): Unit = js.native
  /** Creates a new clone of this object and all descendants. */
  def clone(`object`: Object3D = js.native, recursive: Boolean = js.native): this.type = js.native
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def dispatchEvent(event: js.Any): Unit = js.native
}

@js.native
@JSName("THREE.Object3D")
object Object3D extends js.Object {
  var DefaultUp: Vector3 = js.native
}

@js.native
trait RaycasterParameters extends js.Object {
  var Sprite: js.Any = js.native
  var Mesh: js.Any = js.native
  var PointCloud: js.Any = js.native
  var LOD: js.Any = js.native
  var Line: js.Any = js.native
}

/**
  * This class makes raycasting easier. Raycasting is used for picking and more.
  * @see [[http://threejs.org/docs/#Reference/Core/Raycaster]]
  */
@js.native
@JSName("THREE.Raycaster")
class Raycaster extends js.Object {
  /**
    * This creates a new raycaster object.
    * @param origin The origin vector where the ray casts from.
    * @param direction The direction vector that gives direction to the ray. Should be normalized.
    * @param near All results returned are further away than near. Near can't be negative. Default value is 0.
    * @param far All results returned are closer then far. Far can't be lower then near . Default value is Infinity.
    */
  def this(origin: Vector3 = js.native, direction: Vector3 = js.native, near: Double = js.native, far: Double = js.native) = this()
  /** The Ray used for the raycasting. */
  var ray: Ray = js.native
  /**
    * The near factor of the raycaster. This value indicates which objects can be discarded based on the distance.
    * This value shouldn't be negative and should be smaller than the far property.
    */
  var near: Double = js.native
  /**
    * The far factor of the raycaster. This value indicates which objects can be discarded based on the distance.
    * This value shouldn't be negative and should be larger than the near property.
    */
  var far: Double = js.native
  var params: RaycasterParameters = js.native

  /** The precision factor of the raycaster when intersecting [[org.denigma.threejs.objects.Line]] objects. */
  var linePrecision: Double = js.native

  /**
    * Updates the ray with a new origin and direction.
    * @param origin The origin vector where the ray casts from.
    * @param direction The normalized direction vector that gives direction to the ray.
    */
  def set(origin: Vector3, direction: Vector3): Unit = js.native

  /**
    * Updates the ray with a new origin and direction.
    * @param origin 2D coordinates of the mouse, in normalized device coordinates (NDC)---X and Y components should be between -1 and 1.
    * @param camera camera from which the ray should originate
    */
  def setFromCamera(origin: Vector2, camera: Camera): Unit = js.native

  /**
    * Checks all intersection between the ray and the object with or without the descendants.
    * Intersections are returned sorted by distance, closest first. An array of intersections is returned...
    *
    * When intersecting a Mesh with a BufferGeometry, the faceIndex will be undefined, and indices will be set;
    * when intersecting a Mesh with a Geometry, indices will be undefined.
    *
    * Raycaster delegates to the raycast method of the passed object, when evaluating whether the ray intersects the object or not.
    * This allows meshes to respond differently to ray casting than lines and pointcalouds.
    *
    * Note that for meshes, faces must be pointed towards the origin of the ray in order to be detected;
    * intersections of the ray passing through the back of a face will not be detected.
    * To raycast against both faces of an object, you'll want to set the material's side property to THREE.DoubleSide.
    *
    * @param `object`  The object to check for intersection with the ray.
    * @param recursive If set, it also checks all descendants. Otherwise it only checks intersection with the object.
    */
  def intersectObject(`object`: Object3D, recursive: Boolean = js.native): js.Array[Intersection] = js.native

  /**
    * Checks all intersection between the ray and the objects with or without the descendants.
    * Intersections are returned sorted by distance, closest first. Intersections are of the same form as those returned by [[intersectObject]].
    * @param objects The objects to check for intersection with the ray.
    * @param recursive If set, it also checks all descendants of the objects. Otherwise it only checks intersection with the objects.
    */
  def intersectObjects(objects: js.Array[Object3D], recursive: Boolean = js.native): js.Array[Intersection] = js.native
}


@js.native
@JSName("THREE.InterleavedBuffer")
class InterleavedBuffer[T,REPR<:TypedArray[T,REPR]](array:REPR, stride:Double) extends js.Object {

  def length:Double = js.native
  def count:Double = js.native
  def needsUpdate_= (value:Boolean):Unit = js.native
  def setDynamic(value:Boolean):Unit = js.native
  def copy(source:InterleavedBuffer[T,REPR]):Unit = js.native
  override def clone():this.type = js.native

}

@js.native
@JSName("THREE.InterleavedBufferAttribute")
class InterleavedBufferAttribute[T,REPR<:TypedArray[T,REPR]](interleavedBuffer:InterleavedBuffer[T,REPR], itemSize:Double, offset:Double) extends BufferAttribute[T,REPR] {

  def setW(index:Int, value:T):Unit = js.native
  def getW(index:Double):T = js.native

}