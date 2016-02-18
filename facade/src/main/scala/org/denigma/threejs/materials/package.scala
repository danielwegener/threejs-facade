package org.denigma.threejs.materials

import org.denigma.threejs._
import org.denigma.threejs.math.{ Vector2, Vector3, Color }
import org.denigma.threejs.textures.Texture

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * A material for drawing wireframe-style geometries.
 * @param parameters parameters is an object with one or more properties defining the material's appearance.
 * @see [[http://threejs.org/docs/#Reference/Materials/LineBasicMaterial]]
 */
@JSName("THREE.LineBasicMaterial")
@js.native
class LineBasicMaterial(parameters: LineBasicMaterialParameters = js.native) extends LineMaterial {
  /** Sets the color of the line. Default is 0xffffff. */
  var color: Color = js.native
  /**
   * Controls line thickness. Default is 1.
   * Due to limitations in the ANGLE layer, with the WebGL renderer on Windows platforms linewidth will always be 1 regardless of the set value.
   */
  var linewidth: Double = js.native
  /**
   * Define appearance of line ends. Possible values are "butt", "round" and "square". Default is 'round'.
   * This setting might not have any effect when used with certain renderers.
   * For example, it is ignored with the WebGL renderer, but does work with the Canvas renderer.
   */
  var linecap: String = js.native
  /**
   * Define appearance of line joints. Possible values are "round", "bevel" and "miter". Default is 'round'.
   * This setting might not have any effect when used with certain renderers.
   * For example, it is ignored with the WebGL renderer, but does work with the Canvas renderer.
   */
  var linejoin: String = js.native
  /**
   * Define how the vertices gets colored. Possible values are THREE.NoColors, THREE.FaceColors and THREE.VertexColors. Default is THREE.NoColors.
   * This setting might not have any effect when used with certain renderers.
   */
  var vertexColors: Colors = js.native
  /**
   * Define whether the material color is affected by global fog settings.
   * This setting might not have any effect when used with certain renderers.
   * For example, it is ignored with the Canvas renderer, but does work with the WebGL renderer.
   */
  var fog: Boolean = js.native
  override def clone(): LineBasicMaterial = js.native
}

@js.native
@JSName("THREE.LineDashedMaterial")
class LineDashedMaterial extends LineMaterial {
  def this(parameters: LineDashedMaterialParameters = js.native) = this()
  var color: Color = js.native
  var linewidth: Double = js.native
  var scale: Double = js.native
  var dashSize: Double = js.native
  var gapSize: Double = js.native
  var vertexColors: Colors = js.native
  var fog: Boolean = js.native
  override def clone(): LineDashedMaterial = js.native
}

@js.native
trait MaterialParameters extends js.Object {
  var name: String = js.native
  var side: Side = js.native
  var opacity: Double = js.native
  var transparent: Boolean = js.native
  var blending: Blending = js.native
  var blendSrc: BlendingDstFactor = js.native
  var blendDst: BlendingSrcFactor = js.native
  var blendEquation: BlendingEquation = js.native
  var depthTest: Boolean = js.native
  var depthWrite: Boolean = js.native
  var polygonOffset: Boolean = js.native
  var polygonOffsetFactor: Double = js.native
  var polygonOffsetUnits: Double = js.native
  var alphaTest: Double = js.native
  var overdraw: Double = js.native
  var visible: Boolean = js.native
  var needsUpdate: Boolean = js.native
}

/**
 * Materials describe the appearance of objects. They are defined in a (mostly) renderer-independent way,
 * so you don't have to rewrite materials if you decide to use a different renderer.
 * @constructor This creates a generic material.
 * @see [[http://threejs.org/docs/#Reference/Materials/Material]]
 */
@js.native
@JSName("THREE.Material")
class Material extends js.Object {
  /** Unique number for this material instance. */
  def id: Double = js.native
  var uuid: String = js.native
  /** Material name. Default is an empty string. */
  var name: String = js.native
  /**
   * Defines which of the face sides will be rendered - front, back or both.
   * Default is [[THREE.FrontSide]]. Other options are [[THREE.BackSide]] and [[THREE.DoubleSide]].
   */
  var side: Side = js.native
  var opacity: Double = js.native
  var transparent: Boolean = js.native
  /**
   * Which blending to use when displaying objects with this material.
   * Default is `NormalBlending`.
   * See the blending mode constants for all possible values.
   */
  var blending: Blending = js.native
  var blendSrc: BlendingDstFactor = js.native
  var blendDst: BlendingSrcFactor = js.native
  var blendEquation: BlendingEquation = js.native
  /** Whether to have depth test enabled when rendering this material. Default is `true`.*/
  var depthTest: Boolean = js.native
  /**
   * Whether rendering this material has any effect on the depth buffer. Default is `true`.
   *
   * When drawing 2D overlays it can be useful to disable the depth writing in order to layer several
   * things together without creating z-index artifacts.
   */
  var depthWrite: Boolean = js.native
  /** Whether to use polygon offset. Default is false. This corresponds to the POLYGON_OFFSET_FILL WebGL feature. */
  var polygonOffset: Boolean = js.native
  /** Sets the polygon offset factor. Default is `0`. */
  var polygonOffsetFactor: Double = js.native
  /** Sets the polygon offset units. Default is `0`. */
  var polygonOffsetUnits: Double = js.native
  /** Sets the alpha value to be used when running an alpha test. Default is `0`. */
  var alphaTest: Double = js.native
  /**
   * Amount of triangle expansion at draw time.
   * This is a workaround for cases when gaps appear between triangles when using CanvasRenderer.
   * 0.5 tends to give good results across browsers. Default is `0`.
   */
  var overdraw: Double = js.native
  /** Defines whether this material is visible. Default is `true`. */
  var visible: Boolean = js.native
  /**
   * Specifies that the material needs to be updated at the WebGL level.
   * Set it to true if you made changes that need to be reflected in WebGL.
   *
   * This property is automatically set to true when instancing a new material.
   */
  var needsUpdate: Boolean = js.native
  def setValues(values: Object): Unit = js.native
  def clone(material: Material): Material = js.native
  def dispose(): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[js.Any, _]): Unit = js.native
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, _]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, _]): Unit = js.native
  def dispatchEvent(event: js.Any): Unit = js.native

  var index0AttributeName: String = js.native

}

@js.native
trait LineBasicMaterialParameters extends MaterialParameters {
  /** Line color in hexadecimal. Default is 0xffffff. */
  var color: Double = js.native
  /** Line thickness. Default is 1. */
  var linewidth: Double = js.native
  /** Define appearance of line ends. Default is 'round'. */
  var linecap: String = js.native
  /** Define appearance of line joints. Default is 'round'. */
  var linejoin: String = js.native
  /** Define how the vertices gets colored. Default is [[THREE.NoColors]]. */
  var vertexColors: Colors = js.native
  /** Define whether the material color is affected by global fog settings. Default is false. */
  var fog: Boolean = js.native
}

@js.native
trait LineMaterial extends Material

@js.native
trait LineDashedMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var linewidth: Double = js.native
  var scale: Double = js.native
  var dashSize: Double = js.native
  var gapSize: Double = js.native
  var vertexColors: Colors = js.native
  var fog: Boolean = js.native
}

@js.native
trait MeshBasicMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var map: Texture = js.native
  var lightMap: Texture = js.native
  var specularMap: Texture = js.native
  var alphaMap: Texture = js.native
  var envMap: Texture = js.native
  var combine: Combine = js.native
  var reflectivity: Double = js.native
  var refractionRatio: Double = js.native
  var fog: Boolean = js.native
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var wireframeLinecap: String = js.native
  var wireframeLinejoin: String = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
}

@js.native
@JSName("THREE.MeshBasicMaterial")
class MeshBasicMaterial extends Material {
  def this(parameters: MeshBasicMaterialParameters = js.native) = this()
  var color: Color = js.native
  var map: Texture = js.native
  var lightMap: Texture = js.native
  var specularMap: Texture = js.native
  var alphaMap: Texture = js.native
  var envMap: Texture = js.native
  var combine: Combine = js.native
  var reflectivity: Double = js.native
  var refractionRatio: Double = js.native
  var fog: Boolean = js.native
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var wireframeLinecap: String = js.native
  var wireframeLinejoin: String = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
  override def clone(): MeshBasicMaterial = js.native
}

@js.native
trait MeshDepthMaterialParameters extends MaterialParameters {
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
}

@js.native
@JSName("THREE.MeshDepthMaterial")
class MeshDepthMaterial extends Material {
  def this(parameters: MeshDepthMaterialParameters = js.native) = this()
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  override def clone(): MeshDepthMaterial = js.native
}

/**
 * A Material to define multiple materials for the same geometry.
 * The geometry decides which material is used for which faces by the faces materialindex.
 * The materialindex corresponds with the index of the material in the materials array.
 *
 * @see [[http://threejs.org/docs/#Reference/Materials/MeshFaceMaterial]]
 */
@deprecated(message = "use MultiMaterial instead", since = "r73")
@js.native
@JSName("THREE.MeshFaceMaterial")
class MeshFaceMaterial extends Material {
  /**
   * Creates a MeshFaceMaterial with the correct materials.
   * @param materials The materials for the geometry.
   */
  def this(materials: js.Array[Material] = js.native) = this()
  /** Get or set the materials for the geometry. */
  var materials: js.Array[Material] = js.native
  override def clone(): MeshFaceMaterial = js.native
}

/**
 *
 */
@js.native
trait MeshLambertMaterialParameters extends MaterialParameters {
  /** Line color in hexadecimal. Default is 0xffffff. */
  var color: Double = js.native
  /** Sets the texture map. Default is null  */
  var map: Texture = js.native
  /** Set light map. Default is null.*/
  var lightMap: Texture = js.native
  /** Set ao map. Default is null. */
  var aoMap: Texture = js.native
  /** Set emissive map. Default is null. */
  var emissiveMap: Texture = js.native
  /** Set specular map. Default is null. */
  var specularMap: Texture = js.native
  /** alpha map. Default is null. */
  var alphaMap: Texture = js.native
  /** Set env map. Default is null. */
  var envMap: Texture = js.native
  /** Define whether the material color is affected by global fog settings. Default is false. */
  var fog: Boolean = js.native
  /** Render geometry as wireframe. Default is false (i.e. render as smooth shaded). */
  var wireframe: Boolean = js.native
  /** Controls wireframe thickness. Default is 1. */
  var wireframeLinewidth: Double = js.native
  /**  Define appearance of line ends. Default is 'round'. */
  var wireframeLinecap: String = js.native
  /** Define appearance of line joints. Default is 'round'. */
  var wireframeLinejoin: String = js.native
  /** Define how the vertices gets colored. Default is [[THREE.NoColors]]. */
  var vertexColors: Colors = js.native
  /** Define whether the material uses skinning. Default is false. */
  var skinning: Boolean = js.native
  /** Define whether the material uses morphTargets. Default is false. */
  var morphTargets: Boolean = js.native
}

/**
 * A material for non-shiny (Lambertian) surfaces, evaluated per vertex.
 * @param parameters is an object with one or more properties defining the material's appearance.
 * @see [[http://threejs.org/docs/#Reference/Materials/MeshLambertMaterial]]
 */
@js.native
@JSName("THREE.MeshLambertMaterial")
class MeshLambertMaterial(parameters: MeshLambertMaterialParameters = js.native) extends Material {
  /** Diffuse color of the material. Default is white. */
  var color: Color = js.native
  var ambient: Color = js.native
  /** Emissive (light) color of the material, essentially a solid color unaffected by other lighting. Default is black. */
  var emissive: Color = js.native
  /** Intensity of the emissive light. Modulates the emissive color. Default is 1. */
  var emissiveIntensity: Double = js.native

  var wrapAround: Boolean = js.native
  var wrapRGB: Vector3 = js.native
  /** Set color texture map. Default is null. */
  var map: Texture = js.native
  /** Set light map. Default is null. The lightMap requires a second set of UVs. */
  var lightMap: Texture = js.native
  /** Set ambient occlusion map. Default is null. The aoMap requires a second set of UVs.*/
  var aoMap: Texture = js.native
  /** Set emisssive (glow) map. Default is null.
   * The emissive map color is modulated by the emissive color and the emissive intensity.
   * If you have an emissive map, be sure to set the emissive color to something other than black.
   */
  var emissiveMap: Texture = js.native
  /**
   * Since this material does not have a specular component, the specular value affects only how much of
   * the environment map affects the surface. Default is null.
   */
  var specularMap: Texture = js.native
  /**
   * The alpha map is a grayscale texture that controls the opacity across the surface
   * (black: fully transparent; white: fully opaque). Default is null.
   *
   * Only the color of the texture is used, ignoring the alpha channel if one exists. For RGB and RGBA textures,
   * the WebGL renderer will use the green channel when sampling this texture due to the extra bit of precision
   * provided for green in DXT-compressed and uncompressed RGB 565 formats. Luminance-only and luminance/alpha textures
   * will also still work as expected.
   */
  var alphaMap: Texture = js.native
  /** Set env map. Default is null. */
  var envMap: Texture = js.native
  /**
   * How to combine the result of the surface's color with the environment map, if any.
   *
   * Options are [[THREE.MultiplyOperation]] (default), [[THREE.MixOperation]], [[THREE.AddOperation]].
   * If mix is chosen, the reflectivity is used to blend between the two colors.
   */
  var combine: Combine = js.native
  /** How much the environment map affects the surface; also see "combine". */
  var reflectivity: Double = js.native
  /** The index of refraction for an environment map using THREE.CubeRefractionMapping. Default is `0.98`. */
  var refractionRatio: Double = js.native
  /**
   * Define whether the material color is affected by global fog settings. Default is `true`.
   *
   * This setting might not have any effect when used with certain renderers. For example,
   * it is ignored with the Canvas renderer, but does work with the WebGL renderer.
   */
  var fog: Boolean = js.native
  var shading: Shading = js.native
  /** Whether the triangles' edges are displayed instead of surfaces. Default is `false`. */
  var wireframe: Boolean = js.native
  /**
   * Line thickness for wireframe mode. Default is 1.0.
   *
   * Due to limitations in the ANGLE layer, on Windows platforms linewidth will always be 1 regardless of the set value.
   */
  var wireframeLinewidth: Double = js.native
  /**
   * Define appearance of line ends. Possible values are "butt", "round" and "square". Default is "round".
   *
   * This setting might not have any effect when used with certain renderers.
   * For example, it is ignored with the WebGL renderer, but does work with the Canvas renderer.
   */
  var wireframeLinecap: String = js.native
  /**
   * Define appearance of line joints. Possible values are "round", "bevel" and "miter". Default is 'round'.
   *
   * This setting might not have any effect when used with certain renderers.
   * For example, it is ignored with the WebGL renderer, but does work with the Canvas renderer.
   */
  var wireframeLinejoin: String = js.native
  /**
   * Define how the vertices gets colored. Possible values are THREE.NoColors, THREE.FaceColors and THREE.VertexColors.
   * Default is THREE.NoColors.
   *
   * This setting might not have any effect when used with certain renderers.
   * For example, it is ignored with the Canvas renderer, but does work with the WebGL renderer.
   */
  var vertexColors: Colors = js.native
  /** Define whether the material uses skinning. Default is `false`. */
  var skinning: Boolean = js.native
  /** Define whether the material uses morphTargets. Default is `false`. */
  var morphTargets: Boolean = js.native
  /**
   * Defines whether the material uses morphNormals.
   * Set as true to pass morphNormal attributes from the Geometry to the shader. Default is false.
   */
  var morphNormals: Boolean = js.native
  override def clone(): MeshLambertMaterial = js.native
}

@js.native
trait MeshNormalMaterialParameters extends MaterialParameters {
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var morphTargets: Boolean = js.native
}

@js.native
@JSName("THREE.MeshNormalMaterial")
class MeshNormalMaterial extends Material {
  def this(parameters: MeshNormalMaterialParameters = js.native) = this()
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var morphTargets: Boolean = js.native
  override def clone(): MeshNormalMaterial = js.native
}

@js.native
trait MeshPhongMaterialParameters extends MaterialParameters {
  /** geometry color in hexadecimal. Default is 0xffffff.*/
  var color: Double = js.native
  /** Set texture map. Default is null */
  var map: Texture = js.native
  /** Set light map. Default is null */
  var lightMap: Texture = js.native
  /** Set ao map. Default is null. */
  var aoMap: Texture = js.native
  /** Set emissive map. Default is null. */
  var emissiveMap: Texture = js.native
  /** Set specular map. Default is null. */
  var specularMap: Texture = js.native
  /** Set alpha map. Default is null. */
  var alphaMap: Texture = js.native
  /** Set displacement map. Default is null. */
  var displacementMap: Texture = js.native
  /** Set displacement scale. Default is 1. */
  var displacementScale: Double = js.native
  /** Set displacement offset. Default is 0. */
  var displacementBias: Double = js.native
  /** Set env map. Default is null. */
  var envMap: Texture = js.native
  /** Define whether the material color is affected by global fog settings. Default is true. */
  var fog: Boolean = js.native
  /** Define shading type. Default is THREE.SmoothShading. */
  var shading: Shading = js.native
  /** Define whether the material uses skinning. Default is false. */
  var skinning: Boolean = js.native
  /** Define whether the material uses morphTargets. Default is false. */
  var morphTargets: Boolean = js.native
}

/**
 * A material for shiny surfaces, evaluated per pixel.
 *
 * @see [[http://threejs.org/docs/#Reference/Materials/MeshPhongMaterial]]
 */
@js.native
@JSName("THREE.MeshPhongMaterial")
class MeshPhongMaterial extends Material {
  /** @param parameters an object with one or more of the material's properties defining the its appearance. */
  def this(parameters: MeshPhongMaterialParameters = js.native) = this()
  /** Diffuse color of the material. Default is white. */
  var color: Color = js.native
  var ambient: Color = js.native
  /** Emissive (light) color of the material, essentially a solid color unaffected by other lighting. Default is `black`. */
  var emissive: Color = js.native
  /** Intensity of the emissive light. Modulates the emissive color. Default is 1. */
  var emissiveIntensity: Double = js.native
  /**
   * Specular color of the material, i.e., how shiny the material is and the color of its shine.
   * Setting this the same color as the diffuse value (times some intensity) makes the material more metallic-looking;
   * setting this to some gray makes the material look more plastic. Default is dark gray.
   */
  var specular: Color = js.native
  var shininess: Double = js.native

  /** Set color texture map. Default is null. The texture map color is modulated by the diffuse color. */
  var map: Texture = js.native
  /** Set light map. Default is null. The lightMap requires a second set of UVs. */
  var lightMap: Texture = js.native
  /**
   * The texture to create a bump map. The black and white values map to the perceived depth in relation to the lights.
   * Bump doesn't actually affect the geometry of the object, only the lighting. If a normal map is defined this will be ignored.
   */
  var bumpMap: Texture = js.native
  /** How much the bump map affects the material. Typical ranges are 0-1. Default is 1. */
  var bumpScale: Double = js.native
  /**
   * The texture to create a normal map. The RGB values affect the surface normal for each pixel fragment and change
   * the way the color is lit. Normal maps do not change the actual shape of the surface, only the lighting.
   */
  var normalMap: Texture = js.native
  /** How much the normal map affects the material. Typical ranges are 0-1. Default is (1,1). */
  var normalScale: Vector2 = js.native
  /**
   * The specular map value affects both how much the specular surface highlight contributes and how much
   * of the environment map affects the surface. Default is null.
   */
  var specularMap: Texture = js.native
  /**
   * The alpha map is a grayscale texture that controls the opacity across the surface
   * (black: fully transparent; white: fully opaque). Default is `null`.
   *
   * Only the color of the texture is used, ignoring the alpha channel if one exists. For RGB and RGBA textures,
   * the WebGL renderer will use the green channel when sampling this texture due to the extra bit of precision
   * provided for green in DXT-compressed and uncompressed RGB 565 formats. Luminance-only and luminance/alpha
   * textures will also still work as expected.
   */
  var alphaMap: Texture = js.native
  /** Set env map. Default is `null`. */
  var envMap: Texture = js.native
  /**
   * How to combine the result of the surface's color with the environment map, if any.
   *
   * Options are [[THREE.MultiplyOperation]] (default), [[THREE.MixOperation]], [[THREE.AddOperation]].
   * If mix is chosen, the reflectivity is used to blend between the two colors.
   */
  var combine: Combine = js.native
  /** How much the environment map affects the surface; also see "combine".*/
  var reflectivity: Double = js.native
  /** The index of refraction for an environment map using THREE.CubeRefractionMapping. Default is `0.98`. */
  var refractionRatio: Double = js.native
  /**
   * Define whether the material color is affected by global fog settings. Default is `true`.
   *
   * This setting might not have any effect when used with certain renderers.
   * For example, it is ignored with the Canvas renderer, but does work with the WebGL renderer.
   */
  var fog: Boolean = js.native
  /**
   * How the triangles of a curved surface are rendered: as a smooth surface, as flat separate facets, or no shading at all.
   *
   * Options are [[THREE.SmoothShading]] (default), [[THREE.FlatShading]].
   */
  var shading: Shading = js.native
  /** Whether the triangles' edges are displayed instead of surfaces. Default is `false`. */
  var wireframe: Boolean = js.native
  /**
   * Line thickness for wireframe mode. Default is `1.0`.
   *
   * Due to limitations in the ANGLE layer, on Windows platforms linewidth will always be 1 regardless of the set value.
   */
  var wireframeLinewidth: Double = js.native
  /**
   * Define appearance of line ends. Possible values are "butt", "round" and "square". Default is 'round'.
   *
   * This setting might not have any effect when used with certain renderers.
   * For example, it is ignored with the WebGL renderer, but does work with the Canvas renderer.
   */
  var wireframeLinecap: String = js.native
  /**
   * Define appearance of line joints. Possible values are "round", "bevel" and "miter". Default is 'round'.
   *
   * This setting might not have any effect when used with certain renderers.
   * For example, it is ignored with the WebGL renderer, but does work with the Canvas renderer.
   */
  var wireframeLinejoin: String = js.native
  /**
   * Define how the vertices gets colored. Possible values are [[THREE.NoColors]], [[THREE.FaceColors]] and [[THREE.VertexColors]].
   * Default is [[THREE.NoColors]].
   *
   * This setting might not have any effect when used with certain renderers.
   * For example, it is ignored with the Canvas renderer, but does work with the WebGL renderer.
   */
  var vertexColors: Colors = js.native
  /** Define whether the material uses skinning. Default is `false`. */
  var skinning: Boolean = js.native
  /** Define whether the material uses morphTargets. Default is `false`. */
  var morphTargets: Boolean = js.native
  /**
   * Defines whether the material uses morphNormals. Set as true to pass morphNormal attributes from
   * the Geometry to the shader. Default is `false`.
   */
  var morphNormals: Boolean = js.native
  override def clone(): MeshPhongMaterial = js.native
}

@js.native
trait ShaderMaterialParameters extends MaterialParameters {
  var defines: js.Any = js.native
  var uniforms: js.Any = js.native
  var attributes: js.Any = js.native
  var vertexShader: String = js.native
  var fragmentShader: String = js.native
  var shading: Shading = js.native
  var linewidth: Double = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var fog: Boolean = js.native
  var lights: Boolean = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
  var morphNormals: Boolean = js.native
}

/**
 * A Material to define multiple materials for the same geometry.
 * The geometry decides which material is used for which faces by the faces materialindex.
 * The materialindex corresponds with the index of the material in the materials array.
 * @see [[http://threejs.org/docs/#Reference/Materials/MultiMaterial]]
 */
@js.native
@JSName("THREE.MultiMaterial")
class MultiMaterial extends Material {
  /**
   * @param materials The materials for the geometry.
   */
  def this(materials: js.Array[Material] = js.native) = this()
  /** Get or set the materials for the geometry. */
  var materials: js.Array[Material] = js.native
  /** Creates a clone of this MultiMaterial. */
  override def clone(): MultiMaterial = js.native
}

@js.native
@JSName("THREE.RawShaderMaterial")
class RawShaderMaterial extends ShaderMaterial {
  def this(parameters: ShaderMaterialParameters = js.native) = this()
}

/**
 * Material rendered with custom shaders. A shader is a small program written in GLSL to run on the GPU.
 * @see [[http://threejs.org/docs/#Reference/Materials/ShaderMaterial]]
 */
@js.native
@JSName("THREE.ShaderMaterial")
class ShaderMaterial extends Material {
  def this(parameters: ShaderMaterialParameters = js.native) = this()
  var defines: js.Any = js.native
  var uniforms: js.Any = js.native
  var attributes: js.Any = js.native
  var vertexShader: String = js.native
  var fragmentShader: String = js.native
  var shading: Shading = js.native
  var linewidth: Double = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var fog: Boolean = js.native
  var lights: Boolean = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
  var morphNormals: Boolean = js.native
  override def clone(): ShaderMaterial = js.native
}

@js.native
trait SpriteMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var map: Texture = js.native
  var rotation: Double = js.native
  var fog: Boolean = js.native
}

@js.native
@JSName("THREE.SpriteMaterial")
class SpriteMaterial extends Material {
  def this(parameters: SpriteMaterialParameters = js.native) = this()
  var color: Color = js.native
  var map: Texture = js.native
  var rotation: Double = js.native
  var fog: Boolean = js.native
  override def clone(): SpriteMaterial = js.native
}