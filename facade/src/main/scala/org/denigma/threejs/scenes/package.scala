package org.denigma.threejs.scenes

import org.denigma.threejs.core.Object3D
import org.denigma.threejs.materials.Material
import org.denigma.threejs.math.Color

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait IFog extends js.Object {
  /** Default is the empty string. */
  var name: String = js.native
  /** Fog color. Example: If set to black, far away objects will be rendered black. */
  var color: Color = js.native
  /** Returns a copy of this. */
  override def clone(): IFog = js.native
}

/**
 * This class contains the parameters that define linear fog, i.e., that grows linearly denser with the distance.
 *
 * @constructor The hex parameter is passed to the Color constructor to set the color property.
 *             Hex can be a hexadecimal integer or a CSS-style string.
 * @see [[http://threejs.org/docs/#Reference/Scenes/Fog]]
 */
@js.native
@JSName("THREE.Fog")
class Fog extends IFog {
  def this(hex: Double, near: Double = js.native, far: Double = js.native) = this()

  /**
   * The minimum distance to start applying fog.
   * Objects that are less than 'near' units from the active camera won't be affected by fog.
   * Default is 1.
   */
  var near: Double = js.native
  /**
   * The maximum distance at which fog stops being calculated and applied.
   * Objects that are more than 'far' units away from the active camera won't be affected by fog.
   * Default is 1000.
   */
  var far: Double = js.native

  override def clone(): Fog = js.native
}

/**
 * This class contains the parameters that define exponential fog, i.e., that grows exponentially denser with the distance.
 *
 * @constructor The hex parameter is passed to the Color constructor to set the color property.
 *             Hex can be a hexadecimal integer or a CSS-style string.
 * @see [[http://threejs.org/docs/#Reference/Scenes/FogExp2]]
 */
@js.native
@JSName("THREE.FogExp2")
class FogExp2 extends IFog {
  def this(hex: Double, density: Double = js.native) = this()

  /**
   * Defines how fast the fog will grow dense. Default is `0.00025`.
   */
  var density: Double = js.native
  override def clone(): FogExp2 = js.native
}

/**
 * Scenes allow you to set up what and where is to be rendered by three.js. This is where you place objects, lights and cameras.
 *
 * @constructor Create a new scene object.
 * @see [[http://threejs.org/docs/#Reference/Scenes/Scene]]
 */
@js.native
@JSName("THREE.Scene")
class Scene extends Object3D {
  /** A fog instance defining the type of fog that affects everything rendered in the scene. Default is `null`. */
  var fog: IFog = js.native
  /** If not null, it will force everything in the scene to be rendered with that material. Default is `null`. */
  var overrideMaterial: Material = js.native
  /**
   * Default is true. If set, then the renderer checks every frame if the scene and its objects needs matrix updates.
   * When it isn't, then you have to maintain all matrices in the scene yourself.
   */
  var autoUpdate: Boolean = js.native

}
