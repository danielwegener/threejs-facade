package org.denigma.threejs.extras.geometries

import org.denigma.threejs.core.{Face3, Geometry}
import org.denigma.threejs.extras.core.{Font, Path, Shape}
import org.denigma.threejs.math.{Vector2, Vector3}

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSName

/**
 * BoxGeometry is the quadrilateral primitive geometry class. It is typically used for creating a cube or irregular
 * quadrilateral of the dimensions provided with the 'width', 'height', and 'depth' constructor arguments.
 *
 * {{{
 * var geometry = new THREE.BoxGeometry( 1, 1, 1 );
 * var material = new THREE.MeshBasicMaterial( {color: 0x00ff00} );
 * var cube = new THREE.Mesh( geometry, material );
 * scene.add( cube );
 * }}}
 * @param width          Width of the sides on the X axis.
 * @param height         Height of the sides on the Y axis.
 * @param depth          Depth of the sides on the Z axis.
 * @param widthSegments  Optional. Number of segmented faces along the width of the sides. Default is 1.
 * @param heightSegments Optional. Number of segmented faces along the height of the sides. Default is 1.
 * @param depthSegments  Optional. Number of segmented faces along the depth of the sides. Default is 1.
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/BoxGeometry]]
 */
@js.native
@JSName("THREE.BoxGeometry")
class BoxGeometry(width: Double, height: Double, depth: Double, widthSegments: Double = js.native,
    heightSegments: Double = js.native, depthSegments: Double = js.native) extends Geometry {
  /**
   * Using the above example code above as our basis:
   * {{{
   * geometry.parameters; // outputs an object {width: 1, height: 1, depth: 1, widthSegments: undefined, heightSegments: undefined}
   * cube.geometry.parameters; // as above
   * cube.geometry.parameters.width; // === 1
   * cube.geometry.parameters.widthSegments // === undefined.
   * }}}
   */
  var parameters: js.Any = js.native
}

/**
 * CircleGeometry is a simple shape of Euclidean geometry. It is contructed from a number of triangular segments
 * that are oriented around a central point and extend as far out as a given radius. It is built counter-clockwise
 * from a start angle and a given central angle. It can also be used to create regular polygons, where the number
 * of segments determines the number of sides.
 *
 * @param radius      Radius of the circle, default = 50.
 * @param segments    Number of segments (triangles), minimum = 3, default = 8.
 * @param thetaStart  Start angle for first segment, default = 0 (three o'clock position).
 * @param thetaLength The central angle, often called theta, of the circular sector. The default is 2*Pi, which makes for a complete circle.
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/CircleGeometry]]
 */
@js.native
@JSName("THREE.CircleGeometry")
class CircleGeometry(var radius: Double = js.native, var segments: Int = js.native,
    var thetaStart: Double = js.native, var thetaLength: Double = js.native) extends Geometry


/**
 * A class for generating cylinder geometries
 * @param radiusTop      Radius of the cylinder at the top. Default is 20.
 * @param radiusBottom   Radius of the cylinder at the bottom. Default is 20.
 * @param height         Height of the cylinder. Default is 100.
 * @param radiusSegments Number of segmented faces around the circumference of the cylinder. Default is 8
 * @param heightSegments Number of rows of faces along the height of the cylinder. Default is 1.
 * @param openEnded      A Boolean indicating whether the ends of the cylinder are open or capped. Default is false, meaning capped.
 * @param thetaStart     Start angle for first segment, default = 0 (three o'clock position).
 * @param thetaLength    The central angle, often called theta, of the circular sector. The default is 2*Pi, which makes for a complete cylinder.
 *
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/CylinderGeometry]]
 */
@js.native
@JSName("THREE.CylinderGeometry")
class CylinderGeometry(var radiusTop: Double = js.native, var radiusBottom: Double = js.native,
    var height: Double = js.native, var radiusSegments: Double = js.native,
    var heightSegments: Double = js.native, var openEnded: Boolean = js.native,
    var thetaStart: Double = js.native, thetaLength: Double = js.native) extends Geometry

/**
 * A class for generating a dodecahedron geometries.
 * @param radius Radius of the dodecahedron. Default is 1.
 * @param detail Default is 0. Setting this to a value greater than 0 adds vertices making it no longer a dodecahedron.
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/DodecahedronGeometry]]
 */
@js.native
@JSName("THREE.DodecahedronGeometry")
class DodecahedronGeometry(var radius: Double = js.native, var detail: Double = js.native) extends PolyhedronGeometry

@js.native
trait ExtrudeGeometryOptions extends js.Any {
  /** number of points on the curves */
  var curveSegments: Int
  /** . number of points used for subdividing segements of extrude spline */
  var steps: Int
  /** . Depth to extrude the shape */
  var amount: Int
  /** . turn on bevel */
  var bevelEnabled: Boolean
  /** . how deep into the original shape bevel goes */
  var bevelThickness: Double
  /** . how far from shape outline is bevel */
  var bevelSize: Double
  /** . number of bevel layers */
  var bevelSegments: Int
  /** THREE.CurvePath. 3d spline path to extrude shape along. (creates Frames if (frames aren't defined) */
  var extrudePath: js.Any
  /** .TubeGeometry.FrenetFrames. containing arrays of tangents, normals, binormals */
  var frames: TubeGeometry.FrenetFrames
  /** . material index for front and back faces */
  var material: Int
  /** . material index for extrusion and beveled faces */
  var extrudeMaterial: Int
  /** . object that provides UV generator functions */
  var uvGenerator: js.Any
}

/**
 * Creates extruded geometry from a path shape
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/ExtrudeGeometry]]
 */
@js.native
@JSName("THREE.ExtrudeGeometry")
class ExtrudeGeometry extends Geometry {

  /** This object extrudes an 2D shape to an 3D geometry. */
  def this(shape: Shape | js.Array[Shape], options: ExtrudeGeometryOptions = js.native) = this()

  /**
   * Adds the shapes to the list to extrude.
   * @param shapes  An Array of shapes to add.
   * @param options Object that can contain the following [[ExtrudeGeometryOptions]].
   */
  def addShapeList(shapes: js.Array[Shape], options: ExtrudeGeometryOptions = js.native): Unit = js.native

  /**
   * Add the shape to the list to extrude.
   * @param shape   A shape to add.
   * @param options Object that can contain the following [[ExtrudeGeometryOptions]].
   */
  def addShape(shape: Shape, options: ExtrudeGeometryOptions = js.native): Unit = js.native
}

/**
 * A class for generating an icosahedron geometry.
 * @param radius Default is 1.
 * @param detail Default is 0. Setting this to a value greater than 0 adds more vertices making it no
 *               longer an icosahedron. When detail is greater than 1, it's effectively a sphere.
 *
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/IcosahedronGeometry]]
 */
@js.native
@JSName("THREE.IcosahedronGeometry")
class IcosahedronGeometry(var radius: Double = js.native, var detail: Double = js.native) extends PolyhedronGeometry

/**
 * Class for generating meshes with axial symmetry. Possible uses include donuts, pipes, vases etc.
 * The lathe rotate around the Y axis.
 *
 * @param points    Array of [[Vector2]]s.
 * @param segments  the number of circumference segments to generate. Default is 12.
 * @param phiStart  the starting angle in radians. Default is 0.
 * @param phiLength the radian (0 to 2PI) range of the lathed section 2PI is a closed lathe, less than 2PI is a portion. Default is 2*PI
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/LatheGeometry]]
 */
@js.native
@JSName("THREE.LatheGeometry")
class LatheGeometry(points: js.Array[Vector2], segments: Double = js.native,
    phiStart: Double = js.native, phiLength: Double = js.native) extends Geometry

/**
 * A class for generating an octahedron geometry.
 * @param radius Radius of the octahedron. Default is 1.
 * @param detail Default is 0. Setting this to a value greater than zero add vertices making it no longer an octahedron.
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/OctahedronGeometry]]
 */
@js.native
@JSName("THREE.OctahedronGeometry")
class OctahedronGeometry(radius: Double = js.native, detail: Double = js.native) extends PolyhedronGeometry

/**
 * Generate geometry representing a parametric surface.
 * @param func   A function that takes in a u and v value each between 0 and 1 and returns a Vector3
 * @param slices The count of slices to use for the parametric function
 * @param stacks The count of stacks to use for the parametric function
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/ParametricGeometry]]
 */
@js.native
@JSName("THREE.ParametricGeometry")
class ParametricGeometry(func: js.Function2[Double, Double, Vector3], slices: Double, stacks: Double, useTris: Boolean = js.native) extends Geometry

/**
 * A class for generating plane geometries
 * @param width          Width along the X axis.
 * @param height         Height along the Y axis.
 * @param widthSegments  Optional. Default is 1.
 * @param heightSegments Optional. Default is 1.
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/PlaneGeometry]]
 */
@js.native
@JSName("THREE.PlaneGeometry")
class PlaneGeometry(var width: Double, var height: Double,
    var widthSegments: Double = js.native, var heightSegments: Double = js.native) extends Geometry

/**
 * A polyhedron is a solid in three dimensions with flat faces. This class will take an array of vertices,
 * project them onto a sphere, and then divide them up to the desired level of detail.
 * This class is used by [[DodecahedronGeometry]], [[IcosahedronGeometry]], [[OctahedronGeometry]], and [[TetrahedronGeometry]]
 * to generate their respective geometries.
 *
 *
 */
@js.native
@JSName("THREE.PolyhedronGeometry")
class PolyhedronGeometry extends Geometry {
  def this(vertices: js.Array[Vector3], faces: js.Array[Face3], radius: Double = js.native, detail: Double = js.native) = this()

  /** An object with all of the parameters that were used to generate the geometry. */
  var parameters: js.Any = js.native

}

/**
 * A class for generating a two-dimensional ring geometry.
 * @param innerRadius   Default is 0, but it doesn't work right when innerRadius is set to 0.
 * @param outerRadius   Default is 50.
 * @param thetaSegments Number of segments. A higher number means the ring will be more round. Minimum is 3. Default is 8.
 * @param phiSegments   Minimum is 1. Default is 8.
 * @param thetaStart    Starting angle. Default is 0.
 * @param thetaLength   Central angle. Default is Math.PI * 2.
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/RingGeometry]]
 */
@js.native
@JSName("THREE.RingGeometry")
class RingGeometry(var innerRadius: Double = js.native, var outerRadius: Double = js.native,
    var thetaSegments: Double = js.native, var phiSegments: Double = js.native,
    var thetaStart: Double = js.native, var thetaLength: Double = js.native) extends Geometry {

  /** An object with all of the parameters that were used to generate the geometry. */
  var parameters: js.Any = js.native
}

@js.native
trait ShapeGeometryOptions extends js.Object {
  /** Not used at the moment - defaults to 12 */
  var curveSegments: Int = js.native
  /** index of the material in a material list */
  var material: Int = js.native
  /** A UV generator, defaults to ExtrudeGeometry's WorldUVGenerator */
  var UVGenerator: js.Any = js.native
}

/**
 * Creates a one-sided polygonal geometry from one or more path shapes. Similar to ExtrudeGeometry
 * @param shapes  Array of shapes, or a single shape
 * @param options Optional options object
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/ShapeGeometry]]
 */
@js.native
@JSName("THREE.ShapeGeometry")
class ShapeGeometry(shapes: Shape | js.Array[Shape], options: ShapeGeometryOptions = js.native) extends Geometry {
  /**
   * Adds a list of shapes to the geometry.
   * @param shapes  Array of shapes
   * @param options See options in constructor
   */
  def addShapeList(shapes: js.Array[Shape], options: js.Any = js.native): ShapeGeometry = js.native

  /**
   * Adds a single shape to the geometry
   * @param shape   Shape
   * @param options See options in constructor
   */
  def addShape(shape: Shape, options: js.Any = js.native): Unit = js.native
}

/**
 * A class for generating sphere geometries
 * @param radius         sphere radius. Default is 50.
 * @param widthSegments  number of horizontal segments. Minimum value is 3, and the default is 8.
 * @param heightSegments number of vertical segments. Minimum value is 2, and the default is 6.
 * @param phiStart       specify horizontal starting angle. Default is 0.
 * @param phiLength      specify horizontal sweep angle size. Default is Math.PI * 2.
 * @param thetaStart     specify vertical starting angle. Default is 0.
 * @param thetaLength    specify vertical sweep angle size. Default is Math.PI.
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/SphereGeometry]]
 */
@js.native
@JSName("THREE.SphereGeometry")
class SphereGeometry(var radius: Double, var widthSegments: Double = js.native,
    var heightSegments: Double = js.native, var phiStart: Double = js.native,
    var phiLength: Double = js.native, var thetaStart: Double = js.native,
    var thetaLength: Double = js.native) extends Geometry


/**
 * A class for generating a tetrahedron geometries.
 * @param radius Radius of the tetrahedron. Default is 1.
 * @param detail Default is 0. Setting this to a value greater than 0 adds vertices making it no longer a tetrahedron.
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/TetrahedronGeometry]]
 */
@js.native
@JSName("THREE.TetrahedronGeometry")
class TetrahedronGeometry(radius: Double = js.native, detail: Double = js.native) extends PolyhedronGeometry

@js.native
@JSName("THREE.TextGeometry")
class TextGeometry extends ExtrudeGeometry {
  def this(text: String, TextGeometryParameters: TextGeometryParameters = js.native) = this()
}

@js.native
trait TextGeometryParameters extends js.Object {
  var font: Font = js.native
  /** Size of the text. */
  var size: Double = js.native
  /** Thickness to extrude text. Default is 50. */
  var height: Double = js.native
  /** Number of points on the curves. Default is 12. */
  var curveSegments: Double = js.native
  /** Turn on bevel. Default is False. */
  var bevelEnabled: Boolean = js.native
  /** How deep into text bevel goes. Default is 10. */
  var bevelThickness: Double = js.native
  /** How far from text outline is bevel. Default is 8. */
  var bevelSize: Double = js.native
}

/**
 * A class for generating torus geometries
 * @param radius          Default is 100.
 * @param tube            Diameter of the tube. Default is 40.
 * @param radialSegments  Default is 8
 * @param tubularSegments Default is 6.
 * @param arc             Central angle. Default is Math.PI * 2.
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/TorusGeometry]]
 */
@js.native
@JSName("THREE.TorusGeometry")
class TorusGeometry(var radius: Double = js.native, var tube: Double = js.native,
    var radialSegments: Double = js.native, var tubularSegments: Double = js.native,
    var arc: Double = js.native) extends Geometry

/**
 * Creates a torus knot, the particular shape of which is defined by a pair of coprime integers, p and q.
 * If p and q are not coprime, the result will be a torus link.
 * @param radius          Default is 100.
 * @param tube            Default is 40.
 * @param radialSegments  Default is 64.
 * @param tubularSegments Default is 8.
 * @param p               Default is 2.
 * @param q               Default is 3.
 * @param heightScale     Default is 1.
 * @see
 */
@js.native
@JSName("THREE.TorusKnotGeometry")
class TorusKnotGeometry(var radius: Double = js.native, var tube: Double = js.native,
    var radialSegments: Double = js.native, var tubularSegments: Double = js.native,
    var p: Double = js.native, var q: Double = js.native, var heightScale: Double = js.native) extends Geometry

/**
 * Creates a tube that extrudes along a 3d curve
 *
 * @param path           Curve - A path that inherits from the Curve base class
 * @param segments       Integer - The number of segments that make up the tube, default is 64
 * @param radius         Float - The radius of the tube, default is 1
 * @param radiusSegments Integer - The number of segments that make up the cross-section, default is 8
 * @param closed         Float Is the tube open or closed, default is false
 *
 * @see [[http://threejs.org/docs/#Reference/Extras.Geometries/TubeGeometry]]
 */
@js.native
@JSName("THREE.TubeGeometry")
class TubeGeometry(path: Path, segments: Double = js.native, radius: Double = js.native,
    radiusSegments: Double = js.native, closed: Boolean = js.native) extends Geometry {
  /** An object with all of the parameters that were used to generate the geometry. */
  var parameters: js.Any = js.native
  /** An array of Vector3 tangents */
  var tangents: js.Array[Vector3] = js.native
  /** An array of Vector3 normals */
  var normals: js.Array[Vector3] = js.native
  /** An array of Vector3 binormals */
  var binormals: js.Array[Vector3] = js.native

}

object TubeGeometry {

  /**
   * A static method that generates the Frenet Frames. This is internally run on any new TubeGeometry and then
   * the generated tangents, normals, and binormals are exposed as properties on the TubeGeometry object.
   *
   * @param path     A path that inherits from the Curve base class
   * @param segments The number of segments that make up the tube
   * @param closed   Is the tube open or closed
   */
  @js.native
  @JSName("THREE.TubeGeometry.FrenetFrames")
  class FrenetFrames(path: Path, segments: Double, closed: Boolean) extends js.Any

}
