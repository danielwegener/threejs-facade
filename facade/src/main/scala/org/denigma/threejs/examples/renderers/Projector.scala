package org.denigma.threejs.examples.renderers

import org.denigma.threejs.materials.Material
import org.denigma.threejs.math.{ Vector4, Vector3, Vector2, Color }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.RenderableLine")
class RenderableLine extends js.Object {
  var id: Double = js.native
  var v1: RenderableVertex = js.native
  var v2: RenderableVertex = js.native
  var vertexColors: js.Array[Color] = js.native
  var material: Material = js.native
  var z: Double = js.native
}

@js.native
@JSName("THREE.RenderableObject")
class RenderableObject extends js.Object {
  var id: Double = js.native
  var `object`: Object = js.native
  var z: Double = js.native
}

@js.native
@JSName("THREE.RenderableSprite")
class RenderableSprite extends js.Object {
  var id: Double = js.native
  var `object`: Object = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var rotation: Double = js.native
  var scale: Vector2 = js.native
  var material: Material = js.native
}

@js.native
@JSName("THREE.RenderableVertex")
class RenderableVertex extends js.Object {
  var position: Vector3 = js.native
  var positionWorld: Vector3 = js.native
  var positionScreen: Vector4 = js.native
  var visible: Boolean = js.native
  def copy(vertex: RenderableVertex): Unit = js.native
}