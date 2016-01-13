package org.denigma.threejs.extensions.loaders

import org.denigma.threejs.core.Object3D
import org.denigma.threejs.loaders.LoadingManager
import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * A loader for loading an .obj resource.
 * @example {{{
 * // instantiate a loader
 * var loader = new THREE.OBJLoader();
 * // load a resource
 *
 * loader.load(
 *  // resource URL
 *  'models/skinned/UCS_config.json',
 *  // Function when resource is loaded
 *  function ( object ) {
 *    scene.add( object );
 *  }
 * );
 * }}}
 * @see [[http://threejs.org/docs/#Reference/Loaders/OBJLoader]]
 */
@JSName("THREE.OBJLoader")
@js.native
class OBJLoader(manager: LoadingManager = js.native) extends js.Object {

  /**
   * Begin loading from urls and call onLoad with the parsed response content.
   * @param url        URL to the .obj resource
   * @param onLoad     Will be called when both resources load complete. The argument will be the loaded Object3D.
   * @param onProgress Will be called while both load progress. The argument will be the XmlHttpRequest instance, that contain .total and .loaded bytes.
   * @param onError    Will be called when load errors.
   */
  def load(
              url: String,
              onLoad: js.Function1[Object3D, _] = js.native,
              onProgress: js.Function1[XMLHttpRequest, _] = js.native,
              onError: js.Function1[XMLHttpRequest, _] = js.native
          ): Unit = js.native

  /**
   * Parse an obj text structure and return an Object3D.
   * Found objects are converted to Mesh with a BufferGeometry and a default MeshLambertMaterial.
   * @param text The textual obj structure to parse.
   */
  def parse(text: String): Object3D = js.native

}