package org.denigma.threejs.renderers.webgl.plugins

import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.{ Renderer, RendererPlugin }
import org.denigma.threejs.scenes.Scene

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * The Webglrenderer plugin class that allows Sprites to be rendered in the WebglRenderer.
  * This plugin is automatically loaded in the Webglrenderer.
  * @constructor Creates a new SpritePlugin.
  * @see [[http://threejs.org/docs/#Reference/Renderers.WebGL.Plugins/SpritePlugin]]
  */
@js.native
@JSName("THREE.SpritePlugin")
class SpritePlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = js.native

  /**
    * Renders the sprites defined in the scene. This gets automatically called as post-render function to draw the lensflares.
    */
  override def render(scene: Scene, camera: Camera, viewportWidth: Double = js.native, viewportHeight: Double = js.native): Unit = js.native
}

/**
  * The Webglrenderer plugin class that allows lensflares to be rendered in the WebglRenderer. This plugin is automatically loaded in the Webglrenderer.
  * @see [[http://threejs.org/docs/#Reference/Renderers.WebGL.Plugins/LensFlarePlugin]]
  */
@js.native
@JSName("THREE.LensFlarePlugin")
class LensFlarePlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = js.native

  /**
    * Renders the lensflares defined in the scene. This gets automatically called as post render function to draw the lensflares.
    */
  override def render(scene: Scene, camera: Camera, viewportWidth: Double, viewportHeight: Double): Unit = js.native
}
