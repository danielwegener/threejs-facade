package org.denigma.threejs.renderers

import org.denigma.threejs._
import org.denigma.threejs.cameras.Camera
import org.denigma.threejs.core.Object3D
import org.denigma.threejs.examples.renderers.RenderableVertex
import org.denigma.threejs.lights.Light
import org.denigma.threejs.materials.Material
import org.denigma.threejs.math.{ Vector2, Color, Vector3 }
import org.denigma.threejs.scenes.{ Fog, Scene }
import org.denigma.threejs.textures.Texture
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.webgl.RenderingContext

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.RenderableFace")
class RenderableFace extends js.Object {
  var id: Double = js.native
  var v1: RenderableVertex = js.native
  var v2: RenderableVertex = js.native
  var v3: RenderableVertex = js.native
  var normalModel: Vector3 = js.native
  var vertexNormalsModel: js.Array[Vector3] = js.native
  var vertexNormalsLength: Double = js.native
  var color: Color = js.native
  var material: Material = js.native
  var uvs: js.Array[js.Array[Vector2]] = js.native
  var z: Double = js.native
}

@js.native
trait WebGLRenderingContext extends js.Object {
}

/**
 * The WebGL renderer displays your beautifully crafted scenes using WebGL, if your device supports it.
 *
 * This renderer has way better performance than CanvasRenderer.
 * @see [[http://threejs.org/docs/#Reference/Renderers/WebGLRenderer]]
 */
@js.native
@JSName("THREE.WebGLRenderer")
class WebGLRenderer extends Renderer {
  def this(parameters: WebGLRendererParameters = js.native) = this()

  /** The HTML5 Canvas's 'webgl' context obtained from the canvas where the renderer will draw. */
  var context: js.Any = js.native
  var devicePixelRatio: Double = js.native
  /** Defines whether the renderer should automatically clear its output before rendering. */
  var autoClear: Boolean = js.native
  /** If autoClear is true, defines whether the renderer should clear the color buffer. Default is true. */
  var autoClearColor: Boolean = js.native
  /** If autoClear is true, defines whether the renderer should clear the depth buffer. Default is true. */
  var autoClearDepth: Boolean = js.native
  /** If autoClear is true, defines whether the renderer should clear the stencil buffer. Default is true. */
  var autoClearStencil: Boolean = js.native
  /**
   * Defines whether the renderer should sort objects. Default is true.
   *
   * Note: Sorting is used to attempt to properly render objects that have some degree of transparency.
   * By definition, sorting objects may not work in all cases. Depending on the needs of application,
   * it may be neccessary to turn off sorting and use other methods to deal with transparency rendering e.g.
   * manually determining the object rendering order.
   */
  var sortObjects: Boolean = js.native
  /** Default is false. If set, then it expects that all textures and colors are premultiplied gamma. */
  var gammaInput: Boolean = js.native
  /** Default is false. If set, then it expects that all textures and colors need to be outputted in premultiplied gamma. */
  var gammaOutput: Boolean = js.native
  /** Default is false. If set, use shadow maps in the scene. */
  var shadowMapEnabled: Boolean = js.native
  var shadowMapAutoUpdate: Boolean = js.native
  /**
   * Defines shadow map type (unfiltered, percentage close filtering, percentage close filtering with bilinear filtering in shader)
   * Options are [[THREE.BasicShadowMap]], [[THREE.PCFShadowMap]], [[THREE.PCFSoftShadowMap]]. Default is [[THREE.PCFShadowMap]].
   */
  var shadowMapType: ShadowMapType = js.native
  /** Default is [[THREE.CullFaceFront]]. The faces that needed to be culled. Possible values: [[THREE.CullFaceFront]] and [[THREE.CullFaceBack]] */
  var shadowMapCullFace: CullFace = js.native
  /** Default is false. If set, then the shadowmaps get a specific color to identify which shadow is from which shadowmap. */
  var shadowMapDebug: Boolean = js.native
  /** Default is false. If Set, use cascaded shadowmaps. See cascaded shadowmaps for more information. */
  var shadowMapCascade: Boolean = js.native
  /** Default is 8. The maximum number of MorphTargets allowed in a shader. Keep in mind that the standard materials only allow 8 MorphTargets. */
  var maxMorphTargets: Double = js.native
  /** Default is 4. The maximum number of MorphNormals allowed in a shader. Keep in mind that the standard materials only allow 4 MorphNormals. */
  var maxMorphNormals: Double = js.native
  /**
   * Default is true. If set, then Cubemaps are scaled, when they are bigger than the maximum size,
   * to make sure that they aren't bigger than the maximum size.
   */
  var autoScaleCubemaps: Boolean = js.native
  var renderPluginsPre: js.Array[RendererPlugin] = js.native
  var renderPluginsPost: js.Array[RendererPlugin] = js.native
  var info: js.Any = js.native
  /** This contains the reference to the shadowMapPlugin. */
  var shadowMapPlugin: ShadowMapPlugin = js.native
  /** Return the WebGL context. */
  def getContext(): WebGLRenderingContext = js.native
  /** Return a Boolean true if the context supports vertex textures. */
  def supportsVertexTextures(): Boolean = js.native
  def supportsFloatTextures(): Boolean = js.native
  def supportsStandardDerivatives(): Boolean = js.native

  /** This method returns true if the webgl implementation supports compressed textures of the format S3TC. */
  def supportsCompressedTextureS3TC(): Boolean = js.native
  def getMaxAnisotropy(): Double = js.native
  /** This gets the precision used by the shaders. It returns "highp","mediump" or "lowp". */
  def getPrecision(): String = js.native

  /** Resizes the output canvas to (width, height), and also sets the viewport to fit that size, starting in (0, 0). */
  override def setSize(width: Double, height: Double, updateStyle: Boolean = js.native): Unit = js.native
  /** Sets the viewport to render from (x, y) to (x + width, y + height). */
  def setViewport(x: Double = js.native, y: Double = js.native, width: Double = js.native, height: Double = js.native): Unit = js.native
  /** Sets the scissor area from (x, y) to (x + width, y + height). */
  def setScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /** Enable the scissor test. When this is enabled, only the pixels within the defined scissor area will be affected by further renderer actions. */
  def enableScissorTest(enable: Boolean): Unit = js.native

  /**
   * Sets the clear color and opacity.
   * @example {{{
   *         // Creates a renderer with red background
   *         var renderer = new THREE.WebGLRenderer();
   *         renderer.setSize( 200, 100 );
   *         renderer.setClearColor( 0xff0000 );}}}
   */
  def setClearColor(color: Color, alpha: Double = js.native): Unit = js.native
  def setClearColorHex(hex: Double, alpha: Double): Unit = js.native
  /** Returns a THREE.Color instance with the current clear color. */
  def getClearColor(): Color = js.native
  /** Returns a float with the current clear alpha. Ranges from 0 to 1. */
  def getClearAlpha(): Double = js.native

  /** Tells the renderer to clear its color, depth or stencil drawing buffer(s). Arguments default to true.*/
  def clear(color: Boolean = js.native, depth: Boolean = js.native, stencil: Boolean = js.native): Unit = js.native

  def clearColor(): Unit = js.native
  def clearDepth(): Unit = js.native
  def clearStencil(): Unit = js.native
  def clearTarget(renderTarget: WebGLRenderTarget, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
  def addPostPlugin(plugin: RendererPlugin): Unit = js.native
  def addPrePlugin(plugin: RendererPlugin): Unit = js.native
  def updateShadowMap(scene: Scene, camera: Camera): Unit = js.native
  def renderBufferImmediate(`object`: Object3D, program: Object, material: Material): Unit = js.native
  def renderBufferDirect(camera: Camera, lights: js.Array[Light], fog: Fog, material: Material, geometryGroup: js.Any, `object`: Object3D): Unit = js.native
  def renderBuffer(camera: Camera, lights: js.Array[Light], fog: Fog, material: Material, geometryGroup: js.Any, `object`: Object3D): Unit = js.native
  def render(scene: Scene, camera: Camera, renderTarget: RenderTarget = js.native, forceClear: Boolean = js.native): Unit = js.native
  def renderImmediateObject(camera: Camera, lights: js.Array[Light], fog: Fog, material: Material, `object`: Object3D): Unit = js.native
  def initMaterial(material: Material, lights: js.Array[Light], fog: Fog, `object`: Object3D): Unit = js.native
  def setFaceCulling(cullFace: CullFace = js.native, frontFace: FrontFaceDirection = js.native): Unit = js.native
  def setMaterialFaces(material: Material): Unit = js.native
  def setDepthTest(depthTest: Boolean): Unit = js.native
  def setDepthWrite(depthWrite: Boolean): Unit = js.native
  def setBlending(blending: Blending, blendEquation: BlendingEquation, blendSrc: BlendingSrcFactor, blendDst: BlendingDstFactor): Unit = js.native
  def setPixelRatio(pixelRatio: Double): Unit = js.native
  def getPixelRatio(): Double = js.native
  def setTexture(texture: Texture, slot: Double): Unit = js.native

  /**
   * This method sets the active rendertarget.
   * @param renderTarget The renderTarget that needs to be activated.
   */
  def setRenderTarget(renderTarget: RenderTarget): Unit = js.native
}

@js.native
@JSName("THREE.WebGLRenderTargetCube")
class WebGLRenderTargetCube extends WebGLRenderTarget {
  def this(width: Double, height: Double, options: WebGLRenderTargetOptions = js.native) = this()
  var activeCubeFace: Double = js.native
}

/**
 * parameters is an optional object with properties defining the renderer's behaviour.
 * The constructor also accepts no parameters at all. In all cases, it will assume sane defaults when parameters are missing.
 */
@js.native
trait WebGLRendererParameters extends js.Object {
  /** A Canvas where the renderer draws its output. */
  var canvas: HTMLCanvasElement = js.native
  /** The RenderingContext context to use. */
  var context: RenderingContext = js.native
  /** Shader precision. Can be "highp", "mediump" or "lowp". Defaults to "highp" if supported by the device. */
  var precision: String = js.native
  /** Boolean, default is false. */
  var alpha: Boolean = js.native
  /** Boolean, default is true. */
  var premultipliedAlpha: Boolean = js.native
  /** Boolean, default is false. */
  var antialias: Boolean = js.native
  /** Boolean, default is true. */
  var stencil: Boolean = js.native
  /** Boolean, default is false. */
  var preserveDrawingBuffer: Boolean = js.native
  /** Boolean, default is true. */
  var depth: Double = js.native
  /** Boolean, default is false. */
  var logarithmicDepthBuffer: Boolean = js.native
}

@js.native
@JSName("THREE.WebGLRenderTarget")
class WebGLRenderTarget extends RenderTarget {
  def this(width: Double, height: Double, options: WebGLRenderTargetOptions = js.native) = this()
  var width: Double = js.native
  var height: Double = js.native
  var wrapS: Wrapping = js.native
  var wrapT: Wrapping = js.native
  var magFilter: TextureFilter = js.native
  var minFilter: TextureFilter = js.native
  var anisotropy: Double = js.native
  var offset: Vector2 = js.native
  var repeat: Vector2 = js.native
  var format: Double = js.native
  var `type`: Double = js.native
  var depthBuffer: Boolean = js.native
  var stencilBuffer: Boolean = js.native
  var generateMipmaps: Boolean = js.native
  var shareDepthFrom: js.Any = js.native
  override def clone(): WebGLRenderTarget = js.native
  def dispose(): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def dispatchEvent(event: js.Any): Unit = js.native
}

@js.native
trait WebGLRenderTargetOptions extends js.Object {
  var wrapS: Wrapping = js.native
  var wrapT: Wrapping = js.native
  var magFilter: TextureFilter = js.native
  var minFilter: TextureFilter = js.native
  var anisotropy: Double = js.native
  var format: Double = js.native
  var `type`: TextureDataType = js.native
  var depthBuffer: Boolean = js.native
  var stencilBuffer: Boolean = js.native
}
