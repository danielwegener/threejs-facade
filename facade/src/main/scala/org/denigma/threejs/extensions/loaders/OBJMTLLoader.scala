package org.denigma.threejs.extensions.loaders

import org.denigma.threejs.core.Object3D
import org.denigma.threejs.loaders.LoadingManager
import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * A loader for loading a .obj and its .mtl together.
 * @see [[http://threejs.org/docs/#Reference/Loaders/OBJMTLLoader]]
 */
@JSName("THREE.OBJMTLLoader")
@js.native
class OBJMTLLoader(manager: LoadingManager = js.native) extends js.Object {

  /**
   * Begin loading from urls and call onLoad with the parsed response content.
   *
   * @param objUrl URL to the .obj resource
   * @param mtlUrl URL to the .mtl resource
   * @param onLoad Will be called when both resources load complete. The argument will be the loaded Object3D.
   * @param onProgress  Will be called while both load progress. The argument will be the XmlHttpRequest instance, that contain .total and .loaded bytes.
   * @param onError  Will be called when load errors.
   */
  def load(
    objUrl:     String,
    mtlUrl:     String,
    onLoad:     js.Function1[Object3D, _]       = js.native,
    onProgress: js.Function1[XMLHttpRequest, _] = js.native,
    onError:    js.Function1[XMLHttpRequest, _] = js.native
  ): Unit = js.native

  /**
   * Parse an obj text structure and return an Object3D.
   * Found objects are converted to a Mesh and materials are converted to MeshLambertMaterial.
   * @param text The textual obj structure to parse.
   * @param mtllibCallback Callback to handle `mtllib` declaration.
   */
  def parse(text: String, mtllibCallback: js.Function1[String, _] = js.native): Object3D = js.native

}