package org.denigma.threejs.extras

import org.denigma.threejs.Mapping
import org.denigma.threejs.core.{ Object3D, Geometry }
import org.denigma.threejs.materials.Material
import org.denigma.threejs.math.{ Color, Vector3 }
import org.denigma.threejs.objects.Mesh
import org.denigma.threejs.scenes.Scene
import org.denigma.threejs.textures.{ DataTexture, Texture }
import org.scalajs.dom.raw.{ HTMLCanvasElement, HTMLImageElement }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.GeometryUtils")
object GeometryUtils extends js.Object {
  def merge(geometry1: Geometry, object2: Mesh, materialIndexOffset: Double = js.native): Unit = js.native
  def center(geometry: Geometry): Vector3 = js.native
}

@js.native
@JSName("THREE.ImageUtils")
object ImageUtils extends js.Object {
  var crossOrigin: String = js.native
  def loadTexture(url: String, mapping: Mapping = js.native, onLoad: js.Function1[Texture, Unit] = js.native, onError: js.Function1[String, Unit] = js.native): Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: Mapping = js.native, onLoad: js.Function1[Texture, Unit] = js.native, onError: js.Function1[String, Unit] = js.native): Texture = js.native
  def getNormalMap(image: HTMLImageElement, depth: Double = js.native): HTMLCanvasElement = js.native
  def generateDataTexture(width: Double, height: Double, color: Color): DataTexture = js.native
}

@js.native
@JSName("THREE.SceneUtils")
object SceneUtils extends js.Object {
  def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D = js.native
  def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = js.native
  def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = js.native
}