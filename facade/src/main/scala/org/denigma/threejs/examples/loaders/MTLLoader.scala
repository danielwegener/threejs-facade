package org.denigma.threejs.examples.loaders

import org.denigma.threejs.loaders.{LoadingManager, TextureLoader}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * @see [[https://github.com/mrdoob/three.js/blob/master/examples/js/loaders/DDSLoader.js]]
 */
@JSName("THREE.MTLLoader")
@js.native
class MTLLoader(manager: LoadingManager = js.native) extends TextureLoader