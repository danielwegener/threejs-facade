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

  /** Return camera data in JSON format. */
  def toJSON(): js.Any = js.native

}

/**
  * Creates 6 cameras that render to a [[WebGLRenderTargetCube]].
  * @see [[http://threejs.org/docs/#Reference/Cameras/CubeCamera]]
  */
@js.native
@JSName("THREE.CubeCamera")
class CubeCamera extends Object3D {
  /**
    * Constructs a CubeCamera that contains 6 PerspectiveCameras that then render to a WebGLRenderTargetCube
    * @param near The near clipping distance.
    * @param far The far clipping distance
    * @param cubeResolution Sets the width of the cube.
    */
  def this(near: Double = js.native, far: Double = js.native, cubeResolution: Double = js.native) = this()
  /** The cube texture that gets generated. */
  var renderTarget: WebGLRenderTargetCube = js.native
  /**
    * Call this to update the renderTarget.
    * @param renderer The current WebGL renderer
    * @param scene The current scene
    */
  def updateCubeMap(renderer: Renderer, scene: Scene): Unit = js.native
}

/**
  * Camera with orthographic projection.
  *
  * @param left — Camera frustum left plane.
  * @param right — Camera frustum right plane.
  * @param top — Camera frustum top plane.
  * @param bottom — Camera frustum bottom plane.
  * @param near — Camera frustum near plane.
  * @param far — Camera frustum far plane.
  * @see [[http://threejs.org/docs/#Reference/Cameras/OrthographicCamera]]
  */
@js.native
@JSName("THREE.OrthographicCamera")
class OrthographicCamera(left: Double, right: Double, top: Double, bottom: Double, near: Double = js.native, far: Double = js.native) extends Camera {

  /** Gets or sets the zoom factor of the camera. */
  var zoom: Double = js.native
  /** Updates the camera projection matrix. Must be called after change of parameters. */
  def updateProjectionMatrix(): Unit = js.native
  /** It returns a clone of OrthographicCamera. */
  override def clone(): OrthographicCamera = js.native


}

/**
  * Camera with perspective projection.
  *
  * @param fov Camera frustum vertical field of view, from bottom to top of view, in degrees.
  * @param aspect  Camera frustum aspect ratio, window width divided by window height.
  * @param near  Camera frustum near plane.
  * @param far  Camera frustum far plane.
  *
  * @see [[http://threejs.org/docs/#Reference/Cameras/PerspectiveCamera]]
  */
@js.native
@JSName("THREE.PerspectiveCamera")
class PerspectiveCamera(var fov: Double = js.native, var aspect: Double = js.native, var near: Double = js.native, var far: Double = js.native) extends Camera {

  /** Gets or sets the zoom factor of the camera. */
  var zoom: Double = js.native

  /**
    * Uses focal length (in mm) to estimate and set FOV 35mm (fullframe) camera is used if frame size is not specified.
    * Formula based on [[http://www.bobatkins.com/photography/technical/field_of_view.html]]
    *
    * @param focalLength focal length
    * @param frameHeight frame size
    */
  def setLens(focalLength: Double, frameHeight: Double = js.native): Unit = js.native

  /**
    * Sets an offset in a larger frustum. This is useful for multi-window or multi-monitor/multi-machine setups.
    * For example, if you have 3x2 monitors and each monitor is 1920x1080 and the monitors are in grid like this:
      {{{
      +---+---+---+
      | A | B | C |
      +---+---+---+
      | D | E | F |
      +---+---+---+
      }}}
      then for each monitor you would call it like this:
      {{{
      var w = 1920;
      var h = 1080;
      var fullWidth = w * 3;
      var fullHeight = h * 2;

      // A
      camera.setViewOffset( fullWidth, fullHeight, w * 0, h * 0, w, h );
      // B
      camera.setViewOffset( fullWidth, fullHeight, w * 1, h * 0, w, h );
      // C
      camera.setViewOffset( fullWidth, fullHeight, w * 2, h * 0, w, h );
      // D
      camera.setViewOffset( fullWidth, fullHeight, w * 0, h * 1, w, h );
      // E
      camera.setViewOffset( fullWidth, fullHeight, w * 1, h * 1, w, h );
      // F
      camera.setViewOffset( fullWidth, fullHeight, w * 2, h * 1, w, h ); Note there is no reason monitors have to be the same size or in a grid.
      }}}
    * @param fullWidth full width of multiview setup
    * @param fullHeight full height of multiview setup
    * @param x horizontal offset of subcamera
    * @param y vertical offset of subcamera
    * @param width width of subcamera
    * @param height height of subcamera
    */
  def setViewOffset(fullWidth: Double, fullHeight: Double, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /** Updates the camera projection matrix. Must be called after change of parameters. */
  def updateProjectionMatrix(): Unit = js.native
  /** It returns a clone of PerspectiveCamera. */
  override def clone(): PerspectiveCamera = js.native

}