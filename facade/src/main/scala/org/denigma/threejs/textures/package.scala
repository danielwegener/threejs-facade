package org.denigma.threejs.textures

import org.denigma.threejs.math.Vector2
import org.scalajs.dom._
import org.denigma.threejs._

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.typedarray.{ArrayBufferView, ArrayBuffer}

/**
  * Create a texture to apply to a surface or as a reflection or refraction map.
  *
  * @see [[http://threejs.org/docs/#Reference/Textures/Texture]]
  */
@js.native
@JSName("THREE.Texture")
class Texture extends js.Object {

  def this(image: js.Any, mapping: Mapping = js.native, wrapS: Wrapping = js.native, wrapT: Wrapping = js.native, magFilter: TextureFilter = js.native, minFilter: TextureFilter = js.native, format: PixelFormat = js.native, `type`: TextureDataType = js.native, anisotropy: Double = js.native) = this()
  /** Unique number for this texture instance. */
  var id: Double = js.native
  /**
    * An Image object, typically created using the ImageUtils or ImageLoader classes. The Image object can include an
    * image (e.g., PNG, JPG, GIF, DDS), video (e.g., MP4, OGG/OGV), or set of six images for a cube map.
    * To use video as a texture you need to have a playing HTML5 video element as a source for your texture image and
    * continuously update this texture as long as video is playing.
    */
  var image: js.Any = js.native
  /**
    * How the image is applied to the object. An object type of [[THREE.UVMapping]] is the default, where the U,V coordinates
    * are used to apply the map, and a single texture is expected. The other types are [[THREE.CubeReflectionMapping]],
    * for cube maps used as a reflection map; [[THREE.CubeRefractionMapping]], refraction mapping; and [[THREE.SphericalReflectionMapping]],
    * a spherical reflection map projection. */
  var mapping: Mapping = js.native
  /**
    * The default is [[THREE.ClampToEdgeWrapping]], where the edge is clamped to the outer edge texels.
    * The other two choices are [[THREE.RepeatWrapping]] and [[THREE.MirroredRepeatWrapping]]. */
  var wrapS: Wrapping = js.native
  /**
    * The default is [[THREE.ClampToEdgeWrapping]], where the edge is clamped to the outer edge texels.
    * The other two choices are [[THREE.RepeatWrapping]] and [[THREE.MirroredRepeatWrapping]].
    *
    * NOTE: tiling of images in textures only functions if image dimensions are powers of two
    * (2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, ...) in terms of pixels. Individual dimensions need not be equal,
    * but each must be a power of two. This is a limitation of WebGL, not Three.js.
    */
  var wrapT: Wrapping = js.native
  /**
    * How the texture is sampled when a texel covers more than one pixel. The default is [[THREE.LinearFilter]],
    * which takes the four closest texels and bilinearly interpolates among them. The other option is [[THREE.NearestFilter]],
    * which uses the value of the closest texel.
    */
  var magFilter: TextureFilter = js.native
  /**
    * How the texture is sampled when a texel covers less than one pixel. The default is [[THREE.LinearMipMapLinearFilter]],
    * which uses mipmapping and a trilinear filter. Other choices are [[THREE.NearestFilter]],
    * [[THREE.NearestMipMapNearestFilter]], [[THREE.NearestMipMapLinearFilter]], [[THREE.LinearFilter]],
    * and [[THREE.LinearMipMapNearestFilter]].
    * These vary whether the nearest texel or nearest four texels are retrieved on the nearest mipmap or nearest two mipmaps.
    * Interpolation occurs among the samples retrieved.
    */
  var minFilter: TextureFilter = js.native
  /**
    * The default is [[THREE.RGBAFormat]] for the texture.
    * Other formats are: [[THREE.AlphaFormat]], [[THREE.RGBFormat]], [[THREE.LuminanceFormat]], and [[THREE.LuminanceAlphaFormat]].
    * There are also compressed texture formats, if the S3TC extension is supported: [[THREE.RGB_S3TC_DXT1_Format]],
    * [[THREE.RGBA_S3TC_DXT1_Format]], [[THREE.RGBA_S3TC_DXT3_Format]], and [[THREE.RGBA_S3TC_DXT5_Format]].
    */
  var format: PixelFormat = js.native
  /**
    * The default is [[THREE.UnsignedByteType]]. Other valid types (as WebGL allows) are [[THREE.ByteType]], [[THREE.ShortType]],
    * [[THREE.UnsignedShortType]], [[THREE.IntType]], [[THREE.UnsignedIntType]], [[THREE.FloatType]], [[THREE.UnsignedShort4444Type]],
    * [[THREE.UnsignedShort5551Type]], and [[THREE.UnsignedShort565Type]].
    */
  var `type`: TextureDataType = js.native
  /**
    * The number of samples taken along the axis through the pixel that has the highest density of texels.
    * By default, this value is 1. A higher value gives a less blurry result than a basic mipmap, at the cost of more texture
    * samples being used. Use renderer.getMaxAnisotropy() to find the maximum valid anisotropy value for the GPU; this value
    * is usually a power of 2.
    */
  var anisotropy: Double = js.native
  /**
    * If a texture is changed after creation, set this flag to true so that the texture is properly set up.
    * Particularly important for setting the wrap mode.
    */
  var needsUpdate: Boolean = js.native
  /** How many times the texture is repeated across the surface, in each direction U and V. */
  var repeat: Vector2 = js.native
  /** How much a single repetition of the texture is offset from the beginning, in each direction U and V. Typical range is 0.0 to 1.0. */
  var offset: Vector2 = js.native
  /** Given name of the texture, empty string by default. */
  var name: String = js.native
  /** Whether to generate mipmaps (if possible) for a texture. True by default. */
  var generateMipmaps: Boolean = js.native
  /** Array of mipmaps generated. */
  var mipmaps: js.Array[ImageData] = js.native
  /** True by default. Flips the image's Y axis to match the WebGL texture coordinate space. */
  var flipY: Boolean = js.native
  /**
    * 4 by default. Specifies the alignment requirements for the start of each pixel row in memory.
    * The allowable values are 1 (byte-alignment), 2 (rows aligned to even-numbered bytes), 4 (word-alignment),
    * and 8 (rows start on double-word boundaries). See glPixelStorei for more information.
    */
  var unpackAlignment: Int = js.native
  /** False by default, which is the norm for PNG images. Set to true if the RGB values have been stored premultiplied by alpha. */
  var premultiplyAlpha: Boolean = js.native
  /** A callback function, called when the texture is updated (e.g., when needsUpdate has been set to true and then the texture is used). */
  var onUpdate: js.Function0[Unit] = js.native
  /** Make copy of texture. Note this is not a "deep copy", the image is shared. */
  def clone(texture: Texture): Texture = js.native
  def update(): Unit = js.native
  /** Call EventDispatcher.dispatchEvent with a 'dispose' event type. */
  def dispose(): Unit = js.native
}

@js.native
@JSName("THREE.Texture")
object Texture extends js.Object {
  var DEFAULT_IMAGE: js.Any = js.native
  var DEFAULT_MAPPING: Mapping = js.native
}

/**
  * Creates a texture based on data in compressed form.
  *
  * @see [[http://threejs.org/docs/#Reference/Textures/CubeTexture]]
  */
@js.native
@JSName("THREE.CompressedTexture")
class CompressedTexture extends Texture {
  /**
    * This creates a texture from compressed data. This is mostly used in ImageUtils.loadCompressedTexture.
    *
    * @param mipmaps The mipmaps array should contains objects with data, width and height. The mipmaps should be from of the correct format and type.
    * @param width The width of the biggest mipmap
    * @param height The height of the biggest mipmap
    * @param format The format used in the mipmaps
    * @param `type` The type used in the mipmaps
    * @param mapping How the image is applied to the object. An object type of THREE.UVMapping is the default,
    *                where the U,V coordinates are used to apply the map, and a single texture is expected.
    *                The other types are THREE.CubeReflectionMapping, for cube maps used as a reflection map;
    *                THREE.CubeRefractionMapping, refraction mapping; and THREE.SphericalReflectionMapping, a spherical
    *                reflection map projection.
    * @param wrapS   The default is THREE.ClampToEdgeWrapping, where the edge is clamped to the outer edge texels.
    *                The other two choices are THREE.RepeatWrapping and THREE.MirroredRepeatWrapping.
    * @param wrapT   The default is THREE.ClampToEdgeWrapping, where the edge is clamped to the outer edge texels.
    *                The other two choices are THREE.RepeatWrapping and THREE.MirroredRepeatWrapping.
    * @param magFilter How the texture is sampled when a texel covers more than one pixel. The default is THREE.LinearFilter,
    *                  which takes the four closest texels and bilinearly interpolates among them. The other option is
    *                  THREE.NearestFilter, which uses the value of the closest texels.
    * @param minFilter How the texture is sampled when a texel covers less than one pixel. The default is
    *                  THREE.LinearMipMapLinearFilter, which uses mipmapping and a trilinear filter. Other choices are
    *                  THREE.NearestFilter, THREE.NearestMipMapNearestFilter, THREE.NearestMipMapLinearFilter,
    *                  THREE.LinearFilter, and THREE.LinearMipMapNearestFilter. These vary whether the nearest texel or
    *                  nearest four texels are retrieved on the nearest mipmap or nearest two mipmaps. Interpolation
    *                  occurs among the samples retrieved.
    * @param anisotropy The number of samples taken along the axis through the pixel that has the highest density of texels.
    *                   By default, this value is 1. A higher value gives a less blurry result than a basic mipmap, at
    *                   the cost of more texture samples being used. Use renderer.getMaxAnisotropy() to find the maximum
    *                   valid anisotropy value for the GPU; this value is usually a power of 2.
    */
  def this(mipmaps: js.Array[ImageData], width: Double, height: Double, format: PixelFormat = js.native,
           `type`: TextureDataType = js.native, mapping: Mapping = js.native, wrapS: Wrapping = js.native,
           wrapT: Wrapping = js.native, magFilter: TextureFilter = js.native, minFilter: TextureFilter = js.native,
           anisotropy: Double = js.native) = this()

  override def clone(): CompressedTexture = js.native
}

/**
  * Creates a cube texture made up of six images.
  *
  * @see [[http://threejs.org/docs/#Reference/Textures/CubeTexture]]
  */
@js.native
@JSName("THREE.CubeTexture")
class CubeTexture extends Texture {
  /**
    * CubeTexture is almost equivalent in functionality and usage to Texture. The only differences are that the images
    * are an array of 6 images as opposed to a single image, and the mapping options are THREE.CubeReflectionMapping (default)
    * or THREE.CubeRefractionMapping
    */
  def this(images: js.Array[js.Any], mapping: Mapping = js.native, wrapS: Wrapping = js.native, wrapT: Wrapping = js.native, magFilter: TextureFilter = js.native, minFilter: TextureFilter = js.native, format: PixelFormat = js.native, `type`: TextureDataType = js.native, anisotropy: Double = js.native) = this()
  def clone(texture: CubeTexture): CubeTexture = js.native
}

/**
  * Creates a texture directly from raw data, width and height.
  *
  * @see [[http://threejs.org/docs/#Reference/Textures/DataTexture]]
  */
@js.native
@JSName("THREE.DataTexture")
class DataTexture extends Texture {
  /**
    * The data argument must be an ArrayBuffer or a typed array view. Further parameters correspond to the properties
    * inherited from Texture, where both magFilter and minFilter default to THREE.NearestFilter. The properties flipY
    * and generateMipmaps are intially set to false.
    *
    * The interpretation of the data depends on type and format: If the type is THREE.UnsignedByteType, a Uint8Array
    * will be useful for addressing the texel data. If the format is THREE.RGBAFormat, data needs four values for one texel;
    * #Red, Green, Blue and Alpha (typically the opacity). Similarly, THREE.RGBFormat specifies a format where only three
    * values are used for each texel.
    *
    * For the packed types, THREE.UnsignedShort4444Type, THREE.UnsignedShort5551Type or THREE.UnsignedShort565Type, all
    * color components of one texel can be addressed as bitfields within an integer element of a Uint16Array.
    *
    * In order to use the types THREE.FloatType and THREE.HalfFloatType, the WebGL implementation must support the respective
    * extensions OES_texture_float and OES_texture_half_float. In order to use THREE.LinearFilter for component-wise,
    * bilinear interpolation of the texels based on these types, the WebGL extensions OES_texture_float_linear or
    * OES_texture_half_float_linear must also be present.
    */
  def this(data: ArrayBuffer | ArrayBufferView, width: Double, height: Double, format: PixelFormat, `type`: TextureDataType, mapping: Mapping, wrapS: Wrapping, wrapT: Wrapping, magFilter: TextureFilter, minFilter: TextureFilter, anisotropy: Double = js.native) = this()

  override def clone(): DataTexture = js.native
}
