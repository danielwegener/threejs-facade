package org.denigma.threejs.extras.controls

import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.Object3D
import org.denigma.threejs.math.Vector3

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.FlyControls")
class FlyControls(camera: Camera = js.native) extends js.Object {
  def getObject: Object3D = js.native
  def getDirection: js.Function1[Vector3, Vector3] = js.native
  var movementSpeed: Double = js.native
  var rollSpeed: Double = js.native

  var dragToLook: Boolean = js.native
  var autoForward: Boolean = js.native
  def update(delta: Double): Unit = js.native
  def dispose(): Unit = js.native

}
