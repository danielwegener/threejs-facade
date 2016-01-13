package org.denigma.threejs.extensions

import org.denigma.threejs.Renderer
import org.denigma.threejs.cameras.PerspectiveCamera
import org.denigma.threejs.scenes.Scene
import org.scalajs.dom
import org.scalajs.dom.raw.HTMLElement

trait SceneContainer{

  val container: HTMLElement

  def width:Double

  def height:Double

  type RendererType <:Renderer

  val scene = new Scene()

  def distance:Double = 2000

  lazy val renderer: RendererType = this.initRenderer()

  lazy val camera = initCamera()

  def aspectRatio = width /height

  protected def initRenderer():RendererType

  protected def initCamera() =
  {
    val camera = new PerspectiveCamera(40, this.aspectRatio, 1, 1000000)
    camera.position.z = distance
    camera
  }

  protected def onEnterFrameFunction(double: Double): Unit = {
    onEnterFrame()
    render()
  }

  def onEnterFrame():Unit = {
      renderer.render(scene, camera)
  }

  def render() =  dom.window.requestAnimationFrame(  onEnterFrameFunction _ )

}


