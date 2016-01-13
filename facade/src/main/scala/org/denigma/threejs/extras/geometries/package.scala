package org.denigma.threejs.extras.geometries

import org.denigma.threejs.core.{ Face3, Geometry }
import org.denigma.threejs.extras.core.{ Path, Shape }
import org.denigma.threejs.math.Vector3

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.BoxGeometry")
class BoxGeometry extends Geometry {
  def this(width: Double, height: Double, depth: Double, widthSegments: Double = js.native, heightSegments: Double = js.native, depthSegments: Double = js.native) = this()
  var parameters: js.Any = js.native
  var widthSegments: Double = js.native
  var heightSegments: Double = js.native
  var depthSegments: Double = js.native
}

@js.native
@JSName("THREE.CircleGeometry")
class CircleGeometry extends Geometry {
  def this(radius: Double = js.native, segments: Double = js.native, thetaStart: Double = js.native, thetaLength: Double = js.native) = this()
  var parameters: js.Any = js.native
  var radius: Double = js.native
  var segments: Double = js.native
  var thetaStart: Double = js.native
  var thetaLength: Double = js.native
}

@js.native
@JSName("THREE.CubeGeometry")
class CubeGeometry extends BoxGeometry {
}

@js.native
@JSName("THREE.CylinderGeometry")
class CylinderGeometry extends Geometry {
  def this(radiusTop: Double = js.native, radiusBottom: Double = js.native, height: Double = js.native, radiusSegments: Double = js.native, heightSegments: Double = js.native, openEnded: Boolean = js.native) = this()
  var parameters: js.Any = js.native
  var radiusTop: Double = js.native
  var radiusBottom: Double = js.native
  var height: Double = js.native
  var radialSegments: Double = js.native
  var heightSegments: Double = js.native
  var openEnded: Boolean = js.native
}

@js.native
@JSName("THREE.ExtrudeGeometry")
class ExtrudeGeometry extends Geometry {
  def this(shape: Shape) = this()
  def this(shape: Shape, options: js.Any) = this()
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: js.Array[Shape], options: js.Any) = this()

  def addShapeList(shapes: js.Array[Shape], options: js.Any = js.native): Unit = js.native
  def addShape(shape: Shape, options: js.Any = js.native): Unit = js.native
}

@js.native
@JSName("THREE.IcosahedronGeometry")
class IcosahedronGeometry extends PolyhedronGeometry {
  def this(radius: Double, detail: Double) = this()
  var parameters: js.Any = js.native
  var radius: Double = js.native
  var detail: Double = js.native
}

@js.native
@JSName("THREE.LatheGeometry")
class LatheGeometry extends Geometry {
  def this(points: js.Array[Vector3], segments: Double = js.native, phiStart: Double = js.native, phiLength: Double = js.native) = this()
}

@js.native
@JSName("THREE.OctahedronGeometry")
class OctahedronGeometry extends PolyhedronGeometry {
  def this(radius: Double, detail: Double) = this()
  var parameters: js.Any = js.native
  var radius: Double = js.native
  var detail: Double = js.native
}

@js.native
@JSName("THREE.ParametricGeometry")
class ParametricGeometry extends Geometry {
  def this(func: js.Function2[Double, Double, Vector3], slices: Double, stacks: Double, useTris: Boolean = js.native) = this()
}

@js.native
@JSName("THREE.PlaneGeometry")
class PlaneGeometry extends Geometry {
  def this(width: Double, height: Double, widthSegments: Double = js.native, heightSegments: Double = js.native) = this()
  var parameters: js.Any = js.native
  var width: Double = js.native
  var height: Double = js.native
  var widthSegments: Double = js.native
  var heightSegments: Double = js.native
}

@js.native
@JSName("THREE.PolyhedronGeometry")
class PolyhedronGeometry extends Geometry {
  def this(vertices: js.Array[Vector3], faces: js.Array[Face3], radius: Double = js.native, detail: Double = js.native) = this()
}

@js.native
@JSName("THREE.RingGeometry")
class RingGeometry extends Geometry {
  def this(innerRadius: Double = js.native, outerRadius: Double = js.native, thetaSegments: Double = js.native, phiSegments: Double = js.native, thetaStart: Double = js.native, thetaLength: Double = js.native) = this()
}

@js.native
@JSName("THREE.ShapeGeometry")
class ShapeGeometry extends Geometry {
  def this(shape: Shape) = this()
  def this(shape: Shape, options: js.Any) = this()

  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: js.Array[Shape], options: js.Any) = this()

  def addShapeList(shapes: js.Array[Shape], options: js.Any): ShapeGeometry = js.native
  def addShape(shape: Shape, options: js.Any = js.native): Unit = js.native
}

@js.native
@JSName("THREE.SphereGeometry")
class SphereGeometry extends Geometry {
  def this(radius: Double, widthSegments: Double = js.native, heightSegments: Double = js.native, phiStart: Double = js.native, phiLength: Double = js.native, thetaStart: Double = js.native, thetaLength: Double = js.native) = this()
  var parameters: js.Any = js.native
  var radius: Double = js.native
  var widthSegments: Double = js.native
  var heightSegments: Double = js.native
  var phiStart: Double = js.native
  var phiLength: Double = js.native
  var thetaStart: Double = js.native
  var thetaLength: Double = js.native
}

@js.native
@JSName("THREE.TetrahedronGeometry")
class TetrahedronGeometry extends PolyhedronGeometry {
  def this(radius: Double = js.native, detail: Double = js.native) = this()
}

@js.native
@JSName("THREE.TorusGeometry")
class TorusGeometry extends Geometry {
  def this(radius: Double = js.native, tube: Double = js.native, radialSegments: Double = js.native, tubularSegments: Double = js.native, arc: Double = js.native) = this()
  var parameters: js.Any = js.native
  var radius: Double = js.native
  var tube: Double = js.native
  var radialSegments: Double = js.native
  var tubularSegments: Double = js.native
  var arc: Double = js.native
}

@js.native
@JSName("THREE.TorusKnotGeometry")
class TorusKnotGeometry extends Geometry {
  def this(radius: Double = js.native, tube: Double = js.native, radialSegments: Double = js.native, tubularSegments: Double = js.native, p: Double = js.native, q: Double = js.native, heightScale: Double = js.native) = this()
  var parameters: js.Any = js.native
  var radius: Double = js.native
  var tube: Double = js.native
  var radialSegments: Double = js.native
  var tubularSegments: Double = js.native
  var p: Double = js.native
  var q: Double = js.native
  var heightScale: Double = js.native
}

@js.native
@JSName("THREE.TubeGeometry")
class TubeGeometry extends Geometry {
  def this(path: Path, segments: Double = js.native, radius: Double = js.native, radiusSegments: Double = js.native, closed: Boolean = js.native) = this()
  var parameters: js.Any = js.native
  var path: Path = js.native
  var segments: Double = js.native
  var radius: Double = js.native
  var radialSegments: Double = js.native
  var closed: Boolean = js.native
  var tangents: js.Array[Vector3] = js.native
  var normals: js.Array[Vector3] = js.native
  var binormals: js.Array[Vector3] = js.native
  def FrenetFrames(path: Path, segments: Double, closed: Boolean): Unit = js.native
}