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

object MorphBlendMeshAnimation {
  /** Animation object */
  @js.native
  trait AnimationObject extends js.Object {
    /** Starting frame */
    var startFrame: Double = js.native
    /** Ending frame */
    var endFrame: Double = js.native
    /** The number of frames */
    var length: Double = js.native
    /** The frames per second */
    var fps: Double = js.native
    /** The length of the animation in seconds */
    var duration: Double = js.native
    /** The previous frame that was played */
    var lastFrame: Double = js.native
    /** The current frame */
    var currentFrame: Double = js.native
    /** Whether or not the animation is being played */
    var active: Boolean = js.native
    /** The time in seconds of the animation */
    var time: Double = js.native
    /** Which way to play the animation */
    var direction: Double = js.native
    /** The weight of the animation */
    var weight: Double = js.native
    /** Is playing backwards */
    var directionBackwards: Boolean = js.native
    /** Loop back and forth */
    var mirroredLoop: Boolean = js.native
  }
}

/**
  * A mesh that can blend together multiple animated morph targets.
  * @param geometry An instance of Geometry.
  * @param material An instance of Material (optional).
  * @see [[http://threejs.org/docs/#Reference/Extras.Objects/MorphBlendMesh]]
  */
@js.native
@JSName("THREE.MorphBlendMesh")
class MorphBlendMesh(geometry: Geometry, material: Material = js.native) extends Mesh {
  /** An object of named animations as added by [[createAnimation]]. */
  var animationsMap: js.Object = js.native
  /** The list of animations as added by [[createAnimation]]. */
  var animationsList: js.Array[MorphBlendMeshAnimation.AnimationObject] = js.native

  /**
    * Sets the animation to active and animation time to 0
    * @param name The name of the animation
    */
  def playAnimation(name: String): Unit = js.native

  /**
    * Set the weight of how much this animation will apply to the overall morph. 0 is off, 1 is full weight.
    * @param name The name of the animation
    * @param weight Weight of the animation, typically 0-1
    */
  def setAnimationWeight(name: String, weight: Double): Unit = js.native

  /**
    * A frame is typically 1 morph target.
    * @param name The name of the animation
    * @param fps The number of frames (morphTargets) per second
    */
  def setAnimationFPS(name: String, fps: Double): Unit = js.native

  /**
    * Creates an animation object that gets added to both the animationsMap and animationsList.
    * @param name The name of the animation
    * @param start The starting frame (morph)
    * @param end The ending frame (morph)
    * @param fps How many frames (morphs) to play per second
    */
  def createAnimation(name: String, start: Double, end: Double, fps: Double): Unit = js.native

  /**
    * Goes through the geometry's morphTargets and generates animations based on the morphTargets' names.
    * Names are of the form "walk_01", "walk_02", "walk_03", etc or "run001", "run002", "run003".
    * @param fps Frames per second
    */
  def autoCreateAnimations(fps: Double): Unit = js.native

  /**
    * Updates the animation object with proper values to update the duration.
    * @param name The name of the animation
    * @param duration How long in seconds to play the animation
    */
  def setAnimationDuration(name: String, duration: Double): Unit = js.native

  /**
    * Sets the animation to play forwards
    * @param name The name of the animation
    */
  def setAnimationDirectionForward(name: String): Unit = js.native

  /**
    * Sets the animation to play backwards
    * @param name The name of the animation
    */
  def setAnimationDirectionBackward(name: String): Unit = js.native

  /**
    * Returns the duration in seconds of the animation. Returns -1 if it can't be found.
    * @param name The name of the animation
    */
  def getAnimationDuration(name: String): Double = js.native

  /**
    * Returns the current time position of the animation.
    * @param name The name of the animation
    */
  def getAnimationTime(name: String): Double = js.native

  /**
    * Sets the current time position of the animation
    * @param name The name of the animation
    * @param time The time in seconds
    */
  def setAnimationTime(name: String, time: Double): Unit = js.native

  /**
    * Stops the playback of the animation
    * @param name The name of the animation
    */
  def stopAnimation(name: String): Unit = js.native

}