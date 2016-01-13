package org.denigma.threejs.renderers.webgl.plugins

import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.{ Renderer, RendererPlugin }
import org.denigma.threejs.scenes.Scene

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.SpritePlugin")
class SpritePlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = js.native
  override def render(scene: Scene, camera: Camera, viewportWidth: Double, viewportHeight: Double): Unit = js.native
}

@js.native
@JSName("THREE.LensFlarePlugin")
class LensFlarePlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = js.native
  override def render(scene: Scene, camera: Camera, viewportWidth: Double, viewportHeight: Double): Unit = js.native
}