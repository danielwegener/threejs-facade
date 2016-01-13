package org.denigma.threejs.extras.objects

import org.denigma.threejs.core.{ Geometry, Object3D }
import org.denigma.threejs.materials.Material
import org.denigma.threejs.objects.Mesh

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * base class for immediate rendering objects.
 * @constructor This creates a new ImmediateRenderObject.
 * @see [[http://threejs.org/docs/#Reference/Extras.Objects/ImmediateRenderObject]]
 */
@js.native
@JSName("THREE.ImmediateRenderObject")
class ImmediateRenderObject extends Object3D {
  def render(renderCallback: js.Function): Unit = js.native
}

@js.native
trait MorphBlendMeshAnimation extends js.Object {
  var startFrame: Double = js.native
  var endFrame: Double = js.native
  var length: Double = js.native
  var fps: Double = js.native
  var duration: Double = js.native
  var lastFrame: Double = js.native
  var currentFrame: Double = js.native
  var active: Boolean = js.native
  var time: Double = js.native
  var direction: Double = js.native
  var weight: Double = js.native
  var directionBackwards: Boolean = js.native
  var mirroredLoop: Boolean = js.native
}

@js.native
@JSName("THREE.MorphBlendMesh")
class MorphBlendMesh extends Mesh {
  def this(geometry: Geometry, material: Material) = this()
  var animationsMap: js.Any = js.native
  var animationsList: js.Array[MorphBlendMeshAnimation] = js.native
  def createAnimation(name: String, start: Double, end: Double, fps: Double): Unit = js.native
  def autoCreateAnimations(fps: Double): Unit = js.native
  def setAnimationDirectionForward(name: String): Unit = js.native
  def setAnimationDirectionBackward(name: String): Unit = js.native
  def setAnimationFPS(name: String, fps: Double): Unit = js.native
  def setAnimationDuration(name: String, duration: Double): Unit = js.native
  def setAnimationWeight(name: String, weight: Double): Unit = js.native
  def setAnimationTime(name: String, time: Double): Unit = js.native
  def getAnimationTime(name: String): Double = js.native
  def getAnimationDuration(name: String): Double = js.native
  def playAnimation(name: String): Unit = js.native
  def stopAnimation(name: String): Unit = js.native
  def update(delta: Double): Unit = js.native
}