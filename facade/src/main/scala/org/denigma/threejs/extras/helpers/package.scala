package org.denigma.threejs.extras.helpers

import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.Object3D
import org.denigma.threejs.lights.Light
import org.denigma.threejs.math.{ Color, Matrix3, Box3, Vector3 }
import org.denigma.threejs.objects.{ Bone, Mesh, Line }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.ArrowHelper")
class ArrowHelper extends Object3D {
  def this(dir: Vector3, origin: Vector3 = js.native, length: Double = js.native, hex: Double = js.native, headLength: Double = js.native, headWidth: Double = js.native) = this()
  var line: Line = js.native
  var cone: Mesh = js.native
  def setDirection(dir: Vector3): Unit = js.native
  def setLength(length: Double): Unit = js.native
  def setLength(length: Double, headLength: Double): Unit = js.native
  def setLength(length: Double, headLength: Double, headWidth: Double): Unit = js.native
  def setColor(hex: Double): Unit = js.native
}

@js.native
@JSName("THREE.AxisHelper")
class AxisHelper extends Line {
  def this(size: Double = js.native) = this()
}

@js.native
@JSName("THREE.BoundingBoxHelper")
class BoundingBoxHelper extends Mesh {
  def this(`object`: Object3D, hex: Double = js.native) = this()
  var `object`: Object3D = js.native
  var box: js.Array[Box3] = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.BoxHelper")
class BoxHelper extends Line {
  def this(`object`: Object3D = js.native) = this()
  def update(`object`: Object3D = js.native): Unit = js.native
}

@js.native
@JSName("THREE.CameraHelper")
class CameraHelper extends Line {
  def this(camera: Camera) = this()
  var camera: Camera = js.native
  var pointMap: js.Any = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.DirectionalLightHelper")
class DirectionalLightHelper extends Object3D {
  def this(light: Light, size: Double = js.native) = this()
  var light: Light = js.native
  var lightPlane: Line = js.native
  var targetLine: Line = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.EdgesHelper")
class EdgesHelper extends Line {
  def this(`object`: Object3D, hex: Double = js.native) = this()
}

@js.native
@JSName("THREE.FaceNormalsHelper")
class FaceNormalsHelper extends Line {
  def this(`object`: Object3D, size: Double = js.native, hex: Double = js.native, linewidth: Double = js.native) = this()
  var `object`: Object3D = js.native
  var size: Double = js.native
  var normalMatrix: Matrix3 = js.native
  def update(`object`: Object3D = js.native): Unit = js.native
}

@js.native
@JSName("THREE.GridHelper")
class GridHelper extends Line {
  def this(size: Double, step: Double) = this()
  var color1: Color = js.native
  var color2: Color = js.native
  def setColors(colorCenterLine: Double, colorGrid: Double): Unit = js.native
}

@js.native
@JSName("THREE.HemisphereLightHelper")
class HemisphereLightHelper extends Object3D {
  def this(light: Light, sphereSize: Double, arrowLength: Double, domeSize: Double) = this()
  var light: Light = js.native
  var colors: js.Array[Color] = js.native
  var lightSphere: Mesh = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.PointLightHelper")
class PointLightHelper extends Object3D {
  def this(light: Light, sphereSize: Double) = this()
  var light: Light = js.native
  def dispose(): Unit = js.native
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

@js.native
@JSName("THREE.SpotLightHelper")
class SpotLightHelper extends Object3D {
  def this(light: Light, sphereSize: Double, arrowLength: Double) = this()
  var light: Light = js.native
  var cone: Mesh = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.VertexNormalsHelper")
class VertexNormalsHelper extends Line {
  def this(`object`: Object3D) = this()
  def this(`object`: Object3D, size: Double) = this()
  def this(`object`: Object3D, size: Double, hex: Double) = this()
  def this(`object`: Object3D, size: Double, hex: Double, linewidth: Double) = this()
  var `object`: Object3D = js.native
  var size: Double = js.native
  var normalMatrix: Matrix3 = js.native
  def update(`object`: Object3D = js.native): Unit = js.native
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

