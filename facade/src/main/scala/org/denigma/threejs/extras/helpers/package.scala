package org.denigma.threejs.extras.helpers

import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.Object3D
import org.denigma.threejs.lights.{ DirectionalLight, HemisphereLight, Light, PointLight, SpotLight }
import org.denigma.threejs.math.{ Box3, Vector3 }
import org.denigma.threejs.objects.{ Bone, Mesh, Line }
import org.denigma.threejs.extras.geometries.BoxGeometry

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * An 3D arrow Object.
  *
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/ArrowHelper]]
  */
@js.native
@JSName("THREE.ArrowHelper")
class ArrowHelper extends Object3D {

  /**
    * This creates an arrow starting in origin in the direction dir for a certain length. It is also possible to change color.
    * @param dir Vector3 -- direction from origin. Must be a unit vector.
    * @param origin Vector3
    * @param length scalar
    * @param hex hexadecimal value to define color ex:0xffff00
    * @param headLength The length of the head of the arrow
    * @param headWidth The length of the width of the arrow
    */
  def this(dir: Vector3, origin: Vector3 = js.native, length: Double = js.native, hex: Double = js.native, headLength: Double = js.native, headWidth: Double = js.native) = this()
  /** Contains the line part of the arrowHelper. */
  var line: Line = js.native
  /** Contains the cone part of the arrowHelper. */
  var cone: Mesh = js.native

  /**
    * Sets the direction of the arrowhelper.
    * @param dir The desired direction. Must be a unit vector.
    */
  def setDirection(dir: Vector3): Unit = js.native

  /**
    * Sets the length of the arrowhelper.
    * @param length The desired length
    * @param headLength The length of the head of the arrow
    * @param headWidth The length of the width of the arrow
    */
  def setLength(length: Double, headLength: Double = js.native, headWidth: Double = js.native): Unit = js.native

  /**
    * Sets the color of the arrowHelper.
    * @param hex The hexadicmal value of the color
    */
  def setColor(hex: Double): Unit = js.native
}

/**
  * An axis object to visualize the the 3 axes in a simple way.
  * The X axis is red. The Y axis is green. The Z axis is blue.
  * @constructor Creates an axisHelper with lines of length size.
  * @param size Define the size of the line representing the axes.
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/AxisHelper]]
  */
@js.native
@JSName("THREE.AxisHelper")
class AxisHelper(size: Double) extends Line

/**
  * A helper object to show the world-axis-aligned bounding box for an object.
  *
  * Note that this helper will create a wireframe Mesh object with a [[BoxGeometry]];
  * the resulting bounding box object will therefore have face diagonals.
  * You may want to use [[BoxHelper]], which generates a [[Line]] object without face diagonals.
  * @param `object` object3D to show the world-axis-aligned boundingbox.
  * @param hex hexadecimal value to define color ex:0x888888
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/BoundingBoxHelper]]
  */
@js.native
@JSName("THREE.BoundingBoxHelper")
class BoundingBoxHelper(var `object`: Object3D, hex: Double = js.native) extends Mesh {
  /** Contains the bounding box of the object. */
  var box: Box3 = js.native
  /** Updates the BoundingBoxHelper based on the object property. */
  def update(): Unit = js.native
}

/**
  * Helper object to show a wireframe box (with no face diagonals) around an object
  * @constructor Creates a new wireframe box matching the size of the passed box.
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/BoxHelper]]
  */
@js.native
@JSName("THREE.BoxHelper")
class BoxHelper(`object`: Object3D) extends Line {
  /** Updates the helper's geometry to match the dimensions of the bounding box of the passed object's geometry. */
  def update(`object`: Object3D = js.native): Unit = js.native
}

/**
  * The camera Helper is an Object3D which helps visualizing what a camera contains in its frustum.
  * It visualizes the frustum with an line Geometry.
  * @param camera The camera to visualize.
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/CameraHelper]]
  */
@js.native
@JSName("THREE.CameraHelper")
class CameraHelper(var camera: Camera) extends Line {
  /** This contains the points to viualize the cameraHelper */
  var pointMap: js.Array[js.Array[Vector3]] = js.native
  /** Updates the helper based on the projectionMatrix of the camera. */
  def update(): Unit = js.native
}

/**
  * Visualize a [[DirectionalLight]]'s effect on the scene
  * @constructor Creates a line and plane to visualize the light's position and direction
  * @param light Contains the directionalLight.
  * @param size  dimensions of the plane
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/DirectionalLightHelper]]
  */
@js.native
@JSName("THREE.DirectionalLightHelper")
class DirectionalLightHelper(var light: DirectionalLight, size: Double = js.native) extends Object3D {
  /** Contains the line mesh showing the location of the directional light. */
  var lightPlane: Line = js.native
  /** Contains the line mesh that shows the direction of the light. */
  var targetLine: Line = js.native
  /** Updates the helper to match the position and direction of the .light. */
  def update(): Unit = js.native
}

/**
  * Creates a wireframe object that shows the "hard" edges of another object's geometry.
  * To draw a full wireframe image of an object, see [[WireframeHelper]].
  *
  * @constructor Creates a [[Line]], showing only the "hard" edges of the passed object; specifically,
  *             no edge will be drawn between faces which are adjacent and coplanar (or nearly coplanar).
  * @param `object` Object of which to draw edges
  * @param color Color of the edges.
  * @param thresholdAngle the minimim angle (in degrees), between the face normals of adjacent faces,
  *                       that is required to render an edge. Default is 0.1.
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/EdgesHelper]]
  */
@js.native
@JSName("THREE.EdgesHelper")
class EdgesHelper(`object`: Object3D, color: Double, thresholdAngle: Double = js.native) extends Line

/**
  * Renders arrows to visualize an object's face normals. Requires that the object's geometry be an instance of
  * Geometry (does not work with BufferGeometry), and that face normals have been specified on all faces or
  * calculated with computeFaceNormals.
  *
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/FaceNormalsHelper]]
  */
@js.native
@JSName("THREE.FaceNormalsHelper")
class FaceNormalsHelper(var `object`: Object3D, size: Double = js.native, hex: Double = js.native, linewidth: Double = js.native) extends Line {
  /** Updates the face normal preview based on movement of the object. */
  def update(): Unit = js.native
}

/**
  * The GridHelper is an object to define grids. Grids are two-dimensional arrays of lines.
  *
  * @constructor Creates a new GridHelper of size 'size' and with steps of size 'step'.
  * @param size The size of the grid
  * @param step The size of the step between 2 lines
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/GridHelper]]
  */
@js.native
@JSName("THREE.GridHelper")
class GridHelper(size: Double, step: Double) extends Line {
  /**
    * Updates the color of the grid lines.
    * @param colorCenterLine The color of the centerline. This can be a Color, a hexadecimal value and an CSS-Color name.
    * @param colorGrid The color of the lines of the grid. This can be a Color, a hexadecimal value and an CSS-Color name.
    */
  def setColors(colorCenterLine: Double, colorGrid: Double): Unit = js.native
}

/**
  * Creates a visual aid for a [[HemisphereLight]].
  * @param light The HemisphereLight.
  * @param sphereSize The size of the sphere that shows the location.
  * @constructor Creates an helper for the hemispherelight.
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/HemisphereLightHelper]]
  */
@js.native
@JSName("THREE.HemisphereLightHelper")
class HemisphereLightHelper(var light: Light, sphereSize: Double) extends Object3D {
  /** The sphere mesh that shows the location of the hemispherelight. */
  var lightSphere: Mesh = js.native
  /** Updates the helper to match the position and direction of the .light. */
  def update(): Unit = js.native
}

/**
  * This displays a helper object for a [[PointLight]]
  * @param light The PointLight to display.
  * @param sphereSize The size of the sphere helper
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/PointLightHelper]]
  */
@js.native
@JSName("THREE.PointLightHelper")
class PointLightHelper(var light: PointLight, sphereSize: Double) extends Object3D {
  def dispose(): Unit = js.native
  /** Updates the light helper.*/
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.SkeletonHelper")
class SkeletonHelper extends Line {
  def this(bone: Object3D) = this()
  var bones: js.Array[Bone] = js.native
  var root: Object3D = js.native
  def getBoneList(`object`: Object3D): js.Array[Bone] = js.native
  def update(): Unit = js.native
}

/**
  * This displays a cylinder helper object for a SpotLight
  * @param light The SpotLight to display
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/SpotLightHelper]]
  */
@js.native
@JSName("THREE.SpotLightHelper")
class SpotLightHelper(var light: SpotLight) extends Object3D {
  var cone: Mesh = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native
}

/**
  * Renders arrows to visualize an object's vertex normal vectors.
  * Requires that normals have been specified in a custom attribute or have been calculated using computeVertexNormals.
  * @param `object` object for which to render vertex normals
  * @param size size (length) of the arrows
  * @param color color of the arrows
  * @param linewidth width of the arrow lines
  * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/VertexNormalsHelper]]
  */
@js.native
@JSName("THREE.VertexNormalsHelper")
class VertexNormalsHelper(var `object`: Object3D, size: Double = js.native, color: Double = js.native, linewidth: Double = js.native) extends Line {
  /** Updates the vertex normal preview based on movement of the object. */
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.VertexTangentsHelper")
class VertexTangentsHelper extends Line {
  def this(`object`: Object3D, size: Double = js.native, hex: Double = js.native, linewidth: Double = js.native) = this()
  var `object`: Object3D = js.native
  var size: Double = js.native
  def update(`object`: Object3D = js.native): Unit = js.native
}

/**
 * Creates a wireframe object that shows the edges of another object's geometry.
 * To draw a wireframe image showing only "hard" edges (edges between non-coplanar faces), see [[EdgesHelper]].
 * @example {{{
 * geometry = new THREE.BoxGeometry( 10, 10, 10, 2, 2, 2 );
 * material = new THREE.MeshBasicMaterial( { color: 0xff0000 } );
 * object = new THREE.Mesh( geometry, material );
 *
 * wireframe = new THREE.WireframeHelper( object, 0x00ff00 );
 *
 * scene.add( object );
 * scene.add( wireframe );
 * }}}
 * @see [[http://threejs.org/docs/#Reference/Extras.Helpers/WireframeHelper]]
 */
@js.native
@JSName("THREE.WireframeHelper")
class WireframeHelper extends Line {
  /**
   * Creates a Line, showing only the edges between vertices of an object.
   * @param `object` Object of which to draw edges
   * @param color Color of the edges.
   * @return
   */
  def this(`object`: Object3D, color: Double = js.native) = this()
}

