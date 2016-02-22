package org.denigma.threejs.objects

import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.{ BufferGeometry, Raycaster, Object3D, Geometry }
import org.denigma.threejs.materials.{ SpriteMaterial, MeshBasicMaterial, Material, LineMaterial }
import org.denigma.threejs.math.{ Matrix4, Vector3, Color }
import org.denigma.threejs.textures.{ DataTexture, Texture }
import org.denigma.threejs._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.typedarray.Float32Array

/**
  * A bone which is part of a [[Skeleton]]. The skeleton in turn is used by the [[SkinnedMesh]].
  * Bones are almost identical to a blank Object3D.
  * @param skin The SkinnedMesh to which the bone belongs.
  * @see [[http://threejs.org/docs/#Reference/Objects/Bone]]
  */
@js.native
@JSName("THREE.Bone")
class Bone(var skin: SkinnedMesh = js.native) extends Object3D

/**
  * Level of Detail - Show meshes with more or less geometry based on distance.
  * @see [[http://threejs.org/docs/#Reference/Objects/LOD]]
  */
@js.native
@JSName("THREE.LOD")
class LOD extends Object3D {
  /** An array of Object3Ds */
  var objects: js.Array[js.Any] = js.native
  /**
    * Adds a mesh that will display at a certain distance and greater. Typically the further away the distance, the lower the detail on the mesh.
    * @param mesh The Object3D to display
    * @param distance The distance at which to display this level of detail
    */
  def addLevel(mesh: Object3D, distance: Double = js.native): Unit = js.native
  /** Get a reference to the first [[Object3D]] (mesh) that is greater than supplied distance. */
  def getObjectForDistance(distance: Double): Object3D = js.native
  /** Update the visiblility of the level of detail based on the distance from the camera. */
  def update(camera: Camera): Unit = js.native
  /**
    * Clone a LOD Object.
    * @param `object` (optional) Object3D which needs to be cloned. If undefined, clone method will create a new cloned LOD Object.
    */
  def clone(`object`: LOD = js.native): LOD = js.native
}

/**
  * Creates a simulated lens flare that tracks a light
  * @constructor Automatically adds a lens flare to the lensFlares array if a texture is set.
  * @param texture THREE.Texture (optional)
  * @param size size in pixels (-1 = use texture.width)
  * @param distance (0-1) from light source (0 = at light source)
  * @param blending [[Blending]] - Defaults to [[THREE.NormalBlending]]
  * @param color The color of the lens flare
  * @see [[http://threejs.org/docs/#Reference/Objects/LensFlare]]
  */
@js.native
@JSName("THREE.LensFlare")
class LensFlare(texture: Texture = js.native, size: Double = js.native, distance: Double = js.native, blending: Blending = js.native, color: Color = js.native) extends Object3D {
  /** The array of flares as set by LensFlare.add */
  var lensFlares: js.Array[LensFlareProperty] = js.native
  /** The position of the lens flare on the screen. */
  var positionScreen: Vector3 = js.native
  /** A custom update callback */
  var customUpdateCallback: js.Function1[LensFlare, Unit] = js.native
  /** Adds a lens flare. See the constructor for details on the parameters. */
  def add(texture: Texture, size: Double = js.native, distance: Double = js.native, blending: Blending = js.native, color: Color = js.native): Unit = js.native
  override def add(obj: Object3D): Unit = js.native
  /** Updates the lens flare based on the positionScreen property. */
  def updateLensFlares(): Unit = js.native
  /**
    * Clone a LensFlare Object.
    * @param object (optional) LensFlare which needs to be cloned. If undefined, clone method will create a new cloned LensFlare Object.
    */
  def clone(`object`: LensFlare = js.native): LensFlare = js.native
}

/**
  * A continuous line.
  * @param geometry Vertices representing the line segment(s).
  * @param material Material for the line. Default is [[org.denigma.threejs.materials.LineBasicMaterial]].
  * @constructor If no material is supplied, a randomized line material will be created and assigned to the object.
  * @see [[http://threejs.org/docs/#Reference/Objects/Line]]
  */
@js.native
@JSName("THREE.Line")
class Line(var geometry: Geometry = js.native, var material: LineMaterial = js.native) extends Object3D {
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  def clone(`object`: Line): Line = js.native
}

/**
  * Base class for Mesh objects, such as MorphAnimMesh and SkinnedMesh.
  * @param geometry An instance of Geometry, defining the object's structure.
  * @param material An instance of Material, defining the object's appearance.
  *                 Default is a [[MeshBasicMaterial]] with wireframe mode enabled and randomised colour.
  * @see [[http://threejs.org/docs/#Reference/Objects/Mesh]]
  */
@js.native
@JSName("THREE.Mesh")
class Mesh(var geometry: Geometry = js.native, var material: Material = js.native) extends Object3D {

  /** An array of weights typically from 0-1 that specify how much of the morph is applied.
    * Undefined by default, but reset to a blank array by updateMorphTargets. */
  var morphTargetInfluences: js.Array[Double] = js.native
  /** A dictionary of morphTargets based on the morphTarget.name property. Undefined by default, but rebuilt updateMorphTargets. */
  var morphTargetDictionary: js.Any = js.native
  /** Specify the index of the morph that should be used as the base morph. Replaces the positions.
    * Undefined by default, but reset to -1 (non set) by updateMorphTargets. */
  var morphTargetBase: Integer = js.native
  /**
    * Returns the index of a morph target defined by name.
    * @param name a morph target name
    */
  def getMorphTargetIndexByName(name: String): Double = js.native
  /** Updates the morphtargets to have no influence on the object.
    * Resets the morphTargetForcedOrder, morphTargetInfluences, morphTargetDictionary, and morphTargetBase properties. */
  def updateMorphTargets(): Unit = js.native
  /** Get intersections between a casted ray and this mesh. Raycaster.intersectObject will call this method. */
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  /**
    * Clone a Mesh Object.
    * @param `object`  (optional) Object3D which needs to be cloned. If undefined, clone method will create a new cloned Mesh Object.
    */
  def clone(`object`: Mesh = js.native): Mesh = js.native
}

/**
  * Use an array of bones to create a skeleton that can be used by a SkinnedMesh. WebGL only.
  * @param bones The array of bones
  * @param boneInverses An array of Matrix4s that represent the inverse of the matrixWorld of the individual bones.
  * @param useVertexTexture Whether or not to use a vertex texture in the shader, set in the constructor.
  *                         Not all devices support floating point pixel textures. If this option is set then the
  *                         bone matrices will be packed into a texture and sent to the shader.
  *                         This method allows a much larger set of bones to be used. Otherwise the vertex shader
  *                         will use uniforms, which do not allow for as many bones to be used. The exact numbers
  *                         vary between devices.
  * @see [[http://threejs.org/docs/#Reference/Objects/Skeleton]]
  */
@js.native
@JSName("THREE.Skeleton")
class Skeleton(var bones: js.Array[Bone], var boneInverses: js.Array[Matrix4] = js.native, var useVertexTexture: Boolean = js.native) extends js.Object {
  /** The width of the vertex data texture. */
  var boneTextureWidth: Double = js.native
  /** The height of the vertex data texture. */
  var boneTextureHeight: Double = js.native
  /** The array buffer holding the bone data when using a vertex texture. */
  var boneMatrices: Float32Array = js.native
  /** The [[DataTexture]] holding the bone data when using a vertex texture. */
  var boneTexture: DataTexture = js.native
  /** Generates the boneInverses. */
  def calculateInverses(bone: Bone): Unit = js.native
  /** Returns the skeleton to the base pose. */
  def pose(): Unit = js.native
  /** Updates the boneMatrices and boneTexture after changing the bones.
    * This is called automatically by the WebGLRenderer if the skeleton is used with a SkinnedMesh. */
  def update(): Unit = js.native
  /** Clone a Skeleton Object. */
  override def clone(): Skeleton = js.native
}

object SkinnedMesh {
  sealed trait BindMode
  object BindMode {
    val attached = "attached".asInstanceOf[BindMode]
    val detached = "detached".asInstanceOf[BindMode]
  }
}

/**
  * A mesh that has a Skeleton with bones that can then be used to animate the vertices of the geometry.
  * @see [[http://threejs.org/docs/#Reference/Objects/SkinnedMesh]]
  */
@js.native
@JSName("THREE.SkinnedMesh")
class SkinnedMesh extends Mesh {
  /**
    * @param geometry An instance of Geometry. Geometry.skinIndices and Geometry.skinWeights should be set.
    * @param material An instance of Material (optional).
    * @param useVertexTexture Defines whether a vertex texture can be used (optional).
    */
  def this(geometry: Geometry, material: MeshBasicMaterial = js.native, useVertexTexture: Boolean = js.native) = this()

  /** Either "attached" or "detached". "attached" uses the SkinnedMesh.matrixWorld property for the base transform matrix of the bones.
    * "detached" uses the SkinnedMesh.bindMatrix. */
  var bindMode: SkinnedMesh.BindMode = js.native
  /** The base matrix that is used for the bound bone transforms. */
  var bindMatrix: Matrix4 = js.native
  /** The inverse of the bindMatrix. */
  var inverseBindMatrix: Matrix4 = js.native

  /**
    * Bind a skeleton to the skinned mesh. The bindMatrix gets saved to .bindMatrix property and the .bindMatrixInverse gets calculated.
    * @param bindMatrix Matrix4 that represents the base transform of the skeleton
    */
  def bind(skeleton: Skeleton, bindMatrix: Matrix4): Unit = js.native
  /** Normalizes the Geometry.skinWeights vectors. Does not affect BufferGeometry. */
  def normalizeSkinWeights(): Unit = js.native
  /** This method sets the skinned mesh in the rest pose. */
  def pose(): Unit = js.native

  /**
    * Clone a SkinnedMesh Object.
    * @param `object` (optional) Object3D which needs to be cloned. If undefined, clone method will create a new cloned SkinnedMesh Object.
    */
  def clone(`object`: SkinnedMesh = js.native): SkinnedMesh = js.native
}

/**
  * A sprite is a plane in an 3d scene which faces always towards the camera.
  * @constructor This creates a new sprite with an specific material.
  * @param material An instance of Material, defining the object's appearance. Default is a [[SpriteMaterial]] which is a white plane.
  * @see [[http://threejs.org/docs/#Reference/Objects/Sprite]]
  */
@js.native
@JSName("THREE.Sprite")
class Sprite(var material: Material = js.native) extends Object3D {

  var geometry: BufferGeometry = js.native
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  override def updateMatrix(): Unit = js.native

  /**
    * Clone a Sprite Object.
    * @param `object` (optional) Object3D which needs to be cloned. If undefined, clone method will create a new cloned Sprite Object.
    */
  def clone(`object`: Sprite = js.native): Sprite = js.native
}
