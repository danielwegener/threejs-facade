package org.denigma.threejs.renderers.webgl

import org.denigma.threejs.materials.ShaderMaterial
import org.denigma.threejs.renderers.{ WebGLRendererParameters, WebGLRenderer }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.WebGLShader")
class WebGLShader extends js.Object {
  def this(gl: js.Any, `type`: String, string: String) = this()
}

@js.native
@JSName("THREE.WebGLProgram")
class WebGLProgram extends js.Object {
  def this(renderer: WebGLRenderer, code: String, material: ShaderMaterial, parameters: WebGLRendererParameters) = this()
}
