package org.denigma.threejs.animation

import org.denigma.threejs.MorphTarget
import org.denigma.threejs.core.{EventDispatcher, Object3D}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

// TODO
trait AnimationTrack

/**
 * Reusable set of Tracks that represent an animation.
 */
@js.native
@JSName("THREE.AnimationClip")
class AnimationClip(var name: String, var duration: Double, var tracks: js.Array[AnimationTrack]) extends js.Object {

  def resetDuration(): Unit = js.native
  def trim(): this.type = js.native
  def optimize(): this.type = js.native
}

@js.native
@JSName("THREE.AnimationClip")
object AnimationClip extends js.Any {

  def parse(json: String): AnimationClip = js.native
  def toJSON(clip: AnimationClip): String = js.native
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double): AnimationClip = js.native
  def findByName(array: js.Array[AnimationClip], name: String): AnimationClip = js.native
}

@js.native
@JSName("THREE.AnimationMixer")
class AnimationMixer(root: Object3D) extends js.Object with EventDispatcher {
  var time: Double = js.native
  /** Defaults to 1.0 */
  var timeScale: Double = js.native
}

object AnimationMixer {

  @js.native
  @JSName("THREE.AnimationMixer._Action")
  class Action(mixer: AnimationMixer, clip: AnimationClip, localRoot: Object3D) extends js.Object {
    var tracks: js.Array[AnimationTrack] = js.native
    var nTracks: Int = js.native
    var interpolantSettings = ??? // TODO continue
  }


}
