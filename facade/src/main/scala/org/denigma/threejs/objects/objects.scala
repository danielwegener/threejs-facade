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

@js.native
@JSName("THREE.Bone")
class Bone extends Object3D {
  def this(belongsToSkin: SkinnedMesh) = this()
  var skin: SkinnedMesh = js.native
  var accumulatedRotWeight: Double = js.native
  var accumulatedPosWeight: Double = js.native
  var accumulatedSclWeight: Double = js.native
  override def updateMatrixWorld(forceUpdate: Boolean): Unit = js.native
}

@js.native
@JSName("THREE.LOD")
class LOD extends Object3D {
  var objects: js.Array[js.Any] = js.native
  def addLevel(`object`: Object3D, distance: Double = js.native): Unit = js.native
  def getObjectForDistance(distance: Double): Object3D = js.native
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  def update(camera: Camera): Unit = js.native
  def clone(`object`: LOD): LOD = js.native
}

@js.native
@JSName("THREE.LensFlare")
class LensFlare extends Object3D {
  def this(texture: Texture = js.native, size: Double = js.native, distance: Double = js.native, blending: Blending = js.native, color: Color = js.native) = this()
  var lensFlares: js.Array[LensFlareProperty] = js.native
  var positionScreen: Vector3 = js.native
  var customUpdateCallback: js.Function1[LensFlare, Unit] = js.native
  def add(texture: Texture, size: Double = js.native, distance: Double = js.native, blending: Blending = js.native, color: Color = js.native): Unit = js.native
  override def add(obj: Object3D): Unit = js.native
  def updateLensFlares(): Unit = js.native
}

@js.native
@JSName("THREE.Line")
class Line extends Object3D {
  def this(geometry: Geometry = js.native, material: LineMaterial = js.native, `type`: Double = js.native) = this()
  var geometry: Geometry = js.native
  var material: LineMaterial = js.native
  var `type`: LineType = js.native
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  def clone(`object`: Line): Line = js.native
}

@js.native
@JSName("THREE.Mesh")
class Mesh extends Object3D {
  def this(geometry: Geometry = js.native, material: Material = js.native) = this()
  var geometry: Geometry = js.native
  var material: Material = js.native
  def updateMorphTargets(): Unit = js.native
  def getMorphTargetIndexByName(name: String): Double = js.native
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  def clone(`object`: Mesh): Mesh = js.native
}

@js.native
@JSName("THREE.Skeleton")
class Skeleton extends js.Object {
  def this(bones: js.Array[Bone], boneInverses: js.Array[Matrix4] = js.native, useVertexTexture: Boolean = js.native) = this()
  var useVertexTexture: Boolean = js.native
  var identityMatrix: Matrix4 = js.native
  var bones: js.Array[Bone] = js.native
  var boneTextureWidth: Double = js.native
  var boneTextureHeight: Double = js.native
  var boneMatrices: Float32Array = js.native
  var boneTexture: DataTexture = js.native
  var boneInverses: js.Array[Matrix4] = js.native
  def calculateInverses(bone: Bone): Unit = js.native
  def pose(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.SkinnedMesh")
class SkinnedMesh extends Mesh {
  def this(geometry: Geometry = js.native, material: MeshBasicMaterial = js.native, useVertexTexture: Boolean = js.native) = this()
  var bindMode: String = js.native
  var bindMatrix: Matrix4 = js.native
  var bindMatrixInverse: Matrix4 = js.native
  def bind(skeleton: Skeleton): Unit = js.native
  def bind(skeleton: Skeleton, bindMatrix: Matrix4): Unit = js.native
  def pose(): Unit = js.native
  def normalizeSkinWeights(): Unit = js.native
  def clone(`object`: SkinnedMesh): SkinnedMesh = js.native
  var skeleton: Skeleton = js.native
}

@js.native
@JSName("THREE.Sprite")
class Sprite extends Object3D {
  def this(material: Material = js.native) = this()
  var geometry: BufferGeometry = js.native
  var material: SpriteMaterial = js.native
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  override def updateMatrix(): Unit = js.native
  def clone(`object`: Sprite): Sprite = js.native
}
