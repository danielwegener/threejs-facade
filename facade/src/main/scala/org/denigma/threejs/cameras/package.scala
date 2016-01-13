package org.denigma.threejs.cameras

import org.denigma.threejs.Renderer
import org.denigma.threejs.core.Object3D
import org.denigma.threejs.math.{ Vector3, Matrix4 }
import org.denigma.threejs.renderers.WebGLRenderTargetCube
import org.denigma.threejs.scenes.Scene

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Abstract base class for cameras. This class should always be inherited when you build a new camera.
 * @see [[http://threejs.org/docs/#Reference/Cameras/Camera]]
 */
@js.native
@JSName("THREE.Camera")
class Camera extends Object3D {
  /** This is the inverse of matrixWorld. MatrixWorld contains the Matrix which has the world transform of the Camera. */
  var matrixWorldInverse: Matrix4 = js.native
  /** This is the matrix which contains the projection. */
  var projectionMatrix: Matrix4 = js.native

  /**
   * This makes the camera look at the vector position in the global space as long as the parent of this camera is the scene or at position (0,0,0).
   * @param vector point to look at
   */
  override def lookAt(vector: Vector3): Unit = js.native

  /**
   * It returns a vector representing the direction in which the camera is looking, in world space.
   * @param vector (optional)
   */
  def getWorldDirection(vector: Vector3 = js.native): Vector3 = js.native
}

@js.native
@JSName("THREE.CubeCamera")
class CubeCamera extends Object3D {
  def this(near: Double = js.native, far: Double = js.native, cubeResolution: Double = js.native) = this()
  var renderTarget: WebGLRenderTargetCube = js.native
  def updateCubeMap(renderer: Renderer, scene: Scene): Unit = js.native
}

@js.native
@JSName("THREE.OrthographicCamera")
class OrthographicCamera extends Camera {
  def this(left: Double, right: Double, top: Double, bottom: Double) = this()
  def this(left: Double, right: Double, top: Double, bottom: Double, near: Double) = this()
  def this(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double) = this()
  var left: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  var bottom: Double = js.native
  var near: Double = js.native
  var far: Double = js.native
  def updateProjectionMatrix(): Unit = js.native
}

@js.native
@JSName("THREE.PerspectiveCamera")
class PerspectiveCamera extends Camera {
  def this(fov: Double = js.native, aspect: Double = js.native, near: Double = js.native, far: Double = js.native) = this()
  var fov: Double = js.native
  var aspect: Double = js.native
  var near: Double = js.native
  var far: Double = js.native
  def setLens(focalLength: Double, frameHeight: Double = js.native): Unit = js.native
  def setViewOffset(fullWidth: Double, fullHeight: Double, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def updateProjectionMatrix(): Unit = js.native
}