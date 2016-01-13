package org.denigma.threejs.examples.renderers

import org.denigma.threejs.Renderer
import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.math.Color
import org.denigma.threejs.scenes.Scene
import org.scalajs.dom.raw.HTMLCanvasElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait CanvasRendererParameters extends js.Object {
  var canvas: HTMLCanvasElement = js.native
  var devicePixelRatio: Double = js.native
}

@js.native
@JSName("THREE.CanvasRenderer")
class CanvasRenderer extends Renderer {
  def this(parameters: CanvasRendererParameters = js.native) = this()

  var devicePixelRatio: Double = js.native
  var autoClear: Boolean = js.native
  var sortObjects: Boolean = js.native
  var sortElements: Boolean = js.native
  var info: js.Any = js.native
  def supportsVertexTextures(): Unit = js.native
  def setFaceCulling(): Unit = js.native
  override def setSize(width: Double, height: Double, updateStyle: Boolean = js.native): Unit = js.native
  def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def setScissor(): Unit = js.native
  def enableScissorTest(): Unit = js.native
  def setClearColor(color: Color, opacity: Double = js.native): Unit = js.native
  def setClearColorHex(hex: Double, alpha: Double = js.native): Unit = js.native
  def getClearColor(): Color = js.native
  def getClearAlpha(): Double = js.native
  def getMaxAnisotropy(): Double = js.native
  def clear(): Unit = js.native
  def clearColor(): Unit = js.native
  def clearDepth(): Unit = js.native
  def clearStencil(): Unit = js.native
  override def render(scene: Scene, camera: Camera): Unit = js.native
}
