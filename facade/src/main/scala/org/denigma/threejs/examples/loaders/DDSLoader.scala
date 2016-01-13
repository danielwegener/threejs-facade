package org.denigma.threejs.examples.loaders

import org.denigma.threejs.loaders.{ CompressedTextureLoader, LoadingManager }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * A loader for loading an .obj resource.
 * @see [[https://github.com/mrdoob/three.js/blob/master/examples/js/loaders/DDSLoader.js]]
 */
@JSName("THREE.DDSLoader")
@js.native
class DDSLoader(manager: LoadingManager = js.native) extends CompressedTextureLoader {

}