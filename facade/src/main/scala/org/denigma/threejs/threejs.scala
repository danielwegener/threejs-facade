package org.denigma.threejs

import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core._
import org.denigma.threejs.extras.core.{Font, Shape, Path, Curve}
import org.denigma.threejs.extras.geometries.ExtrudeGeometry
import org.denigma.threejs.lights.Light
import org.denigma.threejs.loaders.LoadingManager
import org.denigma.threejs.materials.{ MaterialParameters, MeshBasicMaterial, Material }
import org.denigma.threejs.objects.{ Bone, Mesh }
import org.denigma.threejs.renderers.WebGLRenderer
import org.denigma.threejs.scenes.Scene
import org.denigma.threejs.math._
import org.denigma.threejs.textures.Texture
import org.scalajs.dom.raw.HTMLCanvasElement

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSName("THREE")
object THREE extends js.Object {

  //todo: Add type aliases like the ones below to better support copy&paste for examples
  type AmbientLight = lights.AmbientLight
  type DirectionalLight = lights.DirectionalLight

  var REVISION: String = js.native
  var CullFaceNone: CullFace = js.native
  var CullFaceBack: CullFace = js.native
  var CullFaceFront: CullFace = js.native
  var CullFaceFrontBack: CullFace = js.native
  val DefaultLoadingManager: LoadingManager = js.native
  var FrontFaceDirectionCW: FrontFaceDirection = js.native
  var FrontFaceDirectionCCW: FrontFaceDirection = js.native
  var BasicShadowMap: ShadowMapType = js.native
  var PCFShadowMap: ShadowMapType = js.native
  var PCFSoftShadowMap: ShadowMapType = js.native
  val FrontSide: Side = js.native
  val BackSide: Side = js.native
  val DoubleSide: Side = js.native
  val NoShading: Shading = js.native
  val FlatShading: Shading = js.native
  val SmoothShading: Shading = js.native
  var NoColors: Colors = js.native
  var FaceColors: Colors = js.native
  var VertexColors: Colors = js.native
  var NoBlending: Blending = js.native
  var NormalBlending: Blending = js.native
  var AdditiveBlending: Blending = js.native
  var SubtractiveBlending: Blending = js.native
  var MultiplyBlending: Blending = js.native
  var CustomBlending: Blending = js.native
  var AddEquation: BlendingEquation = js.native
  var SubtractEquation: BlendingEquation = js.native
  var ReverseSubtractEquation: BlendingEquation = js.native
  var ZeroFactor: BlendingDstFactor = js.native
  var OneFactor: BlendingDstFactor = js.native
  var SrcColorFactor: BlendingDstFactor = js.native
  var OneMinusSrcColorFactor: BlendingDstFactor = js.native
  var SrcAlphaFactor: BlendingDstFactor = js.native
  var OneMinusSrcAlphaFactor: BlendingDstFactor = js.native
  var DstAlphaFactor: BlendingDstFactor = js.native
  var OneMinusDstAlphaFactor: BlendingDstFactor = js.native
  var DstColorFactor: BlendingSrcFactor = js.native
  var OneMinusDstColorFactor: BlendingSrcFactor = js.native
  var SrcAlphaSaturateFactor: BlendingSrcFactor = js.native
  var MultiplyOperation: Combine = js.native
  var MixOperation: Combine = js.native
  var AddOperation: Combine = js.native
  var UVMapping: MappingConstructor = js.native
  var CubeReflectionMapping: MappingConstructor = js.native
  var CubeRefractionMapping: MappingConstructor = js.native
  var SphericalReflectionMapping: MappingConstructor = js.native
  var SphericalRefractionMapping: MappingConstructor = js.native
  var RepeatWrapping: Wrapping = js.native
  var ClampToEdgeWrapping: Wrapping = js.native
  var MirroredRepeatWrapping: Wrapping = js.native
  var NearestFilter: TextureFilter = js.native
  var NearestMipMapNearestFilter: TextureFilter = js.native
  var NearestMipMapLinearFilter: TextureFilter = js.native
  var LinearFilter: TextureFilter = js.native
  var LinearMipMapNearestFilter: TextureFilter = js.native
  var LinearMipMapLinearFilter: TextureFilter = js.native
  var UnsignedByteType: TextureDataType = js.native
  var ByteType: TextureDataType = js.native
  var ShortType: TextureDataType = js.native
  var UnsignedShortType: TextureDataType = js.native
  var IntType: TextureDataType = js.native
  var UnsignedIntType: TextureDataType = js.native
  var FloatType: TextureDataType = js.native
  var UnsignedShort4444Type: PixelType = js.native
  var UnsignedShort5551Type: PixelType = js.native
  var UnsignedShort565Type: PixelType = js.native
  var AlphaFormat: PixelFormat = js.native
  var RGBFormat: PixelFormat = js.native
  var RGBAFormat: PixelFormat = js.native
  var LuminanceFormat: PixelFormat = js.native
  var LuminanceAlphaFormat: PixelFormat = js.native
  var RGB_S3TC_DXT1_Format: CompressedPixelFormat = js.native
  var RGBA_S3TC_DXT1_Format: CompressedPixelFormat = js.native
  var RGBA_S3TC_DXT3_Format: CompressedPixelFormat = js.native
  var RGBA_S3TC_DXT5_Format: CompressedPixelFormat = js.native
  var Math: Math = js.native
  var LineStrip: LineType = js.native
  var LinePieces: LineType = js.native
  var ShaderChunk: ShaderChunk = js.native
}

@js.native
sealed trait CullFace extends js.Object {
}

@js.native
@JSName("THREE.CullFace")
object CullFace extends js.Object {
  @JSBracketAccess
  def apply(value: CullFace): String = js.native
}

@js.native
sealed trait FrontFaceDirection extends js.Object {
}

@js.native
@JSName("THREE.FrontFaceDirection")
object FrontFaceDirection extends js.Object {
  @JSBracketAccess
  def apply(value: FrontFaceDirection): String = js.native
}

@js.native
sealed trait ShadowMapType extends js.Object {
}

@js.native
@JSName("THREE.ShadowMapType")
object ShadowMapType extends js.Object {
  @JSBracketAccess
  def apply(value: ShadowMapType): String = js.native
}

@js.native
sealed trait Shading extends js.Object {
}

@js.native
@JSName("THREE.Shading")
object Shading extends js.Object {
  @JSBracketAccess
  def apply(value: Shading): String = js.native
}

@js.native
sealed trait Colors extends js.Object {
}

@js.native
@JSName("THREE.Colors")
object Colors extends js.Object {
  @JSBracketAccess
  def apply(value: Colors): String = js.native
}

@js.native
sealed trait Blending extends js.Object {
}

@js.native
@JSName("THREE.Blending")
object Blending extends js.Object {
  @JSBracketAccess
  def apply(value: Blending): String = js.native
}

@js.native
sealed trait BlendingEquation extends js.Object {
}

@js.native
@JSName("THREE.BlendingEquation")
object BlendingEquation extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingEquation): String = js.native
}

@js.native
sealed trait BlendingDstFactor extends js.Object {
}

@js.native
@JSName("THREE.BlendingDstFactor")
object BlendingDstFactor extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingDstFactor): String = js.native
}

@js.native
sealed trait BlendingSrcFactor extends js.Object {
}

@js.native
@JSName("THREE.BlendingSrcFactor")
object BlendingSrcFactor extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingSrcFactor): String = js.native
}

@js.native
sealed trait Combine extends js.Object {
}

@js.native
@JSName("THREE.Combine")
object Combine extends js.Object {
  @JSBracketAccess
  def apply(value: Combine): String = js.native
}

@js.native
sealed trait Mapping extends js.Object {
}

@js.native
@JSName("THREE.Mapping")
object Mapping extends js.Object {
  @JSBracketAccess
  def apply(value: Mapping): String = js.native
}

@js.native
trait MappingConstructor extends js.Object {
  /* js.native ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Mapping),List())))) */
}

@js.native
sealed trait Wrapping extends js.Object {
}

@js.native
@JSName("THREE.Wrapping")
object Wrapping extends js.Object {
  @JSBracketAccess
  def apply(value: Wrapping): String = js.native
}

@js.native
sealed trait TextureFilter extends js.Object {
}

@js.native
@JSName("THREE.TextureFilter")
object TextureFilter extends js.Object {
  @JSBracketAccess
  def apply(value: TextureFilter): String = js.native
}

@js.native
sealed trait TextureDataType extends js.Object {
}

@js.native
@JSName("THREE.TextureDataType")
object TextureDataType extends js.Object {
  @JSBracketAccess
  def apply(value: TextureDataType): String = js.native
}

@js.native
sealed trait PixelType extends js.Object {
}

@js.native
@JSName("THREE.PixelType")
object PixelType extends js.Object {
  @JSBracketAccess
  def apply(value: PixelType): String = js.native
}

@js.native
sealed trait PixelFormat extends js.Object {
}

@js.native
@JSName("THREE.PixelFormat")
object PixelFormat extends js.Object {
  @JSBracketAccess
  def apply(value: PixelFormat): String = js.native
}

@js.native
sealed trait CompressedPixelFormat extends js.Object {
}

@js.native
@JSName("THREE.CompressedPixelFormat")
object CompressedPixelFormat extends js.Object {
  @JSBracketAccess
  def apply(value: CompressedPixelFormat): String = js.native
}

@js.native
trait MorphTarget extends js.Object {
  var name: String = js.native
  var vertices: js.Array[Vector3] = js.native
}

@js.native
trait MorphColor extends js.Object {
  var name: String = js.native
  var colors: js.Array[Color] = js.native
}

@js.native
trait MorphNormals extends js.Object {
  var name: String = js.native
  var normals: js.Array[Vector3] = js.native
}

@ScalaJSDefined
trait BoundingBox3D extends js.Object {
  var min: Vector3
  var max: Vector3
}

@js.native
trait BoundingSphere extends js.Object {
  var radius: Double = js.native
}

/**
  * @see [[http://threejs.org/docs/#Reference/Core/Raycaster.intersectObject]]
  */
@js.native
trait Intersection extends js.Object {
  /** distance between the origin of the ray and the intersection */
  var distance: Double = js.native
  /** point of intersection, in world coordinates */
  var point: Vector3 = js.native
  /** intersected face */
  var face: Face3 = js.native
  /**  index of the intersected face */
  var faceIndex: Int = js.native
  /** indices of vertices comprising the intersected face */
  var indices: Array[Int] = js.native
  /** the intersected object */
  var `object`: Object3D = js.native
}

@js.native
@JSName("THREE.AreaLight")
class AreaLight extends Light {
  def this(hex: Double, intensity: Double = js.native) = this()
  var normal: Vector3 = js.native
  var right: Vector3 = js.native
  var intensity: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var constantAttenuation: Double = js.native
  var linearAttenuation: Double = js.native
  var quadraticAttenuation: Double = js.native
}

@js.native
trait PointCloudMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var map: Texture = js.native
  var size: Double = js.native
  var sizeAttenuation: Boolean = js.native
  var vertexColors: Colors = js.native
  var fog: Boolean = js.native
}

@js.native
@JSName("THREE.PointCloudMaterial")
class PointCloudMaterial extends Material {
  def this(parameters: PointCloudMaterialParameters = js.native) = this()
  var color: Color = js.native
  var map: Texture = js.native
  var size: Double = js.native
  var sizeAttenuation: Boolean = js.native
  var vertexColors: Boolean = js.native
  var fog: Boolean = js.native
  override def clone(): PointCloudMaterial = js.native
}

@js.native
@JSName("THREE.ParticleBasicMaterial")
class ParticleBasicMaterial extends PointCloudMaterial {
}

@js.native
@JSName("THREE.ParticleSystemMaterial")
class ParticleSystemMaterial extends PointCloudMaterial {
}

@js.native
trait SpriteCanvasMaterialParameters extends MaterialParameters {
  var color: Double = js.native
}

@js.native
@JSName("THREE.SpriteCanvasMaterial")
class SpriteCanvasMaterial extends Material {
  def this(parameters: SpriteCanvasMaterialParameters = js.native) = this()
  var color: Color = js.native
  def program(context: js.Any, color: Color): Unit = js.native
  override def clone(): SpriteCanvasMaterial = js.native
}

@js.native
trait HSL extends js.Object {
  var h: Double = js.native
  var s: Double = js.native
  var l: Double = js.native
}

@js.native
@JSName("THREE.ColorKeywords")
class ColorKeywords extends js.Object {
}

@js.native
@JSName("THREE.ColorKeywords")
object ColorKeywords extends js.Object {
  var aliceblue: Double = js.native
  var antiquewhite: Double = js.native
  var aqua: Double = js.native
  var aquamarine: Double = js.native
  var azure: Double = js.native
  var beige: Double = js.native
  var bisque: Double = js.native
  var black: Double = js.native
  var blanchedalmond: Double = js.native
  var blue: Double = js.native
  var blueviolet: Double = js.native
  var brown: Double = js.native
  var burlywood: Double = js.native
  var cadetblue: Double = js.native
  var chartreuse: Double = js.native
  var chocolate: Double = js.native
  var coral: Double = js.native
  var cornflowerblue: Double = js.native
  var cornsilk: Double = js.native
  var crimson: Double = js.native
  var cyan: Double = js.native
  var darkblue: Double = js.native
  var darkcyan: Double = js.native
  var darkgoldenrod: Double = js.native
  var darkgray: Double = js.native
  var darkgreen: Double = js.native
  var darkgrey: Double = js.native
  var darkkhaki: Double = js.native
  var darkmagenta: Double = js.native
  var darkolivegreen: Double = js.native
  var darkorange: Double = js.native
  var darkorchid: Double = js.native
  var darkred: Double = js.native
  var darksalmon: Double = js.native
  var darkseagreen: Double = js.native
  var darkslateblue: Double = js.native
  var darkslategray: Double = js.native
  var darkslategrey: Double = js.native
  var darkturquoise: Double = js.native
  var darkviolet: Double = js.native
  var deeppink: Double = js.native
  var deepskyblue: Double = js.native
  var dimgray: Double = js.native
  var dimgrey: Double = js.native
  var dodgerblue: Double = js.native
  var firebrick: Double = js.native
  var floralwhite: Double = js.native
  var forestgreen: Double = js.native
  var fuchsia: Double = js.native
  var gainsboro: Double = js.native
  var ghostwhite: Double = js.native
  var gold: Double = js.native
  var goldenrod: Double = js.native
  var gray: Double = js.native
  var green: Double = js.native
  var greenyellow: Double = js.native
  var grey: Double = js.native
  var honeydew: Double = js.native
  var hotpink: Double = js.native
  var indianred: Double = js.native
  var indigo: Double = js.native
  var ivory: Double = js.native
  var khaki: Double = js.native
  var lavender: Double = js.native
  var lavenderblush: Double = js.native
  var lawngreen: Double = js.native
  var lemonchiffon: Double = js.native
  var lightblue: Double = js.native
  var lightcoral: Double = js.native
  var lightcyan: Double = js.native
  var lightgoldenrodyellow: Double = js.native
  var lightgray: Double = js.native
  var lightgreen: Double = js.native
  var lightgrey: Double = js.native
  var lightpink: Double = js.native
  var lightsalmon: Double = js.native
  var lightseagreen: Double = js.native
  var lightskyblue: Double = js.native
  var lightslategray: Double = js.native
  var lightslategrey: Double = js.native
  var lightsteelblue: Double = js.native
  var lightyellow: Double = js.native
  var lime: Double = js.native
  var limegreen: Double = js.native
  var linen: Double = js.native
  var magenta: Double = js.native
  var maroon: Double = js.native
  var mediumaquamarine: Double = js.native
  var mediumblue: Double = js.native
  var mediumorchid: Double = js.native
  var mediumpurple: Double = js.native
  var mediumseagreen: Double = js.native
  var mediumslateblue: Double = js.native
  var mediumspringgreen: Double = js.native
  var mediumturquoise: Double = js.native
  var mediumvioletred: Double = js.native
  var midnightblue: Double = js.native
  var mintcream: Double = js.native
  var mistyrose: Double = js.native
  var moccasin: Double = js.native
  var navajowhite: Double = js.native
  var navy: Double = js.native
  var oldlace: Double = js.native
  var olive: Double = js.native
  var olivedrab: Double = js.native
  var orange: Double = js.native
  var orangered: Double = js.native
  var orchid: Double = js.native
  var palegoldenrod: Double = js.native
  var palegreen: Double = js.native
  var paleturquoise: Double = js.native
  var palevioletred: Double = js.native
  var papayawhip: Double = js.native
  var peachpuff: Double = js.native
  var peru: Double = js.native
  var pink: Double = js.native
  var plum: Double = js.native
  var powderblue: Double = js.native
  var purple: Double = js.native
  var red: Double = js.native
  var rosybrown: Double = js.native
  var royalblue: Double = js.native
  var saddlebrown: Double = js.native
  var salmon: Double = js.native
  var sandybrown: Double = js.native
  var seagreen: Double = js.native
  var seashell: Double = js.native
  var sienna: Double = js.native
  var silver: Double = js.native
  var skyblue: Double = js.native
  var slateblue: Double = js.native
  var slategray: Double = js.native
  var slategrey: Double = js.native
  var snow: Double = js.native
  var springgreen: Double = js.native
  var steelblue: Double = js.native
  var tan: Double = js.native
  var teal: Double = js.native
  var thistle: Double = js.native
  var tomato: Double = js.native
  var turquoise: Double = js.native
  var violet: Double = js.native
  var wheat: Double = js.native
  var white: Double = js.native
  var whitesmoke: Double = js.native
  var yellow: Double = js.native
  var yellowgreen: Double = js.native
}

@js.native
trait Matrix[T <: Matrix[T]] extends js.Object {
  var elements: scala.scalajs.js.typedarray.Float32Array = js.native
  /** Resets this matrix to identity. */
  def identity(): this.type = js.native
  /** Copies the values of matrix m into this matrix. */
  def copy(m: T): this.type = js.native
  /** Multiplies every component of the matrix by the scalar value s. */
  def multiplyScalar(s: Double): this.type = js.native
  /** Computes and returns the determinant of this matrix. */
  def determinant(): Double = js.native

  /**
    * Set this matrix to the inverse of the passed matrix.
   *
   * @param matrix todo: ???
    * @param throwOnDegenerate If true, throw an error if the matrix is degenerate (not invertible).
    * @return
    */
  def getInverse(matrix: T, throwOnDegenerate: Boolean = js.native): this.type = js.native
  /** Transposes this matrix in place. */
  def transpose(): this.type = js.native
  /** Creates a copy of this matrix. */
  override def clone(): T = js.native
}

@js.native
trait SplineControlPoint extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
}

@js.native
sealed trait LineType extends js.Object {
}

@js.native
@JSName("THREE.LineType")
object LineType extends js.Object {
  @JSBracketAccess
  def apply(value: LineType): String = js.native
}

@js.native
@JSName("THREE.MorphAnimMesh")
class MorphAnimMesh extends Mesh {
  def this(geometry: Geometry = js.native, material: MeshBasicMaterial = js.native) = this()
  var duration: Double = js.native
  var mirroredLoop: Boolean = js.native
  var time: Double = js.native
  var lastKeyframe: Double = js.native
  var currentKeyframe: Double = js.native
  var direction: Double = js.native
  var directionBackwards: Boolean = js.native
  var startKeyframe: Double = js.native
  var endKeyframe: Double = js.native
  var length: Double = js.native
  def setFrameRange(start: Double, end: Double): Unit = js.native
  def setDirectionForward(): Unit = js.native
  def setDirectionBackward(): Unit = js.native
  def parseAnimations(): Unit = js.native
  def setAnimationLabel(label: String, start: Double, end: Double): Unit = js.native
  def playAnimation(label: String, fps: Double): Unit = js.native
  def updateAnimation(delta: Double): Unit = js.native
  def interpolateTargets(a: Double, b: Double, t: Double): Unit = js.native
  def clone(`object`: MorphAnimMesh): MorphAnimMesh = js.native
}

@js.native
@JSName("THREE.PointCloud")
class PointCloud extends Object3D {
  def this(geometry: Geometry, material: PointCloudMaterial = js.native) = this()
  var geometry: Geometry = js.native
  var material: Material = js.native
  var sortParticles: Boolean = js.native
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  def clone(`object`: PointCloud): PointCloud = js.native
}

@js.native
trait Renderer extends js.Object {
  def render(scene: Scene, camera: Camera): Unit = js.native
  def setSize(width: Double, height: Double, updateStyle: Boolean = js.native): Unit = js.native
  var domElement: HTMLCanvasElement = js.native
}

@js.native
trait RendererPlugin extends js.Object {
  def init(renderer: WebGLRenderer): Unit = js.native
  def render(scene: Scene, camera: Camera, currentWidth: Double, currentHeight: Double): Unit = js.native
}

@js.native
trait RenderTarget extends js.Object {
}

@js.native
trait ShaderChunk extends js.Object {
  @JSBracketAccess
  def apply(name: String): String = js.native
  @JSBracketAccess
  def update(name: String, v: String): Unit = js.native
  var alphamap_fragment: String = js.native
  var alphamap_pars_fragment: String = js.native
  var alphatest_fragment: String = js.native
  var bumpmap_pars_fragment: String = js.native
  var color_fragment: String = js.native
  var color_pars_fragment: String = js.native
  var color_pars_vertex: String = js.native
  var color_vertex: String = js.native
  var default_vertex: String = js.native
  var defaultnormal_vertex: String = js.native
  var envmap_fragment: String = js.native
  var envmap_pars_fragment: String = js.native
  var envmap_pars_vertex: String = js.native
  var envmap_vertex: String = js.native
  var fog_fragment: String = js.native
  var fog_pars_fragment: String = js.native
  var lightmap_fragment: String = js.native
  var lightmap_pars_fragment: String = js.native
  var lightmap_pars_vertex: String = js.native
  var lightmap_vertex: String = js.native
  var lights_lambert_pars_vertex: String = js.native
  var lights_lambert_vertex: String = js.native
  var lights_phong_fragment: String = js.native
  var lights_phong_pars_fragment: String = js.native
  var lights_phong_pars_vertex: String = js.native
  var lights_phong_vertex: String = js.native
  var linear_to_gamma_fragment: String = js.native
  var logdepthbuf_fragment: String = js.native
  var logdepthbuf_pars_fragment: String = js.native
  var logdepthbuf_pars_vertex: String = js.native
  var logdepthbuf_vertex: String = js.native
  var map_fragment: String = js.native
  var map_pars_fragment: String = js.native
  var map_pars_vertex: String = js.native
  var map_particle_fragment: String = js.native
  var map_particle_pars_fragment: String = js.native
  var map_vertex: String = js.native
  var morphnormal_vertex: String = js.native
  var morphtarget_pars_vertex: String = js.native
  var morphtarget_vertex: String = js.native
  var normalmap_pars_fragment: String = js.native
  var shadowmap_fragment: String = js.native
  var shadowmap_pars_fragment: String = js.native
  var shadowmap_pars_vertex: String = js.native
  var shadowmap_vertex: String = js.native
  var skinbase_vertex: String = js.native
  var skinning_pars_vertex: String = js.native
  var skinning_vertex: String = js.native
  var skinnormal_vertex: String = js.native
  var specularmap_fragment: String = js.native
  var specularmap_pars_fragment: String = js.native
  var worldpos_vertex: String = js.native
}

@js.native
trait Shader extends js.Object {
  var uniforms: js.Any = js.native
  var vertexShader: String = js.native
  var fragmentShader: String = js.native
}

@js.native
@JSName("THREE.ShaderLib")
object ShaderLib extends js.Object {
  @JSBracketAccess
  def apply(name: String): Shader = js.native
  @JSBracketAccess
  def update(name: String, v: Shader): Unit = js.native
  var basic: Shader = js.native
  var lambert: Shader = js.native
  var phong: Shader = js.native
  var particle_basic: Shader = js.native
  var dashed: Shader = js.native
  var depth: Shader = js.native
  var normal: Shader = js.native
  var normalmap: Shader = js.native
  var cube: Shader = js.native
  var depthRGBA: Shader = js.native
}

@js.native
@JSName("THREE.UniformsLib")
object UniformsLib extends js.Object {
  var common: js.Any = js.native
  var bump: js.Any = js.native
  var normalmap: js.Any = js.native
  var fog: js.Any = js.native
  var lights: js.Any = js.native
  var particle: js.Any = js.native
  var shadowmap: js.Any = js.native
}

@js.native
@JSName("THREE.UniformsUtils")
object UniformsUtils extends js.Object {
  def merge(uniforms: js.Array[js.Any]): js.Dynamic = js.native
  def clone(uniforms_src: js.Any): js.Dynamic = js.native
}


@js.native
trait BoundingBox extends js.Object {
  var minX: Double = js.native
  var minY: Double = js.native
  var maxX: Double = js.native
  var maxY: Double = js.native
  var centroid: Vector2 = js.native
}

@js.native
@JSName("THREE.CurvePath")
class CurvePath extends Curve[Vector2] {
  var curves: js.Array[Curve[Vector2]] = js.native
  var bends: js.Array[Path] = js.native
  var autoClose: Boolean = js.native
  def add(curve: Curve[Vector2]): Unit = js.native
  def checkConnection(): Boolean = js.native
  def closePath(): Unit = js.native
  override def getPoint(t: Double): Vector2 = js.native
  override def getLength(): Double = js.native
  def getCurveLengths(): Double = js.native
  def getBoundingBox(): BoundingBox = js.native
  def createPointsGeometry(divisions: Double): Geometry = js.native
  def createSpacedPointsGeometry(divisions: Double): Geometry = js.native
  def createGeometry(points: js.Array[Vector2]): Geometry = js.native
  def addWrapPath(bendpath: Path): Unit = js.native
  def getTransformedPoints(segments: Double, bends: Path = js.native): js.Array[Vector2] = js.native
  def getTransformedSpacedPoints(segments: Double, bends: js.Array[Path] = js.native): js.Array[Vector2] = js.native
  def getWrapPoints(oldPts: js.Array[Vector2], path: Path): js.Array[Vector2] = js.native
}

@js.native
@JSName("THREE.Gyroscope")
class Gyroscope extends Object3D {
  var translationWorld: Vector3 = js.native
  var translationObject: Vector3 = js.native
  var quaternionWorld: Quaternion = js.native
  var quaternionObject: Quaternion = js.native
  var scaleWorld: Vector3 = js.native
  var scaleObject: Vector3 = js.native
  override def updateMatrixWorld(force: Boolean): Unit = js.native
}

@js.native
sealed trait Side extends js.Object {
}

@js.native
@JSName("THREE.Side")
object Side extends js.Object {
  @JSBracketAccess
  def apply(value: Side): String = js.native
}

@js.native
sealed trait PathActions extends js.Object {
}

@js.native
@JSName("THREE.PathActions")
object PathActions extends js.Object {
  var MOVE_TO: PathActions = js.native
  var LINE_TO: PathActions = js.native
  var QUADRATIC_CURVE_TO: PathActions = js.native
  var BEZIER_CURVE_TO: PathActions = js.native
  var CSPLINE_THRU: PathActions = js.native
  var ARC: PathActions = js.native
  var ELLIPSE: PathActions = js.native
  @JSBracketAccess
  def apply(value: PathActions): String = js.native
}

@js.native
trait PathAction extends js.Object {
  var action: PathActions = js.native
  var args: js.Any = js.native
}

@js.native
trait TextGeometryParameters extends js.Object {
  var font: Font = js.native
  /** Size of the text. */
  var size: Double = js.native
  /** Thickness to extrude text. Default is 50. */
  var height: Double = js.native
  /**  Number of points on the curves. Default is 12. */
  var curveSegments: Double = js.native
  /** Turn on bevel. Default is False. */
  var bevelEnabled: Boolean = js.native
  /** How deep into text bevel goes. Default is 10. */
  var bevelThickness: Double = js.native
  /** How far from text outline is bevel. Default is 8. */
  var bevelSize: Double = js.native
}

@js.native
@JSName("THREE.TextGeometry")
class TextGeometry extends ExtrudeGeometry {
  def this(text: String, TextGeometryParameters: TextGeometryParameters = js.native) = this()
}

@js.native
trait LensFlareProperty extends js.Object {
  var texture: Texture = js.native
  var size: Double = js.native
  var distance: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var scale: Double = js.native
  var rotation: Double = js.native
  var opacity: Double = js.native
  var color: Color = js.native
  var blending: Blending = js.native
}

@js.native
@JSName("THREE.DepthPassPlugin")
class DepthPassPlugin extends RendererPlugin {
  var enabled: Boolean = js.native
  var renderTarget: RenderTarget = js.native
  def init(renderer: Renderer): Unit = js.native
  def render(scene: Scene, camera: Camera): Unit = js.native
  def update(scene: Scene, camera: Camera): Unit = js.native
}

@js.native
@JSName("THREE.ShadowMapPlugin")
class ShadowMapPlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = js.native
  def render(scene: Scene, camera: Camera): Unit = js.native
  def update(scene: Scene, camera: Camera): Unit = js.native
}

@js.native
@JSName("THREE.ShaderFlares")
object ShaderFlares extends js.Object {
  var lensFlareVertexTexture: js.Any = js.native
  var lensFlare: js.Any = js.native
}
