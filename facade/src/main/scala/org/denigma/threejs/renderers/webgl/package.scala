package org.denigma.threejs.renderers.webgl

import org.denigma.threejs.materials.ShaderMaterial
import org.denigma.threejs.renderers.{WebGLRenderingContext, WebGLRendererParameters, WebGLRenderer}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * A lower level function to compile either a vertex or fragment shader.
  * @see [[http://threejs.org/docs/#Reference/Renderers.WebGL/WebGLShader]]
  */
@js.native
@JSName("THREE.WebGLShader")
object WebGLShader extends js.Object {
  /**
    * This will compile an individual shader, but won't link it to be a complete WebGLProgram.
    * Note: this is a function so the new operator should not be used.
    * @param gl The current WebGL context type
    * @param `type` The WebGL type, either gl.VERTEX_SHADER or gl.FRAGMENT_SHADER
    * @param source The source code for the shader
    */
  def objects(gl: WebGLRenderingContext, `type`: js.Any, source: String):js.Any = js.native

}

/**
  * Constructor for the GLSL program sent to vertex and fragment shaders, including default uniforms and attributes.
  * @see [[http://threejs.org/docs/#Reference/Renderers.WebGL/WebGLProgram]]
  */
@js.native
@JSName("THREE.WebGLProgram")
class WebGLProgram extends js.Object {
  def this(renderer: WebGLRenderer, code: String, material: ShaderMaterial, parameters: WebGLRendererParameters) = this()

  /** Returns a name-value mapping of all active uniform locations. */
  def getUniforms() : js.Any = js.native

}
