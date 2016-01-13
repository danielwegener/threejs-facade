package org.denigma.threejs.lights

import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.Object3D
import org.denigma.threejs.RenderTarget
import org.denigma.threejs.materials.MeshLambertMaterial
import org.denigma.threejs.materials.MeshPhongMaterial
import org.denigma.threejs.math.{ Vector2, Matrix4, Vector3, Color }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Abstract base class for lights.
 * @see [[http://threejs.org/docs/#Reference/Lights/Light]]
 */
@js.native
@JSName("THREE.Light")
class Light extends Object3D {
  /**
   * This creates a light with color.
   * @param hex Numeric value of the RGB component of the color.
   */
  def this(hex: Double = js.native) = this()
  /** Color of the light. */
  var color: Color = js.native
}

/**
 * This light's color gets applied to all the objects in the scene globally.
 * @example {{{
 *         var light = new THREE.AmbientLight( 0x404040 ); // soft white light
 *         scene.add( light );
 *         }}}
 * @see [[http://threejs.org/docs/#Reference/Lights/AmbientLight]]
 */
@js.native
@JSName("THREE.AmbientLight")
class AmbientLight extends Light {
  /**
   * This creates an Ambientlight with a color.
   * @param hex Numeric value of the RGB component of the color.
   */
  def this(hex: Double = js.native) = this()
}

/**
  * Affects objects using [[MeshLambertMaterial]] or [[MeshPhongMaterial]].
  */
@js.native
@JSName("THREE.DirectionalLight")
class DirectionalLight extends Light {

  /**
    * Creates a light that shines from a specific direction not from a specific position.
    * This light will behave as though it is infinitely far away and the rays produced from it are all parallel.
    * The best analogy would be a light source that acts like the sun: the sun is so far away that all sunlight
    * hitting objects comes from the same angle.
    * @param hex Numeric value of the RGB component of the color.
    * @param intensity Numeric value of the light's strength/intensity.
    */
  def this(hex: Double = js.native, intensity: Double = js.native) = this()
  /** Target used for shadow camera orientation. */
  var target: Object3D = js.native
  /** Light's intensity. Default — 1.0.*/
  var intensity: Double = js.native

  /**
    * Orthographic shadow camera frustum parameter.
    * Default — 50.
    */
  var shadowCameraNear: Double = js.native
  /**
    * Orthographic shadow camera frustum parameter.
    * Default — 5000.
    */
  var shadowCameraFar: Double = js.native
  /**
    * Orthographic shadow camera frustum parameter.
    * Default — -500.
    */
  var shadowCameraLeft: Double = js.native
  /**
    * Orthographic shadow camera frustum parameter.
    * Default — 500.
    */
  var shadowCameraRight: Double = js.native
  /**
    * Orthographic shadow camera frustum parameter.
    * Default — 500.
    */
  var shadowCameraTop: Double = js.native
  /**
    * Orthographic shadow camera frustum parameter.
    * Default — -500.
    */
  var shadowCameraBottom: Double = js.native
  /**
    * Show debug shadow camera frustum.
    * Default — false.
    */
  var shadowCameraVisible: Boolean = js.native
  /**
    * Shadow map bias, how much to add or subtract from the normalized depth when deciding whether a surface is in shadow.
    * Default — 0.
    */
  var shadowBias: Double = js.native
  /**
    * Shadow map texture width in pixels.
    * Default — 512.
    */
  var shadowMapWidth: Double = js.native
  /**
    * Shadow map texture height in pixels.
    * Default — 512.
    */
  var shadowMapHeight: Double = js.native
  /** The shadowMapWidth and shadowMapHeight stored in a [[Vector2]]. Set internally during rendering. */
  var shadowMapSize: Vector2 = js.native
  /** The shadow's view of the world. Computed internally during rendering from the shadowCamera* settings. */
  var shadowCamera: Camera = js.native
  /** Model to shadow camera space, to compute location and depth in shadow map. Computed internally during rendering. */
  var shadowMatrix: Matrix4 = js.native
  /**
    * The depth map generated using the shadowCamera; a location beyond a pixel's depth is in shadow.
    * Computed internally during rendering.
    */
  var shadowMap: RenderTarget = js.native

  /** It returns a clone of DirectionalLight. */
  override def clone() : DirectionalLight = js.native

  /** Return DirectionalLight data in JSON format.*/
  def toJSON():js.Any = js.native

  var shadowCascade: Boolean = js.native
  var shadowCascadeOffset: Vector3 = js.native
  var shadowCascadeCount: Double = js.native
  var shadowCascadeBias: js.Array[Double] = js.native
  var shadowCascadeWidth: js.Array[Double] = js.native
  var shadowCascadeHeight: js.Array[Double] = js.native
  var shadowCascadeNearZ: js.Array[Double] = js.native
  var shadowCascadeFarZ: js.Array[Double] = js.native
  var shadowCascadeArray: js.Array[DirectionalLight] = js.native
}

/**
 * A light source positioned directly above the scene.
 * @see [[http://threejs.org/docs/#Reference/Lights/HemisphereLight]]
 */
@js.native
@JSName("THREE.HemisphereLight")
class HemisphereLight extends Light {
  /**
   * @param skyColorHex Numeric value of the RGB sky color.
   * @param groundColorHex Numeric value of the RGB ground color.
   * @param intensity Numeric value of the light's strength/intensity.
   */
  def this(skyColorHex: Double = js.native, groundColorHex: Double = js.native, intensity: Double = js.native) = this()
  /** Light's ground color. */
  var groundColor: Color = js.native
  /** Light's intensity.Default — 1.0. */
  var intensity: Double = js.native
}

@js.native
@JSName("THREE.PointLight")
class PointLight extends Light {
  def this(hex: Double = js.native, intensity: Double = js.native, distance: Double = js.native) = this()
  var intensity: Double = js.native
  var distance: Double = js.native
}

/**
 * A point light that can cast shadow in one direction.
 * Affects objects using [[MeshLambertMaterial]] or [[MeshPhongMaterial]].
 * @param hex Numeric value of the RGB component of the color.
 * @param intensity Numeric value of the light's strength/intensity. Default 1.0.
 * @param distance If non-zero, light will attenuate linearly from maximum intensity at light position down to zero at distance. Default 0.0.
 * @param angle Maximum extent of the spotlight, in radians, from its direction. Should be no more than Math.PI/2. Default Math.PI/3.
 * @param penumbra Rapidity of the falloff of light from its target direction. A lower value spreads out the light, while a higher focuses it towards the center. Default 10.0.
 * @param decay The amount the light dims along the distance of the light. Default 1.
 * @see [[http://threejs.org/docs/#Reference/Lights/SpotLight]]
 */
@js.native
@JSName("THREE.SpotLight")
class SpotLight(hex: Double = js.native, var intensity: Double = js.native, var distance: Double = js.native, var angle: Double = js.native, var penumbra: Double = js.native, var decay: Double = js.native) extends Light {

  /**
   * Spotlight focus points at target.position.
   * Default position — (0,0,0).
   * Note: Currently for target property to work properly, it must be part of the scene.
   */
  var target: Object3D = js.native
  /** Perspective shadow camera frustum near parameter. Default 50. */
  var shadowCameraNear: Double = js.native
  /** Perspective shadow camera frustum far parameter. Default 5000. */
  var shadowCameraFar: Double = js.native
  /** Perspective shadow camera frustum field of view parameter. Default 50. */
  var shadowCameraFov: Double = js.native
  /** Show debug shadow camera frustum. Default false. */
  var shadowCameraVisible: Boolean = js.native
  /** Shadow map bias, how much to add or subtract from the normalized depth when deciding whether a surface is in shadow. Default 0. */
  var shadowBias: Double = js.native
  var shadowDarkness: Double = js.native
  /** Shadow map texture width in pixels. Default 512. */
  var shadowMapWidth: Double = js.native
  /** Shadow map texture height in pixels. Default 512. */
  var shadowMapHeight: Double = js.native
  /** The shadowMapWidth and shadowMapHeight stored in a [[Vector2]]. Set internally during rendering. */
  var shadowMapSize: Vector2 = js.native
  /** The shadow's view of the world. Computed internally during rendering from the shadowCamera* settings. */
  var shadowCamera: Camera = js.native
  /** Model to shadow camera space, to compute location and depth in shadow map. Computed internally during rendering. */
  var shadowMatrix: Matrix4 = js.native
  /** The depth map generated using the shadowCamera; a location beyond a pixel's depth is in shadow. Computed internally during rendering. */
  var shadowMap: RenderTarget = js.native
}