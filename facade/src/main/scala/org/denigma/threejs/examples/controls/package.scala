package org.denigma.threejs.examples.controls

import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.Object3D
import org.denigma.threejs.math.{Vector2, Vector3}
import org.scalajs.dom
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.OrbitControls")
class OrbitControls(camera: Camera, element: HTMLElement) extends js.Object {

  def this(camera: Camera) = this(camera, null)

  def rotateLeft(angle: Double): Unit = js.native

  def rotateRight(angle: Double): Unit = js.native

  def rotateUp(angle: Double): Unit = js.native

  def rotateDown(angle: Double): Unit = js.native

  def zoomIn(zoomScale: Double): Unit = js.native

  def zoomOut(zoomScale: Double): Unit = js.native

  def pan(distance: Vector3): Unit = js.native

  def update(): Unit = js.native

  def getAutoRotationAngle(): Double = js.native

  def getZoomScale(): Double = js.native

  def onMouseDown(event: dom.MouseEvent): Unit = js.native

  def onMouseUp(event: dom.MouseEvent): Unit = js.native

  def onMouseWheel(event: dom.MouseEvent): Unit = js.native

  def onMouseMove(event: dom.MouseEvent): Unit = js.native

  def onKeyDown(event: dom.KeyboardEvent): Unit = js.native

  def onKeyUp(event: dom.KeyboardEvent): Unit = js.native

}

@JSName("THREE.PointerLockControls")
@js.native
class PointerLockControls(camera: Camera) extends js.Object {
  def getObject: Object3D = js.native
  def getDirection: js.Function1[Vector3, Vector3] = js.native
  var enabled: Boolean = js.native
}

@js.native
@JSName("THREE.TrackballControls")
class TrackBallControls(camera: Camera) extends js.Object {
  def getMouseOnScreen(clientX: Double, clientY: Double): Vector2 = js.native
  def getMouseProjectionOnBall(clientX: Double, clientY: Double): Vector3 = js.native
  def rotateCamera(): Unit = js.native
  def zoomCamera(): Unit = js.native
  def panCamera(): Unit = js.native
  def update(): Unit = js.native
  def keydown(event: dom.KeyboardEvent): Unit = js.native
  def keyup(event: dom.KeyboardEvent): Unit = js.native
  def mousedown(event: dom.MouseEvent): Unit = js.native
  def mouseup(event: dom.MouseEvent): Unit = js.native
  def mousmove(event: dom.MouseEvent): Unit = js.native
}