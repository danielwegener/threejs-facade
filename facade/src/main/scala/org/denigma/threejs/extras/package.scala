package org.denigma.threejs.extras

import org.denigma.threejs.Mapping
import org.denigma.threejs.core.{ Object3D, Geometry }
import org.denigma.threejs.materials.Material
import org.denigma.threejs.materials.MeshFaceMaterial
import org.denigma.threejs.math.{ Color, Vector3 }
import org.denigma.threejs.objects.Mesh
import org.denigma.threejs.scenes.Scene
import org.denigma.threejs.textures.{ DataTexture, Texture }
import org.scalajs.dom.raw.{ HTMLCanvasElement, HTMLImageElement }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Contains handy functions geometry manipulations.
  * @see [[http://threejs.org/docs/#Reference/Extras/GeometryUtils]]
  */
@js.native
@JSName("THREE.GeometryUtils")
object GeometryUtils extends js.Object {

  @deprecated(message = "THREE.GeometryUtils: .merge() has been moved to Geometry. Use geometry.merge( geometry2, matrix, materialIndexOffset ) instead.", since = "r73")
  def merge(geometry1: Geometry, geometry2: Geometry, materialIndexOffset: Double = js.native): Unit = js.native

  @deprecated(message = "THREE.GeometryUtils: .center() has been moved to Geometry. Use geometry.center() instead.", since = "r73")
  def center(geometry: Geometry): Vector3 = js.native
}

/**
  * A class containing useful utility functions for scene manipulation.
  * @see [[http://threejs.org/docs/#Reference/Extras/SceneUtils]]
  */
@js.native
@JSName("THREE.SceneUtils")
object SceneUtils extends js.Object {
  /**
    * Creates an new Object3D an new mesh for each material defined in materials.
    * Beware that this is not the same as [[org.denigma.threejs.materials.MultiMaterial]]
    *  which defines multiple material for 1 mesh.
    * This is mostly useful for object that need a material and a wireframe implementation.
    * @param geometry The geometry for the Object.
    * @param materials The materials for the object.
    */
  def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D = js.native

  /**
    * Attaches the object to the parent without the moving the object in the worldspace.
    * Beware that to do this the matrixWorld needs to be updated, this can be done by calling the
    * updateMatrixWorld method on the parent object.
    * @param child The object to add to the parent
    * @param scene The scene to detach the object on.
    * @param parent The parent to attach the object from.
    */
  def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = js.native

  /**
    * Detaches the object from the parent and adds it back to the scene without moving in worldspace.
    * Beware that to do this the matrixWorld needs to be updated, this can be done by calling the
    * updateMatrixWorld method on the parent object.
    * @param child The object to remove from the parent
    * @param parent The scene to attach the object on.
    * @param scene The parent to detach the object from.
    */
  def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = js.native
}