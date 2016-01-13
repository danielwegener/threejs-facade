package org.denigma.threejs.lights

import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.Object3D
import org.denigma.threejs.RenderTarget
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

@js.native
@JSName("THREE.DirectionalLight")
class DirectionalLight extends Light {
  def this(hex: Double = js.native, intensity: Double = js.native) = this()
  var target: Object3D = js.native
  var intensity: Double = js.native
  var onlyShadow: Boolean = js.native
  var shadowCameraNear: Double = js.native
  var shadowCameraFar: Double = js.native
  var shadowCameraLeft: Double = js.native
  var shadowCameraRight: Double = js.native
  var shadowCameraTop: Double = js.native
  var shadowCameraBottom: Double = js.native
  var shadowCameraVisible: Boolean = js.native
  var shadowBias: Double = js.native
  var shadowDarkness: Double = js.native
  var shadowMapWidth: Double = js.native
  var shadowMapHeight: Double = js.native
  var shadowCascade: Boolean = js.native
  var shadowCascadeOffset: Vector3 = js.native
  var shadowCascadeCount: Double = js.native
  var shadowCascadeBias: js.Array[Double] = js.native
  var shadowCascadeWidth: js.Array[Double] = js.native
  var shadowCascadeHeight: js.Array[Double] = js.native
  var shadowCascadeNearZ: js.Array[Double] = js.native
  var shadowCascadeFarZ: js.Array[Double] = js.native
  var shadowCascadeArray: js.Array[DirectionalLight] = js.native
  var shadowMap: RenderTarget = js.native
  var shadowMapSize: Double = js.native
  var shadowCamera: Camera = js.native
  var shadowMatrix: Matrix4 = js.native
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

@js.native
@JSName("THREE.SpotLight")
class SpotLight extends Light {
  def this(hex: Double = js.native, intensity: Double = js.native, distance: Double = js.native, angle: Double = js.native, exponent: Double = js.native) = this()
  var target: Object3D = js.native
  var intensity: Double = js.native
  var distance: Double = js.native
  var angle: Double = js.native
  var exponent: Double = js.native
  var onlyShadow: Boolean = js.native
  var shadowCameraNear: Double = js.native
  var shadowCameraFar: Double = js.native
  var shadowCameraFov: Double = js.native
  var shadowCameraVisible: Boolean = js.native
  var shadowBias: Double = js.native
  var shadowDarkness: Double = js.native
  var shadowMapWidth: Double = js.native
  var shadowMapHeight: Double = js.native
  var shadowMap: RenderTarget = js.native
  var shadowMapSize: Vector2 = js.native
  var shadowCamera: Camera = js.native
  var shadowMatrix: Matrix4 = js.native
}