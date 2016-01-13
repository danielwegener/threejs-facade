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
  val REVISION: String = js.native
  val CullFaceNone: CullFace = js.native
  val CullFaceBack: CullFace = js.native
  val CullFaceFront: CullFace = js.native
  val CullFaceFrontBack: CullFace = js.native
  val DefaultLoadingManager: LoadingManager = js.native
  val FrontFaceDirectionCW: FrontFaceDirection = js.native
  val FrontFaceDirectionCCW: FrontFaceDirection = js.native
  val BasicShadowMap: ShadowMapType = js.native
  val PCFShadowMap: ShadowMapType = js.native
  val PCFSoftShadowMap: ShadowMapType = js.native
  val FrontSide: Side = js.native
  val BackSide: Side = js.native
  val DoubleSide: Side = js.native
  val NoShading: Shading = js.native
  val FlatShading: Shading = js.native
  val SmoothShading: Shading = js.native
  val NoColors: Colors = js.native
  val FaceColors: Colors = js.native
  val VertexColors: Colors = js.native
  val NoBlending: Blending = js.native
  val NormalBlending: Blending = js.native
  val AdditiveBlending: Blending = js.native
  val SubtractiveBlending: Blending = js.native
  val MultiplyBlending: Blending = js.native
  val CustomBlending: Blending = js.native
  val AddEquation: BlendingEquation = js.native
  val SubtractEquation: BlendingEquation = js.native
  val ReverseSubtractEquation: BlendingEquation = js.native
  val ZeroFactor: BlendingDstFactor = js.native
  val OneFactor: BlendingDstFactor = js.native
  val SrcColorFactor: BlendingDstFactor = js.native
  val OneMinusSrcColorFactor: BlendingDstFactor = js.native
  val SrcAlphaFactor: BlendingDstFactor = js.native
  val OneMinusSrcAlphaFactor: BlendingDstFactor = js.native
  val DstAlphaFactor: BlendingDstFactor = js.native
  val OneMinusDstAlphaFactor: BlendingDstFactor = js.native
  val DstColorFactor: BlendingSrcFactor = js.native
  val OneMinusDstColorFactor: BlendingSrcFactor = js.native
  val SrcAlphaSaturateFactor: BlendingSrcFactor = js.native
  val MultiplyOperation: Combine = js.native
  val MixOperation: Combine = js.native
  val AddOperation: Combine = js.native
  val UVMapping: MappingConstructor = js.native
  val CubeReflectionMapping: MappingConstructor = js.native
  val CubeRefractionMapping: MappingConstructor = js.native
  val EquirectangularReflectionMapping: MappingConstructor = js.native
  val EquirectangularRefractionMapping: MappingConstructor = js.native
  val SphericalReflectionMapping: MappingConstructor = js.native
  // Wrapping modes
  val RepeatWrapping: Wrapping = js.native
  val ClampToEdgeWrapping: Wrapping = js.native
  val MirroredRepeatWrapping: Wrapping = js.native
  // Filters
  val NearestFilter: TextureFilter = js.native
  val NearestMipMapNearestFilter: TextureFilter = js.native
  val NearestMipMapLinearFilter: TextureFilter = js.native
  val LinearFilter: TextureFilter = js.native
  val LinearMipMapNearestFilter: TextureFilter = js.native
  val LinearMipMapLinearFilter: TextureFilter = js.native
  // Data types
  val UnsignedByteType :TextureDataType= js.native
  val ByteType :TextureDataType= js.native
  val ShortType :TextureDataType= js.native
  val UnsignedShortType :TextureDataType= js.native
  val IntType :TextureDataType= js.native
  val UnsignedIntType :TextureDataType= js.native
  val FloatType :TextureDataType= js.native
  val HalfFloatType :TextureDataType= js.native
  // Pixel types
  val UnsignedShort4444Type: PixelType = js.native
  val UnsignedShort5551Type: PixelType = js.native
  val UnsignedShort565Type: PixelType = js.native
  // Pixel formats
  val AlphaFormat: PixelFormat = js.native
  val RGBFormat: PixelFormat = js.native
  val RGBAFormat: PixelFormat = js.native
  val LuminanceFormat: PixelFormat = js.native
  val LuminanceAlphaFormat: PixelFormat = js.native
  val RGBEFormat: PixelFormat = js.native
  // DDS / ST3C Compressed texture formats
  val RGB_S3TC_DXT1_Format: CompressedPixelFormat = js.native
  val RGBA_S3TC_DXT1_Format: CompressedPixelFormat = js.native
  val RGBA_S3TC_DXT3_Format: CompressedPixelFormat = js.native
  val RGBA_S3TC_DXT5_Format: CompressedPixelFormat = js.native
  // PVRTC compressed texture formats
  val RGB_PVRTC_4BPPV1_Format: CompressedPixelFormat = js.native
  val RGB_PVRTC_2BPPV1_Format: CompressedPixelFormat = js.native
  val RGBA_PVRTC_4BPPV1_Format: CompressedPixelFormat = js.native
  val RGBA_PVRTC_2BPPV1_Format: CompressedPixelFormat = js.native
  // ETC compressed texture formats
  val RGB_ETC1_Format: CompressedPixelFormat = js.native
  // Loop styles for AnimationAction
  val LoopOnce: LoopStyle = js.native
  val LoopRepeat: LoopStyle = js.native
  val LoopPingPong: LoopStyle = js.native

  val Math: Math = js.native

  val LineStrip: LineType = js.native
  val LinePieces: LineType = js.native
  val ShaderChunk: ShaderChunk = js.native

  // Triangle Draw modes
  val TrianglesDrawMode: TriangleDrawMode = js.native
  val TriangleStripDrawMode: TriangleDrawMode = js.native
  val TriangleFanDrawMode: TriangleDrawMode = js.native

}

@js.native
sealed trait TriangleDrawMode extends js.Object

@js.native
sealed trait LoopStyle extends js.Object

@js.native
sealed trait CullFace extends js.Object

@js.native
@JSName("THREE.CullFace")
object CullFace extends js.Object {
  @JSBracketAccess
  def apply(value: CullFace): String = js.native
}

@js.native
sealed trait FrontFaceDirection extends js.Object

@js.native
@JSName("THREE.FrontFaceDirection")
object FrontFaceDirection extends js.Object {
  @JSBracketAccess
  def apply(value: FrontFaceDirection): String = js.native
}

@js.native
sealed trait ShadowMapType extends js.Object

@js.native
@JSName("THREE.ShadowMapType")
object ShadowMapType extends js.Object {
  @JSBracketAccess
  def apply(value: ShadowMapType): String = js.native
}

@js.native
sealed trait Shading extends js.Object

@js.native
@JSName("THREE.Shading")
object Shading extends js.Object {
  @JSBracketAccess
  def apply(value: Shading): String = js.native
}

@js.native
sealed trait Colors extends js.Object

@js.native
@JSName("THREE.Colors")
object Colors extends js.Object {
  @JSBracketAccess
  def apply(value: Colors): String = js.native
}

@js.native
sealed trait Blending extends js.Object

@js.native
@JSName("THREE.Blending")
object Blending extends js.Object {
  @JSBracketAccess
  def apply(value: Blending): String = js.native
}

@js.native
sealed trait BlendingEquation extends js.Object

@js.native
@JSName("THREE.BlendingEquation")
object BlendingEquation extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingEquation): String = js.native
}

@js.native
sealed trait BlendingDstFactor extends js.Object

@js.native
@JSName("THREE.BlendingDstFactor")
object BlendingDstFactor extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingDstFactor): String = js.native
}

@js.native
sealed trait BlendingSrcFactor extends js.Object

@js.native
@JSName("THREE.BlendingSrcFactor")
object BlendingSrcFactor extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingSrcFactor): String = js.native
}

@js.native
sealed trait Combine extends js.Object

@js.native
@JSName("THREE.Combine")
object Combine extends js.Object {
  @JSBracketAccess
  def apply(value: Combine): String = js.native
}

@js.native
sealed trait Mapping extends js.Object

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
sealed trait Wrapping extends js.Object

@js.native
@JSName("THREE.Wrapping")
object Wrapping extends js.Object {
  @JSBracketAccess
  def apply(value: Wrapping): String = js.native
}

@js.native
sealed trait TextureFilter extends js.Object

@js.native
@JSName("THREE.TextureFilter")
object TextureFilter extends js.Object {
  @JSBracketAccess
  def apply(value: TextureFilter): String = js.native
}

@js.native
sealed trait TextureDataType extends js.Object

@js.native
@JSName("THREE.TextureDataType")
object TextureDataType extends js.Object {
  @JSBracketAccess
  def apply(value: TextureDataType): String = js.native
}

@js.native
sealed trait PixelType extends js.Object

@js.native
@JSName("THREE.PixelType")
object PixelType extends js.Object {
  @JSBracketAccess
  def apply(value: PixelType): String = js.native
}

@js.native
sealed trait PixelFormat extends js.Object

@js.native
@JSName("THREE.PixelFormat")
object PixelFormat extends js.Object {
  @JSBracketAccess
  def apply(value: PixelFormat): String = js.native
}

@js.native
sealed trait CompressedPixelFormat extends js.Object

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

@js.native
@deprecated(message = "THREE.ParticleBasicMaterial has been renamed to THREE.PointsMaterial", since = "r74")
trait PointCloudMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var map: Texture = js.native
  var size: Double = js.native
  var sizeAttenuation: Boolean = js.native
  var vertexColors: Boolean = js.native
  var fog: Boolean = js.native
}

@js.native
@JSName("THREE.PointCloudMaterial")
@deprecated(message = "THREE.PointCloudMaterial has been renamed to THREE.PointsMaterial", since = "r74")
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



@deprecated(message = "THREE.ParticleBasicMaterial has been renamed to THREE.PointsMaterial", since = "r74")
@js.native
@JSName("THREE.ParticleBasicMaterial")
class ParticleBasicMaterial extends PointCloudMaterial

@deprecated(message = "THREE.ParticleSystemMaterial has been renamed to THREE.PointsMaterial.", since = "r74")
@js.native
@JSName("THREE.ParticleSystemMaterial")
class ParticleSystemMaterial extends PointCloudMaterial



@js.native
sealed trait LineType extends js.Object

@js.native
@JSName("THREE.MorphAnimMesh")
class MorphAnimMesh extends Mesh(???, ???) {
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

@deprecated(message = "THREE.PointCloud has been renamed to THREE.Points.", since = "r74")
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
trait RenderTarget extends js.Object

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
sealed trait Side extends js.Object

@js.native
@JSName("THREE.Side")
object Side extends js.Object {
  @JSBracketAccess
  def apply(value: Side): String = js.native
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
@JSName("THREE.ShadowMapPlugin")
class ShadowMapPlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = js.native
  def render(scene: Scene, camera: Camera): Unit = js.native
  def update(scene: Scene, camera: Camera): Unit = js.native
}
