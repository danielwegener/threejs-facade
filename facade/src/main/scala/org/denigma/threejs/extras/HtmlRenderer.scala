package org.denigma.threejs.extras

import org.denigma.threejs.Renderer
import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.Object3D
import org.denigma.threejs.math.Matrix3
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.CSS3DObject")
class HtmlObject(element: HTMLElement) extends Object3D {

}

@js.native
@JSName("THREE.CSS3DSprite")
class HtmlSprite(element: HTMLElement) extends HtmlObject(element) {

}

@js.native
@JSName("THREE.CSS3DRenderer")
class HtmlRenderer extends Renderer {

  //  def render(scene: Scene, camera: Camera): Unit = js.native
  //  def setSize(width: Double, height: Double, updateStyle: Boolean = js.native): Unit = js.native
  //  var domElement: HTMLCanvasElement = js.native
  //def this(parameters: WebGLRendererParameters = js.native) = this()

  def setSize(width: Double, height: Double): Unit = js.native

  def epsilon(value: Double): Double = js.native

  def getObjectCSSMatrix(matrix: Matrix3): String = js.native

  def getCameraCSSMatrix(matrix: Matrix3): String = js.native

  def renderObject(obj: HtmlObject, camera: Camera): Unit = js.native

}
