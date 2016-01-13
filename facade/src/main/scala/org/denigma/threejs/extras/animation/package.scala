package org.denigma.threejs.extras

import org.denigma.threejs.core.Object3D
import org.denigma.threejs.objects.{Bone, Mesh}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

package object animation {

  @js.native
  trait KeyFrame extends js.Object {
    var pos: js.Array[Double] = js.native
    var rot: js.Array[Double] = js.native
    var scl: js.Array[Double] = js.native
    var time: Double = js.native
  }

  @js.native
  trait KeyFrames extends js.Object {
    var keys: js.Array[KeyFrame] = js.native
    var parent: Double = js.native
  }

  @js.native
  trait AnimationData extends js.Object {
    var JIT: Double = js.native
    var fps: Double = js.native
    var hierarchy: js.Array[KeyFrames] = js.native
    var length: Double = js.native
    var name: String = js.native
  }

  @js.native
  @JSName("THREE.Animation")
  class Animation extends js.Object {
    def this(root: Mesh, data: AnimationData) = this()
    var root: Mesh = js.native
    var data: AnimationData = js.native
    var hierarchy: js.Array[Bone] = js.native
    var currentTime: Double = js.native
    var timeScale: Double = js.native
    var isPlaying: Boolean = js.native
    var loop: Boolean = js.native
    var weight: Double = js.native
    var keyTypes: js.Array[String] = js.native
    var interpolationType: Double = js.native
    def play(startTime: Double = js.native, weight: Double = js.native): Unit = js.native
    def stop(): Unit = js.native
    def reset(): Unit = js.native
    def update(deltaTimeMS: Double): Unit = js.native
    def getNextKeyWith(`type`: String, h: Double, key: Double): KeyFrame = js.native
    def getPrevKeyWith(`type`: String, h: Double, key: Double): KeyFrame = js.native
  }





  @js.native
  @JSName("THREE.AnimationHandler")
  object AnimationHandler extends js.Object {
    var LINEAR: Double = js.native
    var CATMULLROM: Double = js.native
    var CATMULLROM_FORWARD: Double = js.native
    var animations: js.Array[js.Any] = js.native
    def init(data: Animation): Unit = js.native
    def parse(root: Mesh): js.Array[Object3D] = js.native
    def play(animation: Animation): Unit = js.native
    def stop(animation: Animation): Unit = js.native
    def update(deltaTimeMS: Double): Unit = js.native
  }

  @js.native
  @JSName("THREE.KeyFrameAnimation")
  class KeyFrameAnimation extends js.Object {
    def this(data: js.Any) = this()
    var root: Mesh = js.native
    var data: Object = js.native
    var hierarchy: js.Array[KeyFrames] = js.native
    var currentTime: Double = js.native
    var timeScale: Double = js.native
    var isPlaying: Boolean = js.native
    var isPaused: Boolean = js.native
    var loop: Boolean = js.native
    def play(startTime: Double = js.native): Unit = js.native
    def stop(): Unit = js.native
    def update(delta: Double): Unit = js.native
    def getNextKeyWith(`type`: String, h: Double, key: Double): KeyFrame = js.native
    def getPrevKeyWith(`type`: String, h: Double, key: Double): KeyFrame = js.native
  }

  @js.native
  @JSName("THREE.MorphAnimation")
  class MorphAnimation extends js.Object {
    def this(mesh: Mesh) = this()
    var mesh: Mesh = js.native
    var frames: Double = js.native
    var currentTime: Double = js.native
    var duration: Double = js.native
    var loop: Boolean = js.native
    var isPlaying: Boolean = js.native
    def play(): Unit = js.native
    def pause(): Unit = js.native
    def update(deltaTimeMS: Double): Unit = js.native
  }


}
